/**
 */
package resourceinterfaces.repository.presentation;

import base.provider.BaseEditPlugin;

import behaviourseff.provider.BehaviourseffEditPlugin;

import composition.provider.CompositionEditPlugin;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import de.uka.ipd.sdq.probfunction.provider.ProbabilityFunctionEditPlugin;

import de.uka.ipd.sdq.stoex.provider.StoexEditPlugin;

import de.uka.ipd.sdq.units.provider.UnitsEditPlugin;

import environment.provider.EnvironmentEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import repository.provider.RepositoryEditPlugin;

import resources.provider.ResourcesEditPlugin;

import seff.provider.SeffEditPlugin;

import softwarerepository.provider.SoftwarerepositoryEditPlugin;

import variables.provider.VariablesEditPlugin;

/**
 * This is the central singleton for the Resourceinterfaces editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ResourceinterfacesEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ResourceinterfacesEditorPlugin INSTANCE = new ResourceinterfacesEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceinterfacesEditorPlugin() {
		super
			(new ResourceLocator [] {
				BaseEditPlugin.INSTANCE,
				BehaviourseffEditPlugin.INSTANCE,
				CompositionEditPlugin.INSTANCE,
				EnvironmentEditPlugin.INSTANCE,
				IdentifierEditPlugin.INSTANCE,
				ProbabilityFunctionEditPlugin.INSTANCE,
				RepositoryEditPlugin.INSTANCE,
				ResourcesEditPlugin.INSTANCE,
				SeffEditPlugin.INSTANCE,
				SoftwarerepositoryEditPlugin.INSTANCE,
				StoexEditPlugin.INSTANCE,
				UnitsEditPlugin.INSTANCE,
				VariablesEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
