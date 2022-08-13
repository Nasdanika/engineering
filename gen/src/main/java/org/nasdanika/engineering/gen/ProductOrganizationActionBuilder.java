package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.ProductOrganization;
import org.nasdanika.engineering.Release;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class ProductOrganizationActionBuilder extends OrganizationActionBuilder<ProductOrganization> {
	
	public ProductOrganizationActionBuilder(ProductOrganization target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject, Action> registry,
			Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer,
			ProgressMonitor progressMonitor) {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		if (Util.isBlank(action.getIcon())) {
			action.setIcon("fas fa-box");
		}
		
		createFeatureActions(action, registry, resolveConsumer, progressMonitor);
		createReleaseActions(action, registry, resolveConsumer, progressMonitor);		
		
		return action;
	}
	
	protected void createReleaseActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<Release> releases = getTarget().getReleases();
		if (!releases.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Releases");
			group.setUuid(action.getUuid() + "-releases");
			group.setLocation("releases.html");
			// TODO - icon, ...
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Release release: releases) {
				groupAnonymous.add(createChildAction(release, registry, resolveConsumer, progressMonitor));
			}
		
			action.getNavigation().add(group);
		}
	}
	
	protected void createFeatureActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<Feature> features = getTarget().getFeatures();
		if (!features.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Features");
			group.setUuid(action.getUuid() + "-features");
			group.setLocation("features.html");
			// TODO - icon, ...
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Feature feature: features) {
				groupAnonymous.add(createChildAction(feature, registry, resolveConsumer, progressMonitor));
			}
		
			action.getNavigation().add(group);
		}
	}
		
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {
		super.resolve(action, context, progressMonitor);
		
		ProductOrganization product = getTarget();
		
		EList<Release> releases = product.getReleases();
		if (!releases.isEmpty()) {
			String releaseGroupUUID = action.getUuid() + "-releases";
			Optional<Action> releasesActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> releaseGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Action releasesAction = releasesActionOptional.get();
			releasesAction.getContent().add(renderList(releases, false, null, releasesAction, EngineeringPackage.Literals.PRODUCT__RELEASES, context, progressMonitor)); // Table?
		}
		
		EList<Feature> features = product.getFeatures();
		if (!features.isEmpty()) {
			String featuresGroupUUID = action.getUuid() + "-features";
			Optional<Action> featuresActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> featuresGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Action featuresAction = featuresActionOptional.get();
			featuresAction.getContent().add(renderList(features, false, createFeatureChildrenProvider(), featuresAction, EngineeringPackage.Literals.PRODUCT__FEATURES, context, progressMonitor)); // Table?
		}		
	}

	private ContentProvider<Feature> createFeatureChildrenProvider() {
		return new ContentProvider<Feature>() {

			@Override
			public List<EObject> createContent(
					Feature element, 
					Action base, 
					ETypedElement typedElement,
					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
					ProgressMonitor progressMonitor) {
				
				EList<Feature> children = element.getChildren();
				if (children.isEmpty()) {
					return null;
				}
				return Collections.singletonList(renderList(children, false, this, base, EngineeringPackage.Literals.FEATURE__CHILDREN, context, progressMonitor));
			}
			
		};
	}
	
	
}
