package org.backend.live.tests;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Vector;

import org.backend.live.check.CheckConstraints;
import org.backend.storage.StorageController;
import org.eclipse.emf.common.util.EList;
import org.featuremapper.models.feature.Feature;
import org.featuremapper.models.feature.FeatureModel;
import org.junit.Before;
import org.west.es.context.contextModel.Classification;
import org.west.es.context.contextModel.ClassifiedFeature;
import org.west.es.context.contextModel.ContextModelFactory;

public class Test {

	private StorageController controller;
	
	private CheckConstraints chk;
	
	private FeatureModel model;
	
	private ContextModelFactory contextFac;
	
	Vector<ClassifiedFeature> classi1 =  new Vector();
	
	
	
	@Before
	public void init(){
		contextFac = ContextModelFactory.eINSTANCE;
		controller = new StorageController("testdata/SimplePhone.feature");
		chk = new CheckConstraints(controller);
		model = controller.getFeatureModel();
		EList<Feature> features = model.getAllFeatures();
		for(Feature f : features){
			ClassifiedFeature tmp = contextFac.createClassifiedFeature();
			tmp.setFeature(f);
			tmp.setClassification(Classification.ALIVE);
		}
	}
	
	
	@org.junit.Test
	public void test() {
		for(ClassifiedFeature f : classi1){
			assertTrue(chk.checkNewFeature(f));
		}
	}

}
