/**
 */
package softwareusage;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import softwarerepository.OperationProvidedRole;
import softwarerepository.OperationSignature;

import usage.AbstractUserAction;

import variables.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Level System Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EntryLevelSystemCall models the call to a service provided by a system. Therefore, an
 * EntryLevelSystemCall references a ProvidedRole of a PCM System, from which the
 * called interface and the providing component within the system can be derived, and a Signature
 * specifying the called service. Notice, that the usage model does not permit the domain expert to
 * model calls directly to components, but only to system roles. (TODO: Add such a constraint.) This decouples the System structure
 * (i.e., the component-based software architecture model and its allocation) from the UsageModel
 * and the software architect can change the System (e.g., include new components, remove existing
 * components, or change their wiring or allocation) independently from the domain expert, if
 * the system provided roles are not affected. EntryLevelSystemCalls may include a set of
 * input parameter characterisations and a set of output parameter characterisations (as described in
 * the mpcm::parameters package). However, the random variables characterising the input parameters
 * like NUMBER_OF_ELEMENTS can not depend on other variables in the usage model. They have
 * to be composed from literals only including literals describing random variables having a
 * certain fixed distribution.
 * 
 * TODO Anne: Constraint that ensures that the referred signature is contained in the interface referenced by the ProvidedRole (see Diagram)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwareusage.EntryLevelSystemCall#getProvidedRole_EntryLevelSystemCall <em>Provided Role Entry Level System Call</em>}</li>
 *   <li>{@link softwareusage.EntryLevelSystemCall#getOperationSignature__EntryLevelSystemCall <em>Operation Signature Entry Level System Call</em>}</li>
 *   <li>{@link softwareusage.EntryLevelSystemCall#getOutputParameterUsages_EntryLevelSystemCall <em>Output Parameter Usages Entry Level System Call</em>}</li>
 *   <li>{@link softwareusage.EntryLevelSystemCall#getPriority <em>Priority</em>}</li>
 *   <li>{@link softwareusage.EntryLevelSystemCall#getInputParameterUsages_EntryLevelSystemCall <em>Input Parameter Usages Entry Level System Call</em>}</li>
 * </ul>
 *
 * @see softwareusage.SoftwareusagePackage#getEntryLevelSystemCall()
 * @model
 * @generated
 */
public interface EntryLevelSystemCall extends AbstractUserAction {
	/**
	 * Returns the value of the '<em><b>Provided Role Entry Level System Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role Entry Level System Call</em>' reference.
	 * @see #setProvidedRole_EntryLevelSystemCall(OperationProvidedRole)
	 * @see softwareusage.SoftwareusagePackage#getEntryLevelSystemCall_ProvidedRole_EntryLevelSystemCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationProvidedRole getProvidedRole_EntryLevelSystemCall();

	/**
	 * Sets the value of the '{@link softwareusage.EntryLevelSystemCall#getProvidedRole_EntryLevelSystemCall <em>Provided Role Entry Level System Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role Entry Level System Call</em>' reference.
	 * @see #getProvidedRole_EntryLevelSystemCall()
	 * @generated
	 */
	void setProvidedRole_EntryLevelSystemCall(OperationProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Operation Signature Entry Level System Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Signature Entry Level System Call</em>' reference.
	 * @see #setOperationSignature__EntryLevelSystemCall(OperationSignature)
	 * @see softwareusage.SoftwareusagePackage#getEntryLevelSystemCall_OperationSignature__EntryLevelSystemCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationSignature getOperationSignature__EntryLevelSystemCall();

	/**
	 * Sets the value of the '{@link softwareusage.EntryLevelSystemCall#getOperationSignature__EntryLevelSystemCall <em>Operation Signature Entry Level System Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Signature Entry Level System Call</em>' reference.
	 * @see #getOperationSignature__EntryLevelSystemCall()
	 * @generated
	 */
	void setOperationSignature__EntryLevelSystemCall(OperationSignature value);

	/**
	 * Returns the value of the '<em><b>Output Parameter Usages Entry Level System Call</b></em>' containment reference list.
	 * The list contents are of type {@link variables.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameter Usages Entry Level System Call</em>' containment reference list.
	 * @see softwareusage.SoftwareusagePackage#getEntryLevelSystemCall_OutputParameterUsages_EntryLevelSystemCall()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getOutputParameterUsages_EntryLevelSystemCall();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see softwareusage.SoftwareusagePackage#getEntryLevelSystemCall_Priority()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link softwareusage.EntryLevelSystemCall#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Input Parameter Usages Entry Level System Call</b></em>' containment reference list.
	 * The list contents are of type {@link variables.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter Usages Entry Level System Call</em>' containment reference list.
	 * @see softwareusage.SoftwareusagePackage#getEntryLevelSystemCall_InputParameterUsages_EntryLevelSystemCall()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getInputParameterUsages_EntryLevelSystemCall();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.providedRole_EntryLevelSystemCall.providingEntity_ProvidedRole.oclIsTypeOf(mpcm::system::System)'"
	 * @generated
	 */
	boolean EntryLevelSystemCallMustReferenceProvidedRoleOfASystem(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.providedRole_EntryLevelSystemCall.providedInterface__OperationProvidedRole.signatures__OperationInterface-&gt;includes(self.operationSignature__EntryLevelSystemCall)'"
	 * @generated
	 */
	boolean EntryLevelSystemCallSignatureMustMatchItsProvidedRole(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EntryLevelSystemCall
