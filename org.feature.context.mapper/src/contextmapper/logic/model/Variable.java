package contextmapper.logic.model;

import org.featuremapper.models.feature.Feature;

public class Variable {
	private String name;
	public Variable(Feature f){
		name = f.getName();
	}
	public Variable(String s){
		name = s;
	}
	public String getName(){
		return name;
	}
}
