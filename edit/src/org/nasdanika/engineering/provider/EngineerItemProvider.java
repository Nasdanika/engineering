/**
 */
package org.nasdanika.engineering.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.emf.edit.EReferenceItemProvider;
import org.nasdanika.engineering.Engineer;

import org.nasdanika.engineering.EngineeringFactory;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.party.provider.RoleItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.engineering.Engineer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineerItemProvider extends RoleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}
	
	/**
	 * Called from getChildren(), adds EReferenceItemProvider children.
	 * @param children
	 */
	protected void addEReferenceItemProviderChildren(Object object, Collection<EReferenceItemProvider> children) {
		children.add(new EReferenceItemProvider(this, (EObject) object, EngineeringPackage.Literals.ABSTRACT_ENGINEER__ISSUES));		
		children.add(new EReferenceItemProvider(this, (EObject) object, EngineeringPackage.Literals.ABSTRACT_ENGINEER__OBJECTIVES));		
	}
	
	@Override
	public final Collection<?> getChildren(Object object) {
		List<EReferenceItemProvider> children = eReferenceItemProviders.get(object);
		if (children == null) {
			children = new ArrayList<>();
			eReferenceItemProviders.put(object, children);
			addEReferenceItemProviderChildren(object, children);
			children.sort((a,b) -> a.getText(object).compareTo(b.getText(object)));
		}
		Collection<Object> ret = new ArrayList<>(children);
		ret.addAll(super.getChildren(object));
		return ret;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
//			childrenFeatures.add(EngineeringPackage.Literals.ABSTRACT_ENGINEER__ISSUES);
//			childrenFeatures.add(EngineeringPackage.Literals.ABSTRACT_ENGINEER__OBJECTIVES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Engineer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Engineer"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Engineer)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_Engineer_type") :
			getString("_UI_Engineer_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Engineer.class)) {
			case EngineeringPackage.ENGINEER__ISSUES:
			case EngineeringPackage.ENGINEER__OBJECTIVES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EngineeringPackage.Literals.ABSTRACT_ENGINEER__ISSUES,
				 EngineeringFactory.eINSTANCE.createIssue()));

		newChildDescriptors.add
			(createChildParameter
				(EngineeringPackage.Literals.ABSTRACT_ENGINEER__OBJECTIVES,
				 EngineeringFactory.eINSTANCE.createObjective()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EngineeringEditPlugin.INSTANCE;
	}

}
