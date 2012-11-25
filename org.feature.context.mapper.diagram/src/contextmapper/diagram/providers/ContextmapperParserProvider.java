package contextmapper.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import contextmapper.ContextmapperPackage;
import contextmapper.diagram.edit.parts.AssociateConnectionTypeEditPart;
import contextmapper.diagram.edit.parts.ContextNameEditPart;
import contextmapper.diagram.edit.parts.ExcludeConnectionTypeEditPart;
import contextmapper.diagram.edit.parts.IncludeConnectionTypeEditPart;
import contextmapper.diagram.edit.parts.PriorConnectionTypeEditPart;
import contextmapper.diagram.edit.parts.RuntimeConfigNameEditPart;
import contextmapper.diagram.parsers.MessageFormatParser;
import contextmapper.diagram.part.ContextmapperVisualIDRegistry;

/**
 * @generated
 */
public class ContextmapperParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser contextName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getContextName_5001Parser() {
		if (contextName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getContext_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getContext_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			contextName_5001Parser = parser;
		}
		return contextName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser runtimeConfigName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getRuntimeConfigName_5002Parser() {
		if (runtimeConfigName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getRuntimeConfig_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getRuntimeConfig_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			runtimeConfigName_5002Parser = parser;
		}
		return runtimeConfigName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser priorConnectionType_6001Parser;

	/**
	 * @generated
	 */
	private IParser getPriorConnectionType_6001Parser() {
		if (priorConnectionType_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getPriorConnection_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			priorConnectionType_6001Parser = parser;
		}
		return priorConnectionType_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser excludeConnectionType_6002Parser;

	/**
	 * @generated
	 */
	private IParser getExcludeConnectionType_6002Parser() {
		if (excludeConnectionType_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getExcludeConnection_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			excludeConnectionType_6002Parser = parser;
		}
		return excludeConnectionType_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser includeConnectionType_6003Parser;

	/**
	 * @generated
	 */
	private IParser getIncludeConnectionType_6003Parser() {
		if (includeConnectionType_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getIncludeConnection_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			includeConnectionType_6003Parser = parser;
		}
		return includeConnectionType_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser associateConnectionType_6004Parser;

	/**
	 * @generated
	 */
	private IParser getAssociateConnectionType_6004Parser() {
		if (associateConnectionType_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getAssociateConnection_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associateConnectionType_6004Parser = parser;
		}
		return associateConnectionType_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ContextNameEditPart.VISUAL_ID:
			return getContextName_5001Parser();
		case RuntimeConfigNameEditPart.VISUAL_ID:
			return getRuntimeConfigName_5002Parser();
		case PriorConnectionTypeEditPart.VISUAL_ID:
			return getPriorConnectionType_6001Parser();
		case ExcludeConnectionTypeEditPart.VISUAL_ID:
			return getExcludeConnectionType_6002Parser();
		case IncludeConnectionTypeEditPart.VISUAL_ID:
			return getIncludeConnectionType_6003Parser();
		case AssociateConnectionTypeEditPart.VISUAL_ID:
			return getAssociateConnectionType_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ContextmapperVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ContextmapperVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ContextmapperElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
