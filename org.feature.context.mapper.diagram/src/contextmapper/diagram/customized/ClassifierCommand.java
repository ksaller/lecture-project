package contextmapper.diagram.customized;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.featuremapper.models.feature.Feature;

import contextmapper.Classifier;
import contextmapper.Context;

public class ClassifierCommand extends AbstractTransactionalCommand {

	private Context context;
	private Classifier classifier;
	
	public ClassifierCommand(TransactionalEditingDomain domain, Context context, Classifier classifier) {
		super(domain, "add classifier", null);
		this.context = context;
		this.classifier = classifier;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		EList<Classifier> cls = context.getClassifier();
		for (int i = 0; i < cls.size(); ++i) {
			if(classifier.getFeature().equals(cls.get(i).getFeature())) {
				if(classifier.getFeatureClassification().getValue() == -1) // if Unclassified
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
