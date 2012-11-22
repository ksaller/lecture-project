package org.west.es.context.contextModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ContextElementExcludeLinksItemSemanticEditPolicy
		extends
		org.west.es.context.contextModel.diagram.edit.policies.ContextModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextElementExcludeLinksItemSemanticEditPolicy() {
		super(
				org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExcludeLinks_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
