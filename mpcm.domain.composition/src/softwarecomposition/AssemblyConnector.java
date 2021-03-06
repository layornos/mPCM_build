/**
 */
package softwarecomposition;

import composition.AssemblyContext;
import composition.Connector;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import softwarerepository.OperationProvidedRole;
import softwarerepository.OperationRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AssemblyConnector is a bidirectional link of two assembly contexts. Intuitively, an AssemblyConnector connects a
 * provided and a required interface of two different components. AssemblyContext must refer to the tuple (Role,
 * AssemblyContext) in order to uniquely identify which component roles communicate with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwarecomposition.AssemblyConnector#getRequiringAssemblyContext_AssemblyConnector <em>Requiring Assembly Context Assembly Connector</em>}</li>
 *   <li>{@link softwarecomposition.AssemblyConnector#getProvidingAssemblyContext_AssemblyConnector <em>Providing Assembly Context Assembly Connector</em>}</li>
 *   <li>{@link softwarecomposition.AssemblyConnector#getProvidedRole_AssemblyConnector <em>Provided Role Assembly Connector</em>}</li>
 *   <li>{@link softwarecomposition.AssemblyConnector#getRequiredRole_AssemblyConnector <em>Required Role Assembly Connector</em>}</li>
 * </ul>
 *
 * @see softwarecomposition.SoftwarecompositionPackage#getAssemblyConnector()
 * @model
 * @generated
 */
public interface AssemblyConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Requiring Assembly Context Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Assembly Context Assembly Connector</em>' reference.
	 * @see #setRequiringAssemblyContext_AssemblyConnector(AssemblyContext)
	 * @see softwarecomposition.SoftwarecompositionPackage#getAssemblyConnector_RequiringAssemblyContext_AssemblyConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getRequiringAssemblyContext_AssemblyConnector();

	/**
	 * Sets the value of the '{@link softwarecomposition.AssemblyConnector#getRequiringAssemblyContext_AssemblyConnector <em>Requiring Assembly Context Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiring Assembly Context Assembly Connector</em>' reference.
	 * @see #getRequiringAssemblyContext_AssemblyConnector()
	 * @generated
	 */
	void setRequiringAssemblyContext_AssemblyConnector(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Providing Assembly Context Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Assembly Context Assembly Connector</em>' reference.
	 * @see #setProvidingAssemblyContext_AssemblyConnector(AssemblyContext)
	 * @see softwarecomposition.SoftwarecompositionPackage#getAssemblyConnector_ProvidingAssemblyContext_AssemblyConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getProvidingAssemblyContext_AssemblyConnector();

	/**
	 * Sets the value of the '{@link softwarecomposition.AssemblyConnector#getProvidingAssemblyContext_AssemblyConnector <em>Providing Assembly Context Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providing Assembly Context Assembly Connector</em>' reference.
	 * @see #getProvidingAssemblyContext_AssemblyConnector()
	 * @generated
	 */
	void setProvidingAssemblyContext_AssemblyConnector(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Provided Role Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role Assembly Connector</em>' reference.
	 * @see #setProvidedRole_AssemblyConnector(OperationProvidedRole)
	 * @see softwarecomposition.SoftwarecompositionPackage#getAssemblyConnector_ProvidedRole_AssemblyConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationProvidedRole getProvidedRole_AssemblyConnector();

	/**
	 * Sets the value of the '{@link softwarecomposition.AssemblyConnector#getProvidedRole_AssemblyConnector <em>Provided Role Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role Assembly Connector</em>' reference.
	 * @see #getProvidedRole_AssemblyConnector()
	 * @generated
	 */
	void setProvidedRole_AssemblyConnector(OperationProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Required Role Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role Assembly Connector</em>' reference.
	 * @see #setRequiredRole_AssemblyConnector(OperationRequiredRole)
	 * @see softwarecomposition.SoftwarecompositionPackage#getAssemblyConnector_RequiredRole_AssemblyConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationRequiredRole getRequiredRole_AssemblyConnector();

	/**
	 * Sets the value of the '{@link softwarecomposition.AssemblyConnector#getRequiredRole_AssemblyConnector <em>Required Role Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role Assembly Connector</em>' reference.
	 * @see #getRequiredRole_AssemblyConnector()
	 * @generated
	 */
	void setRequiredRole_AssemblyConnector(OperationRequiredRole value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AssemblyConnector references an assembly context and a provided role on the provider side. This constraint ensures that the referenced provided role is really available in the referenced assembly context. 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.providingAssemblyContext_AssemblyConnector.encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity-&gt;includes(self.providedRole_AssemblyConnector)\r\n\r\n'"
	 * @generated
	 */
	boolean AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AssemblyConnector references an assembly context and a required role on the client side. This constraint ensures that the referenced required role is really available in the referenced assembly context. 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.requiringAssemblyContext_AssemblyConnector.encapsulatedComponent__AssemblyContext.requiredRoles_InterfaceRequiringEntity-&gt;includes(self.requiredRole_AssemblyConnector)\r\n\r\n'"
	 * @generated
	 */
	boolean AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces references by this Connector must match. This means that either 
	 * 1) the referenced providedRole and the referenced requiredRole refer to the same Interface (first part of the expression) or 2)  the Interface A referenced by the providedRole is a subtype of the Interface B referenced by the requiredRole as transitively defined by the parentInterface__Interface property. That means that either Interface A is the parentInterface__Interface of Interface B, or there is a set of Interfaces 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.providedRole_AssemblyConnector.providedInterface__OperationProvidedRole = self.requiredRole_AssemblyConnector.requiredInterface__OperationRequiredRole'"
	 * @generated
	 */
	boolean AssemblyConnectorsReferencedInterfacesMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AssemblyConnector
