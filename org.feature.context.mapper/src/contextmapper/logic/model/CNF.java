package contextmapper.logic.model;

import java.util.ArrayList;
import java.util.List;

public class CNF {
	
	private List<Clause> clauses;
	
	public CNF(){
		clauses = new ArrayList<Clause>();
	}
	public CNF(List<Clause> clauses){
		this.clauses = clauses;
	}
	public void add(Clause c){clauses.add(c);}
	public List<Clause> getClauses(){return clauses;}
	public boolean remove(Literal l){
		boolean result = false;
		for(Clause cl : clauses) result |= cl.remove(l);
		return result;
	}
	public boolean remove(Clause c){
		return clauses.remove(c);
	}
}
