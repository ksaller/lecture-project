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
	 * The feature id for the '<em><b>Classifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CLASSIFIES = 1;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TARGET_CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Included</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__INCLUDED = 3;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__SOURCE_CONNECTIONS = 4;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Feature Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FEATURE_REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link contextmapper.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.ConnectionImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link contextmapper.impl.PriorConnectionImpl <em>Prior Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.PriorConnectionImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getPriorConnection()
	 * @generated
	 */
	int PRIOR_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_CONNECTION__SOURCE = CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_CONNECTION__TARGET = CONNECTION__TARGET;

	/**
	 * The number of structural features of the '<em>Prior Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link contextmapper.impl.ExcludeConnectionImpl <em>Exclude Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.ExcludeConnectionImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getExcludeConnection()
	 * @generated
	 */
	int EXCLUDE_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONNECTION__SOURCE = CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONNECTION__TARGET = CONNECTION__TARGET;

	/**
	 * The number of structural features of the '<em>Exclude Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link contextmapper.impl.AssociateConnectionImpl <em>Associate Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.AssociateConnectionImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getAssociateConnection()
	 * @generated
	 */
	int ASSOCIATE_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE_CONNECTION__SOURCE = CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE_CONNECTION__TARGET = CONNECTION__TARGET;

	/**
	 * The number of structural features of the '<em>Associate Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link contextmapper.impl.RuntimeConfigImpl <em>Runtime Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.RuntimeConfigImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getRuntimeConfig()
	 * @generated
	 */
	int RUNTIME_CONFIG = 6;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG__INCLUDES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG__NAME = 1;

	/**
	 * The number of structural features of the '<em>Runtime Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Source</b></em>' container reference.
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
	 * The meta object id for the '{@link contextmapper.impl.ContextDiagramImpl <em>Context Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.impl.ContextDiagramImpl
	 * @see contextmapper.impl.ContextmapperPackageImpl#getContextDiagram()
	 * @generated
	 */
	int CONTEXT_DIAGRAM = 8;

	/**
	 * The feature id for the '<em><b>Mapping Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIAGRAM__MAPPING_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Contains Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIAGRAM__CONTAINS_CONTEXTS = 1;

	/**
	 * The feature id for the '<em><b>Contains Runtime Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIAGRAM__CONTAINS_RUNTIME_CONFIGS = 2;

	/**
	 * The number of structural features of the '<em>Context Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link contextmapper.Classification <em>Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextmapper.Classification
	 * @see contextmapper.impl.ContextmapperPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 9;


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
	 * Returns the meta object for the reference list '{@link contextmapper.Context#getClassifies <em>Classifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classifies</em>'.
	 * @see contextmapper.Context#getClassifies()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Classifies();

	/**
	 * Returns the meta object for the reference list '{@link contextmapper.Context#getTargetConnections <em>Target Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Connections</em>'.
	 * @see contextmapper.Context#getTargetConnections()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_TargetConnections();

	/**
	 * Returns the meta object for the reference list '{@link contextmapper.Context#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included</em>'.
	 * @see contextmapper.Context#getIncluded()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Included();

	/**
	 * Returns the meta object for the containment reference list '{@link contextmapper.Context#getSourceConnections <em>Source Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Connections</em>'.
	 * @see contextmapper.Context#getSourceConnections()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_SourceConnections();

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
	 * Returns the meta object for the attribute '{@link contextmapper.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see contextmapper.Classifier#getFeature()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Feature();

	/**
	 * Returns the meta object for the reference '{@link contextmapper.Classifier#getFeatureReference <em>Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Reference</em>'.
	 * @see contextmapper.Classifier#getFeatureReference()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_FeatureReference();

	/**
	 * Returns the meta object for class '{@link contextmapper.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see contextmapper.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link contextmapper.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see contextmapper.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the container reference '{@link contextmapper.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target</em>'.
	 * @see contextmapper.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

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
	 * Returns the meta object for class '{@link contextmapper.ExcludeConnection <em>Exclude Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Connection</em>'.
	 * @see contextmapper.ExcludeConnection
	 * @generated
	 */
	EClass getExcludeConnection();

	/**
	 * Returns the meta object for class '{@link contextmapper.AssociateConnection <em>Associate Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associate Connection</em>'.
	 * @see contextmapper.AssociateConnection
	 * @generated
	 */
	EClass getAssociateConnection();

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
	 * Returns the meta object for the containment reference list '{@link contextmapper.RuntimeConfig#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see contextmapper.RuntimeConfig#getIncludes()
	 * @see #getRuntimeConfig()
	 * @generated
	 */
	EReference getRuntimeConfig_Includes();

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
	 * Returns the meta object for class '{@link contextmapper.IncludeConnection <em>Include Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Connection</em>'.
	 * @see contextmapper.IncludeConnection
	 * @generated
	 */
	EClass getIncludeConnection();

	/**
	 * Returns the meta object for the container reference '{@link contextmapper.IncludeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
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
	 * Returns the meta object for the containment reference list '{@link contextmapper.ContextDiagram#getContainsContexts <em>Contains Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Contexts</em>'.
	 * @see contextmapper.ContextDiagram#getContainsContexts()
	 * @see #getContextDiagram()
	 * @generated
	 */
	EReference getContextDiagram_ContainsContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link contextmapper.ContextDiagram#getContainsRuntimeConfigs <em>Contains Runtime Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Runtime Configs</em>'.
	 * @see contextmapper.ContextDiagram#getContainsRuntimeConfigs()
	 * @see #getContextDiagram()
	 * @generated
	 */
	EReference getContextDiagram_ContainsRuntimeConfigs();

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
		 * The meta object literal for the '<em><b>Classifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CLASSIFIES = eINSTANCE.getContext_Classifies();

		/**
		 * The meta object literal for the '<em><b>Target Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__TARGET_CONNECTIONS = eINSTANCE.getContext_TargetConnections();

		/**
		 * The meta object literal for the '<em><b>Included</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__INCLUDED = eINSTANCE.getContext_Included();

		/**
		 * The meta object literal for the '<em><b>Source Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__SOURCE_CONNECTIONS = eINSTANCE.getContext_SourceConnections();

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
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__FEATURE = eINSTANCE.getClassifier_Feature();

		/**
		 * The meta object literal for the '<em><b>Feature Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__FEATURE_REFERENCE = eINSTANCE.getClassifier_FeatureReference();

		/**
		 * The meta object literal for the '{@link contextmapper.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.ConnectionImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

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
		 * The meta object literal for the '{@link contextmapper.impl.ExcludeConnectionImpl <em>Exclude Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.ExcludeConnectionImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getExcludeConnection()
		 * @generated
		 */
		EClass EXCLUDE_CONNECTION = eINSTANCE.getExcludeConnection();

		/**
		 * The meta object literal for the '{@link contextmapper.impl.AssociateConnectionImpl <em>Associate Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextmapper.impl.AssociateConnectionImpl
		 * @see contextmapper.impl.ContextmapperPackageImpl#getAssociateConnection()
		 * @generated
		 */
		EClass ASSOCIATE_CONNECTION = eINSTANCE.getAssociateConnection();

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
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_CONFIG__INCLUDES = eINSTANCE.getRuntimeConfig_Includes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_CONFIG__NAME = eINSTANCE.getRuntimeConfig_Name();

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
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
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
		 * The meta object literal for the '<em><b>Contains Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DIAGRAM__CONTAINS_CONTEXTS = eINSTANCE.getContextDiagram_ContainsContexts();

		/**
		 * The meta object literal for the '<em><b>Contains Runtime Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DIAGRAM__CONTAINS_RUNTIME_CONFIGS = eINSTANCE.getContextDiagram_ContainsRuntimeConfigs();

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
