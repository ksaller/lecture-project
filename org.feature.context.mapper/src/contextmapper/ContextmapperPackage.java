/**
 */
package contextmapper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see contextmapper.ContextmapperFactory
 * @model kind="package"
 * @generated
 */
public interface ContextmapperPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contextmapper";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/feature/context/mapper/model/contextmapper.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.feature.context.mapper.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextmapperPackage eINSTANCE = contextmapper.impl.ContextmapperPackageImpl.init();

	/**
	 * The meta object id for the '{@link contextmapper.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.ContextImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__EXTEND = 3;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__EXCLUDE = 4;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__EXCLUDED = 5;

	/**
	 * The feature id for the '<em><b>Priorize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PRIORIZE = 6;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link contextmapper.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.ClassifierImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 1;

	/**
	 * The feature id for the '<em><b>Feature Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FEATURE_CLASSIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link contextmapper.impl.RuntimeConfigImpl <em>Runtime Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.RuntimeConfigImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getRuntimeConfig()
	 * @generated
	 */
	int RUNTIME_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG__INCLUDE = 1;

	/**
	 * The number of structural features of the '<em>Runtime Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link contextmapper.impl.ContextDiagramImpl <em>Context Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.ContextDiagramImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getContextDiagram()
	 * @generated
	 */
	int CONTEXT_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Mapping Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIAGRAM__MAPPING_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIAGRAM__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Runtimeconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIAGRAM__RUNTIMECONFIG = 2;

	/**
	 * The number of structural features of the '<em>Context Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link contextmapper.impl.ExcludeConnectionImpl <em>Exclude Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.ExcludeConnectionImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getExcludeConnection()
	 * @generated
	 */
	int EXCLUDE_CONNECTION = 5;

	/**
	 * The meta object id for the '{@link contextmapper.impl.IncludeConnectionImpl <em>Include Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.IncludeConnectionImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getIncludeConnection()
	 * @generated
	 */
	int INCLUDE_CONNECTION = 7;

	/**
	 * The meta object id for the '{@link contextmapper.impl.PriorConnectionImpl <em>Prior Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.PriorConnectionImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getPriorConnection()
	 * @generated
	 */
	int PRIOR_CONNECTION = 6;

	/**
	 * The meta object id for the '{@link contextmapper.impl.ExtendConnectionImpl <em>Extend Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.ExtendConnectionImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getExtendConnection()
	 * @generated
	 */
	int EXTEND_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTEND_CONNECTION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTEND_CONNECTION__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Extend Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTEND_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONNECTION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Exclude Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_CONNECTION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_CONNECTION__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Prior Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CONNECTION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Include Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link contextmapper.Classification <em>Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.Classification
	 * @see contextmapper.impl.ContextmapperPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 8;


	/**
	 * Returns the meta object for class '{@link contextmapper.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see contextmapper.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link contextmapper.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see contextmapper.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for the reference '{@link contextmapper.Context#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see contextmapper.Context#getMapping()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Mapping();

	/**
	 * Returns the meta object for the reference list '{@link contextmapper.Context#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classifier</em>'.
	 * @see contextmapper.Context#getClassifier()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Classifier();

	/**
	 * Returns the meta object for the containment reference list '{@link contextmapper.Context#getPriorize <em>Priorize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Priorize</em>'.
	 * @see contextmapper.Context#getPriorize()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Priorize();

	/**
	 * Returns the meta object for the containment reference list '{@link contextmapper.Context#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extend</em>'.
	 * @see contextmapper.Context#getExtend()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Extend();

	/**
	 * Returns the meta object for the containment reference list '{@link contextmapper.Context#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude</em>'.
	 * @see contextmapper.Context#getExclude()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Exclude();

	/**
	 * Returns the meta object for the reference list '{@link contextmapper.Context#getExcluded <em>Excluded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded</em>'.
	 * @see contextmapper.Context#getExcluded()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Excluded();

	/**
	 * Returns the meta object for class '{@link contextmapper.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see contextmapper.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link contextmapper.Classifier#getFeatureClassification <em>Feature Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Classification</em>'.
	 * @see contextmapper.Classifier#getFeatureClassification()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_FeatureClassification();

	/**
	 * Returns the meta object for the reference '{@link contextmapper.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see contextmapper.Classifier#getFeature()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Feature();

	/**
	 * Returns the meta object for class '{@link contextmapper.RuntimeConfig <em>Runtime Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Config</em>'.
	 * @see contextmapper.RuntimeConfig
	 * @generated
	 */
	EClass getRuntimeConfig();

	/**
	 * Returns the meta object for the attribute '{@link contextmapper.RuntimeConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see contextmapper.RuntimeConfig#getName()
	 * @see #getRuntimeConfig()
	 * @generated
	 */
	EAttribute getRuntimeConfig_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link contextmapper.RuntimeConfig#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see contextmapper.RuntimeConfig#getInclude()
	 * @see #getRuntimeConfig()
	 * @generated
	 */
	EReference getRuntimeConfig_Include();

	/**
	 * Returns the meta object for class '{@link contextmapper.ContextDiagram <em>Context Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Diagram</em>'.
	 * @see contextmapper.ContextDiagram
	 * @generated
	 */
	EClass getContextDiagram();

	/**
	 * Returns the meta object for the reference '{@link contextmapper.ContextDiagram#getMappingReference <em>Mapping Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping Reference</em>'.
	 * @see contextmapper.ContextDiagram#getMappingReference()
	 * @see #getContextDiagram()
	 * @generated
	 */
	EReference getContextDiagram_MappingReference();

	/**
	 * Returns the meta object for the containment reference list '{@link contextmapper.ContextDiagram#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see contextmapper.ContextDiagram#getContext()
	 * @see #getContextDiagram()
	 * @generated
	 */
	EReference getContextDiagram_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link contextmapper.ContextDiagram#getRuntimeconfig <em>Runtimeconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtimeconfig</em>'.
	 * @see contextmapper.ContextDiagram#getRuntimeconfig()
	 * @see #getContextDiagram()
	 * @generated
	 */
	EReference getContextDiagram_Runtimeconfig();

	/**
	 * Returns the meta object for class '{@link contextmapper.ExcludeConnection <em>Exclude Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Connection</em>'.
	 * @see contextmapper.ExcludeConnection
	 * @generated
	 */
	EClass getExcludeConnection();

	/**
	 * Returns the meta object for the container reference '{@link contextmapper.ExcludeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see contextmapper.ExcludeConnection#getSource()
	 * @see #getExcludeConnection()
	 * @generated
	 */
	EReference getExcludeConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link contextmapper.ExcludeConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see contextmapper.ExcludeConnection#getTarget()
	 * @see #getExcludeConnection()
	 * @generated
	 */
	EReference getExcludeConnection_Target();

	/**
	 * Returns the meta object for class '{@link contextmapper.IncludeConnection <em>Include Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Connection</em>'.
	 * @see contextmapper.IncludeConnection
	 * @generated
	 */
	EClass getIncludeConnection();

	/**
	 * Returns the meta object for the reference '{@link contextmapper.IncludeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see contextmapper.IncludeConnection#getSource()
	 * @see #getIncludeConnection()
	 * @generated
	 */
	EReference getIncludeConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link contextmapper.IncludeConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see contextmapper.IncludeConnection#getTarget()
	 * @see #getIncludeConnection()
	 * @generated
	 */
	EReference getIncludeConnection_Target();

	/**
	 * Returns the meta object for class '{@link contextmapper.PriorConnection <em>Prior Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prior Connection</em>'.
	 * @see contextmapper.PriorConnection
	 * @generated
	 */
	EClass getPriorConnection();

	/**
	 * Returns the meta object for the reference '{@link contextmapper.PriorConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see contextmapper.PriorConnection#getTarget()
	 * @see #getPriorConnection()
	 * @generated
	 */
	EReference getPriorConnection_Target();

	/**
	 * Returns the meta object for the container reference '{@link contextmapper.PriorConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see contextmapper.PriorConnection#getSource()
	 * @see #getPriorConnection()
	 * @generated
	 */
	EReference getPriorConnection_Source();

	/**
	 * Returns the meta object for class '{@link contextmapper.ExtendConnection <em>Extend Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extend Connection</em>'.
	 * @see contextmapper.ExtendConnection
	 * @generated
	 */
	EClass getExtendConnection();

	/**
	 * Returns the meta object for the reference '{@link contextmapper.ExtendConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see contextmapper.ExtendConnection#getTarget()
	 * @see #getExtendConnection()
	 * @generated
	 */
	EReference getExtendConnection_Target();

	/**
	 * Returns the meta object for the container reference '{@link contextmapper.ExtendConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see contextmapper.ExtendConnection#getSource()
	 * @see #getExtendConnection()
	 * @generated
	 */
	EReference getExtendConnection_Source();

	/**
	 * Returns the meta object for enum '{@link contextmapper.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classification</em>'.
	 * @see contextmapper.Classification
	 * @generated
	 */
	EEnum getClassification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextmapperFactory getContextmapperFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link contextmapper.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.ContextImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__MAPPING = eINSTANCE.getContext_Mapping();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CLASSIFIER = eINSTANCE.getContext_Classifier();

		/**
		 * The meta object literal for the '<em><b>Priorize</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PRIORIZE = eINSTANCE.getContext_Priorize();

		/**
		 * The meta object literal for the '<em><b>Extend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__EXTEND = eINSTANCE.getContext_Extend();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__EXCLUDE = eINSTANCE.getContext_Exclude();

		/**
		 * The meta object literal for the '<em><b>Excluded</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__EXCLUDED = eINSTANCE.getContext_Excluded();

		/**
		 * The meta object literal for the '{@link contextmapper.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.ClassifierImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Feature Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__FEATURE_CLASSIFICATION = eINSTANCE.getClassifier_FeatureClassification();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__FEATURE = eINSTANCE.getClassifier_Feature();

		/**
		 * The meta object literal for the '{@link contextmapper.impl.RuntimeConfigImpl <em>Runtime Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.RuntimeConfigImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getRuntimeConfig()
		 * @generated
		 */
		EClass RUNTIME_CONFIG = eINSTANCE.getRuntimeConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_CONFIG__NAME = eINSTANCE.getRuntimeConfig_Name();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_CONFIG__INCLUDE = eINSTANCE.getRuntimeConfig_Include();

		/**
		 * The meta object literal for the '{@link contextmapper.impl.ContextDiagramImpl <em>Context Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.ContextDiagramImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getContextDiagram()
		 * @generated
		 */
		EClass CONTEXT_DIAGRAM = eINSTANCE.getContextDiagram();

		/**
		 * The meta object literal for the '<em><b>Mapping Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DIAGRAM__MAPPING_REFERENCE = eINSTANCE.getContextDiagram_MappingReference();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DIAGRAM__CONTEXT = eINSTANCE.getContextDiagram_Context();

		/**
		 * The meta object literal for the '<em><b>Runtimeconfig</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DIAGRAM__RUNTIMECONFIG = eINSTANCE.getContextDiagram_Runtimeconfig();

		/**
		 * The meta object literal for the '{@link contextmapper.impl.ExcludeConnectionImpl <em>Exclude Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.ExcludeConnectionImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getExcludeConnection()
		 * @generated
		 */
		EClass EXCLUDE_CONNECTION = eINSTANCE.getExcludeConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_CONNECTION__SOURCE = eINSTANCE.getExcludeConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_CONNECTION__TARGET = eINSTANCE.getExcludeConnection_Target();

		/**
		 * The meta object literal for the '{@link contextmapper.impl.IncludeConnectionImpl <em>Include Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.IncludeConnectionImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getIncludeConnection()
		 * @generated
		 */
		EClass INCLUDE_CONNECTION = eINSTANCE.getIncludeConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE_CONNECTION__SOURCE = eINSTANCE.getIncludeConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE_CONNECTION__TARGET = eINSTANCE.getIncludeConnection_Target();

		/**
		 * The meta object literal for the '{@link contextmapper.impl.PriorConnectionImpl <em>Prior Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.PriorConnectionImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getPriorConnection()
		 * @generated
		 */
		EClass PRIOR_CONNECTION = eINSTANCE.getPriorConnection();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_CONNECTION__TARGET = eINSTANCE.getPriorConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_CONNECTION__SOURCE = eINSTANCE.getPriorConnection_Source();

		/**
		 * The meta object literal for the '{@link contextmapper.impl.ExtendConnectionImpl <em>Extend Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.ExtendConnectionImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getExtendConnection()
		 * @generated
		 */
		EClass EXTEND_CONNECTION = eINSTANCE.getExtendConnection();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTEND_CONNECTION__TARGET = eINSTANCE.getExtendConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTEND_CONNECTION__SOURCE = eINSTANCE.getExtendConnection_Source();

		/**
		 * The meta object literal for the '{@link contextmapper.Classification <em>Classification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.Classification
		 * @see contextmapper.impl.ContextmapperPackageImpl#getClassification()
		 * @generated
		 */
		EEnum CLASSIFICATION = eINSTANCE.getClassification();

	}

} //ContextmapperPackage
