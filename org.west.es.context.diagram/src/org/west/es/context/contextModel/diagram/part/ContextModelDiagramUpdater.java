package org.west.es.context.contextModel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class ContextModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
				.getVisualID(view)) {
		case org.west.es.context.contextModel.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getContainer_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelNodeDescriptor> getContainer_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.west.es.context.contextModel.Container modelElement = (org.west.es.context.contextModel.Container) view
				.getElement();
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelNodeDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContextInstances().iterator(); it
				.hasNext();) {
			org.west.es.context.contextModel.ContextInstance childElement = (org.west.es.context.contextModel.ContextInstance) it
					.next();
			int visualID = org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceEditPart.VISUAL_ID) {
				result.add(new org.west.es.context.contextModel.diagram.part.ContextModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContextElements().iterator(); it
				.hasNext();) {
			org.west.es.context.contextModel.ContextElement childElement = (org.west.es.context.contextModel.ContextElement) it
					.next();
			int visualID = org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.west.es.context.contextModel.diagram.edit.parts.ContextElementEditPart.VISUAL_ID) {
				result.add(new org.west.es.context.contextModel.diagram.part.ContextModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
				.getVisualID(view)) {
		case org.west.es.context.contextModel.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getContainer_1000ContainedLinks(view);
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceEditPart.VISUAL_ID:
			return getContextInstance_2003ContainedLinks(view);
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementEditPart.VISUAL_ID:
			return getContextElement_2002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
				.getVisualID(view)) {
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceEditPart.VISUAL_ID:
			return getContextInstance_2003IncomingLinks(view);
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementEditPart.VISUAL_ID:
			return getContextElement_2002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
				.getVisualID(view)) {
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceEditPart.VISUAL_ID:
			return getContextInstance_2003OutgoingLinks(view);
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementEditPart.VISUAL_ID:
			return getContextElement_2002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getContainer_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getContextInstance_2003ContainedLinks(
			View view) {
		org.west.es.context.contextModel.ContextInstance modelElement = (org.west.es.context.contextModel.ContextInstance) view
				.getElement();
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextInstance_IncludeLinks_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getContextElement_2002ContainedLinks(
			View view) {
		org.west.es.context.contextModel.ContextElement modelElement = (org.west.es.context.contextModel.ContextElement) view
				.getElement();
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_ExtendsLink_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_ExcludeLinks_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_PriorizeLinks_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getContextInstance_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getContextElement_2002IncomingLinks(
			View view) {
		org.west.es.context.contextModel.ContextElement modelElement = (org.west.es.context.contextModel.ContextElement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ContextElement_ExtendsLink_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContextElement_ExcludeLinks_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContextElement_PriorizeLinks_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContextInstance_IncludeLinks_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getContextInstance_2003OutgoingLinks(
			View view) {
		org.west.es.context.contextModel.ContextInstance modelElement = (org.west.es.context.contextModel.ContextInstance) view
				.getElement();
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextInstance_IncludeLinks_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getContextElement_2002OutgoingLinks(
			View view) {
		org.west.es.context.contextModel.ContextElement modelElement = (org.west.es.context.contextModel.ContextElement) view
				.getElement();
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_ExtendsLink_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_ExcludeLinks_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_PriorizeLinks_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextElement_ExtendsLink_4003(
			org.west.es.context.contextModel.ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
					.getContextElement_ExtendsLink()) {
				result.add(new org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor(
						setting.getEObject(),
						target,
						org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExtendsLink_4003,
						org.west.es.context.contextModel.diagram.edit.parts.ContextElementExtendsLinkEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextElement_ExcludeLinks_4004(
			org.west.es.context.contextModel.ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
					.getContextElement_ExcludeLinks()) {
				result.add(new org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor(
						setting.getEObject(),
						target,
						org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExcludeLinks_4004,
						org.west.es.context.contextModel.diagram.edit.parts.ContextElementExcludeLinksEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextElement_PriorizeLinks_4005(
			org.west.es.context.contextModel.ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
					.getContextElement_PriorizeLinks()) {
				result.add(new org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor(
						setting.getEObject(),
						target,
						org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementPriorizeLinks_4005,
						org.west.es.context.contextModel.diagram.edit.parts.ContextElementPriorizeLinksEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextInstance_IncludeLinks_4006(
			org.west.es.context.contextModel.ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
					.getContextInstance_IncludeLinks()) {
				result.add(new org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor(
						setting.getEObject(),
						target,
						org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstanceIncludeLinks_4006,
						org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceIncludeLinksEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextElement_ExtendsLink_4003(
			org.west.es.context.contextModel.ContextElement source) {
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		org.west.es.context.contextModel.ContextElement destination = source
				.getExtendsLink();
		if (destination == null) {
			return result;
		}
		result.add(new org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor(
				source,
				destination,
				org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExtendsLink_4003,
				org.west.es.context.contextModel.diagram.edit.parts.ContextElementExtendsLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextElement_ExcludeLinks_4004(
			org.west.es.context.contextModel.ContextElement source) {
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getExcludeLinks().iterator(); destinations
				.hasNext();) {
			org.west.es.context.contextModel.ContextElement destination = (org.west.es.context.contextModel.ContextElement) destinations
					.next();
			result.add(new org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor(
					source,
					destination,
					org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExcludeLinks_4004,
					org.west.es.context.contextModel.diagram.edit.parts.ContextElementExcludeLinksEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextElement_PriorizeLinks_4005(
			org.west.es.context.contextModel.ContextElement source) {
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getPriorizeLinks().iterator(); destinations
				.hasNext();) {
			org.west.es.context.contextModel.ContextElement destination = (org.west.es.context.contextModel.ContextElement) destinations
					.next();
			result.add(new org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor(
					source,
					destination,
					org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementPriorizeLinks_4005,
					org.west.es.context.contextModel.diagram.edit.parts.ContextElementPriorizeLinksEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextInstance_IncludeLinks_4006(
			org.west.es.context.contextModel.ContextInstance source) {
		LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> result = new LinkedList<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getIncludeLinks().iterator(); destinations
				.hasNext();) {
			org.west.es.context.contextModel.ContextElement destination = (org.west.es.context.contextModel.ContextElement) destinations
					.next();
			result.add(new org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor(
					source,
					destination,
					org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstanceIncludeLinks_4006,
					org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceIncludeLinksEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<org.west.es.context.contextModel.diagram.part.ContextModelNodeDescriptor> getSemanticChildren(
				View view) {
			return ContextModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getContainedLinks(
				View view) {
			return ContextModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getIncomingLinks(
				View view) {
			return ContextModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.west.es.context.contextModel.diagram.part.ContextModelLinkDescriptor> getOutgoingLinks(
				View view) {
			return ContextModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
