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
import contextmapper.diagram.edit.parts.ContextNameEditPart;
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
	private IParser runtimeConfigName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getRuntimeConfigName_5001Parser() {
		if (runtimeConfigName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getRuntimeConfig_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getRuntimeConfig_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			runtimeConfigName_5001Parser = parser;
		}
		return runtimeConfigName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getContextName_5002Parser() {
		if (contextName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getContext_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ContextmapperPackage.eINSTANCE
					.getContext_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			contextName_5002Parser = parser;
		}
		return contextName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ContextNameEditPart.VISUAL_ID:
			return getContextName_5002Parser();
		case RuntimeConfigNameEditPart.VISUAL_ID:
			return getRuntimeConfigName_5001Parser();
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
