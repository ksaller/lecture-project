package storage;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emftext.term.propositional.expression.Term;
import org.feature.model.csp.TextExpressionParser;
import org.featuremapper.models.feature.Constraint;
import org.featuremapper.models.feature.Feature;
import org.featuremapper.models.feature.FeatureModel;
import org.featuremapper.models.feature.FeaturePackage;


// TODO: Auto-generated Javadoc
/**
 * The Class Datamanager.
 */
public class Datamanager {
	
	/** The featuremodel. */
	private FeatureModel featuremodel;
	
	/** The constraints. */
	private EList<Constraint> constraints;

	/** The chosen features. */
	private Vector<Feature> choosenFeatures = new Vector<Feature>();
	
	/** The terms. */
	private List<Term> terms;
	
	/**
	 * Instantiates a new datamanager.
	 *
	 * @param featuremodel the featuremodel
	 */
	public Datamanager(FeatureModel featuremodel){
		this.featuremodel = featuremodel;
		init();		
	}
	
	/**
	 * Instantiates a new datamanager.
	 *
	 * @param pfad the pfad
	 */
	public Datamanager(String pfad){
		featuremodel =(FeatureModel) loadModel(FeaturePackage.eINSTANCE, pfad, null);
		init();
	}
	
	/**
	 * Inits the.
	 */
	private void init(){
		setConstraints(featuremodel.getConstraints());
		terms = TextExpressionParser.parseExpressions(featuremodel);
	}
	
	/**
	 * Gets the constraints.
	 *
	 * @return the constraints
	 */
	public EList<Constraint> getConstraints() {
		return constraints;
	}

	/**
	 * Sets the constraints.
	 *
	 * @param constraints the constraints to set
	 */
	protected void setConstraints(EList<Constraint> constraints) {
		this.constraints = constraints;
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
	 * @param terms the terms to set
	 */
	public void setTerms(List<Term> terms) {
		this.terms = terms;
	}
	
	
	/**
	 * Gets the feature model.
	 *
	 * @return the featuremodel
	 */
	public FeatureModel getFeatureModel() {
		return featuremodel;
	}

	/**
	 * Sets the feature model.
	 *
	 * @param featuremodel the featuremodel to set
	 */
	public void setFeatureModel(FeatureModel featuremodel) {
		this.featuremodel = featuremodel;
		setConstraints(featuremodel.getConstraints());
	}
	
	/**
	 * Adds the feature.
	 *
	 * @param feature the feature
	 */
	public void addFeature(Feature feature){
		choosenFeatures.add(feature);
	}
	
	/**
	 * Gets the nuber of choosen features.
	 *
	 * @return the nuber of choosen features
	 */
	public int getNuberOfChoosenFeatures(){
		return choosenFeatures.size();
	}
	
	/**
	 * Gets the feature at position.
	 *
	 * @param position the position
	 * @return the feature at position
	 */
	public Feature getFeatureAtPosition(int position){
		return choosenFeatures.get(position);
	}
	
	//Code aus Slicer
	
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
		if (resourceSet == null){
			resourceSet = new ResourceSetImpl();
		}
		// Get the resource
		Resource resource = resourceSet.getResource(uri, true);

		// Add adapter for reverse navigation along unidirectional links
		ECrossReferenceAdapter adapter = ECrossReferenceAdapter.getCrossReferenceAdapter(resourceSet);
		if (adapter == null){
			resourceSet.eAdapters().add(new ECrossReferenceAdapter());
		}
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
	 * Register xmi factory as default.
	 */
	private void registerXMIFactoryAsDefault() {
		// Add XMI factory to registry
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
	}

	
}
