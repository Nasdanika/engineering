/**
 */
package org.nasdanika.engineering.representation.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.emf.DiagnosticHelper;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.representation.ComponentDiagram;
import org.nasdanika.engineering.representation.RepresentationPackage;
import org.nasdanika.engineering.util.EngineeringValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.engineering.representation.RepresentationPackage
 * @generated
 */
public class RepresentationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RepresentationValidator INSTANCE = new RepresentationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.engineering.representation";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineeringValidator engineeringValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationValidator() {
		super();
		engineeringValidator = EngineeringValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RepresentationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RepresentationPackage.COMPONENT_DIAGRAM:
				return validateComponentDiagram((ComponentDiagram)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentDiagram(ComponentDiagram componentDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentDiagram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(componentDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentDiagram_container(componentDiagram, diagnostics, context);
		return result;
	}

	/**
	 * Validates the container constraint of '<em>Component Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateComponentDiagram_container(ComponentDiagram componentDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			EObject c = componentDiagram.eContainer();
			if (!((c instanceof Engineer) || c instanceof org.nasdanika.engineering.Module)) {
				DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, componentDiagram);
				helper.error("Component diagram representation shall be contained by an engineer or module", EngineeringPackage.Literals.RELEASE__INCREMENT);
			}
		}
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RepresentationValidator
