package org.west.es.context.contextModel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ContextElementPriorizeLinksEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public ContextElementPriorizeLinksEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new org.west.es.context.contextModel.diagram.edit.policies.ContextElementPriorizeLinksItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new PriorizeLinksFigure();
	}

	/**
	 * @generated
	 */
	public PriorizeLinksFigure getPrimaryShape() {
		return (PriorizeLinksFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class PriorizeLinksFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public PriorizeLinksFigure() {
			this.setLineWidth(2);

		}

	}

}
