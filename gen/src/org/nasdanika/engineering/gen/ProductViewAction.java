package org.nasdanika.engineering.gen;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Product;

public class ProductViewAction extends ModuleViewAction<Product> {
	
	public ProductViewAction(Product value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.PRODUCT__RELEASES) {
			return role == FeatureRole.ELEMENT_ACTIONS;
		}
		return super.isFeatureInRole(feature, role);
	}

}
