/**
 */
package metamodel.impl;

import metamodel.AssociateConnection;
import metamodel.Classification;
import metamodel.Classifier;
import metamodel.Connection;
import metamodel.Context;
import metamodel.ContextDiagram;
import metamodel.ExcludeConnection;
import metamodel.IncludeConnection;
import metamodel.MetamodelFactory;
import metamodel.MetamodelPackage;
import metamodel.PriorConnection;
import metamodel.RuntimeConfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.feature.multi.perspective.mapping.viewmapping.ViewmappingPackage;

import org.featuremapper.models.feature.FeaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelPackageImpl extends EPackageImpl implements MetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associateConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classificationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see metamodel.MetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetamodelPackageImpl() {
		super(eNS_URI, MetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetamodelPackage init() {
		if (isInited) return (MetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(MetamodelPackage.eNS_URI);

		// Obtain or create and register package
		MetamodelPackageImpl theMetamodelPackage = (MetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetamodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ViewmappingPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetamodelPackage.eNS_URI, theMetamodelPackage);
		return theMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_Name() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Classifies() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_TargetConnections() {
		return (EReference)contextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Included() {
		return (EReference)contextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_SourceConnections() {
		return (EReference)contextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_Feature() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_FeatureReference() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Source() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Target() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorConnection() {
		return priorConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeConnection() {
		return excludeConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociateConnection() {
		return associateConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeConfig() {
		return runtimeConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeConfig_Includes() {
		return (EReference)runtimeConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeConnection() {
		return includeConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludeConnection_Source() {
		return (EReference)includeConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludeConnection_Target() {
		return (EReference)includeConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextDiagram() {
		return contextDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextDiagram_MappingReference() {
		return (EReference)contextDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextDiagram_ContainsContexts() {
		return (EReference)contextDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextDiagram_ContainsRuntimeConfigs() {
		return (EReference)contextDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassification() {
		return classificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactory getMetamodelFactory() {
		return (MetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contextEClass = createEClass(CONTEXT);
		createEAttribute(contextEClass, CONTEXT__NAME);
		createEReference(contextEClass, CONTEXT__CLASSIFIES);
		createEReference(contextEClass, CONTEXT__TARGET_CONNECTIONS);
		createEReference(contextEClass, CONTEXT__INCLUDED);
		createEReference(contextEClass, CONTEXT__SOURCE_CONNECTIONS);

		classifierEClass = createEClass(CLASSIFIER);
		createEAttribute(classifierEClass, CLASSIFIER__FEATURE);
		createEReference(classifierEClass, CLASSIFIER__FEATURE_REFERENCE);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__SOURCE);
		createEReference(connectionEClass, CONNECTION__TARGET);

		priorConnectionEClass = createEClass(PRIOR_CONNECTION);

		excludeConnectionEClass = createEClass(EXCLUDE_CONNECTION);

		associateConnectionEClass = createEClass(ASSOCIATE_CONNECTION);

		runtimeConfigEClass = createEClass(RUNTIME_CONFIG);
		createEReference(runtimeConfigEClass, RUNTIME_CONFIG__INCLUDES);

		includeConnectionEClass = createEClass(INCLUDE_CONNECTION);
		createEReference(includeConnectionEClass, INCLUDE_CONNECTION__SOURCE);
		createEReference(includeConnectionEClass, INCLUDE_CONNECTION__TARGET);

		contextDiagramEClass = createEClass(CONTEXT_DIAGRAM);
		createEReference(contextDiagramEClass, CONTEXT_DIAGRAM__MAPPING_REFERENCE);
		createEReference(contextDiagramEClass, CONTEXT_DIAGRAM__CONTAINS_CONTEXTS);
		createEReference(contextDiagramEClass, CONTEXT_DIAGRAM__CONTAINS_RUNTIME_CONFIGS);

		// Create enums
		classificationEEnum = createEEnum(CLASSIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FeaturePackage theFeaturePackage = (FeaturePackage)EPackage.Registry.INSTANCE.getEPackage(FeaturePackage.eNS_URI);
		ViewmappingPackage theViewmappingPackage = (ViewmappingPackage)EPackage.Registry.INSTANCE.getEPackage(ViewmappingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		priorConnectionEClass.getESuperTypes().add(this.getConnection());
		excludeConnectionEClass.getESuperTypes().add(this.getConnection());
		associateConnectionEClass.getESuperTypes().add(this.getConnection());

		// Initialize classes and features; add operations and parameters
		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContext_Name(), ecorePackage.getEString(), "name", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Classifies(), this.getClassifier(), null, "classifies", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_TargetConnections(), this.getConnection(), this.getConnection_Source(), "targetConnections", null, 0, -1, Context.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Included(), this.getIncludeConnection(), this.getIncludeConnection_Target(), "included", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_SourceConnections(), this.getConnection(), this.getConnection_Target(), "sourceConnections", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifier_Feature(), this.getClassification(), "feature", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifier_FeatureReference(), theFeaturePackage.getFeature(), null, "featureReference", null, 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Source(), this.getContext(), this.getContext_TargetConnections(), "source", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Target(), this.getContext(), this.getContext_SourceConnections(), "target", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priorConnectionEClass, PriorConnection.class, "PriorConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(excludeConnectionEClass, ExcludeConnection.class, "ExcludeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associateConnectionEClass, AssociateConnection.class, "AssociateConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeConfigEClass, RuntimeConfig.class, "RuntimeConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeConfig_Includes(), this.getIncludeConnection(), this.getIncludeConnection_Source(), "includes", null, 0, -1, RuntimeConfig.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(includeConnectionEClass, IncludeConnection.class, "IncludeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludeConnection_Source(), this.getRuntimeConfig(), this.getRuntimeConfig_Includes(), "source", null, 1, 1, IncludeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncludeConnection_Target(), this.getContext(), this.getContext_Included(), "target", null, 1, 1, IncludeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextDiagramEClass, ContextDiagram.class, "ContextDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextDiagram_MappingReference(), theViewmappingPackage.getMapping(), null, "mappingReference", null, 1, 1, ContextDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextDiagram_ContainsContexts(), this.getContext(), null, "containsContexts", null, 0, -1, ContextDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextDiagram_ContainsRuntimeConfigs(), this.getRuntimeConfig(), null, "containsRuntimeConfigs", null, 0, -1, ContextDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classificationEEnum, Classification.class, "Classification");
		addEEnumLiteral(classificationEEnum, Classification.DEAD);
		addEEnumLiteral(classificationEEnum, Classification.ALIVE);
		addEEnumLiteral(classificationEEnum, Classification.UNBOUND);

		// Create resource
		createResource(eNS_URI);
	}

} //MetamodelPackageImpl
