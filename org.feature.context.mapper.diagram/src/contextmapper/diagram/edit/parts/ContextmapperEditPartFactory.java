package contextmapper.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import contextmapper.diagram.part.ContextmapperVisualIDRegistry;

/**
 * @generated
 */
public class ContextmapperEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ContextmapperVisualIDRegistry.getVisualID(view)) {

			case ContextDiagramEditPart.VISUAL_ID:
				return new ContextDiagramEditPart(view);

			case RuntimeConfigEditPart.VISUAL_ID:
				return new RuntimeConfigEditPart(view);

			case RuntimeConfigNameEditPart.VISUAL_ID:
				return new RuntimeConfigNameEditPart(view);

			case ContextEditPart.VISUAL_ID:
				return new ContextEditPart(view);

			case ContextNameEditPart.VISUAL_ID:
				return new ContextNameEditPart(view);

			case ExtendConnectionEditPart.VISUAL_ID:
				return new ExtendConnectionEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case ExcludeConnectionEditPart.VISUAL_ID:
				return new ExcludeConnectionEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case PriorConnectionEditPart.VISUAL_ID:
				return new PriorConnectionEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case IncludeConnectionEditPart.VISUAL_ID:
				return new IncludeConnectionEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

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
