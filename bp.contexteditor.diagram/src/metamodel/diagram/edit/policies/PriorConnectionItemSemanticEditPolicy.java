package metamodel.diagram.edit.policies;

import metamodel.diagram.providers.MetamodelElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class PriorConnectionItemSemanticEditPolicy extends
		MetamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PriorConnectionItemSemanticEditPolicy() {
		super(MetamodelElementTypes.PriorConnection_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
