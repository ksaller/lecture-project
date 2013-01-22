package contextmapper.diagram.customized;

import org.eclipse.jface.viewers.IFilter;

import contextmapper.Context;
import contextmapper.diagram.edit.parts.ContextEditPart;

public class ContextEditPartPropertySectionFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if(toTest instanceof ContextEditPart)
//			if(((Context) ((ContextEditPart)toTest).getAdapter(Context.class)).getMapping() != null)
				return true;
		return false;
	} 

}
