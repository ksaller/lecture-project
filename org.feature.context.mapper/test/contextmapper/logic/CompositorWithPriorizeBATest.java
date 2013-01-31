package contextmapper.logic;

import static org.junit.Assert.assertEquals;

import org.feature.multi.perspective.mapping.viewmapping.Mapping;
import org.feature.multi.perspective.mapping.viewmapping.ViewmappingFactory;
import org.feature.multi.perspective.model.viewmodel.AbstractGroup;
import org.feature.multi.perspective.model.viewmodel.ViewmodelFactory;
import org.featuremapper.models.feature.Feature;
import org.featuremapper.models.feature.FeatureModel;
import org.featuremapper.models.feature.FeaturePackage;
import org.junit.Before;
import org.junit.Test;

import contextmapper.Classification;
import contextmapper.Classifier;
import contextmapper.Context;
import contextmapper.ContextmapperFactory;
import contextmapper.PriorConnection;

public class CompositorWithPriorizeBATest {

	Context c1, c2, c3;
	Mapping m1, m2;
	Classifier cl1, cl2, cl3, cl4, cl5, cl6;
	FeatureModel fm;

	@Before
	public void setUp() {
		c1 = ContextmapperFactory.eINSTANCE.createContext();
		c2 = ContextmapperFactory.eINSTANCE.createContext();
		m1 = ViewmappingFactory.eINSTANCE.createMapping();
		m2 = ViewmappingFactory.eINSTANCE.createMapping();
		cl1 = ContextmapperFactory.eINSTANCE.createClassifier();
		cl2 = ContextmapperFactory.eINSTANCE.createClassifier();
		cl3 = ContextmapperFactory.eINSTANCE.createClassifier();
		cl4 = ContextmapperFactory.eINSTANCE.createClassifier();
		cl5 = ContextmapperFactory.eINSTANCE.createClassifier();
		cl6 = ContextmapperFactory.eINSTANCE.createClassifier();
		fm = (FeatureModel) CompositorTestUtils.loadModel(FeaturePackage.eINSTANCE,
				"testdata/documentmanagement.feature", null);
		cl1.setFeature(fm.getRoot());
		cl2.setFeature(fm.getRoot());

		// m2.getFeatures().add(fm.getRoot());
		c1.setMapping(m1);
		c2.setMapping(m2);
		c1.getClassifier().add(cl1);
		c2.getClassifier().add(cl2);
		m1.getFeatures().addAll(fm.getAllFeatures());
		m2.getFeatures().add(fm.getRoot());

		AbstractGroup value1 = ViewmodelFactory.eINSTANCE.createCoreGroup();
		AbstractGroup value2 = ViewmodelFactory.eINSTANCE.createCoreGroup();
		value1.setName("g1");
		value2.setName("g2");
		c1.getMapping().setViewgroup(value1);
		c2.getMapping().setViewgroup(value2);
		
		PriorConnection prCon = ContextmapperFactory.eINSTANCE.createPriorConnection();
		prCon.setSource(c2);
		prCon.setTarget(c1);
		c2.getPriorize().add(prCon);
	}

	@Test
	public void testUnboundDead() throws ContradictionException {
		c1.getClassifier().get(0)
				.setFeatureClassification(Classification.UNBOUND);
		c2.getClassifier().get(0).setFeatureClassification(Classification.DEAD);
		assertEquals(Compositor.compose(c1, c2).getClassifier().get(0)
				.getFeatureClassification(), Classification.DEAD);
		assertEquals(Compositor.compose(c2, c1).getClassifier().get(0)
				.getFeatureClassification(), Classification.DEAD);
	}

	@Test
	public void testAliveDead() throws ContradictionException {
		c1.getClassifier().get(0)
				.setFeatureClassification(Classification.ALIVE);
		c2.getClassifier().get(0).setFeatureClassification(Classification.DEAD);
		assertEquals(Compositor.compose(c1, c2).getClassifier().get(0)
				.getFeatureClassification(), Classification.DEAD);

	}
	
	@Test
	public void testDeadAlive() throws ContradictionException {
		c1.getClassifier().get(0)
				.setFeatureClassification(Classification.ALIVE);
		c2.getClassifier().get(0).setFeatureClassification(Classification.DEAD);
		assertEquals(Compositor.compose(c2, c1).getClassifier().get(0)
				.getFeatureClassification(), Classification.DEAD);
	}

	@Test
	public void testUnboundAlive() throws ContradictionException {
		c1.getClassifier().get(0)
				.setFeatureClassification(Classification.UNBOUND);
		c2.getClassifier().get(0)
				.setFeatureClassification(Classification.ALIVE);
		assertEquals(Compositor.compose(c1, c2).getClassifier().get(0)
				.getFeatureClassification(), Classification.ALIVE);
		assertEquals(Compositor.compose(c2, c1).getClassifier().get(0)
				.getFeatureClassification(), Classification.ALIVE);
	}

	@Test
	public void testAliveAlive() throws ContradictionException {
		c1.getClassifier().get(0)
				.setFeatureClassification(Classification.ALIVE);
		c2.getClassifier().get(0)
				.setFeatureClassification(Classification.ALIVE);
		assertEquals(Compositor.compose(c1, c2).getClassifier().get(0)
				.getFeatureClassification(), Classification.ALIVE);
		assertEquals(Compositor.compose(c2, c1).getClassifier().get(0)
				.getFeatureClassification(), Classification.ALIVE);
	}

	@Test
	public void testDeadDead() throws ContradictionException {
		c1.getClassifier().get(0).setFeatureClassification(Classification.DEAD);
		c2.getClassifier().get(0).setFeatureClassification(Classification.DEAD);
		assertEquals(Compositor.compose(c1, c2).getClassifier().get(0)
				.getFeatureClassification(), Classification.DEAD);
		assertEquals(Compositor.compose(c2, c1).getClassifier().get(0)
				.getFeatureClassification(), Classification.DEAD);
	}

	@Test
	public void testUnboundUnbound() throws ContradictionException {
		c1.getClassifier().get(0)
				.setFeatureClassification(Classification.UNBOUND);
		c2.getClassifier().get(0)
				.setFeatureClassification(Classification.UNBOUND);
		assertEquals(Compositor.compose(c1, c2).getClassifier().get(0)
				.getFeatureClassification(), Classification.UNBOUND);
		assertEquals(Compositor.compose(c2, c1).getClassifier().get(0)
				.getFeatureClassification(), Classification.UNBOUND);
	}

	@Test
	public void testUnclassifiedDead() throws ContradictionException {
		c1.getClassifier().clear();
		c2.getClassifier().get(0).setFeatureClassification(Classification.DEAD);
		assertEquals(Compositor.compose(c1, c2).getClassifier().get(0)
				.getFeatureClassification(), Classification.DEAD);
		assertEquals(Compositor.compose(c2, c1).getClassifier().get(0)
				.getFeatureClassification(), Classification.DEAD);

	}

	@Test
	public void testUnclassifiedUnbound() throws ContradictionException {
		c1.getClassifier().clear();
		c2.getClassifier().get(0)
				.setFeatureClassification(Classification.UNBOUND);
		assertEquals(Compositor.compose(c1, c2).getClassifier().get(0)
				.getFeatureClassification(), Classification.UNBOUND);
		assertEquals(Compositor.compose(c2, c1).getClassifier().get(0)
				.getFeatureClassification(), Classification.UNBOUND);

	}

	@Test
	public void testUnclassifiedUnclassified() throws ContradictionException {
		c1.getClassifier().clear();
		c2.getClassifier().clear();
		assertEquals(Compositor.compose(c1,c2).getClassifier().size(),0);
		assertEquals(Compositor.compose(c2,c1).getClassifier().size(),0);
		

	}

	@Test
	public void testUnclassifiedAlive() throws ContradictionException {
		c1.getClassifier().clear();
		c2.getClassifier().get(0)
				.setFeatureClassification(Classification.ALIVE);
		assertEquals(Compositor.compose(c1, c2).getClassifier().get(0)
				.getFeatureClassification(), Classification.ALIVE);
		assertEquals(Compositor.compose(c2, c1).getClassifier().get(0)
				.getFeatureClassification(), Classification.ALIVE);

	}

	@Test
	public void testSerie() throws ContradictionException {

		Feature f1 = m1.getFeatures().get(3);
		Feature f2 = m1.getFeatures().get(20);
		Feature f3 = m1.getFeatures().get(13);
		Feature f4 = m1.getFeatures().get(14);
		cl3.setFeature(f1);
		cl4.setFeature(f2);
		cl5.setFeature(f3);
		cl6.setFeature(f4);

		c1.getClassifier().add(cl3);
		c2.getClassifier().add(cl5);
		c1.getClassifier().add(cl4);
		c2.getClassifier().add(cl6);
		c1.getClassifier().get(2).setFeatureClassification(Classification.DEAD);
		c2.getClassifier().get(2).setFeatureClassification(Classification.ALIVE);
		c1.getClassifier().get(0).setFeatureClassification(Classification.ALIVE);
		c2.getClassifier().get(0).setFeatureClassification(Classification.UNBOUND);
		c1.getClassifier().get(1).setFeatureClassification(Classification.UNBOUND);
		c2.getClassifier().get(1).setFeatureClassification(Classification.DEAD);
		c3 = Compositor.compose(c1, c2);
		assertEquals(c3.getClassifier().size(), 5);

	}
}
