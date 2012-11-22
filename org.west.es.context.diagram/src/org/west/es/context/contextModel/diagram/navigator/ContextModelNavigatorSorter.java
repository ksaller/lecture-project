package org.west.es.context.contextModel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ContextModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem) {
			org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem item = (org.west.es.context.contextModel.diagram.navigator.ContextModelNavigatorItem) element;
			return org.west.es.context.contextModel.diagram.part.ContextModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
