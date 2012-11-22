package org.west.es.context.contextModel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ContextElementExcludeLinksReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

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
	public ContextElementExcludeLinksReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof org.west.es.context.contextModel.ContextElement) {
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
		if (!(oldEnd instanceof org.west.es.context.contextModel.ContextElement && newEnd instanceof org.west.es.context.contextModel.ContextElement)) {
			return false;
		}
		return org.west.es.context.contextModel.diagram.edit.policies.ContextModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistContextElementExcludeLinks_4004(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof org.west.es.context.contextModel.ContextElement && newEnd instanceof org.west.es.context.contextModel.ContextElement)) {
			return false;
		}
		return org.west.es.context.contextModel.diagram.edit.policies.ContextModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistContextElementExcludeLinks_4004(
						getOldSource(), getNewTarget());
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
		getOldSource().getExcludeLinks().remove(getOldTarget());
		getNewSource().getExcludeLinks().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getExcludeLinks().remove(getOldTarget());
		getOldSource().getExcludeLinks().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected org.west.es.context.contextModel.ContextElement getOldSource() {
		return (org.west.es.context.contextModel.ContextElement) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected org.west.es.context.contextModel.ContextElement getNewSource() {
		return (org.west.es.context.contextModel.ContextElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected org.west.es.context.contextModel.ContextElement getOldTarget() {
		return (org.west.es.context.contextModel.ContextElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.west.es.context.contextModel.ContextElement getNewTarget() {
		return (org.west.es.context.contextModel.ContextElement) newEnd;
	}
}
