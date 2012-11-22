package org.west.es.context.contextModel.diagram.providers;

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

/**
 * @generated
 */
public class ContextModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser contextInstanceName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getContextInstanceName_5003Parser() {
		if (contextInstanceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
					.getContextInstance_Name() };
			org.west.es.context.contextModel.diagram.parsers.MessageFormatParser parser = new org.west.es.context.contextModel.diagram.parsers.MessageFormatParser(
					features);
			contextInstanceName_5003Parser = parser;
		}
		return contextInstanceName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextElementName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getContextElementName_5002Parser() {
		if (contextElementName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { org.west.es.context.contextModel.ContextModelPackage.eINSTANCE
					.getContextElement_Name() };
			org.west.es.context.contextModel.diagram.parsers.MessageFormatParser parser = new org.west.es.context.contextModel.diagram.parsers.MessageFormatParser(
					features);
			contextElementName_5002Parser = parser;
		}
		return contextElementName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.west.es.context.contextModel.diagram.edit.parts.ContextInstanceNameEditPart.VISUAL_ID:
			return getContextInstanceName_5003Parser();
		case org.west.es.context.contextModel.diagram.edit.parts.ContextElementNameEditPart.VISUAL_ID:
			return getContextElementName_5002Parser();
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
			return getParser(org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (org.west.es.context.contextModel.diagram.providers.ContextModelElementTypes
					.getElement(hint) == null) {
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
