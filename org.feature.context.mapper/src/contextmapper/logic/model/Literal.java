package contextmapper.logic.model;

import contextmapper.Classification;

public class Literal {
	private boolean constant;
	private Variable var;
	public Literal(Variable v, boolean b){
		this.constant = b;
		this.var = v;
	}
	public Literal not(){
		return new Literal(var, !constant);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Literal){
			Literal l = (Literal) obj;
			return (this.constant==l.constant && this.var.getName().equals(l.var.getName()));
		}
		else return super.equals(obj);
	}
	
	
}
