package contextmapper.diagram.application;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.feature.multi.perspective.mapping.viewmapping.MappingModel;
import org.feature.multi.perspective.mapping.viewmapping.ViewmappingFactory;
import org.feature.multi.perspective.mapping.viewmapping.impl.ViewmappingFactoryImpl;
import org.feature.multi.perspective.mapping.viewmapping.util.ViewmappingAdapterFactory;
import org.featuremapper.models.feature.FeatureModel;
import org.featuremapper.models.feature.FeaturePackage;

import contextmapper.diagram.part.ContextmapperCreationWizard;
import contextmapper.diagram.part.Messages;

/**
 * @generated
 */
public class DiagramEditorActionBarAdvisor extends ActionBarAdvisor {

	/**
	 * @generated
	 */
	private ActionFactory.IWorkbenchAction lockToolBarAction;

	/**
	 * @generated
	 */
	private ActionFactory.IWorkbenchAction toggleCoolbarAction;
	

	/**
	 * @generated
	 */
	public DiagramEditorActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	/**
	 * @generated
	 */
	private IWorkbenchWindow getWindow() {
		return getActionBarConfigurer().getWindowConfigurer().getWindow();
	}

	/**
	 * @generated NOT
	 */
	protected void makeActions(IWorkbenchWindow window) {
		toggleCoolbarAction = ActionFactory.TOGGLE_COOLBAR.create(window);
		register(toggleCoolbarAction);
		lockToolBarAction = ActionFactory.LOCK_TOOL_BAR.create(window);
		register(lockToolBarAction);
		

		register(ActionFactory.CLOSE.create(window));

		register(ActionFactory.CLOSE_ALL.create(window));

		register(ActionFactory.SAVE.create(window));

		register(ActionFactory.SAVE_AS.create(window));

		register(ActionFactory.SAVE_ALL.create(window));

		register(ActionFactory.QUIT.create(window));

		register(ActionFactory.UNDO.create(window));

		register(ActionFactory.REDO.create(window));

		register(ActionFactory.CUT.create(window));

		register(ActionFactory.COPY.create(window));

		register(ActionFactory.PASTE.create(window));

		register(ActionFactory.DELETE.create(window));

		register(ActionFactory.SELECT_ALL.create(window));

		register(ActionFactory.OPEN_NEW_WINDOW.create(window));

		register(ActionFactory.PRINT.create(window));
		
	}

	/**
	 * @generated
	 */
	protected void fillMenuBar(IMenuManager menu) {

		{
			IMenuManager menuX = new MenuManager(
					Messages.ApplicationMenuName_File,
					IWorkbenchActionConstants.M_FILE);

			menuX.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));

			{
				IMenuManager menuXX = new MenuManager(
						Messages.ApplicationMenuName_New, "new");

				menuXX.add(new GroupMarker(
						IWorkbenchActionConstants.MB_ADDITIONS));
				menuX.add(menuXX);
			}

			menuX.add(new Separator());

			menuX.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));

			menuX.add(new Separator());

			menuX.add(getAction(ActionFactory.CLOSE.getId()));

			menuX.add(getAction(ActionFactory.CLOSE_ALL.getId()));
			

			menuX.add(new Separator());

			menuX.add(getAction(ActionFactory.SAVE.getId()));

			menuX.add(getAction(ActionFactory.SAVE_AS.getId()));

			menuX.add(getAction(ActionFactory.SAVE_ALL.getId()));

			menuX.add(new Separator());

			menuX.add(getAction(ActionFactory.QUIT.getId()));

			menuX.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
			menu.add(menuX);
		}

		{
			IMenuManager menuX = new MenuManager(
					Messages.ApplicationMenuName_Edit,
					IWorkbenchActionConstants.M_EDIT);

			menuX.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));

			menuX.add(getAction(ActionFactory.UNDO.getId()));

			menuX.add(getAction(ActionFactory.REDO.getId()));

			menuX.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));

			menuX.add(new Separator());

			menuX.add(getAction(ActionFactory.CUT.getId()));

			menuX.add(getAction(ActionFactory.COPY.getId()));

			menuX.add(getAction(ActionFactory.PASTE.getId()));

			menuX.add(new GroupMarker(IWorkbenchActionConstants.CUT_EXT));

			menuX.add(new Separator());

			menuX.add(getAction(ActionFactory.DELETE.getId()));

			menuX.add(getAction(ActionFactory.SELECT_ALL.getId()));

			menuX.add(new Separator());

			menuX.add(new GroupMarker(IWorkbenchActionConstants.ADD_EXT));

			menuX.add(new GroupMarker(IWorkbenchActionConstants.EDIT_END));

			menuX.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
			menu.add(menuX);
		}

		menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));

		{
			IMenuManager menuX = new MenuManager(
					Messages.ApplicationMenuName_Window,
					IWorkbenchActionConstants.M_WINDOW);

			menuX.add(getAction(ActionFactory.OPEN_NEW_WINDOW.getId()));

			menuX.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			menu.add(menuX);
		}

		{
			IMenuManager menuX = new MenuManager(
					Messages.ApplicationMenuName_Help,
					IWorkbenchActionConstants.M_HELP);

			menuX.add(new GroupMarker(IWorkbenchActionConstants.HELP_START));

			menuX.add(new GroupMarker(IWorkbenchActionConstants.HELP_END));

			menuX.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			menu.add(menuX);
		}
	}

	/**
	 * @generated
	 */
	protected void fillCoolBar(ICoolBarManager toolBar) {
		IMenuManager popUpMenu = new MenuManager();
		popUpMenu.add(new ActionContributionItem(lockToolBarAction));
		popUpMenu.add(new ActionContributionItem(toggleCoolbarAction));
		toolBar.setContextMenuManager(popUpMenu);

		toolBar.add(new GroupMarker("group.file"));

		{
			IToolBarManager toolBarX = new ToolBarManager();

			toolBarX.add(new Separator(IWorkbenchActionConstants.NEW_GROUP));

			toolBarX.add(new GroupMarker(IWorkbenchActionConstants.NEW_EXT));

			toolBarX.add(new GroupMarker(IWorkbenchActionConstants.SAVE_GROUP));

			toolBarX.add(getAction(ActionFactory.SAVE.getId()));

			toolBarX.add(new GroupMarker(IWorkbenchActionConstants.SAVE_EXT));

			toolBarX.add(getAction(ActionFactory.PRINT.getId()));

			toolBarX.add(new GroupMarker(IWorkbenchActionConstants.PRINT_EXT));

			toolBarX.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
			toolBar.add(new ToolBarContributionItem(toolBarX,
					IWorkbenchActionConstants.TOOLBAR_FILE));
		}

		toolBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));

		toolBar.add(new GroupMarker("group.nav"));

		toolBar.add(new GroupMarker(IWorkbenchActionConstants.GROUP_EDITOR));

		toolBar.add(new GroupMarker(IWorkbenchActionConstants.GROUP_HELP));

		{
			IToolBarManager toolBarX = new ToolBarManager();

			toolBarX.add(new Separator(IWorkbenchActionConstants.GROUP_HELP));

			toolBarX.add(new GroupMarker(IWorkbenchActionConstants.GROUP_APP));
			toolBar.add(new ToolBarContributionItem(toolBarX,
					IWorkbenchActionConstants.TOOLBAR_HELP));
		}
	}

	/**
	 * @generated
	 */
	private static boolean openEditor(IWorkbench workbench, URI fileURI) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		IEditorDescriptor editorDescriptor = workbench.getEditorRegistry()
				.getDefaultEditor(fileURI.toFileString());
		if (editorDescriptor == null) {
			MessageDialog
					.openError(
							workbenchWindow.getShell(),
							Messages.DiagramEditorActionBarAdvisor_DefaultFileEditorTitle,
							NLS.bind(
									Messages.DiagramEditorActionBarAdvisor_DefaultFileEditorMessage,
									fileURI.toFileString()));
			return false;
		} else {
			try {
				page.openEditor(new URIEditorInput(fileURI),
						editorDescriptor.getId());
			} catch (PartInitException exception) {
				MessageDialog
						.openError(
								workbenchWindow.getShell(),
								Messages.DiagramEditorActionBarAdvisor_DefaultEditorOpenErrorTitle,
								exception.getMessage());
				return false;
			}
		}
		return true;
	}

	/**
	 * @generated
	 */
	public static class NewDiagramAction extends WorkbenchWindowActionDelegate {

		/**
		 * @generated
		 */
		public void run(IAction action) {
			ContextmapperCreationWizard wizard = new ContextmapperCreationWizard();
			wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY);
			WizardDialog wizardDialog = new WizardDialog(
					getWindow().getShell(), wizard);
			wizardDialog.open();
		}
	}

	/**
	 * @generated
	 */
	public static class OpenURIAction extends WorkbenchWindowActionDelegate {

		/**
		 * @generated
		 */
		public void run(IAction action) {
			LoadResourceAction.LoadResourceDialog loadResourceDialog = new LoadResourceAction.LoadResourceDialog(
					getWindow().getShell());
			if (Dialog.OK == loadResourceDialog.open()) {
				for (Iterator i = loadResourceDialog.getURIs().iterator(); i
						.hasNext();) {
					openEditor(getWindow().getWorkbench(), (URI) i.next());
				}
			}
		}
	}

	/**
	 * @generated
	 */
	public static class OpenAction extends WorkbenchWindowActionDelegate {

		/**
		 * @generated
		 */
		public void run(IAction action) {
			FileDialog fileDialog = new FileDialog(getWindow().getShell(),
					SWT.OPEN);
			fileDialog.open();
			if (fileDialog.getFileName() != null
					&& fileDialog.getFileName().length() > 0) {
				openEditor(
						getWindow().getWorkbench(),
						URI.createFileURI(fileDialog.getFilterPath()
								+ File.separator + fileDialog.getFileName()));
			}
		}
	}

	/**
	 * 
	 * Action, that allows the User to load a .viewmapping file 
	 * @author Stefan
	 * @generated NOT
	 */
	public static class LoadViewMappingAction extends WorkbenchWindowActionDelegate {

		public void run(IAction action) {
			FileDialog fileDialog = new FileDialog(getWindow().getShell(),
					SWT.OPEN);
			String[] extensions = {"*.viewmapping", "*.*"};
			fileDialog.setFilterExtensions(extensions);
			fileDialog.open();
			if (fileDialog.getFileName() != null
					&& fileDialog.getFileName().length() > 0) {
				
				//TODO: complete code!!!!
				MappingModel fm = (MappingModel) loadModel(URI.createFileURI(fileDialog.getFilterPath() + 
			    		File.separator + fileDialog.getFileName()), null);
								
			    MessageDialog.openInformation(getWindow().getShell(),"Test","1. Feature des Mapping-Model: " + fm.getMappings().get(0).getFeatures().get(0).getName());		
			}
		}
	}

	private static EObject loadModel(EPackage ePackage, String path,
			ResourceSet resourceSet) {
		initEMF(ePackage);

		return loadModel(createFileURI(path, true), resourceSet);
	}

	private static EObject loadModel(URI uri, ResourceSet resourceSet) {
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

	private static URI createFileURI(String path, boolean mustExist) {
		File filePath = new File(path);
		if (!filePath.exists() && mustExist)
			throw new IllegalArgumentException(path + " does not exist.");

		return URI.createFileURI(filePath.getAbsolutePath());
	}

	private static void registerXMIFactoryAsDefault() {
		// Add XMI factory to registry
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
	}

	private static void initEMF(EPackage ePackage) {
		// Initialize the model
		// logger.debug("Initializing " + ePackage.getName());

		ePackage.getName();
		registerXMIFactoryAsDefault();
	}	
	
	
	/**
	 * @generated
	 */
	public static class AboutAction extends WorkbenchWindowActionDelegate {

		/**
		 * @generated
		 */
		public void run(IAction action) {
			MessageDialog.openInformation(getWindow().getShell(),
					Messages.DiagramEditorActionBarAdvisor_AboutDialogTitle,
					Messages.DiagramEditorActionBarAdvisor_AboutDialogMessage);
		}
	}

}