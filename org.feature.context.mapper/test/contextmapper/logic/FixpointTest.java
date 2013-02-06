package contextmapper.logic;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.feature.multi.perspective.mapping.viewmapping.Mapping;
import org.feature.multi.perspective.mapping.viewmapping.ViewmappingFactory;
import org.featuremapper.models.feature.FeatureModel;
import org.featuremapper.models.feature.FeaturePackage;
import org.junit.Test;

import contextmapper.Classification;
import contextmapper.Classifier;
import contextmapper.Context;
import contextmapper.ContextmapperFactory;

public class FixpointTest {

	private Map<String, Classification> expectedClassifcations;

	@Test
	// (expected=ConstraintViolation.class)
	public void testSimpleCNFBuild() throws ConstraintViolation {

		Context c = ContextmapperFactory.eINSTANCE.createContext();
		Mapping m1 = ViewmappingFactory.eINSTANCE.createMapping();

		Classifier cl1 = ContextmapperFactory.eINSTANCE.createClassifier();
		Classifier cl2 = ContextmapperFactory.eINSTANCE.createClassifier();
		Classifier cl3 = ContextmapperFactory.eINSTANCE.createClassifier();
		Classifier cl4 = ContextmapperFactory.eINSTANCE.createClassifier();

		FeatureModel fm = (FeatureModel) loadModel(FeaturePackage.eINSTANCE,
				"testdata/wsn.feature", null);

		// AdHoc
		cl1.setFeature(fm.getRoot().getGroups().get(0).getChildFeatures()
				.get(0).getGroups().get(0).getChildFeatures().get(0));
		cl1.setFeatureClassification(Classification.ALIVE);
//		System.out.println("CL1: " + cl1.getFeature().getName());

		// Sensors
		cl2.setFeature(fm.getRoot().getGroups().get(3).getChildFeatures()
				.get(0));
		cl2.setFeatureClassification(Classification.ALIVE);
//		System.out.println("CL2: " + cl2.getFeature().getName());
		
		// Temperatur
		cl3.setFeature(fm.getRoot().getGroups().get(3).getChildFeatures()
				.get(0).getGroups().get(0).getChildFeatures().get(1));
		cl3.setFeatureClassification(Classification.DEAD);
//		System.out.println("CL3: " + cl3.getFeature().getName());
		
		// GPS
		cl4.setFeature(fm.getRoot().getGroups().get(3).getChildFeatures()
				.get(0).getGroups().get(0).getChildFeatures().get(0));
		cl4.setFeatureClassification(Classification.DEAD);
//		System.out.println("CL4: " + cl4.getFeature().getName());
		
		m1.getFeatures().add(cl1.getFeature());
		m1.getFeatures().add(cl2.getFeature());
		m1.getFeatures().add(cl3.getFeature());
		m1.getFeatures().add(cl4.getFeature());

		c.setMapping(m1);
		c.getClassifier().add(cl1);
		c.getClassifier().add(cl2);
		c.getClassifier().add(cl3);
		c.getClassifier().add(cl4);

		expectedClassifcations = new HashMap<String, Classification>();

		expectedClassifcations.put("WSN_Platform", Classification.ALIVE);
		expectedClassifcations.put("Connection", Classification.ALIVE);
		expectedClassifcations.put("AdHoc", Classification.ALIVE);
		expectedClassifcations.put("WifiAdHoc", Classification.ALIVE);
		expectedClassifcations.put("Infrastructure", Classification.DEAD);
		expectedClassifcations.put("WifiInfrastructure", Classification.DEAD);
		expectedClassifcations.put("GSM", Classification.DEAD);
		expectedClassifcations.put("Routing", Classification.ALIVE);
		expectedClassifcations.put("BGP", Classification.DEAD);
		expectedClassifcations.put("LAR", Classification.ALIVE);
		expectedClassifcations.put("Monitoring", Classification.ALIVE);
		expectedClassifcations.put("Analysis", Classification.UNBOUND);
		expectedClassifcations.put("CollectionProtocol", Classification.ALIVE);
		expectedClassifcations.put("PushSum", Classification.UNBOUND);
		expectedClassifcations.put("SystemExp", Classification.UNBOUND);
		expectedClassifcations.put("CS", Classification.UNBOUND);
		expectedClassifcations.put("Sensors", Classification.ALIVE);
		expectedClassifcations.put("GPS", Classification.DEAD);
		expectedClassifcations.put("Temperatur", Classification.DEAD);
		expectedClassifcations.put("Pressure", Classification.ALIVE);
		expectedClassifcations.put("Chipset", Classification.ALIVE);
		expectedClassifcations.put("ARM", Classification.UNBOUND);
		expectedClassifcations.put("Intel", Classification.UNBOUND);

		IFixpointSolver ifs = new Fixpoint();
		ifs.create(c, fm, false);
		System.out.println("______________________________");

		for (Classifier cl : ifs.solve()) {
//			System.out.println(" - set " + cl.getFeature().getName() + " to "
//					+ cl.getFeatureClassification());
			Assert.assertEquals(cl.getFeature().getName(), searchExpectedClassification(cl),
					cl.getFeatureClassification());

		}
	}

	private Classification searchExpectedClassification(Classifier cf) {

		return expectedClassifcations.get(cf.getFeature().getName());

	}

	private EObject loadModel(EPackage ePackage, String path,
			ResourceSet resourceSet) {
		initEMF(ePackage);

		return loadModel(createFileURI(path, true), resourceSet);
	}

	private EObject loadModel(URI uri, ResourceSet resourceSet) {
		// Obtain a new resource set if necessary
		if (resourceSet == null)
			resourceSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resourceSet.getResource(uri, true);

		// Add adapter for reverse navigation along unidirectional links
		ECrossReferenceAdapter adapter = ECrossReferenceAdapter
				.getCrossReferenceAdapter(resourceSet);
		if (adapter == null)
			resourceSet.eAdapters().add(new ECrossReferenceAdapter());

		// Return root model element
		return resource.getContents().get(0);
	}

	private URI createFileURI(String path, boolean mustExist) {
		File filePath = new File(path);
		if (!filePath.exists() && mustExist)
			throw new IllegalArgumentException(path + " does not exist.");

		return URI.createFileURI(filePath.getAbsolutePath());
	}

	private void registerXMIFactoryAsDefault() {
		// Add XMI factory to registry
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
	}

	private void initEMF(EPackage ePackage) {
		// Initialize the model
		// logger.debug("Initializing " + ePackage.getName());

		ePackage.getName();
		registerXMIFactoryAsDefault();
	}

}
