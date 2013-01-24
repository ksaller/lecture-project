package contextmapper.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.feature.multi.perspective.mapping.viewmapping.MappingModel;

import contextmapper.diagram.customized.GlobalObjectGetter;
import contextmapper.diagram.edit.commands.MappingCommand;

/**
 * @generated
 */
public class ContextmapperCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected ContextmapperCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected ContextmapperCreationWizardPage domainModelFilePage;

	/**
	 * @author Stefan 
	 * @generated NOT
	 */
	protected ContextmapperCreationWizardPage viewMappingFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.ContextmapperCreationWizardTitle);
		setDefaultPageImageDescriptor(ContextmapperDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewContextmapperWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated NOT
	 */
	public void addPages() {
		diagramModelFilePage = new ContextmapperCreationWizardPage(
				"DiagramModelFile", getSelection(), "contextmapper_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setFilterExtensions(new String[] { "*.contextmapper_diagram" });
		diagramModelFilePage
				.setTitle(Messages.ContextmapperCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.ContextmapperCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new ContextmapperCreationWizardPage(
				"DomainModelFile", getSelection(), "contextmapper") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".contextmapper_diagram".length()); //$NON-NLS-1$
					setFileName(ContextmapperDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "contextmapper")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setFilterExtensions(new String[] { "*.contextmapper" });
		domainModelFilePage
				.setTitle(Messages.ContextmapperCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.ContextmapperCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);

		// Erstellt eine neue Wizard-Page, auf die eine *.viewmapping-Datei ausgewählt werden muss
		viewMappingFilePage = new ContextmapperCreationWizardPage(
				"ViewMappingFile", getSelection(), "viewmapping") {
			public void setVisible(boolean visible) {
				if (visible) {
					setFileName("");
				}
				super.setVisible(visible);
			}
		};
		// Legt Titel und Beschreibung der Seite fest und fügt sie dem Wizard hinzu
		viewMappingFilePage
				.setFilterExtensions(new String[] { "*.viewmapping" });
		viewMappingFilePage
				.setTitle(Messages.ContextmapperCreationWizard_ViewMappingFilePageTitle);
		viewMappingFilePage
				.setDescription(Messages.ContextmapperCreationWizard_ViewMappingFilePageDescription);
		addPage(viewMappingFilePage);
	}

	/**
	 * @generated NOT
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				diagram = ContextmapperDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						ContextmapperDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										Messages.ContextmapperCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.ContextmapperCreationWizardCreationError,
						null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				ContextmapperDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}

		// MappingModel aus viewmapping-Datei laden:
		MappingModel mappingModel = (MappingModel) contextmapper.diagram.customized.GlobalObjectGetter
				.loadModel(viewMappingFilePage.getURI(), null);

		// MappingModel an ContextDiagram zuweisen:
		DiagramEditor editor = GlobalObjectGetter.getDiagramEditor();
		ICommandProxy setMappingCommand = new ICommandProxy(new MappingCommand(
				editor.getEditingDomain(), mappingModel));
		setMappingCommand.execute();
		return diagram != null;
	}

}