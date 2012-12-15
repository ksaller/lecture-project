package contextmapper.diagram.part;

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

import contextmapper.Context;
import contextmapper.ContextDiagram;
import contextmapper.ContextmapperPackage;
import contextmapper.ExcludeConnection;
import contextmapper.ExtendConnection;
import contextmapper.IncludeConnection;
import contextmapper.PriorConnection;
import contextmapper.RuntimeConfig;
import contextmapper.diagram.edit.parts.ContextDiagramEditPart;
import contextmapper.diagram.edit.parts.ContextEditPart;
import contextmapper.diagram.edit.parts.ExcludeConnectionEditPart;
import contextmapper.diagram.edit.parts.ExtendConnectionEditPart;
import contextmapper.diagram.edit.parts.IncludeConnectionEditPart;
import contextmapper.diagram.edit.parts.PriorConnectionEditPart;
import contextmapper.diagram.edit.parts.RuntimeConfigEditPart;
import contextmapper.diagram.providers.ContextmapperElementTypes;

/**
 * @generated
 */
public class ContextmapperDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ContextmapperNodeDescriptor> getSemanticChildren(
			View view) {
		switch (ContextmapperVisualIDRegistry.getVisualID(view)) {
		case ContextDiagramEditPart.VISUAL_ID:
			return getContextDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperNodeDescriptor> getContextDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ContextDiagram modelElement = (ContextDiagram) view.getElement();
		LinkedList<ContextmapperNodeDescriptor> result = new LinkedList<ContextmapperNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRuntimeconfig().iterator(); it
				.hasNext();) {
			RuntimeConfig childElement = (RuntimeConfig) it.next();
			int visualID = ContextmapperVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RuntimeConfigEditPart.VISUAL_ID) {
				result.add(new ContextmapperNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContext().iterator(); it
				.hasNext();) {
			Context childElement = (Context) it.next();
			int visualID = ContextmapperVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContextEditPart.VISUAL_ID) {
				result.add(new ContextmapperNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getContainedLinks(View view) {
		switch (ContextmapperVisualIDRegistry.getVisualID(view)) {
		case ContextDiagramEditPart.VISUAL_ID:
			return getContextDiagram_1000ContainedLinks(view);
		case RuntimeConfigEditPart.VISUAL_ID:
			return getRuntimeConfig_2001ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2002ContainedLinks(view);
		case ExcludeConnectionEditPart.VISUAL_ID:
			return getExcludeConnection_4004ContainedLinks(view);
		case ExtendConnectionEditPart.VISUAL_ID:
			return getExtendConnection_4002ContainedLinks(view);
		case IncludeConnectionEditPart.VISUAL_ID:
			return getIncludeConnection_4003ContainedLinks(view);
		case PriorConnectionEditPart.VISUAL_ID:
			return getPriorConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getIncomingLinks(View view) {
		switch (ContextmapperVisualIDRegistry.getVisualID(view)) {
		case RuntimeConfigEditPart.VISUAL_ID:
			return getRuntimeConfig_2001IncomingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2002IncomingLinks(view);
		case ExcludeConnectionEditPart.VISUAL_ID:
			return getExcludeConnection_4004IncomingLinks(view);
		case ExtendConnectionEditPart.VISUAL_ID:
			return getExtendConnection_4002IncomingLinks(view);
		case IncludeConnectionEditPart.VISUAL_ID:
			return getIncludeConnection_4003IncomingLinks(view);
		case PriorConnectionEditPart.VISUAL_ID:
			return getPriorConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getOutgoingLinks(View view) {
		switch (ContextmapperVisualIDRegistry.getVisualID(view)) {
		case RuntimeConfigEditPart.VISUAL_ID:
			return getRuntimeConfig_2001OutgoingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2002OutgoingLinks(view);
		case ExcludeConnectionEditPart.VISUAL_ID:
			return getExcludeConnection_4004OutgoingLinks(view);
		case ExtendConnectionEditPart.VISUAL_ID:
			return getExtendConnection_4002OutgoingLinks(view);
		case IncludeConnectionEditPart.VISUAL_ID:
			return getIncludeConnection_4003OutgoingLinks(view);
		case PriorConnectionEditPart.VISUAL_ID:
			return getPriorConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getContextDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getRuntimeConfig_2001ContainedLinks(
			View view) {
		RuntimeConfig modelElement = (RuntimeConfig) view.getElement();
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IncludeConnection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getContext_2002ContainedLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ExcludeConnection_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExtendConnection_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PriorConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getExtendConnection_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getExcludeConnection_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getPriorConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getIncludeConnection_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getRuntimeConfig_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getContext_2002IncomingLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ExcludeConnection_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExtendConnection_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IncludeConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PriorConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getExtendConnection_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getExcludeConnection_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getPriorConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getIncludeConnection_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getRuntimeConfig_2001OutgoingLinks(
			View view) {
		RuntimeConfig modelElement = (RuntimeConfig) view.getElement();
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IncludeConnection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getContext_2002OutgoingLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ExcludeConnection_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExtendConnection_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_PriorConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getExtendConnection_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getExcludeConnection_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getPriorConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContextmapperLinkDescriptor> getIncludeConnection_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getContainedTypeModelFacetLinks_ExtendConnection_4002(
			Context container) {
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		for (Iterator<?> links = container.getExtend().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExtendConnection) {
				continue;
			}
			ExtendConnection link = (ExtendConnection) linkObject;
			if (ExtendConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getTarget();
			Context src = link.getSource();
			result.add(new ContextmapperLinkDescriptor(src, dst, link,
					ContextmapperElementTypes.ExtendConnection_4002,
					ExtendConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getContainedTypeModelFacetLinks_ExcludeConnection_4004(
			Context container) {
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		for (Iterator<?> links = container.getExclude().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExcludeConnection) {
				continue;
			}
			ExcludeConnection link = (ExcludeConnection) linkObject;
			if (ExcludeConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getTarget();
			Context src = link.getSource();
			result.add(new ContextmapperLinkDescriptor(src, dst, link,
					ContextmapperElementTypes.ExcludeConnection_4004,
					ExcludeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getContainedTypeModelFacetLinks_PriorConnection_4001(
			Context container) {
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		for (Iterator<?> links = container.getPriorize().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PriorConnection) {
				continue;
			}
			PriorConnection link = (PriorConnection) linkObject;
			if (PriorConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getTarget();
			Context src = link.getSource();
			result.add(new ContextmapperLinkDescriptor(src, dst, link,
					ContextmapperElementTypes.PriorConnection_4001,
					PriorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getContainedTypeModelFacetLinks_IncludeConnection_4003(
			RuntimeConfig container) {
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		for (Iterator<?> links = container.getInclude().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IncludeConnection) {
				continue;
			}
			IncludeConnection link = (IncludeConnection) linkObject;
			if (IncludeConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getTarget();
			RuntimeConfig src = link.getSource();
			result.add(new ContextmapperLinkDescriptor(src, dst, link,
					ContextmapperElementTypes.IncludeConnection_4003,
					IncludeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getIncomingTypeModelFacetLinks_ExtendConnection_4002(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextmapperPackage.eINSTANCE
					.getExtendConnection_Target()
					|| false == setting.getEObject() instanceof ExtendConnection) {
				continue;
			}
			ExtendConnection link = (ExtendConnection) setting.getEObject();
			if (ExtendConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context src = link.getSource();
			result.add(new ContextmapperLinkDescriptor(src, target, link,
					ContextmapperElementTypes.ExtendConnection_4002,
					ExtendConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getIncomingTypeModelFacetLinks_ExcludeConnection_4004(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextmapperPackage.eINSTANCE
					.getExcludeConnection_Target()
					|| false == setting.getEObject() instanceof ExcludeConnection) {
				continue;
			}
			ExcludeConnection link = (ExcludeConnection) setting.getEObject();
			if (ExcludeConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context src = link.getSource();
			result.add(new ContextmapperLinkDescriptor(src, target, link,
					ContextmapperElementTypes.ExcludeConnection_4004,
					ExcludeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getIncomingTypeModelFacetLinks_PriorConnection_4001(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextmapperPackage.eINSTANCE
					.getPriorConnection_Target()
					|| false == setting.getEObject() instanceof PriorConnection) {
				continue;
			}
			PriorConnection link = (PriorConnection) setting.getEObject();
			if (PriorConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context src = link.getSource();
			result.add(new ContextmapperLinkDescriptor(src, target, link,
					ContextmapperElementTypes.PriorConnection_4001,
					PriorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getIncomingTypeModelFacetLinks_IncludeConnection_4003(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextmapperPackage.eINSTANCE
					.getIncludeConnection_Target()
					|| false == setting.getEObject() instanceof IncludeConnection) {
				continue;
			}
			IncludeConnection link = (IncludeConnection) setting.getEObject();
			if (IncludeConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RuntimeConfig src = link.getSource();
			result.add(new ContextmapperLinkDescriptor(src, target, link,
					ContextmapperElementTypes.IncludeConnection_4003,
					IncludeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getOutgoingTypeModelFacetLinks_ExtendConnection_4002(
			Context source) {
		Context container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Context) {
				container = (Context) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		for (Iterator<?> links = container.getExtend().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExtendConnection) {
				continue;
			}
			ExtendConnection link = (ExtendConnection) linkObject;
			if (ExtendConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getTarget();
			Context src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ContextmapperLinkDescriptor(src, dst, link,
					ContextmapperElementTypes.ExtendConnection_4002,
					ExtendConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getOutgoingTypeModelFacetLinks_ExcludeConnection_4004(
			Context source) {
		Context container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Context) {
				container = (Context) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		for (Iterator<?> links = container.getExclude().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExcludeConnection) {
				continue;
			}
			ExcludeConnection link = (ExcludeConnection) linkObject;
			if (ExcludeConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getTarget();
			Context src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ContextmapperLinkDescriptor(src, dst, link,
					ContextmapperElementTypes.ExcludeConnection_4004,
					ExcludeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getOutgoingTypeModelFacetLinks_PriorConnection_4001(
			Context source) {
		Context container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Context) {
				container = (Context) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		for (Iterator<?> links = container.getPriorize().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PriorConnection) {
				continue;
			}
			PriorConnection link = (PriorConnection) linkObject;
			if (PriorConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getTarget();
			Context src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ContextmapperLinkDescriptor(src, dst, link,
					ContextmapperElementTypes.PriorConnection_4001,
					PriorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ContextmapperLinkDescriptor> getOutgoingTypeModelFacetLinks_IncludeConnection_4003(
			RuntimeConfig source) {
		RuntimeConfig container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof RuntimeConfig) {
				container = (RuntimeConfig) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ContextmapperLinkDescriptor> result = new LinkedList<ContextmapperLinkDescriptor>();
		for (Iterator<?> links = container.getInclude().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IncludeConnection) {
				continue;
			}
			IncludeConnection link = (IncludeConnection) linkObject;
			if (IncludeConnectionEditPart.VISUAL_ID != ContextmapperVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getTarget();
			RuntimeConfig src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ContextmapperLinkDescriptor(src, dst, link,
					ContextmapperElementTypes.IncludeConnection_4003,
					IncludeConnectionEditPart.VISUAL_ID));
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
		public List<ContextmapperNodeDescriptor> getSemanticChildren(View view) {
			return ContextmapperDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ContextmapperLinkDescriptor> getContainedLinks(View view) {
			return ContextmapperDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ContextmapperLinkDescriptor> getIncomingLinks(View view) {
			return ContextmapperDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ContextmapperLinkDescriptor> getOutgoingLinks(View view) {
			return ContextmapperDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
