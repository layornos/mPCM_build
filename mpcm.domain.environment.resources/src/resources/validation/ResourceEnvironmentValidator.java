/**
 *
 * $Id$
 */
package resources.validation;

import org.eclipse.emf.common.util.EList;

import resources.CommunicationLinkResourceSpecification;
import resources.ResourceContainer;

/**
 * A sample validator interface for {@link resources.ResourceEnvironment}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResourceEnvironmentValidator {
	boolean validate();

	boolean validateResourceContainers(EList<ResourceContainer> value);
	boolean validateCommunicationLinkResourceSpecifications(EList<CommunicationLinkResourceSpecification> value);
}
