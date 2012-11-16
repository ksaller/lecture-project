package metamodel.diagram.edit.policies;

import metamodel.diagram.edit.commands.ContextCreateCommand;
import metamodel.diagram.edit.commands.RuntimeConfigCreateCommand;
import metamodel.diagram.providers.MetamodelElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ContextDiagramItemSemanticEditPolicy extends
		MetamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextDiagramItemSemanticEditPolicy() {
		super(MetamodelElementTypes.ContextDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MetamodelElementTypes.RuntimeConfig_2001 == req.getElementType()) {
			return getGEFWrapper(new RuntimeConfigCreateCommand(req));
		}
		if (MetamodelElementTypes.Context_2002 == req.getElementType()) {
			return getGEFWrapper(new ContextCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
