/**
 */
package usage.tests;

import junit.textui.TestRunner;

import usage.Delay;
import usage.UsageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelayTest extends AbstractUserActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelayTest.class);
	}

	/**
	 * Constructs a new Delay test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delay test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Delay getFixture() {
		return (Delay)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsageFactory.eINSTANCE.createDelay());
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

} //DelayTest
