package contextmapper.logic.model;

import contextmapper.Classification;

public class Constant {
	public int c;
	public Constant(int i){
		this.c = i;
	}
	public Constant(Classification c){
		switch (c) {
		case ALIVE:
			this.c = 1;
			break;
		case DEAD:
			this.c = 0;
			break;
		case UNBOUND:
			this.c = 2;
			break;
		default:
			this.c = -1;
			break;
		}
	}
	public int getConstant(){
		return c;
	}
	public Classification getConstantClassification(){
		switch (c) {
		case 1:
			return Classification.ALIVE;
		case 0:
			return Classification.DEAD;
		case 2:
			return Classification.UNBOUND;
		default:
			return Classification.UNCLASSIFIED;
		}
	}
}
