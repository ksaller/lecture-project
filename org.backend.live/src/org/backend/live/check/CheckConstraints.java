package org.backend.live.check;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.emftext.term.propositional.expression.Term;

import org.featuremapper.models.feature.Constraint;
import org.featuremapper.models.feature.Feature;
import org.backend.storage.StorageController;
import org.west.es.context.contextModel.ClassifiedFeature;

public class CheckConstraints {

	private StorageController controller;
	
	private List<Term> terms;
	
	private List<ClassifiedFeature> classiefiedFeatures;
	
	public CheckConstraints(StorageController controller){
		this.controller=controller;
		terms=controller.getTerms();
	}
	
	public boolean checkNewFeature(ClassifiedFeature classiefiedFeature){
		Feature feature = classiefiedFeature.getFeature();
		EList<Constraint> constraintsFeature = feature.getConstraints();
		System.out.println("terms.get(0): "+terms.get(0).toString());
		System.out.println(constraintsFeature);
		System.out.println(controller.getConstraints());
		classiefiedFeatures.add(classiefiedFeature);
		return true;  //change
	}
}
