package metamodel.diagram.edit.commands;

import metamodel.Context;
import metamodel.IncludeConnection;
import metamodel.RuntimeConfig;
import metamodel.diagram.edit.policies.MetamodelBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class IncludeConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public IncludeConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof IncludeConnection) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Context && newEnd instanceof Context)) {
			return false;
		}
		RuntimeConfig target = getLink().getSource();
		return MetamodelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistIncludeConnection_4002(getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof RuntimeConfig && newEnd instanceof RuntimeConfig)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Context)) {
			return false;
		}
		Context source = (Context) getLink().eContainer();
		return MetamodelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistIncludeConnection_4002(getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getIncluded().remove(getLink());
		getNewSource().getIncluded().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSource(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected IncludeConnection getLink() {
		return (IncludeConnection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Context getOldSource() {
		return (Context) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Context getNewSource() {
		return (Context) newEnd;
	}

	/**
	 * @generated
	 */
	protected RuntimeConfig getOldTarget() {
		return (RuntimeConfig) oldEnd;
	}

	/**
	 * @generated
	 */
	protected RuntimeConfig getNewTarget() {
		return (RuntimeConfig) newEnd;
	}
}
