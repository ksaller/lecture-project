package contextmapper.diagram.part;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.feature.multi.perspective.mapping.viewmapping.MappingModel;
import contextmapper.diagram.customized.GlobalObjectGetter;
import contextmapper.diagram.edit.commands.MappingCommand;

/**
 * @generated
 */
public class ContextmapperProjectCreationWizard extends
		ContextmapperCreationWizard {

	protected WizardNewProjectCreationPage projectCreationPage;

	private URI createFileURI(String path, boolean mustExist) {
		File filePath = new File(path);
		if (!filePath.exists() && mustExist)
			throw new IllegalArgumentException(path + " does not exist.");

		return URI.createFileURI(filePath.getAbsolutePath());
	}

	static void copyfile(String srFile, String dtFile) {
		try {
			File f1 = new File(srFile);
			File f2 = new File(dtFile);
			InputStream in = new FileInputStream(f1);

			// For Append the file.
			// OutputStream out = new FileOutputStream(f2,true);

			// For Overwrite the file.
			OutputStream out = new FileOutputStream(f2);

			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
			System.out.println("File copied.");
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage()
					+ " in the specified projectCreationPage.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * erstellt neues Verzeichnis name
	 * 
	 * @author Timo
	 * @param path
	 * @param name
	 */
	public static void cerateDir(String path, String name) {
		File file = new File(path + name);
		;
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.print("projectCreationPage is created!");
				System.out.println(file.getAbsolutePath());
			} else {
				System.out.println("Failed to create projectCreationPage!");
			}

		}
	}

	/**
	 * gibt Verzeichnispfad einer URI zurück
	 * 
	 * @author Timo
	 * @param uri
	 * @return
	 */
	public static String getUriCotainerPath(URI uri) {

		String str2 = URI.decode(uri.path());
		String str4 = URI.decode(uri.lastSegment());
		return str2.substring(0, str2.length() - str4.length());
	}

	/**
	 * @generated NOT
	 */
	public void addPages() {

		projectCreationPage = new WizardNewProjectCreationPage("NewProjectPage");
		projectCreationPage.setDescription("Geben Sie dem Projekt einen Namen");
		projectCreationPage.setTitle("Geben Sie dem Projekt einen Namen");

		addPage(projectCreationPage);

		// Erstellt eine neue Wizard-Page, auf die eine *.viewmapping-Datei
		// ausgewählt werden muss
		viewMappingFilePage = new FileSelectionPage(
				"ViewMappingFile", getSelection(), "viewmapping") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) validatePage();

				super.setVisible(visible);
			}
		};

		// Legt Titel und Beschreibung der Seite fest und fügt sie dem Wizard
		// hinzu
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
		
		// speicherort
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final String locationPath = projectCreationPage.getLocationPath() + "/";
		final String dir = projectCreationPage.getProjectName();
		// todo
		cerateDir(locationPath, dir);
		cerateDir(locationPath + dir, "/feature");
		cerateDir(locationPath + dir, "/viewmodel");
		cerateDir(locationPath + dir, "/mapping");
		IRunnableWithProgress op = new IRunnableWithProgress() {
			String contextmapperPath = locationPath + dir + "/contextmapper/" + dir
					+ ".contextmapper_diagram";
			String contextmapperPath2 = locationPath + dir + "/contextmapper/" + dir
					+ ".contextmapper";

			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {

				diagram = ContextmapperDiagramEditorUtil.createDiagram(

				URI.createFileURI(contextmapperPath), URI.createFileURI(contextmapperPath2),
						monitor);
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
		MappingModel mappingModel = (MappingModel) contextmapper.diagram.customized.GlobalObjectGetter
				.loadModel(viewMappingFilePage.getURI(), null);

		String viewMappingPath = locationPath + dir + "/mapping/"
				+ URI.decode(viewMappingFilePage.getURI().lastSegment());

		String featurePath = locationPath
				+ dir
				+ "/feature/"
				+ URI.decode(mappingModel.getFeatureModel().eResource()
						.getURI().lastSegment());

		String viewmodelPath = locationPath
				+ dir
				+ "/viewmodel/"
				+ URI.decode(mappingModel.getViewModel().eResource().getURI()
						.lastSegment());
		
		copyfile(URI.decode(viewMappingFilePage.getURI().path()),
				viewMappingPath);
		copyfile(URI.decode(mappingModel.getViewModel().eResource().getURI()
						.path()), viewmodelPath);
		copyfile(URI.decode(mappingModel.getFeatureModel().eResource().getURI()
						.path()), featurePath);

		// MappingModel aus viewmapping-Datei laden:
		mappingModel = (MappingModel) contextmapper.diagram.customized.GlobalObjectGetter
				.loadModel(this.createFileURI(viewMappingPath, true), null);
		// .loadModel(viewMappingFilePage.getURI(), null);

		// MappingModel an ContextDiagram zuweisen:
		DiagramEditor editor = GlobalObjectGetter.getDiagramEditor();
		ICommandProxy setMappingCommand = new ICommandProxy(new MappingCommand(
				editor.getEditingDomain(), mappingModel));
		setMappingCommand.execute();

		final IProject project = projectCreationPage.getProjectHandle();
		final IProjectDescription desc = workspace
				.newProjectDescription(projectCreationPage.getProjectName());

		if (!projectCreationPage.getLocationPath().toString()
				.matches(workspace.getRoot().getLocation().toString())) {
			desc.setLocation(projectCreationPage.getLocationPath()
					.addTrailingSeparator().addTrailingSeparator().append(dir));
		}
		IWorkspaceRunnable operation = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				project.create(desc, monitor);
				project.open(null);

			}
		};
		try {
			workspace.run(operation, null);
			// workspace.addResourceChangeListener(listener)
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return diagram != null;
	}

}

