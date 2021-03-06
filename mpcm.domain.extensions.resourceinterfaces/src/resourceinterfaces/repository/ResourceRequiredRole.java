/**
 */
package resourceinterfaces.repository;

import repository.Role;

import resourceinterfaces.resourcetype.ResourceInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Required role for resource interface access of a component
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.repository.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}</li>
 *   <li>{@link resourceinterfaces.repository.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}</li>
 * </ul>
 *
 * @see resourceinterfaces.repository.RepositoryPackage#getResourceRequiredRole()
 * @model
 * @generated
 */
public interface ResourceRequiredRole extends Role {
	/**
	 * Returns the value of the '<em><b>Required Resource Interface Resource Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Resource Interface Resource Required Role</em>' reference.
	 * @see #setRequiredResourceInterface__ResourceRequiredRole(ResourceInterface)
	 * @see resourceinterfaces.repository.RepositoryPackage#getResourceRequiredRole_RequiredResourceInterface__ResourceRequiredRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceInterface getRequiredResourceInterface__ResourceRequiredRole();

	/**
	 * Sets the value of the '{@link resourceinterfaces.repository.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resource Interface Resource Required Role</em>' reference.
	 * @see #getRequiredResourceInterface__ResourceRequiredRole()
	 * @generated
	 */
	void setRequiredResourceInterface__ResourceRequiredRole(ResourceInterface value);

	/**
	 * Returns the value of the '<em><b>Resource Interface Requiring Entity Resource Required Role</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link resourceinterfaces.repository.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference.
	 * @see #setResourceInterfaceRequiringEntity__ResourceRequiredRole(ResourceInterfaceRequiringEntity)
	 * @see resourceinterfaces.repository.RepositoryPackage#getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole()
	 * @see resourceinterfaces.repository.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity
	 * @model opposite="resourceRequiredRoles__ResourceInterfaceRequiringEntity" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ResourceInterfaceRequiringEntity getResourceInterfaceRequiringEntity__ResourceRequiredRole();

	/**
	 * Sets the value of the '{@link resourceinterfaces.repository.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference.
	 * @see #getResourceInterfaceRequiringEntity__ResourceRequiredRole()
	 * @generated
	 */
	void setResourceInterfaceRequiringEntity__ResourceRequiredRole(ResourceInterfaceRequiringEntity value);

} // ResourceRequiredRole
