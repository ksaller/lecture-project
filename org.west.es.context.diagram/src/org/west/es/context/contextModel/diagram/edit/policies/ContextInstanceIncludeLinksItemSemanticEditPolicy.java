package org.west.es.context.contextModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ContextInstanceIncludeLinksItemSemanticEditPolicy
		extends
		org.west.es.context.contextModel.diagram.edit.policies.ContextModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextInstanceIncludeLinksItemSemanticEditPolicy() {
		super(
				org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstanceIncludeLinks_4006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
