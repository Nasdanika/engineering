/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ForumImpl#getDiscussion <em>Discussion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ForumImpl#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForumImpl extends NamedElementImpl implements Forum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.FORUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Forum> getDiscussion() {
		return (EList<Forum>)eDynamicGet(EngineeringPackage.FORUM__DISCUSSION, EngineeringPackage.Literals.FORUM__DISCUSSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Topic> getTopics() {
		return (EList<Topic>)eDynamicGet(EngineeringPackage.FORUM__TOPICS, EngineeringPackage.Literals.FORUM__TOPICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.FORUM__DISCUSSION:
				return ((InternalEList<?>)getDiscussion()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.FORUM__TOPICS:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.FORUM__DISCUSSION:
				return getDiscussion();
			case EngineeringPackage.FORUM__TOPICS:
				return getTopics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EngineeringPackage.FORUM__DISCUSSION:
				getDiscussion().clear();
				getDiscussion().addAll((Collection<? extends Forum>)newValue);
				return;
			case EngineeringPackage.FORUM__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Topic>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EngineeringPackage.FORUM__DISCUSSION:
				getDiscussion().clear();
				return;
			case EngineeringPackage.FORUM__TOPICS:
				getTopics().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EngineeringPackage.FORUM__DISCUSSION:
				return !getDiscussion().isEmpty();
			case EngineeringPackage.FORUM__TOPICS:
				return !getTopics().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForumImpl
