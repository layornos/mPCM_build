/**
 */
package seff.tests;

import junit.textui.TestRunner;

import seff.ForkedBehaviour;
import seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Forked Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForkedBehaviourTest extends BehaviourTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForkedBehaviourTest.class);
	}

	/**
	 * Constructs a new Forked Behaviour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedBehaviourTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Forked Behaviour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ForkedBehaviour getFixture() {
		return (ForkedBehaviour)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createForkedBehaviour());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ForkedBehaviourTest
