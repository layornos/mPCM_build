/**
 */
package usage.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>usage</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new UsageTests("usage Tests");
		suite.addTestSuite(ScenarioBehaviourTest.class);
		suite.addTestSuite(StartTest.class);
		suite.addTestSuite(StopTest.class);
		suite.addTestSuite(BranchTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTests(String name) {
		super(name);
	}

} //UsageTests
