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
		paletteContainer.add(createContextClassifies2CreationTool());
		paletteContainer.add(createPriorConnection3CreationTool());
		paletteContainer.add(createExcludeConnection4CreationTool());
		paletteContainer.add(createAssociateConnection5CreationTool());
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
						.singletonList(MetamodelElementTypes.RuntimeConfig_2001));
		entry.setId("createContext1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.RuntimeConfig_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextClassifies2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContextClassifies2CreationTool_title,
				Messages.ContextClassifies2CreationTool_desc,
				Collections.singletonList(MetamodelElementTypes.Context_2002));
		entry.setId("createContextClassifies2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.Context_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPriorConnection3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PriorConnection3CreationTool_title,
				Messages.PriorConnection3CreationTool_desc,
				Collections
						.singletonList(MetamodelElementTypes.AssociateConnection_4001));
		entry.setId("createPriorConnection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.AssociateConnection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExcludeConnection4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ExcludeConnection4CreationTool_title,
				Messages.ExcludeConnection4CreationTool_desc,
				Collections
						.singletonList(MetamodelElementTypes.IncludeConnection_4002));
		entry.setId("createExcludeConnection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.IncludeConnection_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociateConnection5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AssociateConnection5CreationTool_title,
				Messages.AssociateConnection5CreationTool_desc,
				Collections
						.singletonList(MetamodelElementTypes.PriorConnection_4003));
		entry.setId("createAssociateConnection5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.PriorConnection_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRuntimeConfig6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RuntimeConfig6CreationTool_title,
				Messages.RuntimeConfig6CreationTool_desc,
				Collections
						.singletonList(MetamodelElementTypes.ExcludeConnection_4004));
		entry.setId("createRuntimeConfig6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MetamodelElementTypes
				.getImageDescriptor(MetamodelElementTypes.ExcludeConnection_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIncludeConnection7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.IncludeConnection7CreationTool_title,
				Messages.IncludeConnection7CreationTool_desc, null, null) {
		};
		entry.setId("createIncludeConnection7CreationTool"); //$NON-NLS-1$
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
