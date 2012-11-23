package org.backend.storage.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.backend.storage.StorageController;
import org.emftext.term.propositional.expression.Term;
import org.featuremapper.models.feature.Constraint;
import org.junit.Before;
import org.junit.Test;

public class TestBuildingStoragecontroller {

	private StorageController controller = null;
	
	private List<Term> terms =null;
	
	private List<Constraint> constraints = null;
	
	@Before
	public void init(){
		controller = new StorageController("testdata/SimplePhone.feature");
		System.out.println("controller. "+controller);
		terms = controller.getTerms();
		System.out.println("terms. "+terms);
		constraints = controller.getConstraints();
		System.out.println(constraints);
	}
	
	@Test
	public void testIfControllerExists() {
		assertTrue(controller!=null);
	}
	
	@Test
	public void testIfTermsAreInitialiced() {
		assertTrue(terms!=null);
	}	
	@Test
	public void testIfConstraintsAreInitialiced() {
		assertTrue(constraints!=null);
	}
	
	@Test
	public void testIfAllConstraintsAreParsed() {
		assertTrue(terms.size()==constraints.size());
	}
}
