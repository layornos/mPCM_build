/**
 */
package infrastructure.repository.tests;

import infrastructure.repository.InfrastructureProvidedRole;
import infrastructure.repository.RepositoryFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureProvidedRoleTest extends TestCase {

	/**
	 * The fixture for this Infrastructure Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureProvidedRole fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureProvidedRoleTest.class);
	}

	/**
	 * Constructs a new Infrastructure Provided Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureProvidedRoleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Infrastructure Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InfrastructureProvidedRole fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Infrastructure Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureProvidedRole getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createInfrastructureProvidedRole());
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

} //InfrastructureProvidedRoleTest
