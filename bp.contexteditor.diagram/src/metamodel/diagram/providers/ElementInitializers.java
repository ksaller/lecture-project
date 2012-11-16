package metamodel.diagram.providers;

import metamodel.diagram.part.MetamodelDiagramEditorPlugin;

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
		ElementInitializers cached = MetamodelDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			MetamodelDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
