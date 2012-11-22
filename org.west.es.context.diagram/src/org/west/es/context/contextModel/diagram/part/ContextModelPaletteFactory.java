package org.west.es.context.contextModel.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ContextModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createContextModel1Group());
	}

	/**
	 * Creates "contextModel" palette tool group
	 * @generated
	 */
	private PaletteContainer createContextModel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				org.west.es.context.contextModel.diagram.part.Messages.ContextModel1Group_title);
		paletteContainer.setId("createContextModel1Group"); //$NON-NLS-1$
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createContextElement2CreationTool());
		paletteContainer.add(createContextInstance3CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createExtendsLink5CreationTool());
		paletteContainer.add(createExcludeLinks6CreationTool());
		paletteContainer.add(createPriorizeLinks7CreationTool());
		paletteContainer.add(createIncludeLinks8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextElement2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.west.es.context.contextModel.diagram.part.Messages.ContextElement2CreationTool_title,
				org.west.es.context.contextModel.diagram.part.Messages.ContextElement2CreationTool_desc,
				Collections
						.singletonList(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElement_2002));
		entry.setId("createContextElement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes
				.getImageDescriptor(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElement_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextInstance3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.west.es.context.contextModel.diagram.part.Messages.ContextInstance3CreationTool_title,
				org.west.es.context.contextModel.diagram.part.Messages.ContextInstance3CreationTool_desc,
				Collections
						.singletonList(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstance_2003));
		entry.setId("createContextInstance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes
				.getImageDescriptor(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstance_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtendsLink5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.west.es.context.contextModel.diagram.part.Messages.ExtendsLink5CreationTool_title,
				org.west.es.context.contextModel.diagram.part.Messages.ExtendsLink5CreationTool_desc,
				Collections
						.singletonList(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExtendsLink_4003));
		entry.setId("createExtendsLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes
				.getImageDescriptor(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExtendsLink_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExcludeLinks6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.west.es.context.contextModel.diagram.part.Messages.ExcludeLinks6CreationTool_title,
				org.west.es.context.contextModel.diagram.part.Messages.ExcludeLinks6CreationTool_desc,
				Collections
						.singletonList(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExcludeLinks_4004));
		entry.setId("createExcludeLinks6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes
				.getImageDescriptor(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementExcludeLinks_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPriorizeLinks7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.west.es.context.contextModel.diagram.part.Messages.PriorizeLinks7CreationTool_title,
				org.west.es.context.contextModel.diagram.part.Messages.PriorizeLinks7CreationTool_desc,
				Collections
						.singletonList(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementPriorizeLinks_4005));
		entry.setId("createPriorizeLinks7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes
				.getImageDescriptor(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextElementPriorizeLinks_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIncludeLinks8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.west.es.context.contextModel.diagram.part.Messages.IncludeLinks8CreationTool_title,
				org.west.es.context.contextModel.diagram.part.Messages.IncludeLinks8CreationTool_desc,
				Collections
						.singletonList(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstanceIncludeLinks_4006));
		entry.setId("createIncludeLinks8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes
				.getImageDescriptor(org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes.ContextInstanceIncludeLinks_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
