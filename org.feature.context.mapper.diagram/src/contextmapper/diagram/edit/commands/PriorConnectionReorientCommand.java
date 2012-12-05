package contextmapper.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import contextmapper.Context;
import contextmapper.PriorConnection;
import contextmapper.diagram.edit.policies.ContextmapperBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class PriorConnectionReorientCommand extends EditElementCommand {

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
	public PriorConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof PriorConnection) {
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
		Context target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Context)) {
			return false;
		}
		Context container = (Context) getLink().eContainer();
		return ContextmapperBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPriorConnection_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Context && newEnd instanceof Context)) {
			return false;
		}
		Context source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Context)) {
			return false;
		}
		Context container = (Context) getLink().eContainer();
		return ContextmapperBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPriorConnection_4001(container, getLink(), source,
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected PriorConnection getLink() {
		return (PriorConnection) getElementToEdit();
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
	protected Context getOldTarget() {
		return (Context) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Context getNewTarget() {
		return (Context) newEnd;
	}
}
