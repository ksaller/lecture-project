package contextmapper.diagram.providers;

import contextmapper.diagram.part.ContextmapperDiagramEditorPlugin;

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
		ElementInitializers cached = ContextmapperDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			ContextmapperDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
