package contextmapper.diagram.customized;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.ui.IWorkbench;
import org.feature.multi.perspective.mapping.viewmapping.MappingModel;

import contextmapper.ContextDiagram;
import contextmapper.diagram.part.ContextmapperDiagramEditorPlugin;

/**
 * Command, um dem ContextDiagram das MappingModel zuzuweisen
 * 
 * @author Daniel
 */
public class MappingCommand extends AbstractTransactionalCommand {

	private MappingModel mappingModel;
	
	public MappingCommand(TransactionalEditingDomain editingDomain, MappingModel model) {
	    super(editingDomain, "mapping reference", null);
	    mappingModel = model;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		
		// Aktuelles ContextDiagram holen:
		ContextDiagram contextDiagram = GlobalObjectGetter.getContextDiagram();
		
		// TODO: Den nachfolgenden Befehl über execute (wie unten auskommentiert) ausführen. Nur wie?
		contextDiagram.setMappingReference(mappingModel);
		
		//getEditingDomain().getCommandStack().execute(SetCommand.create(getEditingDomain(), myElement, ContextmapperDiagramEditorPlugin.getInstance(), 'New name'));
		//getEditingDomain().getCommandStack().execute(SetCommand.create(getEditingDomain(), myElement, XXXPackage.eINSTANCE.getElemenet_name(), 'New name'));
	    return CommandResult.newOKCommandResult();
	}

}
