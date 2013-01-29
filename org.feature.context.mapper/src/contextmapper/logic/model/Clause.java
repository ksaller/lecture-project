package contextmapper.logic.model;

import java.util.ArrayList;
import java.util.List;

public class Clause {
	
	private List<Literal> literals;
	
	public Clause(){
		literals = new ArrayList<Literal>();
	}
	public Clause(List<Literal> literals){
		this.literals = literals;

	}
	public Clause(Literal l1, Literal l2, Literal l3){
		literals = new ArrayList<Literal>();
		literals.add(l1);
		literals.add(l2);
		literals.add(l3);
	}
	public void add(Literal l){literals.add(l);}
	public List<Literal> getLiterals(){return literals;}
	public boolean remove(Literal l){return literals.remove(l);}
}
