/**
 */
package performanceannotations;

import composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Service Execution Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ComponentSpecifiedExecutionTime allows software architects (and performance analysts) to specify the response time of a service (signature + role) of a component. However, the response time is not given for the considered component in general, but the component in a specific context (i.e., in a specific hardware environment with specific external components connected) determined by the AssemblyContext. This allows software architects to include Provided- and CompleteComponentTypes into their software architecuture that still miss a description of their internals. Even though the internals are missing, performance predictions are still possible.
 * 
 * 
 * Note:
 * - Is it actually the response time or total service demand specified here? -> I guess it should be response time. Otherwise, we would require also an assignment to resources.
 * - I guess it's necessary to replace the association  to the AssemblyContext by an association to an AllocationContext, since the Response time is heavily determined by the underlying hardware...
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link performanceannotations.ComponentServiceExecutionTime#getAssemblyContext_ComponentSpecifiedExecutionTime <em>Assembly Context Component Specified Execution Time</em>}</li>
 * </ul>
 *
 * @see performanceannotations.PerformanceannotationsPackage#getComponentServiceExecutionTime()
 * @model
 * @generated
 */
public interface ComponentServiceExecutionTime extends ServiceExecutionTime {
	/**
	 * Returns the value of the '<em><b>Assembly Context Component Specified Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context Component Specified Execution Time</em>' reference.
	 * @see #setAssemblyContext_ComponentSpecifiedExecutionTime(AssemblyContext)
	 * @see performanceannotations.PerformanceannotationsPackage#getComponentServiceExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext_ComponentSpecifiedExecutionTime();

	/**
	 * Sets the value of the '{@link performanceannotations.ComponentServiceExecutionTime#getAssemblyContext_ComponentSpecifiedExecutionTime <em>Assembly Context Component Specified Execution Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context Component Specified Execution Time</em>' reference.
	 * @see #getAssemblyContext_ComponentSpecifiedExecutionTime()
	 * @generated
	 */
	void setAssemblyContext_ComponentSpecifiedExecutionTime(AssemblyContext value);

} // ComponentServiceExecutionTime
