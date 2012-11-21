package tests;

import org.eclipse.emf.common.util.EList;
import org.featuremapper.models.feature.Constraint;
import org.featuremapper.models.feature.Feature;
import org.featuremapper.models.feature.FeatureFactory;
import org.featuremapper.models.feature.FeatureModel;
import org.featuremapper.models.feature.Group;

import storage.Datamanager;

public class TestDatabase {

	static Datamanager manager;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**FeatureFactory fac = FeatureFactory.eINSTANCE;
		FeatureModel fm = fac.createFeatureModel();
		
		Feature f1 = fac.createFeature();
		Feature f2 = fac.createFeature();
		Feature f3 = fac.createFeature();
		Feature f4 = fac.createFeature();
		Feature f5 = fac.createFeature();
		
		f1.setName("Feature1");
		f2.setName("Feature2");
		f3.setName("Feature3");
		f4.setName("Feature4");
		f5.setName("Feature5");
		
		Group g1 = fac.createGroup();
		Group g2 = fac.createGroup();
		
		f2.setParentGroup(g1);
		f3.setParentGroup(g1);
		
		f4.setParentGroup(g2);
		f5.setParentGroup(g2);
		
		fm.setName("TestModel");
		fm.setRoot(f1);
		
		g1.setParentFeature(f1);
		g2.setParentFeature(f1);
		
		Constraint c1 = fac.createConstraint();
		Constraint c2 = fac.createConstraint();
		
		c1.setLanguage("CSP");
		c1.setExpression("(not (Feature1 and not Feature2))");
		
		c2.setLanguage("CSP");
		c2.setExpression("(Feature1 and not Feature4) or (not Feature5 and Feature2)");
		
		EList<Constraint> c  = fm.getConstraints();
		c.add(c1);
		c.add(c2);
		
		manager = new Datamanager(fm);*/
		
		manager = new Datamanager("testdata/SimplePhone.feature");
		System.out.println("loadedFeatureModel: "+manager.getFeatureModel());
		System.out.println("Constraints of the FeatureModel: "+manager.getConstraints());
		System.out.println("Sliced Constraints: "+manager.getTerms());
	}

}
