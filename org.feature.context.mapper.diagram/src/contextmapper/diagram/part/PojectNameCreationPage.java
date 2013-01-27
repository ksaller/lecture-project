package contextmapper.diagram.part;

import java.io.File;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * WizardPage zum Erstellen des Projektnamens
 * 
 * @author Timo
 * 
 */
public class PojectNameCreationPage extends WizardPage {

	private final IStructuredSelection currentSelection;

	public Text projektName;

	/**
	 * 
	 * @param name
	 * @param currentSelection
	 */
	protected PojectNameCreationPage(String name,
			IStructuredSelection currentSelection) {
		super(name);
		this.currentSelection = currentSelection;

	}

	/**
 * 
 */
	@Override
	public void createControl(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		plate.setLayout(new GridLayout(2, false));
		Label label = new Label(plate, SWT.NONE);
		label.setText("Projekt");
		label.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
				false, 2, 1));
		projektName = new Text(plate, SWT.SINGLE | SWT.BORDER);
		projektName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false));

		validatePage();
		setControl(plate);
	}

	protected boolean validatePage() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		if (projektName.getText() == "") {
			setErrorMessage(Messages.WizardNewFileCreationPage_EmptyFileNameError);
			return false;
		}
		if (new Path("").isValidPath(workspaceDirectory.getAbsolutePath() + "/" + projektName.getText())) { //$NON-NLS-1$
			setErrorMessage(Messages.WizardNewFileCreationPage_InvalidFileNameError);
			return false;
		}
		setErrorMessage(null);
		return true;
	}
}