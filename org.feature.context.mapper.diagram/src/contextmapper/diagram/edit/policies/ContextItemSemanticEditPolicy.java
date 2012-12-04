package contextmapper.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import contextmapper.diagram.edit.commands.ExcludeConnectionCreateCommand;
import contextmapper.diagram.edit.commands.ExcludeConnectionReorientCommand;
import contextmapper.diagram.edit.commands.ExtendConnectionCreateCommand;
import contextmapper.diagram.edit.commands.ExtendConnectionReorientCommand;
import contextmapper.diagram.edit.commands.IncludeConnectionCreateCommand;
import contextmapper.diagram.edit.commands.IncludeConnectionReorientCommand;
import contextmapper.diagram.edit.commands.PriorConnectionCreateCommand;
import contextmapper.diagram.edit.commands.PriorConnectionReorientCommand;
import contextmapper.diagram.edit.parts.ExcludeConnectionEditPart;
import contextmapper.diagram.edit.parts.ExtendConnectionEditPart;
import contextmapper.diagram.edit.parts.IncludeConnectionEditPart;
import contextmapper.diagram.edit.parts.PriorConnectionEditPart;
import contextmapper.diagram.part.ContextmapperVisualIDRegistry;
import contextmapper.diagram.providers.ContextmapperElementTypes;

/**
 * @generated
 */
public class ContextItemSemanticEditPolicy extends
		ContextmapperBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextItemSemanticEditPolicy() {
		super(ContextmapperElementTypes.Context_2002);
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
			if (ContextmapperVisualIDRegistry.getVisualID(incomingLink) == ExtendConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ContextmapperVisualIDRegistry.getVisualID(incomingLink) == ExcludeConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ContextmapperVisualIDRegistry.getVisualID(incomingLink) == PriorConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ContextmapperVisualIDRegistry.getVisualID(incomingLink) == IncludeConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ContextmapperVisualIDRegistry.getVisualID(outgoingLink) == ExtendConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ContextmapperVisualIDRegistry.getVisualID(outgoingLink) == ExcludeConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ContextmapperVisualIDRegistry.getVisualID(outgoingLink) == PriorConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
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
		if (ContextmapperElementTypes.ExtendConnection_4002 == req
				.getElementType()) {
			return getGEFWrapper(new ExtendConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ContextmapperElementTypes.ExcludeConnection_4004 == req
				.getElementType()) {
			return getGEFWrapper(new ExcludeConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ContextmapperElementTypes.PriorConnection_4001 == req
				.getElementType()) {
			return getGEFWrapper(new PriorConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ContextmapperElementTypes.IncludeConnection_4003 == req
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
		if (ContextmapperElementTypes.ExtendConnection_4002 == req
				.getElementType()) {
			return getGEFWrapper(new ExtendConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ContextmapperElementTypes.ExcludeConnection_4004 == req
				.getElementType()) {
			return getGEFWrapper(new ExcludeConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ContextmapperElementTypes.PriorConnection_4001 == req
				.getElementType()) {
			return getGEFWrapper(new PriorConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ContextmapperElementTypes.IncludeConnection_4003 == req
				.getElementType()) {
			return getGEFWrapper(new IncludeConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ExtendConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new ExtendConnectionReorientCommand(req));
		case ExcludeConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new ExcludeConnectionReorientCommand(req));
		case PriorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new PriorConnectionReorientCommand(req));
		case IncludeConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new IncludeConnectionReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
