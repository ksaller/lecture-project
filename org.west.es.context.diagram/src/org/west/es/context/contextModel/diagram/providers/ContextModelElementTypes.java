package org.west.es.context.contextModel.diagram.providers;

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

/**
 * @generated
 */
public class ContextModelElementTypes {

	/**
	 * @generated
	 */
	private ContextModelElementTypes() {
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
	public static final IElementType Container_1000 = getElementType("org.west.es.context.diagram.Container_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextInstance_2003 = getElementType("org.west.es.context.diagram.ContextInstance_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextElement_2002 = getElementType("org.west.es.context.diagram.ContextElement_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextElementExtendsLink_4003 = getElementType("org.west.es.context.diagram.ContextElementExtendsLink_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextElementExcludeLinks_4004 = getElementType("org.west.es.context.diagram.ContextElementExcludeLinks_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextElementPriorizeLinks_4005 = getElementType("org.west.es.context.diagram.ContextElementPriorizeLinks_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextInstanceIncludeLinks_4006 = getElementType("org.west.es.context.diagram.ContextInstanceIncludeLinks_4006"); //$NON-NLS-1$

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
				return org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
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

			elements.put(
					Container_1000,
					org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
							.getContainer());

			elements.put(
					ContextInstance_2003,
					org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
							.getContextInstance());

			elements.put(
					ContextElement_2002,
					org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
							.getContextElement());

			elements.put(
					ContextElementExtendsLink_4003,
					org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
							.getContextElement_ExtendsLink());

			elements.put(
					ContextElementExcludeLinks_4004,
					org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
							.getContextElement_ExcludeLinks());

			elements.put(
					ContextElementPriorizeLinks_4005,
					org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
							.getContextElement_PriorizeLinks());

			elements.put(
					ContextInstanceIncludeLinks_4006,
					org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
							.getContextInstance_IncludeLinks());
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
			KNOWN_ELEMENT_TYPES.add(Container_1000);
			KNOWN_ELEMENT_TYPES.add(ContextInstance_2003);
			KNOWN_ELEMENT_TYPES.add(ContextElement_2002);
			KNOWN_ELEMENT_TYPES.add(ContextElementExtendsLink_4003);
			KNOWN_ELEMENT_TYPES.add(ContextElementExcludeLinks_4004);
			KNOWN_ELEMENT_TYPES.add(ContextElementPriorizeLinks_4005);
			KNOWN_ELEMENT_TYPES.add(ContextInstanceIncludeLinks_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case org.west.es.context.contextModel.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return Container_1000;
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceEditPart.VISUAL_ID:
			return ContextInstance_2003;
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementEditPart.VISUAL_ID:
			return ContextElement_2002;
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementExtendsLinkEditPart.VISUAL_ID:
			return ContextElementExtendsLink_4003;
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementExcludeLinksEditPart.VISUAL_ID:
			return ContextElementExcludeLinks_4004;
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementPriorizeLinksEditPart.VISUAL_ID:
			return ContextElementPriorizeLinks_4005;
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceIncludeLinksEditPart.VISUAL_ID:
			return ContextInstanceIncludeLinks_4006;
		}
		return null;
	}

}
