package contextmapper.logic.model;

public class Assignment {
	private Constant constant;
	private Variable var;
	public Assignment(Variable v, Constant c){
		this.constant = c;
		this.var = v;
	}
}
