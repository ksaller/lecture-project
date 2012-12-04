package contextmapper.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import contextmapper.diagram.edit.policies.IncludeConnectionItemSemanticEditPolicy;

/**
 * @generated
 */
public class IncludeConnectionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public IncludeConnectionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new IncludeConnectionItemSemanticEditPolicy());
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
		return new IncludeConnectionFigure();
	}

	/**
	 * @generated
	 */
	public IncludeConnectionFigure getPrimaryShape() {
		return (IncludeConnectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class IncludeConnectionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureIncludeConnectionNameFigure;

		/**
		 * @generated
		 */
		public IncludeConnectionFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DASH);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureIncludeConnectionNameFigure = new WrappingLabel();

			fFigureIncludeConnectionNameFigure.setText("include");

			this.add(fFigureIncludeConnectionNameFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setFill(false);
			df.setLineWidth(2);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureIncludeConnectionNameFigure() {
			return fFigureIncludeConnectionNameFigure;
		}

	}

}
