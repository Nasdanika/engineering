/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Journey;
import org.nasdanika.engineering.JourneyElement;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.Transition;
import org.nasdanika.html.app.impl.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TransitionImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TransitionImpl#isSuppress <em>Suppress</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TransitionImpl#getTargetId <em>Target Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The default value of the '{@link #isSuppress() <em>Suppress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuppress()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPRESS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JourneyElement getTarget() {
		String tid = getTargetId();
		if (Util.isBlank(tid)) {
			return null;
		}
		EObject c = eContainer();
		if (c != null) {
			EObject cc = c.eContainer();
			if (cc instanceof Journey) {
				return resolve((Journey) cc, tid);
			}
		}
		return null;		
	}
	
	private static JourneyElement resolve(Journey journey, String path) { 
		int colonIdx = path.indexOf(":");
		int slashIdx = path.indexOf('/');
		if (colonIdx > 0 && (slashIdx == -1 || colonIdx < slashIdx)) { // URI
			return (JourneyElement) journey.eResource().getResourceSet().getEObject(URI.createURI(path), true);
		}
		if (slashIdx == - 1) {
			if ("..".equals(path)) { 
				if (journey == null) { 
					return null;
				}
				EObject c = journey.eContainer();
				if (c instanceof Journey) { 
					return (JourneyElement) c;
				}
				return null;
			}
			for (JourneyElement journeyElement: journey.getAllElements()) {
				if (path.equals(journeyElement.getPath())) {
					return journeyElement;
				}
			}
			return null;
		}
		JourneyElement firstSegment = resolve(journey, path.substring(0, slashIdx)); 
		if (firstSegment instanceof Journey) {
			return resolve((Journey) firstSegment, path.substring(slashIdx + 1));
		}
		return null;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyElement basicGetTarget() {
		return (JourneyElement)eDynamicGet(EngineeringPackage.TRANSITION__TARGET, EngineeringPackage.Literals.TRANSITION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<NamedElement> getPayload() {
		return (EList<NamedElement>)eDynamicGet(EngineeringPackage.TRANSITION__PAYLOAD, EngineeringPackage.Literals.TRANSITION__PAYLOAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSuppress() {
		return (Boolean)eDynamicGet(EngineeringPackage.TRANSITION__SUPPRESS, EngineeringPackage.Literals.TRANSITION__SUPPRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuppress(boolean newSuppress) {
		eDynamicSet(EngineeringPackage.TRANSITION__SUPPRESS, EngineeringPackage.Literals.TRANSITION__SUPPRESS, newSuppress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetId() {
		return (String)eDynamicGet(EngineeringPackage.TRANSITION__TARGET_ID, EngineeringPackage.Literals.TRANSITION__TARGET_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetId(String newTargetId) {
		eDynamicSet(EngineeringPackage.TRANSITION__TARGET_ID, EngineeringPackage.Literals.TRANSITION__TARGET_ID, newTargetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case EngineeringPackage.TRANSITION__PAYLOAD:
				return getPayload();
			case EngineeringPackage.TRANSITION__SUPPRESS:
				return isSuppress();
			case EngineeringPackage.TRANSITION__TARGET_ID:
				return getTargetId();
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
			case EngineeringPackage.TRANSITION__PAYLOAD:
				getPayload().clear();
				getPayload().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case EngineeringPackage.TRANSITION__SUPPRESS:
				setSuppress((Boolean)newValue);
				return;
			case EngineeringPackage.TRANSITION__TARGET_ID:
				setTargetId((String)newValue);
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
			case EngineeringPackage.TRANSITION__PAYLOAD:
				getPayload().clear();
				return;
			case EngineeringPackage.TRANSITION__SUPPRESS:
				setSuppress(SUPPRESS_EDEFAULT);
				return;
			case EngineeringPackage.TRANSITION__TARGET_ID:
				setTargetId(TARGET_ID_EDEFAULT);
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
			case EngineeringPackage.TRANSITION__TARGET:
				return basicGetTarget() != null;
			case EngineeringPackage.TRANSITION__PAYLOAD:
				return !getPayload().isEmpty();
			case EngineeringPackage.TRANSITION__SUPPRESS:
				return isSuppress() != SUPPRESS_EDEFAULT;
			case EngineeringPackage.TRANSITION__TARGET_ID:
				return TARGET_ID_EDEFAULT == null ? getTargetId() != null : !TARGET_ID_EDEFAULT.equals(getTargetId());
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
