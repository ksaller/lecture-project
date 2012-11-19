package metamodel.diagram.part;

import java.util.Collections;
import java.util.List;

import metamodel.diagram.providers.MetamodelElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MetamodelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMetamodel1Group());
	}

	/**
	 * Creates "metamodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createMetamodel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Metamodel1Group_title);
		paletteContainer.setId("createMetamodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createContext1CreationTool());
		paletteContainer.add(createPriorConnection2CreationTool());
		paletteContainer.add(createExcludeConnection3CreationTool());
		paletteContainer.add(createAssociateConnection4CreationTool());
		paletteContainer.add(createRuntimeConfig5CreationTool());
		paletteContainer.add(createIncludeConnection6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContext1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Context1CreationTool_title,
				Messages.Context1CreationTool_desc,
				Collections.singletonList(MetamodelElementTypes.Context_2002));
		entry.setId("createContext1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.Context_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPriorConnection2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PriorConnection2CreationTool_title,
				Messages.PriorConnection2CreationTool_desc,
				Collections
						.singletonList(MetamodelElementTypes.PriorConnection_4003));
		entry.setId("createPriorConnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.PriorConnection_4003));
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
						.singletonList(MetamodelElementTypes.ExcludeConnection_4004));
		entry.setId("createExcludeConnection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.ExcludeConnection_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociateConnection4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AssociateConnection4CreationTool_title,
				Messages.AssociateConnection4CreationTool_desc,
				Collections
						.singletonList(MetamodelElementTypes.AssociateConnection_4001));
		entry.setId("createAssociateConnection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.AssociateConnection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRuntimeConfig5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RuntimeConfig5CreationTool_title,
				Messages.RuntimeConfig5CreationTool_desc,
				Collections
						.singletonList(MetamodelElementTypes.RuntimeConfig_2001));
		entry.setId("createRuntimeConfig5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.RuntimeConfig_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIncludeConnection6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.IncludeConnection6CreationTool_title,
				Messages.IncludeConnection6CreationTool_desc,
				Collections
						.singletonList(MetamodelElementTypes.IncludeConnection_4002));
		entry.setId("createIncludeConnection6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.IncludeConnection_4002));
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
