/**
 */
package performance.resources;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see performance.resources.ResourcesPackage
 * @generated
 */
public interface ResourcesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesFactory eINSTANCE = performance.resources.impl.ResourcesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Performance Resources Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Resources Root</em>'.
	 * @generated
	 */
	PerformanceResourcesRoot createPerformanceResourcesRoot();

	/**
	 * Returns a new object of class '<em>Processing Resource Performance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Resource Performance Specification</em>'.
	 * @generated
	 */
	ProcessingResourcePerformanceSpecification createProcessingResourcePerformanceSpecification();

	/**
	 * Returns a new object of class '<em>Communication Link Resource Performance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Link Resource Performance Specification</em>'.
	 * @generated
	 */
	CommunicationLinkResourcePerformanceSpecification createCommunicationLinkResourcePerformanceSpecification();

	/**
	 * Returns a new object of class '<em>HDD Resource Performance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HDD Resource Performance Specification</em>'.
	 * @generated
	 */
	HDDResourcePerformanceSpecification createHDDResourcePerformanceSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcesPackage getResourcesPackage();

} //ResourcesFactory
