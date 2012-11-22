package org.west.es.context.contextModel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ContextModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(view)) {

			case org.west.es.context.contextModel.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
				return new org.west.es.context.contextModel.diagram.edit.parts.ContainerEditPart(
						view);

			case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceEditPart.VISUAL_ID:
				return new org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceEditPart(
						view);

			case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceNameEditPart.VISUAL_ID:
				return new org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceNameEditPart(
						view);

			case org.west.es.context.contextModel.diagram.edit.parts.ContextElementEditPart.VISUAL_ID:
				return new org.west.es.context.contextModel.diagram.edit.parts.ContextElementEditPart(
						view);

			case org.west.es.context.contextModel.diagram.edit.parts.ContextElementNameEditPart.VISUAL_ID:
				return new org.west.es.context.contextModel.diagram.edit.parts.ContextElementNameEditPart(
						view);

			case org.west.es.context.contextModel.diagram.edit.parts.ContextElementExtendsLinkEditPart.VISUAL_ID:
				return new org.west.es.context.contextModel.diagram.edit.parts.ContextElementExtendsLinkEditPart(
						view);

			case org.west.es.context.contextModel.diagram.edit.parts.ContextElementExcludeLinksEditPart.VISUAL_ID:
				return new org.west.es.context.contextModel.diagram.edit.parts.ContextElementExcludeLinksEditPart(
						view);

			case org.west.es.context.contextModel.diagram.edit.parts.ContextElementPriorizeLinksEditPart.VISUAL_ID:
				return new org.west.es.context.contextModel.diagram.edit.parts.ContextElementPriorizeLinksEditPart(
						view);

			case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceIncludeLinksEditPart.VISUAL_ID:
				return new org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceIncludeLinksEditPart(
						view);

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
