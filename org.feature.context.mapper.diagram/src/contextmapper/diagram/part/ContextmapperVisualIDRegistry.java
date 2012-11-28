package contextmapper.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import contextmapper.ContextDiagram;
import contextmapper.ContextmapperPackage;
import contextmapper.diagram.edit.parts.AssociateConnectionEditPart;
import contextmapper.diagram.edit.parts.ContextDiagramEditPart;
import contextmapper.diagram.edit.parts.ContextEditPart;
import contextmapper.diagram.edit.parts.ContextNameEditPart;
import contextmapper.diagram.edit.parts.ExcludeConnectionEditPart;
import contextmapper.diagram.edit.parts.IncludeConnectionEditPart;
import contextmapper.diagram.edit.parts.PriorConnectionEditPart;
import contextmapper.diagram.edit.parts.RuntimeConfigEditPart;
import contextmapper.diagram.edit.parts.RuntimeConfigNameEditPart;
import contextmapper.diagram.edit.parts.WrappingLabel2EditPart;
import contextmapper.diagram.edit.parts.WrappingLabel3EditPart;
import contextmapper.diagram.edit.parts.WrappingLabel4EditPart;
import contextmapper.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ContextmapperVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.feature.context.mapper.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ContextDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ContextDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return contextmapper.diagram.part.ContextmapperVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ContextmapperDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ContextmapperPackage.eINSTANCE.getContextDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ContextDiagram) domainElement)) {
			return ContextDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = contextmapper.diagram.part.ContextmapperVisualIDRegistry
				.getModelID(containerView);
		if (!ContextDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ContextDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = contextmapper.diagram.part.ContextmapperVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ContextDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ContextDiagramEditPart.VISUAL_ID:
			if (ContextmapperPackage.eINSTANCE.getRuntimeConfig()
					.isSuperTypeOf(domainElement.eClass())) {
				return RuntimeConfigEditPart.VISUAL_ID;
			}
			if (ContextmapperPackage.eINSTANCE.getContext().isSuperTypeOf(
					domainElement.eClass())) {
				return ContextEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = contextmapper.diagram.part.ContextmapperVisualIDRegistry
				.getModelID(containerView);
		if (!ContextDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ContextDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = contextmapper.diagram.part.ContextmapperVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ContextDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ContextDiagramEditPart.VISUAL_ID:
			if (RuntimeConfigEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuntimeConfigEditPart.VISUAL_ID:
			if (RuntimeConfigNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextEditPart.VISUAL_ID:
			if (ContextNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExcludeConnectionEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociateConnectionEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IncludeConnectionEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PriorConnectionEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ContextmapperPackage.eINSTANCE.getExcludeConnection()
				.isSuperTypeOf(domainElement.eClass())) {
			return ExcludeConnectionEditPart.VISUAL_ID;
		}
		if (ContextmapperPackage.eINSTANCE.getAssociateConnection()
				.isSuperTypeOf(domainElement.eClass())) {
			return AssociateConnectionEditPart.VISUAL_ID;
		}
		if (ContextmapperPackage.eINSTANCE.getIncludeConnection()
				.isSuperTypeOf(domainElement.eClass())) {
			return IncludeConnectionEditPart.VISUAL_ID;
		}
		if (ContextmapperPackage.eINSTANCE.getPriorConnection().isSuperTypeOf(
				domainElement.eClass())) {
			return PriorConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ContextDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ContextDiagramEditPart.VISUAL_ID:
			return false;
		case ContextEditPart.VISUAL_ID:
		case RuntimeConfigEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return contextmapper.diagram.part.ContextmapperVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return contextmapper.diagram.part.ContextmapperVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return contextmapper.diagram.part.ContextmapperVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return contextmapper.diagram.part.ContextmapperVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return contextmapper.diagram.part.ContextmapperVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return contextmapper.diagram.part.ContextmapperVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
