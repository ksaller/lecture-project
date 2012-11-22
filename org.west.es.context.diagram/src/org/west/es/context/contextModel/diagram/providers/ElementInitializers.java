package org.west.es.context.contextModel.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
