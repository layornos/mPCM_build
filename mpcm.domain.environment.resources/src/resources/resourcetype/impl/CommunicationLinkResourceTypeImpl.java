/**
 */
package resources.resourcetype.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import repository.Role;
import resources.resourcetype.CommunicationLinkResourceType;
import resources.resourcetype.ResourcetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CommunicationLinkResourceTypeImpl extends ResourceTypeImpl implements CommunicationLinkResourceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLinkResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcetypePackage.Literals.COMMUNICATION_LINK_RESOURCE_TYPE;
	}

	@Override
	public EList<Role> getResourceProvidedRoles__ResourceInterfaceProvidingEntity() {
		// TODO Auto-generated method stub
		return null;
	}

} //CommunicationLinkResourceTypeImpl
