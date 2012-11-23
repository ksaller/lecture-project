package org.backend.live.check;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.emftext.term.propositional.expression.Term;

import org.featuremapper.models.feature.Feature;
import org.backend.storage.StorageController;

public class CheckConstraints {

	private StorageController controller;
	
	private List<Term> terms;
	
	public CheckConstraints(StorageController controller){
		this.controller=controller;
		terms=controller.getTerms();
	}
	
	public boolean checkNewFeature(Feature feature){
		String name = feature.getName();
		for(Term term : terms){
			EList<EObject> list = term.eContents();
			for(EObject ob : list){
				System.out.println(ob);
			}
		}
		return false;
	}
}
