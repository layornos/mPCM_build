/**
 */
package resources.resourcetype.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import repository.Role;
import resources.resourcetype.ProcessingResourceType;
import resources.resourcetype.ResourcetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcessingResourceTypeImpl extends ResourceTypeImpl implements ProcessingResourceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcetypePackage.Literals.PROCESSING_RESOURCE_TYPE;
	}

	@Override
	public EList<Role> getResourceProvidedRoles__ResourceInterfaceProvidingEntity() {
		// TODO Auto-generated method stub
		return null;
	}

} //ProcessingResourceTypeImpl
