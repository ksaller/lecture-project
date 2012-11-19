package metamodel.diagram.edit.parts;

import metamodel.diagram.part.MetamodelVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MetamodelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MetamodelVisualIDRegistry.getVisualID(view)) {

			case ContextDiagramEditPart.VISUAL_ID:
				return new ContextDiagramEditPart(view);

			case RuntimeConfigEditPart.VISUAL_ID:
				return new RuntimeConfigEditPart(view);

			case ContextEditPart.VISUAL_ID:
				return new ContextEditPart(view);

			case ContextNameEditPart.VISUAL_ID:
				return new ContextNameEditPart(view);

			case IncludeConnectionEditPart.VISUAL_ID:
				return new IncludeConnectionEditPart(view);

			case AssociateConnectionEditPart.VISUAL_ID:
				return new AssociateConnectionEditPart(view);

			case ExcludeConnectionEditPart.VISUAL_ID:
				return new ExcludeConnectionEditPart(view);

			case PriorConnectionEditPart.VISUAL_ID:
				return new PriorConnectionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
