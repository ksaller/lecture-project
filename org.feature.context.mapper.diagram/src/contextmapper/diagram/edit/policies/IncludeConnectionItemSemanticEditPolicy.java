package contextmapper.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import contextmapper.diagram.providers.ContextmapperElementTypes;

/**
 * @generated
 */
public class IncludeConnectionItemSemanticEditPolicy extends
		ContextmapperBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IncludeConnectionItemSemanticEditPolicy() {
		super(ContextmapperElementTypes.IncludeConnection_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
