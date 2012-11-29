package contextmapper.diagram.customized;

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

	public static ContextDiagram getContextDiagram(){
		return (ContextDiagram)getDiagramEditor().getDiagram().getElement().eResource().getContents().get(0);
	}
	
	public static IWorkbench getWorkbench(){
		return ContextmapperDiagramEditorPlugin.getInstance().getWorkbench();
	}
	
	public static DiagramEditor getDiagramEditor(){
		return (DiagramEditor)getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
	}
}
