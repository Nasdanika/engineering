package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.EStructuralFeatureViewActionImpl;
import org.nasdanika.html.emf.ViewAction;

public class EngineeredCapabilityViewAction<T extends EngineeredCapability> extends CapabilityViewAction<T> {
	
	protected EngineeredCapabilityViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Object featureValue(EStructuralFeature feature, Object value, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (feature == EngineeringPackage.Literals.ENDEAVOR__COMPLETION) {
			double completion = getSemanticElement().getCompletion();
			if (completion != Double.NaN && completion > 0.001) {
				return viewGenerator.getBootstrapFactory().progressBar((int) (100 * completion));
			}			
		}
		return super.featureValue(feature, value, viewGenerator, progressMonitor);
	}
		
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.ENDEAVOR__ALL_ISSUES) {
			return false;
		}
		if (feature == EngineeringPackage.Literals.ENDEAVOR__CAPACITY) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		if (feature == EngineeringPackage.Literals.ENGINEERED_CAPABILITY__ALIGNS) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ENDEAVOR__CAPACITY) {
			return endeavorCapacityFeatureActions(getSemanticElement());
		}
		if (feature == EngineeringPackage.Literals.ENGINEERED_CAPABILITY__ALIGNS) {
			EList<Alignment> aligns = getSemanticElement().getAligns();
			if (aligns.isEmpty()) {
				return Collections.emptyList();
			}
			EStructuralFeatureViewActionImpl<T, EStructuralFeature> alignsFeatureAction = new EStructuralFeatureViewActionImpl<T, EStructuralFeature>(getSemanticElement(), feature) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
					table.header().headerRow("Aim", "Description").color(Color.INFO);
					for (Alignment alignment: aligns) {
						table.body().row(
								viewGenerator.link(ViewAction.adaptToViewActionNonNull(alignment.getAim())),
								getModelElementDescription(alignment));
					}
					return table;
				}				
				
			};
			alignsFeatureAction.getRoles().add(Action.Role.SECTION);
			return Collections.singleton(alignsFeatureAction);
		}
		return super.featureActions(feature);
	}
	
	public static Collection<Action> endeavorCapacityFeatureActions(Endeavor endeavor) {
		EList<Capacity> capacity = endeavor.getCapacity();
		if (capacity.isEmpty()) {
			return Collections.emptyList();
		}
		EStructuralFeatureViewActionImpl<Endeavor, EStructuralFeature> allocationsSection = new EStructuralFeatureViewActionImpl<Endeavor, EStructuralFeature>(endeavor, EngineeringPackage.Literals.ENDEAVOR__CAPACITY) {
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Map<Engineer, List<Capacity>> capacityGroupedByEngineer = Util.groupBy(
						capacity
							.stream()
							.filter(c -> c.eContainer() instanceof Engineer)
							.collect(Collectors.toList()), 
						c -> (Engineer) c.eContainer());
				
				Map<Engineer, List<Allocation>> allocationsGroupedByEngineer = Util.groupBy(
						capacity
							.stream()
							.filter(c -> c instanceof Allocation)
							.map(c -> (Allocation) c)
							.collect(Collectors.toList()), 
						Allocation::getEngineer);

				Set<Engineer> allEngineers = new HashSet<>(capacityGroupedByEngineer.keySet());
				allEngineers.addAll(allocationsGroupedByEngineer.keySet());
				List<Engineer> allEngineersSorted = new ArrayList<>(allEngineers);
				allEngineersSorted.sort((a,b) -> {
					if (a == b) {
						return 0;
					}
					
					if (a == null) {
						return -1;
					}
					
					if (b == null) {
						return 1;
					}
					
					if (Util.isBlank(a.getName())) {
						return -1;
					}
					
					if (Util.isBlank(b.getName())) {
						return 1;
					}
					
					return a.getName().compareTo(b.getName());
				});
								
				Fragment ret = viewGenerator.getHTMLFactory().fragment();				
				BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
				for (Engineer engineer: allEngineersSorted) {
					ret.content(TagName.h4.create(engineer == null ? "Undefined" : viewGenerator.link(ViewAction.adaptToViewActionNonNull(engineer))));
					List<Capacity> ec = capacityGroupedByEngineer.get(engineer);
					if (ec != null && !ec.isEmpty()) {
						ret.content(TagName.h5.create("Capacity"));
						Table table = bootstrapFactory.table().bordered().striped();
						table.header().headerRow("Effort", "Rate", "Funds").color(Color.INFO);
						for (Capacity ece: ec) {
							table.body().row(
									ece.getEffort(),
									ece.getRate(),
									ece.getFunds()
							);
						}					
						ret.content(table);
					}
					List<Allocation> ea = allocationsGroupedByEngineer.get(engineer);
					if (ea != null && !ea.isEmpty()) {
						ret.content(TagName.h5.create("Allocations"));
						Table table = bootstrapFactory.table().bordered().striped();
						table.header().headerRow("Target", "Category", "Effort", "Rate", "Funds").color(Color.INFO);
						for (Allocation eae: ea) {
							Tag categoriesTag;
							EList<IssueCategory> category = eae.getCategory();
							if (category.isEmpty()) {
								categoriesTag = TagName.span.create();
							} else if (category.size() == 1) {
								categoriesTag = viewGenerator.link(ViewAction.adaptToViewActionNonNull(category.get(0)));							
							} else {
								categoriesTag = viewGenerator.getHTMLFactory().tag(TagName.ul);
								for (Action ca: ViewAction.adaptToViewActionsNonNull(category)) {
									categoriesTag.content(TagName.li.create(viewGenerator.link(ca)));
								}
							}
							table.body().row(
									viewGenerator.link(ViewAction.adaptToViewActionNonNull(eae.eContainer())),
									categoriesTag,
									eae.getEffort(),
									eae.getRate(),
									eae.getFunds()
							);
						}
						ret.content(table);
					}
				}
				
				return ret;
			}				
			
		};
		allocationsSection.getRoles().add(Action.Role.SECTION);
		return Collections.singleton(allocationsSection);		
	}	
	
}
