package contextmapper.diagram.customized;

import org.eclipse.jface.viewers.IFilter;

import contextmapper.diagram.edit.parts.ContextEditPart;

public class ContextEditPartPropertySectionFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if (toTest instanceof ContextEditPart)
			return true;
		return false;
	}

}
