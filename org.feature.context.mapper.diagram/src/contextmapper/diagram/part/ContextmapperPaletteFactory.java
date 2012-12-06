package contextmapper.diagram.part;

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

import contextmapper.diagram.providers.ContextmapperElementTypes;

/**
 * @generated
 */
public class ContextmapperPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createContextmapper1Group());
	}

	/**
	 * Creates "contextmapper" palette tool group
	 * @generated
	 */
	private PaletteContainer createContextmapper1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Contextmapper1Group_title);
		paletteContainer.setId("createContextmapper1Group"); //$NON-NLS-1$
		paletteContainer.add(createContext1CreationTool());
		paletteContainer.add(createExtendConnection2CreationTool());
		paletteContainer.add(createExcludeConnection3CreationTool());
		paletteContainer.add(createPriorConnection4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createRuntimeConfig6CreationTool());
		paletteContainer.add(createIncludeConnection7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContext1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Context1CreationTool_title,
				Messages.Context1CreationTool_desc,
				Collections
						.singletonList(ContextmapperElementTypes.Context_2002));
		entry.setId("createContext1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ContextmapperElementTypes
				.getImageDescriptor(ContextmapperElementTypes.Context_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtendConnection2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ExtendConnection2CreationTool_title,
				Messages.ExtendConnection2CreationTool_desc,
				Collections
						.singletonList(ContextmapperElementTypes.ExtendConnection_4002));
		entry.setId("createExtendConnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ContextmapperElementTypes
				.getImageDescriptor(ContextmapperElementTypes.ExtendConnection_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExcludeConnection3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ExcludeConnection3CreationTool_title,
				Messages.ExcludeConnection3CreationTool_desc,
				Collections
						.singletonList(ContextmapperElementTypes.ExcludeConnection_4004));
		entry.setId("createExcludeConnection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ContextmapperElementTypes
				.getImageDescriptor(ContextmapperElementTypes.ExcludeConnection_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPriorConnection4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PriorConnection4CreationTool_title,
				Messages.PriorConnection4CreationTool_desc,
				Collections
						.singletonList(ContextmapperElementTypes.PriorConnection_4001));
		entry.setId("createPriorConnection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ContextmapperElementTypes
				.getImageDescriptor(ContextmapperElementTypes.PriorConnection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRuntimeConfig6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RuntimeConfig6CreationTool_title,
				Messages.RuntimeConfig6CreationTool_desc,
				Collections
						.singletonList(ContextmapperElementTypes.RuntimeConfig_2001));
		entry.setId("createRuntimeConfig6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ContextmapperElementTypes
				.getImageDescriptor(ContextmapperElementTypes.RuntimeConfig_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIncludeConnection7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.IncludeConnection7CreationTool_title,
				Messages.IncludeConnection7CreationTool_desc,
				Collections
						.singletonList(ContextmapperElementTypes.IncludeConnection_4003));
		entry.setId("createIncludeConnection7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ContextmapperElementTypes
				.getImageDescriptor(ContextmapperElementTypes.IncludeConnection_4003));
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
