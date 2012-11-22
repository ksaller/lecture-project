package org.west.es.context.contextModel.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		org.west.es.context.contextModel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		org.west.es.context.contextModel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		org.west.es.context.contextModel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		org.west.es.context.contextModel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		org.west.es.context.contextModel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
