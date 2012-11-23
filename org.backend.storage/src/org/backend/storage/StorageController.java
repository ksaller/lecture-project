/*
 * 
 */
package org.backend.storage;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emftext.term.propositional.expression.Term;
import org.feature.model.sat.TextExpressionParser;
import org.featuremapper.models.feature.Constraint;
import org.featuremapper.models.feature.FeatureModel;
import org.featuremapper.models.feature.FeaturePackage;

// TODO: Auto-generated Javadoc
/**
 * The Class StorageController.
 */
public class StorageController {
	
	/** The featuremodel. */
	private FeatureModel featuremodel;
	
	/** The terms. */
	private List<Term> terms;
	
	/** The constraints. */
	private List<Constraint> constraints;
	
	/**
	 * Instantiates a new storage controller.
	 *
	 * @param featuremodel the featuremodel
	 */
	public StorageController(FeatureModel featuremodel){
		this.featuremodel =featuremodel;
		init();
	}
	
	/**
	 * Instantiates a new storage controller.
	 *
	 * @param pfad the pfad
	 */
	public StorageController(String pfad){
		this.featuremodel = (FeatureModel) loadModel(FeaturePackage.eINSTANCE,pfad, null);
		init();
	}
	
	/**
	 * Inits the.
	 */
	private void init(){
		setTerms(TextExpressionParser.parseExpressions(featuremodel));
		setConstraints(featuremodel.getConstraints());
	}
	
	
	//begin loadModel Code from /org.feature.model.slicer/test/formulaSlicer/formula/TestCNFBuild.java
	 
	/**
	 * Load model.
	 *
	 * @param ePackage the e package
	 * @param path the path
	 * @param resourceSet the resource set
	 * @return the e object
	 */
	private EObject loadModel(EPackage ePackage, String path,
			ResourceSet resourceSet) {
		initEMF(ePackage);

		return loadModel(createFileURI(path, true), resourceSet);
	}

	/**
	 * Load model.
	 *
	 * @param uri the uri
	 * @param resourceSet the resource set
	 * @return the e object
	 */
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

	/**
	 * Creates the file uri.
	 *
	 * @param path the path
	 * @param mustExist the must exist
	 * @return the uri
	 */
	private URI createFileURI(String path, boolean mustExist) {
		File filePath = new File(path);
		if (!filePath.exists() && mustExist)
			throw new IllegalArgumentException(path + " does not exist.");

		return URI.createFileURI(filePath.getAbsolutePath());
	}

	/**
	 * Register xmi factory as default.
	 */
	private void registerXMIFactoryAsDefault() {
		// Add XMI factory to registry
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
	}

	/**
	 * Inits the emf.
	 *
	 * @param ePackage the e package
	 */
	private void initEMF(EPackage ePackage) {
		// Initialize the model
		// logger.debug("Initializing " + ePackage.getName());

		ePackage.getName();
		registerXMIFactoryAsDefault();
	}

	/**
	 * Gets the terms.
	 *
	 * @return the terms
	 */
	public List<Term> getTerms() {
		return terms;
	}

	/**
	 * Sets the terms.
	 *
	 * @param terms the new terms
	 */
	public void setTerms(List<Term> terms) {
		this.terms = terms;
	}

	/**
	 * Gets the constraints.
	 *
	 * @return the constraints
	 */
	public List<Constraint> getConstraints() {
		return constraints;
	}

	/**
	 * Sets the constraints.
	 *
	 * @param constraints the new constraints
	 */
	public void setConstraints(List<Constraint> constraints) {
		this.constraints = constraints;
	}
	
	//end loadModel Code from /org.feature.model.slicer/test/formulaSlicer/formula/TestCNFBuild.java
	
}
