/**
 */
package org.nasdanika.engineering.flow.impl;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.persistence.ConfigurationException;
import org.nasdanika.common.persistence.Marked;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.flow.Journey;
import org.nasdanika.engineering.flow.JourneyElement;
import org.nasdanika.engineering.flow.Transition;
import org.nasdanika.engineering.impl.NamedElementImpl;
import org.nasdanika.html.app.impl.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.flow.impl.TransitionImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.nasdanika.engineering.flow.impl.TransitionImpl#isSuppress <em>Suppress</em>}</li>
 *   <li>{@link org.nasdanika.engineering.flow.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.engineering.flow.impl.TransitionImpl#getLag <em>Lag</em>}</li>
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
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLag() <em>Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLag()
	 * @generated
	 * @ordered
	 */
	protected static final Duration LAG_EDEFAULT = null;

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
		return FlowPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		eDynamicSet(FlowPackage.TRANSITION__TARGET, FlowPackage.Literals.TRANSITION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getLag() {
		return (Duration)eDynamicGet(FlowPackage.TRANSITION__LAG, FlowPackage.Literals.TRANSITION__LAG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLag(Duration newLag) {
		eDynamicSet(FlowPackage.TRANSITION__LAG, FlowPackage.Literals.TRANSITION__LAG, newLag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JourneyElement getTarget(EList<Journey> journeyPath) {
		String tid = getTarget();
		if (Util.isBlank(tid)) {
			throw new ConfigurationException("Transition target is not set", EObjectAdaptable.adaptTo(this, Marked.class));
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<JourneyElement> rPath = resolve((List) journeyPath, tid);
		return rPath.isEmpty() ? null : rPath.get(rPath.size() - 1);
	}

	/**
	 * Resolves a {@link JourneyElement} by its path and the journey path.
	 * @param contextPath Nesting path of journey elements. In the case of no journey inheritance - the containment path.
	 * @param path Journey element path.
	 * @return
	 */
	private static List<JourneyElement> resolve(List<JourneyElement> contextPath, String path) {
		if (contextPath.isEmpty()) {
			return contextPath;
		}
		
		int colonIdx = path.indexOf(":");
		int slashIdx = path.indexOf('/');
		JourneyElement lastElement = contextPath.get(contextPath.size() - 1);
		if (colonIdx > 0 && (slashIdx == -1 || colonIdx < slashIdx)) { // URI
			JourneyElement result = (JourneyElement) lastElement.eResource().getResourceSet().getEObject(URI.createURI(path), true);
			List<JourneyElement> ret = new ArrayList<>(contextPath);
			ret.add(result);
			return ret;
		}
		if (slashIdx == - 1) {
			if ("..".equals(path)) {
				if (contextPath.size() == 1) {
					EObject c = lastElement.eContainer();
					if (c instanceof Journey) { 
						return Collections.singletonList((JourneyElement) c);
					}
					return Collections.emptyList();
				}
				List<JourneyElement> ret = new ArrayList<>(contextPath);
				ret.remove(ret.size() - 1);
				return ret;
			}
			if (lastElement instanceof Journey) {
				for (JourneyElement journeyElement: ((Journey) lastElement).getAllElements()) {
					if (path.equals(journeyElement.getPath())) {
						List<JourneyElement> ret = new ArrayList<>(contextPath);
						ret.add(journeyElement);					
						return ret;
					}
				}
			}
			return Collections.emptyList();
		}
		List<JourneyElement> firstSegmentPath = resolve(contextPath, path.substring(0, slashIdx)); 
		return resolve(firstSegmentPath, path.substring(slashIdx + 1));
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<NamedElement> getPayload() {
		return (EList<NamedElement>)eDynamicGet(FlowPackage.TRANSITION__PAYLOAD, FlowPackage.Literals.TRANSITION__PAYLOAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSuppress() {
		return (Boolean)eDynamicGet(FlowPackage.TRANSITION__SUPPRESS, FlowPackage.Literals.TRANSITION__SUPPRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuppress(boolean newSuppress) {
		eDynamicSet(FlowPackage.TRANSITION__SUPPRESS, FlowPackage.Literals.TRANSITION__SUPPRESS, newSuppress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return (String)eDynamicGet(FlowPackage.TRANSITION__TARGET, FlowPackage.Literals.TRANSITION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.TRANSITION__PAYLOAD:
				return getPayload();
			case FlowPackage.TRANSITION__SUPPRESS:
				return isSuppress();
			case FlowPackage.TRANSITION__TARGET:
				return getTarget();
			case FlowPackage.TRANSITION__LAG:
				return getLag();
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
			case FlowPackage.TRANSITION__PAYLOAD:
				getPayload().clear();
				getPayload().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case FlowPackage.TRANSITION__SUPPRESS:
				setSuppress((Boolean)newValue);
				return;
			case FlowPackage.TRANSITION__TARGET:
				setTarget((String)newValue);
				return;
			case FlowPackage.TRANSITION__LAG:
				setLag((Duration)newValue);
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
			case FlowPackage.TRANSITION__PAYLOAD:
				getPayload().clear();
				return;
			case FlowPackage.TRANSITION__SUPPRESS:
				setSuppress(SUPPRESS_EDEFAULT);
				return;
			case FlowPackage.TRANSITION__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case FlowPackage.TRANSITION__LAG:
				setLag(LAG_EDEFAULT);
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
			case FlowPackage.TRANSITION__PAYLOAD:
				return !getPayload().isEmpty();
			case FlowPackage.TRANSITION__SUPPRESS:
				return isSuppress() != SUPPRESS_EDEFAULT;
			case FlowPackage.TRANSITION__TARGET:
				return TARGET_EDEFAULT == null ? getTarget() != null : !TARGET_EDEFAULT.equals(getTarget());
			case FlowPackage.TRANSITION__LAG:
				return LAG_EDEFAULT == null ? getLag() != null : !LAG_EDEFAULT.equals(getLag());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FlowPackage.TRANSITION___GET_TARGET__ELIST:
				return getTarget((EList<Journey>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransitionImpl
