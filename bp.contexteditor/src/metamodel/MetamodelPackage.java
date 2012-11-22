/**
 */
package metamodel;

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
 * @see metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bp/contexteditor/model/metamodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bp.contexteditor.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodel.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ContextImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getContext()
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
	 * The meta object id for the '{@link metamodel.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ClassifierImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getClassifier()
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
	 * The meta object id for the '{@link metamodel.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ConnectionImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getConnection()
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
	 * The meta object id for the '{@link metamodel.impl.PriorConnectionImpl <em>Prior Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.PriorConnectionImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getPriorConnection()
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
	 * The meta object id for the '{@link metamodel.impl.ExcludeConnectionImpl <em>Exclude Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ExcludeConnectionImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getExcludeConnection()
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
	 * The meta object id for the '{@link metamodel.impl.AssociateConnectionImpl <em>Associate Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.AssociateConnectionImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getAssociateConnection()
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
	 * The meta object id for the '{@link metamodel.impl.RuntimeConfigImpl <em>Runtime Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.RuntimeConfigImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getRuntimeConfig()
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
	 * The number of structural features of the '<em>Runtime Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link metamodel.impl.IncludeConnectionImpl <em>Include Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.IncludeConnectionImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getIncludeConnection()
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
	 * The meta object id for the '{@link metamodel.impl.ContextDiagramImpl <em>Context Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ContextDiagramImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getContextDiagram()
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
	 * The meta object id for the '{@link metamodel.Classification <em>Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.Classification
	 * @see metamodel.impl.MetamodelPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 9;


	/**
	 * Returns the meta object for class '{@link metamodel.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see metamodel.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for the reference list '{@link metamodel.Context#getClassifies <em>Classifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classifies</em>'.
	 * @see metamodel.Context#getClassifies()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Classifies();

	/**
	 * Returns the meta object for the reference list '{@link metamodel.Context#getTargetConnections <em>Target Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Connections</em>'.
	 * @see metamodel.Context#getTargetConnections()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_TargetConnections();

	/**
	 * Returns the meta object for the reference list '{@link metamodel.Context#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included</em>'.
	 * @see metamodel.Context#getIncluded()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Included();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.Context#getSourceConnections <em>Source Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Connections</em>'.
	 * @see metamodel.Context#getSourceConnections()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_SourceConnections();

	/**
	 * Returns the meta object for class '{@link metamodel.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see metamodel.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see metamodel.Classifier#getFeature()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Feature();

	/**
	 * Returns the meta object for the reference '{@link metamodel.Classifier#getFeatureReference <em>Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Reference</em>'.
	 * @see metamodel.Classifier#getFeatureReference()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_FeatureReference();

	/**
	 * Returns the meta object for class '{@link metamodel.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see metamodel.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link metamodel.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see metamodel.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the container reference '{@link metamodel.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target</em>'.
	 * @see metamodel.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for class '{@link metamodel.PriorConnection <em>Prior Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prior Connection</em>'.
	 * @see metamodel.PriorConnection
	 * @generated
	 */
	EClass getPriorConnection();

	/**
	 * Returns the meta object for class '{@link metamodel.ExcludeConnection <em>Exclude Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Connection</em>'.
	 * @see metamodel.ExcludeConnection
	 * @generated
	 */
	EClass getExcludeConnection();

	/**
	 * Returns the meta object for class '{@link metamodel.AssociateConnection <em>Associate Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associate Connection</em>'.
	 * @see metamodel.AssociateConnection
	 * @generated
	 */
	EClass getAssociateConnection();

	/**
	 * Returns the meta object for class '{@link metamodel.RuntimeConfig <em>Runtime Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Config</em>'.
	 * @see metamodel.RuntimeConfig
	 * @generated
	 */
	EClass getRuntimeConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.RuntimeConfig#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see metamodel.RuntimeConfig#getIncludes()
	 * @see #getRuntimeConfig()
	 * @generated
	 */
	EReference getRuntimeConfig_Includes();

	/**
	 * Returns the meta object for class '{@link metamodel.IncludeConnection <em>Include Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Connection</em>'.
	 * @see metamodel.IncludeConnection
	 * @generated
	 */
	EClass getIncludeConnection();

	/**
	 * Returns the meta object for the container reference '{@link metamodel.IncludeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see metamodel.IncludeConnection#getSource()
	 * @see #getIncludeConnection()
	 * @generated
	 */
	EReference getIncludeConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link metamodel.IncludeConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see metamodel.IncludeConnection#getTarget()
	 * @see #getIncludeConnection()
	 * @generated
	 */
	EReference getIncludeConnection_Target();

	/**
	 * Returns the meta object for class '{@link metamodel.ContextDiagram <em>Context Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Diagram</em>'.
	 * @see metamodel.ContextDiagram
	 * @generated
	 */
	EClass getContextDiagram();

	/**
	 * Returns the meta object for the reference '{@link metamodel.ContextDiagram#getMappingReference <em>Mapping Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping Reference</em>'.
	 * @see metamodel.ContextDiagram#getMappingReference()
	 * @see #getContextDiagram()
	 * @generated
	 */
	EReference getContextDiagram_MappingReference();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.ContextDiagram#getContainsContexts <em>Contains Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Contexts</em>'.
	 * @see metamodel.ContextDiagram#getContainsContexts()
	 * @see #getContextDiagram()
	 * @generated
	 */
	EReference getContextDiagram_ContainsContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.ContextDiagram#getContainsRuntimeConfigs <em>Contains Runtime Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Runtime Configs</em>'.
	 * @see metamodel.ContextDiagram#getContainsRuntimeConfigs()
	 * @see #getContextDiagram()
	 * @generated
	 */
	EReference getContextDiagram_ContainsRuntimeConfigs();

	/**
	 * Returns the meta object for enum '{@link metamodel.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classification</em>'.
	 * @see metamodel.Classification
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
	MetamodelFactory getMetamodelFactory();

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
		 * The meta object literal for the '{@link metamodel.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ContextImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getContext()
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
		 * The meta object literal for the '{@link metamodel.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ClassifierImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getClassifier()
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
		 * The meta object literal for the '{@link metamodel.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ConnectionImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getConnection()
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
		 * The meta object literal for the '{@link metamodel.impl.PriorConnectionImpl <em>Prior Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.PriorConnectionImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getPriorConnection()
		 * @generated
		 */
		EClass PRIOR_CONNECTION = eINSTANCE.getPriorConnection();

		/**
		 * The meta object literal for the '{@link metamodel.impl.ExcludeConnectionImpl <em>Exclude Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ExcludeConnectionImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getExcludeConnection()
		 * @generated
		 */
		EClass EXCLUDE_CONNECTION = eINSTANCE.getExcludeConnection();

		/**
		 * The meta object literal for the '{@link metamodel.impl.AssociateConnectionImpl <em>Associate Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.AssociateConnectionImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getAssociateConnection()
		 * @generated
		 */
		EClass ASSOCIATE_CONNECTION = eINSTANCE.getAssociateConnection();

		/**
		 * The meta object literal for the '{@link metamodel.impl.RuntimeConfigImpl <em>Runtime Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.RuntimeConfigImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getRuntimeConfig()
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
		 * The meta object literal for the '{@link metamodel.impl.IncludeConnectionImpl <em>Include Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.IncludeConnectionImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getIncludeConnection()
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
		 * The meta object literal for the '{@link metamodel.impl.ContextDiagramImpl <em>Context Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ContextDiagramImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getContextDiagram()
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
		 * The meta object literal for the '{@link metamodel.Classification <em>Classification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.Classification
		 * @see metamodel.impl.MetamodelPackageImpl#getClassification()
		 * @generated
		 */
		EEnum CLASSIFICATION = eINSTANCE.getClassification();

	}

} //MetamodelPackage
