package contextmapper.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.draw2d.CenterLayout;
import org.eclipse.swt.graphics.Color;

import contextmapper.diagram.edit.policies.ContextItemSemanticEditPolicy;
import contextmapper.diagram.part.ContextmapperVisualIDRegistry;
import contextmapper.diagram.providers.ContextmapperElementTypes;

/**
 * @generated
 */
public class ContextEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ContextEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ContextItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ContextFigure();
	}

	/**
	 * @generated
	 */
	public ContextFigure getPrimaryShape() {
		return (ContextFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContextNameEditPart) {
			((ContextNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureContextNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContextNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ContextmapperVisualIDRegistry
				.getType(ContextNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ContextmapperElementTypes.PriorConnection_4001);
		types.add(ContextmapperElementTypes.ExcludeConnection_4004);
		types.add(ContextmapperElementTypes.ExtendConnection_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof contextmapper.diagram.edit.parts.ContextEditPart) {
			types.add(ContextmapperElementTypes.PriorConnection_4001);
		}
		if (targetEditPart instanceof contextmapper.diagram.edit.parts.ContextEditPart) {
			types.add(ContextmapperElementTypes.ExcludeConnection_4004);
		}
		if (targetEditPart instanceof contextmapper.diagram.edit.parts.ContextEditPart) {
			types.add(ContextmapperElementTypes.ExtendConnection_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ContextmapperElementTypes.PriorConnection_4001) {
			types.add(ContextmapperElementTypes.Context_2002);
		} else if (relationshipType == ContextmapperElementTypes.ExcludeConnection_4004) {
			types.add(ContextmapperElementTypes.Context_2002);
		} else if (relationshipType == ContextmapperElementTypes.ExtendConnection_4002) {
			types.add(ContextmapperElementTypes.Context_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ContextmapperElementTypes.IncludeConnection_4003);
		types.add(ContextmapperElementTypes.PriorConnection_4001);
		types.add(ContextmapperElementTypes.ExcludeConnection_4004);
		types.add(ContextmapperElementTypes.ExtendConnection_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ContextmapperElementTypes.IncludeConnection_4003) {
			types.add(ContextmapperElementTypes.RuntimeConfig_2001);
		} else if (relationshipType == ContextmapperElementTypes.PriorConnection_4001) {
			types.add(ContextmapperElementTypes.Context_2002);
		} else if (relationshipType == ContextmapperElementTypes.ExcludeConnection_4004) {
			types.add(ContextmapperElementTypes.Context_2002);
		} else if (relationshipType == ContextmapperElementTypes.ExtendConnection_4002) {
			types.add(ContextmapperElementTypes.Context_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ContextFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextNameFigure;

		/**
		 * @generated
		 */
		public ContextFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(2);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureContextNameFigure = new WrappingLabel();

			fFigureContextNameFigure.setText("<...>");

			GridData constraintFFigureContextNameFigure = new GridData();
			constraintFFigureContextNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureContextNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureContextNameFigure.horizontalIndent = 0;
			constraintFFigureContextNameFigure.horizontalSpan = 1;
			constraintFFigureContextNameFigure.verticalSpan = 1;
			constraintFFigureContextNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureContextNameFigure.grabExcessVerticalSpace = true;
			this.add(fFigureContextNameFigure,
					constraintFFigureContextNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextNameFigure() {
			return fFigureContextNameFigure;
		}

	}

}
