package org.west.es.context.contextModel.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ContextElementItemSemanticEditPolicy
		extends
		org.west.es.context.contextModel.diagram.edit.policies.ContextModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextElementItemSemanticEditPolicy() {
		super(
				org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElement_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(incomingLink) == org.west.es.context.contextModel.diagram.edit.parts.ContextElementExtendsLinkEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(incomingLink) == org.west.es.context.contextModel.diagram.edit.parts.ContextElementExcludeLinksEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(incomingLink) == org.west.es.context.contextModel.diagram.edit.parts.ContextElementPriorizeLinksEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(incomingLink) == org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceIncludeLinksEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(outgoingLink) == org.west.es.context.contextModel.diagram.edit.parts.ContextElementExtendsLinkEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(outgoingLink) == org.west.es.context.contextModel.diagram.edit.parts.ContextElementExcludeLinksEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(outgoingLink) == org.west.es.context.contextModel.diagram.edit.parts.ContextElementPriorizeLinksEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExtendsLink_4003 == req
				.getElementType()) {
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextElementExtendsLinkCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExcludeLinks_4004 == req
				.getElementType()) {
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextElementExcludeLinksCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementPriorizeLinks_4005 == req
				.getElementType()) {
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextElementPriorizeLinksCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstanceIncludeLinks_4006 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExtendsLink_4003 == req
				.getElementType()) {
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextElementExtendsLinkCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExcludeLinks_4004 == req
				.getElementType()) {
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextElementExcludeLinksCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementPriorizeLinks_4005 == req
				.getElementType()) {
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextElementPriorizeLinksCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstanceIncludeLinks_4006 == req
				.getElementType()) {
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextInstanceIncludeLinksCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementExtendsLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextElementExtendsLinkReorientCommand(
					req));
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementExcludeLinksEditPart.VISUAL_ID:
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextElementExcludeLinksReorientCommand(
					req));
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementPriorizeLinksEditPart.VISUAL_ID:
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextElementPriorizeLinksReorientCommand(
					req));
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceIncludeLinksEditPart.VISUAL_ID:
			return getGEFWrapper(new org.west.es.context.contextModel.diagram.edit.commands.ContextInstanceIncludeLinksReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
