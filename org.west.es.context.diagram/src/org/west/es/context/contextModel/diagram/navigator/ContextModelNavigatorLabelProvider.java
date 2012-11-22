package org.west.es.context.contextModel.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ContextModelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem
				&& !isOwnView(((org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorGroup) {
			org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorGroup group = (org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorGroup) element;
			return org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem) {
			org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem navigatorItem = (org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
				.getVisualID(view)) {
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceIncludeLinksEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.eclipse.org/context?ContextInstance?includeLinks", org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstanceIncludeLinks_4006); //$NON-NLS-1$
		case org.west.es.context.contextModel.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?www.eclipse.org/context?Container", org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.Container_1000); //$NON-NLS-1$
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementExcludeLinksEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.eclipse.org/context?ContextElement?excludeLinks", org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExcludeLinks_4004); //$NON-NLS-1$
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.eclipse.org/context?ContextInstance", org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstance_2003); //$NON-NLS-1$
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementExtendsLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.eclipse.org/context?ContextElement?extendsLink", org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExtendsLink_4003); //$NON-NLS-1$
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementPriorizeLinksEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.eclipse.org/context?ContextElement?priorizeLinks", org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementPriorizeLinks_4005); //$NON-NLS-1$
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.eclipse.org/context?ContextElement", org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElement_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes
						.isKnownElementType(elementType)) {
			image = org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorGroup) {
			org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorGroup group = (org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem) {
			org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem navigatorItem = (org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
				.getVisualID(view)) {
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceIncludeLinksEditPart.VISUAL_ID:
			return getContextInstanceIncludeLinks_4006Text(view);
		case org.west.es.context.contextModel.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getContainer_1000Text(view);
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementExcludeLinksEditPart.VISUAL_ID:
			return getContextElementExcludeLinks_4004Text(view);
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceEditPart.VISUAL_ID:
			return getContextInstance_2003Text(view);
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementExtendsLinkEditPart.VISUAL_ID:
			return getContextElementExtendsLink_4003Text(view);
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementPriorizeLinksEditPart.VISUAL_ID:
			return getContextElementPriorizeLinks_4005Text(view);
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementEditPart.VISUAL_ID:
			return getContextElement_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getContextInstanceIncludeLinks_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContainer_1000Text(View view) {
		org.west.es.context.contextModel.Container domainModelElement = (org.west.es.context.contextModel.Container) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContextElementExcludeLinks_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContextInstance_2003Text(View view) {
		IParser parser = org.west.es.context.contextModel.diagram.providers.ContextModelParserProvider
				.getParser(
						org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstance_2003,
						view.getElement() != null ? view.getElement() : view,
						org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
								.getType(org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContextElementExtendsLink_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContextElementPriorizeLinks_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContextElement_2002Text(View view) {
		IParser parser = org.west.es.context.contextModel.diagram.providers.ContextModelParserProvider
				.getParser(
						org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElement_2002,
						view.getElement() != null ? view.getElement() : view,
						org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
								.getType(org.west.es.context.contextModel.diagram.edit.parts.ContextElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.west.es.context.contextModel.diagram.part.ContextModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return org.west.es.context.contextModel.diagram.edit.parts.ContainerEditPart.MODEL_ID
				.equals(org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
						.getModelID(view));
	}

}
