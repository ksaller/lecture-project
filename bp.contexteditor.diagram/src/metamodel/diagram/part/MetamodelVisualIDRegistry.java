package metamodel.diagram.part;

import metamodel.ContextDiagram;
import metamodel.MetamodelPackage;
import metamodel.diagram.edit.parts.AssociateConnectionEditPart;
import metamodel.diagram.edit.parts.ContextDiagramEditPart;
import metamodel.diagram.edit.parts.ContextEditPart;
import metamodel.diagram.edit.parts.ContextNameEditPart;
import metamodel.diagram.edit.parts.ExcludeConnectionEditPart;
import metamodel.diagram.edit.parts.IncludeConnectionEditPart;
import metamodel.diagram.edit.parts.PriorConnectionEditPart;
import metamodel.diagram.edit.parts.RuntimeConfigEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MetamodelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "bp.contexteditor.diagram/debug/visualID"; //$NON-NLS-1$

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
		return metamodel.diagram.part.MetamodelVisualIDRegistry
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
				MetamodelDiagramEditorPlugin.getInstance().logError(
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
		if (MetamodelPackage.eINSTANCE.getContextDiagram().isSuperTypeOf(
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
		String containerModelID = metamodel.diagram.part.MetamodelVisualIDRegistry
				.getModelID(containerView);
		if (!ContextDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ContextDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = metamodel.diagram.part.MetamodelVisualIDRegistry
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
			if (MetamodelPackage.eINSTANCE.getRuntimeConfig().isSuperTypeOf(
					domainElement.eClass())) {
				return RuntimeConfigEditPart.VISUAL_ID;
			}
			if (MetamodelPackage.eINSTANCE.getContext().isSuperTypeOf(
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
		String containerModelID = metamodel.diagram.part.MetamodelVisualIDRegistry
				.getModelID(containerView);
		if (!ContextDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ContextDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = metamodel.diagram.part.MetamodelVisualIDRegistry
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
		case ContextEditPart.VISUAL_ID:
			if (ContextNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (MetamodelPackage.eINSTANCE.getAssociateConnection().isSuperTypeOf(
				domainElement.eClass())) {
			return AssociateConnectionEditPart.VISUAL_ID;
		}
		if (MetamodelPackage.eINSTANCE.getIncludeConnection().isSuperTypeOf(
				domainElement.eClass())) {
			return IncludeConnectionEditPart.VISUAL_ID;
		}
		if (MetamodelPackage.eINSTANCE.getPriorConnection().isSuperTypeOf(
				domainElement.eClass())) {
			return PriorConnectionEditPart.VISUAL_ID;
		}
		if (MetamodelPackage.eINSTANCE.getExcludeConnection().isSuperTypeOf(
				domainElement.eClass())) {
			return ExcludeConnectionEditPart.VISUAL_ID;
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
		case RuntimeConfigEditPart.VISUAL_ID:
		case ContextEditPart.VISUAL_ID:
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
			return metamodel.diagram.part.MetamodelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return metamodel.diagram.part.MetamodelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return metamodel.diagram.part.MetamodelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return metamodel.diagram.part.MetamodelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return metamodel.diagram.part.MetamodelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return metamodel.diagram.part.MetamodelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
