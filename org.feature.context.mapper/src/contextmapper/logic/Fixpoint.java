package contextmapper.logic;

import java.util.List;

import org.featuremapper.models.feature.Feature;
import org.featuremapper.models.feature.FeatureModel;

import contextmapper.Classifier;
import contextmapper.Context;
import contextmapper.logic.model.Assignment;
import contextmapper.logic.model.CNF;
import contextmapper.logic.model.Clause;
import contextmapper.logic.model.Constant;
import contextmapper.logic.model.Literal;
import contextmapper.logic.model.Variable;

public class Fixpoint {

	List<Variable> v;
	List<Assignment> e;
	CNF cnf = new CNF();
	
	// nur zu testzwecken
	protected Fixpoint(List<Variable> v, List<Assignment> e, CNF cnf){
		this.v=v;
		this.e=e;
		this.cnf=cnf;
	}
	
	public Fixpoint(Context c, FeatureModel fm){
		for(Feature f : c.getMapping().getFeatures())
			v.add(new Variable(f));
		for(Classifier cl : c.getClassifier())
			e.add(new Assignment(new Variable(cl.getFeature()), new Constant(cl.getFeatureClassification())));
		//TODO: buildCNF aus dem FeatureModel
	}
	
	private boolean constantFolding(){
		//TODO: implement ConstantFolding
		return false;
	}
	
	private boolean fixpoint(){
		boolean result = false;
		//step 1:
		result |= constantFolding();
		//step 2:
		for(Clause clause : cnf.getClauses()){
			if(clause.getLiterals().size()==1)
				result |= cnf.remove(clause.getLiterals().get(0).not());			
		}
		//TODO: step 3:
//		for(Clause c1 : cnf.getClauses()){
//			for(Clause c2 : cnf.getClauses()){
//				if(!(c1==c2)){
//					if(c1.getLiterals().containsAll(c2.getLiterals()))
//						result |= cnf.remove(c1);
//				}
//			}
//		}	
		//step 4:
		//TODO: implement Step 4 if necessary
		
		
		return result;
	}
	
	//ruft den fixpoint-solver auf
	public void solve(){
		int i = 0;
		while(fixpoint())
			System.out.print(i++ + " ,");	
		
		//TODO: interpretation des Ergebnisses, etc.
	}
	
}
