/**
 */
package seff;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Fork Action Splits the RDSEFF control flow with an AND-semantic, meaning that it invokes several ForkedBehaviours concurrently.  ForkActions
 * allow both asynchronously and synchronously forked behaviours. </p>
 * 
 * <p>By default, the ForkedBehaviours inside a ForkAction are asynchronous. This means that all inner ForkedBehaviours execute concurrently, but the control flow does not wait for them to terminate and continues immediately after their invocation with the successor action of the ForkAction. Thus, in this case, the ForkAction does not wait for any inner ForkedBehaviour.  It is furthermore not possible to refer to results or output parameters of asynchronously ForkedBehaviours in the rest of the RDSEFF, as it is unclear when these results will be available.</p>
 * 
 * <p>To model synchronization, a SynchronizationPoint can be added to the ForkAction. Then, all ForkedBehaviours <strong>within</strong> the SynchronizationPoint execute concurrently and the control flow waits for each of these behaviours to terminate before continuing. If a SynchronizationPoint is used, the ForkAction blocks and waits for all ForkedBehaviours inside the SynchronizationPoint before continuing. Thus, in this case, the successor action of the ForkAction is only executed after all ForkedBehaviours inside the SynchronizationPoint have completed execution. Component developers can specify a result of the computations with its attached VariableUsages.</p>
 * 
 * <p>Each ForkedBehaviour can be considered as a program thread. All parameter characterisations from the surrounding RDSEFF are also valid inside the ForkedBehaviours and can be used to parameterise resource demands or control flow constructs. 
 * The parameter characterisations are the same in each ForkedBehaviour. </p>
 * 
 * <p> The same Fork Action can contain asynchronous and synchronousForkedbehaviours at the same time. In that case, all forked behaviours are started. The control flow waits for all synchronous behaviours to finish execution and only then continues. </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link seff.ForkAction#getAsynchronousForkedBehaviours_ForkAction <em>Asynchronous Forked Behaviours Fork Action</em>}</li>
 *   <li>{@link seff.ForkAction#getSynchronisingBehaviours_ForkAction <em>Synchronising Behaviours Fork Action</em>}</li>
 * </ul>
 *
 * @see seff.SeffPackage#getForkAction()
 * @model
 * @generated
 */
public interface ForkAction extends AbstractInternalControlFlowAction {
	/**
	 * Returns the value of the '<em><b>Asynchronous Forked Behaviours Fork Action</b></em>' containment reference list.
	 * The list contents are of type {@link seff.ForkedBehaviour}.
	 * It is bidirectional and its opposite is '{@link seff.ForkedBehaviour#getForkAction_ForkedBehaivour <em>Fork Action Forked Behaivour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynchronous Forked Behaviours Fork Action</em>' containment reference list.
	 * @see seff.SeffPackage#getForkAction_AsynchronousForkedBehaviours_ForkAction()
	 * @see seff.ForkedBehaviour#getForkAction_ForkedBehaivour
	 * @model opposite="forkAction_ForkedBehaivour" containment="true" ordered="false"
	 * @generated
	 */
	EList<ForkedBehaviour> getAsynchronousForkedBehaviours_ForkAction();

	/**
	 * Returns the value of the '<em><b>Synchronising Behaviours Fork Action</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link seff.SynchronisationPoint#getForkAction_SynchronisationPoint <em>Fork Action Synchronisation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronising Behaviours Fork Action</em>' containment reference.
	 * @see #setSynchronisingBehaviours_ForkAction(SynchronisationPoint)
	 * @see seff.SeffPackage#getForkAction_SynchronisingBehaviours_ForkAction()
	 * @see seff.SynchronisationPoint#getForkAction_SynchronisationPoint
	 * @model opposite="forkAction_SynchronisationPoint" containment="true" ordered="false"
	 * @generated
	 */
	SynchronisationPoint getSynchronisingBehaviours_ForkAction();

	/**
	 * Sets the value of the '{@link seff.ForkAction#getSynchronisingBehaviours_ForkAction <em>Synchronising Behaviours Fork Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronising Behaviours Fork Action</em>' containment reference.
	 * @see #getSynchronisingBehaviours_ForkAction()
	 * @generated
	 */
	void setSynchronisingBehaviours_ForkAction(SynchronisationPoint value);

} // ForkAction
