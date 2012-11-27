import java.io.File;
import java.util.Map;
import validation.listener.OurValidationListener;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.ILiveValidator;
import org.eclipse.emf.validation.service.IValidationListener;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.feature.multi.perspective.mapping.viewmapping.Mapping;
import org.feature.multi.perspective.mapping.viewmapping.MappingModel;
import org.feature.multi.perspective.mapping.viewmapping.ViewmappingFactory;
import org.feature.multi.perspective.mapping.viewmapping.ViewmappingPackage;
import org.feature.multi.perspective.model.viewmodel.CoreGroup;
import org.feature.multi.perspective.model.viewmodel.Group;
import org.feature.multi.perspective.model.viewmodel.GroupModel;
import org.feature.multi.perspective.model.viewmodel.ViewmodelFactory;
import org.featuremapper.models.feature.FeatureModel;
import org.featuremapper.models.feature.FeaturePackage;
import org.junit.Test;

public class TestValidation {

	@Test
	public void test() {
		// prepare model
		ViewmodelFactory vmof = ViewmodelFactory.eINSTANCE;
		GroupModel gm = vmof.createGroupModel();
		CoreGroup core = vmof.createCoreGroup();
		gm.setCoreGroup(core);
		Group g1 = vmof.createGroup();
		Group g2 = vmof.createGroup();
		g1.setName("g1");
		g2.setName("g2");
		g2.setParentGroup(core);
		g1.setParentGroup(core);
		
		FeatureModel fm = (FeatureModel) loadModel(FeaturePackage.eINSTANCE, "testdata/SimplePhone.feature", null);
		
		ViewmappingPackage.eINSTANCE.getName();
		ViewmappingFactory vmaf = ViewmappingFactory.eINSTANCE;
		MappingModel mamo = vmaf.createMappingModel();
		mamo.setFeatureModel(fm);
		mamo.setViewModel(gm);
		
		// constaints
		
		// validator
		ILiveValidator liveValidator = (ILiveValidator)ModelValidationService.getInstance().newValidator(EvaluationMode.LIVE);
		
		// Adapter
		LiveValidationAdapter mappingModelAdapter = new LiveValidationAdapter(liveValidator);
		mamo.eAdapters().add(mappingModelAdapter);
		
		// Listener
		IValidationListener listener = new OurValidationListener();
		ModelValidationService mvs = ModelValidationService.getInstance();
		mvs.addValidationListener(listener);
		
		Mapping m1 = vmaf.createMapping();
		m1.getFeatures().add(fm.getRoot().getGroups().get(0).getChildFeatures().get(0));
		m1.setViewgroup(g1);
		mamo.getMappings().add(m1);
		
		Mapping m2 = vmaf.createMapping();
		m2.getFeatures().add(fm.getRoot().getGroups().get(0).getChildFeatures().get(0));
		m2.setViewgroup(g2);
		mamo.getMappings().add(m2);
		
	}

	
	//Code aus Slicer
	
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
		
	private void initEMF(EPackage ePackage) {
		// Initialize the model
		// logger.debug("Initializing " + ePackage.getName());

		ePackage.getName();
		registerXMIFactoryAsDefault();
	}
		
	private void registerXMIFactoryAsDefault() {
		// Add XMI factory to registry
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
	}

}