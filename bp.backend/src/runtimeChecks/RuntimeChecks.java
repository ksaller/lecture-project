package runtimeChecks;

import java.util.List;
import java.util.Vector;
import org.emftext.term.propositional.expression.Term;
import org.featuremapper.models.feature.Feature;


public class RuntimeChecks {
	
	public boolean checkDirectNeighbors(Feature feature, Vector<Feature> choosen, List<Term> terms){
		for(Term term : terms){
			feature.getConstraints();
		}
		
		return true;		
	}
}
