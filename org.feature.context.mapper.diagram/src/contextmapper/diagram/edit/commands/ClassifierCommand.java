package contextmapper.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

import contextmapper.Classifier;
import contextmapper.Context;

public class ClassifierCommand extends AbstractTransactionalCommand {

	private Context context;
	private Classifier classifier;

	public ClassifierCommand(TransactionalEditingDomain domain,
			Context context, Classifier classifier) {
		super(domain, "change classifier", null);
		this.context = context;
		this.classifier = classifier;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		EList<Classifier> cls = context.getClassifier();
		for (int i = 0; i < cls.size(); ++i) {
			if (classifier.getFeature().equals(cls.get(i).getFeature())) {
				// if unclassified
				if (classifier.getFeatureClassification().getValue() == -1)
					cls.remove(i);
				else
					cls.set(i, classifier);

				return CommandResult.newOKCommandResult();
			}
		}
		context.getClassifier().add(classifier);

		return CommandResult.newOKCommandResult();
	}
	


}
