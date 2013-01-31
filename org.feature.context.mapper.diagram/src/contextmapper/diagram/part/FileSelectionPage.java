package contextmapper.diagram.part;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * WizardPage zum Erstellen des Viewmapping
 * 
 * @author Timo
 * 
 */
public class FileSelectionPage extends ContextmapperCreationWizardPage {

	public FileSelectionPage(String pageName,
			IStructuredSelection selection, String fileExtension) {
		super(pageName, selection, fileExtension);
		
	}

	protected boolean validatePage() {
		if (!super.validatePage()) {
			return false;
		}
		String extension = getExtension();
		if (extension != null
				&& !getFilePath().toString().endsWith("." + extension)) {
			setErrorMessage(NLS.bind(
					Messages.ContextmapperCreationWizardPageExtensionError,
					extension));
			return false;
		}
		if  (! super.getFilePath().toFile().exists())
		{
			setErrorMessage("No ViewMapping File found");
			
			return false;}
		return true;
	}

	
}