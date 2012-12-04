package contextmapper.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import contextmapper.diagram.edit.policies.ExcludeConnectionItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExcludeConnectionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public ExcludeConnectionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ExcludeConnectionItemSemanticEditPolicy());
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
		return new ExcludeConnectionFigure();
	}

	/**
	 * @generated
	 */
	public ExcludeConnectionFigure getPrimaryShape() {
		return (ExcludeConnectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ExcludeConnectionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureExcludeConnectionNameFigure;

		/**
		 * @generated
		 */
		public ExcludeConnectionFigure() {
			this.setLineWidth(2);

			createContents();
			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureExcludeConnectionNameFigure = new WrappingLabel();

			fFigureExcludeConnectionNameFigure.setText("exclude");

			this.add(fFigureExcludeConnectionNameFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setFill(false);
			df.setLineWidth(2);
			return df;
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
		public WrappingLabel getFigureExcludeConnectionNameFigure() {
			return fFigureExcludeConnectionNameFigure;
		}

	}

}
