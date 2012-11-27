package org.backend.batch;
import static org.junit.Assert.*;

import org.featuremapper.models.feature.Feature;
import org.featuremapper.models.feature.FeatureFactory;
import org.junit.Before;
import org.junit.Test;
import org.west.es.context.contextModel.Classification;
import org.west.es.context.contextModel.ClassifiedFeature;
import org.west.es.context.contextModel.ContextElement;
import org.west.es.context.contextModel.ContextModelFactory;


public class TestContextCheck {
	
	Feature f1 = FeatureFactory.eINSTANCE.createFeature();
	Feature f2 = FeatureFactory.eINSTANCE.createFeature();
	Feature f3 = FeatureFactory.eINSTANCE.createFeature();
	ContextChecker contextChecker;
	ContextModelFactory cmf = ContextModelFactory.eINSTANCE;
	ContextElement context1, context2;
	
	@Before
	public void before() {
		// prepare
		ContextModelFactory cmf = ContextModelFactory.eINSTANCE;
		context1 = cmf.createContextElement();
		context2 = cmf.createContextElement();
		context1.setName("c1");
		context2.setName("c2");
		
		f1.setName("f1");
		f2.setName("f2");
		f3.setName("f3");
	}

	@Test
	public void testSimpleFail() {
		ClassifiedFeature cf1 = cmf.createClassifiedFeature();
		ClassifiedFeature cf2 = cmf.createClassifiedFeature();
		cf1.setClassification(Classification.ALIVE);
		cf1.setFeature(f1);
		cf2.setClassification(Classification.DEAD);
		cf2.setFeature(f1);
		context1.getClassifiedFeatures().add(cf1);
		context2.getClassifiedFeatures().add(cf2);
		assertFalse(ContextChecker.areConsistent(context1, context2));
		assertFalse(ContextChecker.areConsistent(context2, context1));
	}

	@Test
	public void testEmpty() {
		assertTrue(ContextChecker.areConsistent(context1, context2));
	}

	@Test
	public void simpleTestUnboundValid() {
		ClassifiedFeature cf1 = cmf.createClassifiedFeature();
		ClassifiedFeature cf2 = cmf.createClassifiedFeature();
		cf1.setClassification(Classification.ALIVE);
		cf1.setFeature(f1);
		cf2.setClassification(Classification.UNBOUND);
		cf2.setFeature(f1);
		context1.getClassifiedFeatures().add(cf1);
		context2.getClassifiedFeatures().add(cf2);

		assertTrue(ContextChecker.areConsistent(context1, context2));
		assertTrue(ContextChecker.areConsistent(context2, context1));
	}
	
	public void simpleTestEqual() {
		ClassifiedFeature cf1 = cmf.createClassifiedFeature();
		ClassifiedFeature cf2 = cmf.createClassifiedFeature();
		cf1.setClassification(Classification.DEAD);
		cf1.setFeature(f1);
		cf2.setClassification(Classification.DEAD);
		cf2.setFeature(f1);
		context1.getClassifiedFeatures().add(cf1);
		context2.getClassifiedFeatures().add(cf2);

		assertTrue(ContextChecker.areConsistent(context1, context2));
	}

	@Test
	public void simpleTestNotSetValid() {
		ClassifiedFeature cf1 = cmf.createClassifiedFeature();
		cf1.setClassification(Classification.ALIVE);
		cf1.setFeature(f1);
		context1.getClassifiedFeatures().add(cf1);

		assertTrue(ContextChecker.areConsistent(context1, context2));
		assertTrue(ContextChecker.areConsistent(context2, context1));
	}

	@Test
	public void testFail() {
		ClassifiedFeature cf1 = cmf.createClassifiedFeature();
		ClassifiedFeature cf2 = cmf.createClassifiedFeature();
		ClassifiedFeature cf3 = cmf.createClassifiedFeature();
		ClassifiedFeature cf4 = cmf.createClassifiedFeature();
		cf1.setClassification(Classification.ALIVE);
		cf1.setFeature(f1);
		cf2.setClassification(Classification.ALIVE);
		cf2.setFeature(f2);
		cf3.setClassification(Classification.DEAD);
		cf3.setFeature(f1);
		cf4.setClassification(Classification.UNBOUND);
		cf4.setFeature(f3);
		context1.getClassifiedFeatures().add(cf1);
		context2.getClassifiedFeatures().add(cf2);
		context2.getClassifiedFeatures().add(cf3);
		context2.getClassifiedFeatures().add(cf4);
		
		assertFalse(ContextChecker.areConsistent(context1, context2));
		assertFalse(ContextChecker.areConsistent(context2, context1));
	}
	

	@Test
	public void testValid() {
		ClassifiedFeature cf1 = cmf.createClassifiedFeature();
		ClassifiedFeature cf2 = cmf.createClassifiedFeature();
		ClassifiedFeature cf3 = cmf.createClassifiedFeature();
		ClassifiedFeature cf4 = cmf.createClassifiedFeature();
		ClassifiedFeature cf5 = cmf.createClassifiedFeature();
		cf1.setClassification(Classification.ALIVE);
		cf1.setFeature(f1);
		cf2.setClassification(Classification.UNBOUND);
		cf2.setFeature(f2);
		cf3.setClassification(Classification.DEAD);
		cf3.setFeature(f3);
		cf4.setClassification(Classification.DEAD);
		cf4.setFeature(f2);
		cf5.setClassification(Classification.DEAD);
		cf5.setFeature(f3);
		
		context1.getClassifiedFeatures().add(cf1);
		context1.getClassifiedFeatures().add(cf2);
		context1.getClassifiedFeatures().add(cf3);
		context2.getClassifiedFeatures().add(cf4);
		context2.getClassifiedFeatures().add(cf5);
		
		assertTrue(ContextChecker.areConsistent(context1, context2));
		assertTrue(ContextChecker.areConsistent(context2, context1));
	}
}
