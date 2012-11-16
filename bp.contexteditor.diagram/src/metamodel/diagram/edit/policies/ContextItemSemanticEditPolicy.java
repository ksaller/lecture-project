package metamodel.diagram.edit.policies;

import java.util.Iterator;

import metamodel.diagram.edit.commands.AssociateConnectionCreateCommand;
import metamodel.diagram.edit.commands.AssociateConnectionReorientCommand;
import metamodel.diagram.edit.commands.ExcludeConnectionCreateCommand;
import metamodel.diagram.edit.commands.ExcludeConnectionReorientCommand;
import metamodel.diagram.edit.commands.IncludeConnectionCreateCommand;
import metamodel.diagram.edit.commands.IncludeConnectionReorientCommand;
import metamodel.diagram.edit.commands.PriorConnectionCreateCommand;
import metamodel.diagram.edit.commands.PriorConnectionReorientCommand;
import metamodel.diagram.edit.parts.AssociateConnectionEditPart;
import metamodel.diagram.edit.parts.ExcludeConnectionEditPart;
import metamodel.diagram.edit.parts.IncludeConnectionEditPart;
import metamodel.diagram.edit.parts.PriorConnectionEditPart;
import metamodel.diagram.part.MetamodelVisualIDRegistry;
import metamodel.diagram.providers.MetamodelElementTypes;

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

/**
 * @generated
 */
public class ContextItemSemanticEditPolicy extends
		MetamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextItemSemanticEditPolicy() {
		super(MetamodelElementTypes.Context_2002);
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
			if (MetamodelVisualIDRegistry.getVisualID(incomingLink) == AssociateConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MetamodelVisualIDRegistry.getVisualID(incomingLink) == PriorConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MetamodelVisualIDRegistry.getVisualID(incomingLink) == ExcludeConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MetamodelVisualIDRegistry.getVisualID(outgoingLink) == AssociateConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MetamodelVisualIDRegistry.getVisualID(outgoingLink) == IncludeConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MetamodelVisualIDRegistry.getVisualID(outgoingLink) == PriorConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MetamodelVisualIDRegistry.getVisualID(outgoingLink) == ExcludeConnectionEditPart.VISUAL_ID) {
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
		if (MetamodelElementTypes.AssociateConnection_4001 == req
				.getElementType()) {
			return getGEFWrapper(new AssociateConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MetamodelElementTypes.IncludeConnection_4002 == req
				.getElementType()) {
			return getGEFWrapper(new IncludeConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MetamodelElementTypes.PriorConnection_4003 == req.getElementType()) {
			return getGEFWrapper(new PriorConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MetamodelElementTypes.ExcludeConnection_4004 == req
				.getElementType()) {
			return getGEFWrapper(new ExcludeConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MetamodelElementTypes.AssociateConnection_4001 == req
				.getElementType()) {
			return getGEFWrapper(new AssociateConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MetamodelElementTypes.IncludeConnection_4002 == req
				.getElementType()) {
			return null;
		}
		if (MetamodelElementTypes.PriorConnection_4003 == req.getElementType()) {
			return getGEFWrapper(new PriorConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MetamodelElementTypes.ExcludeConnection_4004 == req
				.getElementType()) {
			return getGEFWrapper(new ExcludeConnectionCreateCommand(req,
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
		case AssociateConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new AssociateConnectionReorientCommand(req));
		case IncludeConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new IncludeConnectionReorientCommand(req));
		case PriorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new PriorConnectionReorientCommand(req));
		case ExcludeConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new ExcludeConnectionReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
