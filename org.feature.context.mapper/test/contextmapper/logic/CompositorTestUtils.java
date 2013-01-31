package contextmapper.logic;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class CompositorTestUtils {

	public static URI createFileURI(String path, boolean mustExist) {
		File filePath = new File(path);
		if (!filePath.exists() && mustExist)
			throw new IllegalArgumentException(path + " does not exist.");
	
		return URI.createFileURI(filePath.getAbsolutePath());
	}

	public static void initEMF(EPackage ePackage) {
		// Initialize the model
		// logger.debug("Initializing " + ePackage.getName());
	
		ePackage.getName();
		registerXMIFactoryAsDefault();
	}

	public static EObject loadModel(EPackage ePackage, String path,
			ResourceSet resourceSet) {
		initEMF(ePackage);
	
		return loadModel(createFileURI(path, true), resourceSet);
	}

	public static EObject loadModel(URI uri, ResourceSet resourceSet) {
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

	public static void registerXMIFactoryAsDefault() {
		// Add XMI factory to registry
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
	}

}
