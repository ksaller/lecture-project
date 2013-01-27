

package contextmapper.diagram.part;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;


import org.eclipse.core.resources.IProject;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.common.util.URI;
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
	 * @author Stefan 
	 * @generated NOT
	 */
	protected ContextmapperCreationWizardPage viewMappingFilePage;
	protected PojectNameCreationPage directory;
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
	private URI createFileURI(String path, boolean mustExist) {
		File filePath = new File(path);
		if (!filePath.exists() && mustExist)
			throw new IllegalArgumentException(path + " does not exist.");

		return URI.createFileURI(filePath.getAbsolutePath());
	}
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
		System.out.println("aaaaaaaaaaaaaa");
	}
	 static void copyfile(String srFile, String dtFile){
		 try{
		 File f1 = new File(srFile);
		 File f2 = new File(dtFile);
		 InputStream in = new FileInputStream(f1);
		 
		 //For Append the file.
		// OutputStream out = new FileOutputStream(f2,true);

		 //For Overwrite the file.
		 OutputStream out = new FileOutputStream(f2);

		 byte[] buf = new byte[1024];
		 int len;
		 while ((len = in.read(buf)) > 0){
		 out.write(buf, 0, len);
		 }
		 in.close();
		 out.close();
		 System.out.println("File copied.");
		 }
		 catch(FileNotFoundException ex){
		 System.out.println(ex.getMessage() + " in the specified directory.");
		 System.exit(0);
		 }
		 catch(IOException e){
		 System.out.println(e.getMessage());  
		 }
		 }
		/**
		 * @author Timo
		 * @param viewMapping
		 * @return new String[] {FeatureModelpath,ViewModelpath}
		 */
		 public static String[] getFeatureViewModelpath(URI viewMapping){
		 String zeile1 = "";
		 String zeile2 = "";
		 String zeile3 = "";
		 String zeile4 = "";

			  FileReader fr;
			try {
				fr = new FileReader(URI.decode(viewMapping.path()));
			
			    BufferedReader br = new BufferedReader(fr);


			    try {
					while( (zeile1 = br.readLine()) != null )
					{
					 zeile4=zeile3;
					 zeile3=zeile2;
					 zeile2=zeile1;
					}
				
			

			    br.close();} catch (IOException e) {
					
					e.printStackTrace();}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			int n1=0,n2=0;
			
			for(int n=0;n<zeile4.length();n++)
			{
			if (zeile4.charAt(n)=='/'){n1=n;break;}}
			for(int n=n1;n<zeile4.length();n++)
			{
			if (zeile4.charAt(n)=='#'){n2=n;break;}
			}
			zeile4=zeile4.substring(n1,n2);
			
			for(int n=0;n<zeile3.length();n++)
			{
			if (zeile3.charAt(n)=='/'){n1=n;break;}}
			for(int n=n1;n<zeile3.length();n++)
			{
			if (zeile3.charAt(n)=='#'){n2=n;break;}
			}
			zeile3=zeile3.substring(n1,n2);
			return new String[] {zeile4,zeile3};}
		 /**
		  * erstellt neues Verzeichnis name 
		  * @author Timo
		  * @param path
		  * @param name
		  */
		 public static void cerateDir(String path,String name){
			 File file = new File(path+name
						);;
				if (!file.exists()) {
					if (file.mkdir()) {
						System.out.print("Directory is created!");
						System.out.println(file.getAbsolutePath());
					} else {
						System.out.println("Failed to create directory!");
					}
				
		 }
		 }
		 /**
		  * gibt Verzeichnispfad einer URI zurück
		  * @author Timo
		  * @param uri
		  * @return
		  */
		 public static String  getUriCotainerPath(URI uri){
			 
			String str2=URI.decode(uri.path());
			String str4=URI.decode(uri.lastSegment());

			return str2.substring(0, str2.length()-str4.length());
		 }
			
			
		

	/**
	 * @generated NOT
	 */
	public void addPages() {
		directory=new PojectNameCreationPage("Setze Namen für Projekt", getSelection()){ //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
		if (visible) {
			
			
	 validatePage();
	
			//$NON-NLS-1$
		}
		super.setVisible(visible);
	}
};
		directory.setDescription("Geben Sie dem Projekt einen Namen");
		directory.setTitle("Geben Sie dem Projekt einen Namen");
		
		addPage(directory);
		
		// Erstellt eine neue Wizard-Page, auf die eine *.viewmapping-Datei ausgewählt werden muss
		viewMappingFilePage = new ContextmapperCreationWizardPage(
				"ViewMappingFile", getSelection(), "viewmapping") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					
					setFileName(ContextmapperDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									"mapping", "viewmapping")); 
			validatePage();
			
					//$NON-NLS-1$
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
		 
		String  viewmappingPath=getFeatureViewModelpath(viewMappingFilePage.getURI())[0];
		  String  featurePath=getFeatureViewModelpath(viewMappingFilePage.getURI())[1];
			
			//name
			
			//speicherort
			IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
			File workspaceDirectory = workspace.getRoot().getLocation().toFile(); 
			final String worksp =workspaceDirectory.getAbsolutePath()+"/";
			//String oldContainerPath = FileCopy.getUriCotainerPath(diagramModelFilePage.getURI());
			final String dir =directory.projektName.getText();
				cerateDir( worksp ,dir);
				cerateDir( worksp +dir,"/feature");
				cerateDir( worksp +dir,"/viewmodel");
				cerateDir( worksp +dir,"/mapping");
				cerateDir( worksp +dir,"/contextmapper");
		IRunnableWithProgress op = new IRunnableWithProgress() {
			String newPath=worksp+dir+"/contextmapper/"+dir+".contextmapper_diagram";
			String newPath2=worksp+dir+"/contextmapper/"+dir+".contextmapper";
			
		
	        
	     
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				  
				; 
				
				diagram = ContextmapperDiagramEditorUtil.createDiagram(
						
						URI.createFileURI(newPath),
						URI.createFileURI(newPath2), monitor);
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


		
		URI pr =URI.createFileURI(worksp+dir+"/.project");
		//URI.createPlatformResourceURI(worksp+dir+"/.project",true);
		 PrintWriter pWriter;
		try {
			pWriter = new PrintWriter(pr.path());
			pWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			pWriter.println("<projectDescription>");
		    pWriter.println("\t<name>"+dir+"</name>");
			pWriter.println("\t<comment></comment>");
			pWriter.println("\t<projects>");
			pWriter.println("\t</projects>");
			pWriter.println("\t<buildSpec>");
			pWriter.println("\t</buildSpec>");
			pWriter.println("\t<natures>");
			pWriter.println("\t</natures>");
		    pWriter.println("</projectDescription>");


			
			 pWriter.flush();	
			  pWriter.close();  
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
        
        	
		
		
		String newPath; //= oldContainerPath +dir+"/"+URI.decode(diagramModelFilePage.getURI().lastSegment());		
		//FileCopy.copyfile(URI.decode(diagramModelFilePage.getURI().path()),newPath);
		//newPath = oldContainerPath +dir+"/"+URI.decode(domainModelFilePage.getURI().lastSegment());  
		//FileCopy.copyfile(URI.decode(domainModelFilePage.getURI().path()),newPath);
        newPath =  worksp +dir+"/mapping/"+URI.decode(viewMappingFilePage.getURI().lastSegment());		
		copyfile(URI.decode(viewMappingFilePage.getURI().path()),newPath);
		String relPath=getUriCotainerPath(viewMappingFilePage.getURI());
		String oldPath= relPath.substring(0, relPath.length()-"/mapping".length())+featurePath;
		copyfile(oldPath,worksp+dir+featurePath);
		oldPath= relPath.substring(0, relPath.length()-"/mapping".length())+viewmappingPath;
	    copyfile(oldPath,worksp+dir+viewmappingPath);
	
		// MappingModel aus viewmapping-Datei laden:
		MappingModel mappingModel = (MappingModel) contextmapper.diagram.customized.GlobalObjectGetter
			.loadModel(this.createFileURI(newPath, true), null);
		
		
		// MappingModel an ContextDiagram zuweisen:
		DiagramEditor editor = GlobalObjectGetter.getDiagramEditor();
		ICommandProxy setMappingCommand = new ICommandProxy(new MappingCommand(
				editor.getEditingDomain(), mappingModel));
		setMappingCommand.execute();
		
		final IProject project = workspace.getRoot().getProject(dir);
		IWorkspaceRunnable operation  = new IWorkspaceRunnable() {
		      public void run(IProgressMonitor monitor) throws CoreException {
		         project.create(null);
		         project.open(null);
		      }};
		 try {
			 workspace.run(operation, null);
		} catch (CoreException e) {	
			e.printStackTrace();
		}
		
		return diagram != null;
	}

}