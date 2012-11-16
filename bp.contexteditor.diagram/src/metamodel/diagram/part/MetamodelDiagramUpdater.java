package metamodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import metamodel.AssociateConnection;
import metamodel.Context;
import metamodel.ContextDiagram;
import metamodel.ExcludeConnection;
import metamodel.IncludeConnection;
import metamodel.MetamodelPackage;
import metamodel.PriorConnection;
import metamodel.RuntimeConfig;
import metamodel.diagram.edit.parts.AssociateConnectionEditPart;
import metamodel.diagram.edit.parts.ContextDiagramEditPart;
import metamodel.diagram.edit.parts.ContextEditPart;
import metamodel.diagram.edit.parts.ExcludeConnectionEditPart;
import metamodel.diagram.edit.parts.IncludeConnectionEditPart;
import metamodel.diagram.edit.parts.PriorConnectionEditPart;
import metamodel.diagram.edit.parts.RuntimeConfigEditPart;
import metamodel.diagram.providers.MetamodelElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MetamodelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<MetamodelNodeDescriptor> getSemanticChildren(View view) {
		switch (MetamodelVisualIDRegistry.getVisualID(view)) {
		case ContextDiagramEditPart.VISUAL_ID:
			return getContextDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelNodeDescriptor> getContextDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ContextDiagram modelElement = (ContextDiagram) view.getElement();
		LinkedList<MetamodelNodeDescriptor> result = new LinkedList<MetamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContainsRuntimeConfigs()
				.iterator(); it.hasNext();) {
			RuntimeConfig childElement = (RuntimeConfig) it.next();
			int visualID = MetamodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RuntimeConfigEditPart.VISUAL_ID) {
				result.add(new MetamodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContainsContexts().iterator(); it
				.hasNext();) {
			Context childElement = (Context) it.next();
			int visualID = MetamodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContextEditPart.VISUAL_ID) {
				result.add(new MetamodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getContainedLinks(View view) {
		switch (MetamodelVisualIDRegistry.getVisualID(view)) {
		case ContextDiagramEditPart.VISUAL_ID:
			return getContextDiagram_1000ContainedLinks(view);
		case RuntimeConfigEditPart.VISUAL_ID:
			return getRuntimeConfig_2001ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2002ContainedLinks(view);
		case AssociateConnectionEditPart.VISUAL_ID:
			return getAssociateConnection_4001ContainedLinks(view);
		case IncludeConnectionEditPart.VISUAL_ID:
			return getIncludeConnection_4002ContainedLinks(view);
		case PriorConnectionEditPart.VISUAL_ID:
			return getPriorConnection_4003ContainedLinks(view);
		case ExcludeConnectionEditPart.VISUAL_ID:
			return getExcludeConnection_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getIncomingLinks(View view) {
		switch (MetamodelVisualIDRegistry.getVisualID(view)) {
		case RuntimeConfigEditPart.VISUAL_ID:
			return getRuntimeConfig_2001IncomingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2002IncomingLinks(view);
		case AssociateConnectionEditPart.VISUAL_ID:
			return getAssociateConnection_4001IncomingLinks(view);
		case IncludeConnectionEditPart.VISUAL_ID:
			return getIncludeConnection_4002IncomingLinks(view);
		case PriorConnectionEditPart.VISUAL_ID:
			return getPriorConnection_4003IncomingLinks(view);
		case ExcludeConnectionEditPart.VISUAL_ID:
			return getExcludeConnection_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getOutgoingLinks(View view) {
		switch (MetamodelVisualIDRegistry.getVisualID(view)) {
		case RuntimeConfigEditPart.VISUAL_ID:
			return getRuntimeConfig_2001OutgoingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2002OutgoingLinks(view);
		case AssociateConnectionEditPart.VISUAL_ID:
			return getAssociateConnection_4001OutgoingLinks(view);
		case IncludeConnectionEditPart.VISUAL_ID:
			return getIncludeConnection_4002OutgoingLinks(view);
		case PriorConnectionEditPart.VISUAL_ID:
			return getPriorConnection_4003OutgoingLinks(view);
		case ExcludeConnectionEditPart.VISUAL_ID:
			return getExcludeConnection_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getContextDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getRuntimeConfig_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getContext_2002ContainedLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssociateConnection_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IncludeConnection_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PriorConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExcludeConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getAssociateConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getIncludeConnection_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getPriorConnection_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getExcludeConnection_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getRuntimeConfig_2001IncomingLinks(
			View view) {
		RuntimeConfig modelElement = (RuntimeConfig) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IncludeConnection_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getContext_2002IncomingLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssociateConnection_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PriorConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExcludeConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getAssociateConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getIncludeConnection_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getPriorConnection_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getExcludeConnection_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getRuntimeConfig_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getContext_2002OutgoingLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssociateConnection_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IncludeConnection_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PriorConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExcludeConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getAssociateConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getIncludeConnection_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getPriorConnection_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MetamodelLinkDescriptor> getExcludeConnection_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MetamodelLinkDescriptor> getContainedTypeModelFacetLinks_AssociateConnection_4001(
			Context container) {
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getSourceConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociateConnection) {
				continue;
			}
			AssociateConnection link = (AssociateConnection) linkObject;
			if (AssociateConnectionEditPart.VISUAL_ID != MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getSource();
			result.add(new MetamodelLinkDescriptor(container, dst, link,
					MetamodelElementTypes.AssociateConnection_4001,
					AssociateConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MetamodelLinkDescriptor> getContainedTypeModelFacetLinks_IncludeConnection_4002(
			Context container) {
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getIncluded().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IncludeConnection) {
				continue;
			}
			IncludeConnection link = (IncludeConnection) linkObject;
			if (IncludeConnectionEditPart.VISUAL_ID != MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RuntimeConfig dst = link.getSource();
			result.add(new MetamodelLinkDescriptor(container, dst, link,
					MetamodelElementTypes.IncludeConnection_4002,
					IncludeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MetamodelLinkDescriptor> getContainedTypeModelFacetLinks_PriorConnection_4003(
			Context container) {
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getSourceConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PriorConnection) {
				continue;
			}
			PriorConnection link = (PriorConnection) linkObject;
			if (PriorConnectionEditPart.VISUAL_ID != MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getSource();
			result.add(new MetamodelLinkDescriptor(container, dst, link,
					MetamodelElementTypes.PriorConnection_4003,
					PriorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MetamodelLinkDescriptor> getContainedTypeModelFacetLinks_ExcludeConnection_4004(
			Context container) {
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getSourceConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExcludeConnection) {
				continue;
			}
			ExcludeConnection link = (ExcludeConnection) linkObject;
			if (ExcludeConnectionEditPart.VISUAL_ID != MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Context dst = link.getSource();
			result.add(new MetamodelLinkDescriptor(container, dst, link,
					MetamodelElementTypes.ExcludeConnection_4004,
					ExcludeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MetamodelLinkDescriptor> getIncomingTypeModelFacetLinks_AssociateConnection_4001(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MetamodelPackage.eINSTANCE
					.getConnection_Source()
					|| false == setting.getEObject() instanceof AssociateConnection) {
				continue;
			}
			AssociateConnection link = (AssociateConnection) setting
					.getEObject();
			if (AssociateConnectionEditPart.VISUAL_ID != MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Context) {
				continue;
			}
			Context container = (Context) link.eContainer();
			result.add(new MetamodelLinkDescriptor(container, target, link,
					MetamodelElementTypes.AssociateConnection_4001,
					AssociateConnectionEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MetamodelLinkDescriptor> getIncomingTypeModelFacetLinks_IncludeConnection_4002(
			RuntimeConfig target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MetamodelPackage.eINSTANCE
					.getIncludeConnection_Source()
					|| false == setting.getEObject() instanceof IncludeConnection) {
				continue;
			}
			IncludeConnection link = (IncludeConnection) setting.getEObject();
			if (IncludeConnectionEditPart.VISUAL_ID != MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Context) {
				continue;
			}
			Context container = (Context) link.eContainer();
			result.add(new MetamodelLinkDescriptor(container, target, link,
					MetamodelElementTypes.IncludeConnection_4002,
					IncludeConnectionEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MetamodelLinkDescriptor> getIncomingTypeModelFacetLinks_PriorConnection_4003(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MetamodelPackage.eINSTANCE
					.getConnection_Source()
					|| false == setting.getEObject() instanceof PriorConnection) {
				continue;
			}
			PriorConnection link = (PriorConnection) setting.getEObject();
			if (PriorConnectionEditPart.VISUAL_ID != MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Context) {
				continue;
			}
			Context container = (Context) link.eContainer();
			result.add(new MetamodelLinkDescriptor(container, target, link,
					MetamodelElementTypes.PriorConnection_4003,
					PriorConnectionEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MetamodelLinkDescriptor> getIncomingTypeModelFacetLinks_ExcludeConnection_4004(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MetamodelLinkDescriptor> result = new LinkedList<MetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MetamodelPackage.eINSTANCE
					.getConnection_Source()
					|| false == setting.getEObject() instanceof ExcludeConnection) {
				continue;
			}
			ExcludeConnection link = (ExcludeConnection) setting.getEObject();
			if (ExcludeConnectionEditPart.VISUAL_ID != MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Context) {
				continue;
			}
			Context container = (Context) link.eContainer();
			result.add(new MetamodelLinkDescriptor(container, target, link,
					MetamodelElementTypes.ExcludeConnection_4004,
					ExcludeConnectionEditPart.VISUAL_ID));

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
		public List<MetamodelNodeDescriptor> getSemanticChildren(View view) {
			return MetamodelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MetamodelLinkDescriptor> getContainedLinks(View view) {
			return MetamodelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MetamodelLinkDescriptor> getIncomingLinks(View view) {
			return MetamodelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MetamodelLinkDescriptor> getOutgoingLinks(View view) {
			return MetamodelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
