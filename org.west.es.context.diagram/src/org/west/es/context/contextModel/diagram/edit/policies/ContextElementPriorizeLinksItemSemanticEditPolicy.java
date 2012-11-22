package org.west.es.context.contextModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ContextElementPriorizeLinksItemSemanticEditPolicy
		extends
		org.west.es.context.contextModel.diagram.edit.policies.ContextModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextElementPriorizeLinksItemSemanticEditPolicy() {
		super(
				org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementPriorizeLinks_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
