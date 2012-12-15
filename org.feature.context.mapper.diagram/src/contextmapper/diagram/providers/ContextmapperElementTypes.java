package contextmapper.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import contextmapper.ContextmapperPackage;
import contextmapper.diagram.edit.parts.ContextDiagramEditPart;
import contextmapper.diagram.edit.parts.ContextEditPart;
import contextmapper.diagram.edit.parts.ExcludeConnectionEditPart;
import contextmapper.diagram.edit.parts.ExtendConnectionEditPart;
import contextmapper.diagram.edit.parts.IncludeConnectionEditPart;
import contextmapper.diagram.edit.parts.PriorConnectionEditPart;
import contextmapper.diagram.edit.parts.RuntimeConfigEditPart;
import contextmapper.diagram.part.ContextmapperDiagramEditorPlugin;

/**
 * @generated
 */
public class ContextmapperElementTypes {

	/**
	 * @generated
	 */
	private ContextmapperElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ContextDiagram_1000 = getElementType("org.feature.context.mapper.diagram.ContextDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RuntimeConfig_2001 = getElementType("org.feature.context.mapper.diagram.RuntimeConfig_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Context_2002 = getElementType("org.feature.context.mapper.diagram.Context_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtendConnection_4002 = getElementType("org.feature.context.mapper.diagram.ExtendConnection_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExcludeConnection_4004 = getElementType("org.feature.context.mapper.diagram.ExcludeConnection_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PriorConnection_4001 = getElementType("org.feature.context.mapper.diagram.PriorConnection_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IncludeConnection_4003 = getElementType("org.feature.context.mapper.diagram.IncludeConnection_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ContextmapperDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ContextDiagram_1000,
					ContextmapperPackage.eINSTANCE.getContextDiagram());

			elements.put(RuntimeConfig_2001,
					ContextmapperPackage.eINSTANCE.getRuntimeConfig());

			elements.put(Context_2002,
					ContextmapperPackage.eINSTANCE.getContext());

			elements.put(ExcludeConnection_4004,
					ContextmapperPackage.eINSTANCE.getExcludeConnection());

			elements.put(ExtendConnection_4002,
					ContextmapperPackage.eINSTANCE.getExtendConnection());

			elements.put(IncludeConnection_4003,
					ContextmapperPackage.eINSTANCE.getIncludeConnection());

			elements.put(PriorConnection_4001,
					ContextmapperPackage.eINSTANCE.getPriorConnection());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ContextDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(RuntimeConfig_2001);
			KNOWN_ELEMENT_TYPES.add(Context_2002);
			KNOWN_ELEMENT_TYPES.add(ExcludeConnection_4004);
			KNOWN_ELEMENT_TYPES.add(ExtendConnection_4002);
			KNOWN_ELEMENT_TYPES.add(IncludeConnection_4003);
			KNOWN_ELEMENT_TYPES.add(PriorConnection_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ContextDiagramEditPart.VISUAL_ID:
			return ContextDiagram_1000;
		case RuntimeConfigEditPart.VISUAL_ID:
			return RuntimeConfig_2001;
		case ContextEditPart.VISUAL_ID:
			return Context_2002;
		case ExcludeConnectionEditPart.VISUAL_ID:
			return ExcludeConnection_4004;
		case ExtendConnectionEditPart.VISUAL_ID:
			return ExtendConnection_4002;
		case IncludeConnectionEditPart.VISUAL_ID:
			return IncludeConnection_4003;
		case PriorConnectionEditPart.VISUAL_ID:
			return PriorConnection_4001;
		}
		return null;
	}

}
