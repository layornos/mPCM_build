/**
 */
package behaviourseff.impl;

import behaviourseff.BehaviourSEFF;
import behaviourseff.BehaviourseffPackage;

import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.CDOObjectHistory;
import org.eclipse.emf.cdo.CDOState;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.lock.CDOLockState;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.common.security.CDOPermission;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import seff.Behaviour;

import softwarerepository.impl.ServiceEffectSpecificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour SEFF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourseff.impl.BehaviourSEFFImpl#getBehaviour <em>Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourSEFFImpl extends ServiceEffectSpecificationImpl implements BehaviourSEFF {
	/**
	 * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected Behaviour behaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourSEFFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourseffPackage.Literals.BEHAVIOUR_SEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour getBehaviour() {
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviour(Behaviour newBehaviour, NotificationChain msgs) {
		Behaviour oldBehaviour = behaviour;
		behaviour = newBehaviour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourseffPackage.BEHAVIOUR_SEFF__BEHAVIOUR, oldBehaviour, newBehaviour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviour(Behaviour newBehaviour) {
		if (newBehaviour != behaviour) {
			NotificationChain msgs = null;
			if (behaviour != null)
				msgs = ((InternalEObject)behaviour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourseffPackage.BEHAVIOUR_SEFF__BEHAVIOUR, null, msgs);
			if (newBehaviour != null)
				msgs = ((InternalEObject)newBehaviour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourseffPackage.BEHAVIOUR_SEFF__BEHAVIOUR, null, msgs);
			msgs = basicSetBehaviour(newBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourseffPackage.BEHAVIOUR_SEFF__BEHAVIOUR, newBehaviour, newBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourseffPackage.BEHAVIOUR_SEFF__BEHAVIOUR:
				return basicSetBehaviour(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourseffPackage.BEHAVIOUR_SEFF__BEHAVIOUR:
				return getBehaviour();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviourseffPackage.BEHAVIOUR_SEFF__BEHAVIOUR:
				setBehaviour((Behaviour)newValue);
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
			case BehaviourseffPackage.BEHAVIOUR_SEFF__BEHAVIOUR:
				setBehaviour((Behaviour)null);
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
			case BehaviourseffPackage.BEHAVIOUR_SEFF__BEHAVIOUR:
				return behaviour != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean cdoConflict() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CDOResource cdoDirectResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CDOObjectHistory cdoHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CDOID cdoID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cdoInvalid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CDOLockState cdoLockState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CDOPermission cdoPermission() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cdoPrefetch(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CDOLock cdoReadLock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cdoReload() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CDOResource cdoResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CDORevision cdoRevision() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CDORevision cdoRevision(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CDOState cdoState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CDOView cdoView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CDOLock cdoWriteLock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CDOLock cdoWriteOption() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEntityName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEntityName(String value) {
		// TODO Auto-generated method stub
		
	}

} //BehaviourSEFFImpl
