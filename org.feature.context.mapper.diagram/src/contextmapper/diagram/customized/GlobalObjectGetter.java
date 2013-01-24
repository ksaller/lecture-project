package contextmapper.diagram.customized;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.ui.IWorkbench;

import contextmapper.ContextDiagram;
import contextmapper.diagram.part.ContextmapperDiagramEditorPlugin;

/**
 * Leicher Zugriff auf wichtige Objekte
 * 
 * @author Melvil
 * 
 */
public class GlobalObjectGetter {

	public static ContextDiagram getContextDiagram() {
		return (ContextDiagram) getDiagramEditor().getDiagram().getElement()
				.eResource().getContents().get(0);
	}

	public static IWorkbench getWorkbench() {
		return ContextmapperDiagramEditorPlugin.getInstance().getWorkbench();
	}

	public static DiagramEditor getDiagramEditor() {
		return (DiagramEditor) getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getActiveEditor();
	}

	public static EObject loadModel(URI uri, ResourceSet resourceSet) {
		// Obtain a new resource set if necessary
		if (resourceSet == null)
			resourceSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resourceSet.getResource(uri, true);

		// Add adapter for reverse navigation along unidirectional links
		ECrossReferenceAdapter adapter = ECrossReferenceAdapter
				.getCrossReferenceAdapter(resourceSet);
		if (adapter == null)
			resourceSet.eAdapters().add(new ECrossReferenceAdapter());

		// Return root model element
		return resource.getContents().get(0);
	}
}