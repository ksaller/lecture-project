/**
 */
package org.west.es.context.contextModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.feature.multi.perspective.mapping.viewmapping.ViewmappingPackage;

import org.featuremapper.models.feature.FeaturePackage;

import org.west.es.context.contextModel.Classification;
import org.west.es.context.contextModel.ClassifiedFeature;
import org.west.es.context.contextModel.ContextElement;
import org.west.es.context.contextModel.ContextInstance;
import org.west.es.context.contextModel.ContextModelFactory;
import org.west.es.context.contextModel.ContextModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextModelPackageImpl extends EPackageImpl implements ContextModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifiedFeatureEClass = null;

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
	 * @see org.west.es.context.contextModel.ContextModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContextModelPackageImpl() {
		super(eNS_URI, ContextModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContextModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContextModelPackage init() {
		if (isInited) return (ContextModelPackage)EPackage.Registry.INSTANCE.getEPackage(ContextModelPackage.eNS_URI);

		// Obtain or create and register package
		ContextModelPackageImpl theContextModelPackage = (ContextModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContextModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContextModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ViewmappingPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theContextModelPackage.createPackageContents();

		// Initialize created meta-data
		theContextModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContextModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContextModelPackage.eNS_URI, theContextModelPackage);
		return theContextModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Name() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Author() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Version() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_CreationDate() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_ContextElements() {
		return (EReference)containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_ContextInstances() {
		return (EReference)containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_AssociatedMappingModel() {
		return (EReference)containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextElement() {
		return contextElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextElement_Name() {
		return (EAttribute)contextElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextElement_AssociatedMapping() {
		return (EReference)contextElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextElement_PriorizeLinks() {
		return (EReference)contextElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextElement_ExtendsLink() {
		return (EReference)contextElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextElement_ExcludeLinks() {
		return (EReference)contextElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextElement_ClassifiedFeatures() {
		return (EReference)contextElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextInstance() {
		return contextInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextInstance_Name() {
		return (EAttribute)contextInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextInstance_IncludeLinks() {
		return (EReference)contextInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifiedFeature() {
		return classifiedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifiedFeature_Name() {
		return (EAttribute)classifiedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifiedFeature_Feature() {
		return (EReference)classifiedFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifiedFeature_Classification() {
		return (EAttribute)classifiedFeatureEClass.getEStructuralFeatures().get(2);
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
	public ContextModelFactory getContextModelFactory() {
		return (ContextModelFactory)getEFactoryInstance();
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
		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__NAME);
		createEAttribute(containerEClass, CONTAINER__AUTHOR);
		createEAttribute(containerEClass, CONTAINER__VERSION);
		createEAttribute(containerEClass, CONTAINER__CREATION_DATE);
		createEReference(containerEClass, CONTAINER__CONTEXT_ELEMENTS);
		createEReference(containerEClass, CONTAINER__CONTEXT_INSTANCES);
		createEReference(containerEClass, CONTAINER__ASSOCIATED_MAPPING_MODEL);

		contextElementEClass = createEClass(CONTEXT_ELEMENT);
		createEAttribute(contextElementEClass, CONTEXT_ELEMENT__NAME);
		createEReference(contextElementEClass, CONTEXT_ELEMENT__ASSOCIATED_MAPPING);
		createEReference(contextElementEClass, CONTEXT_ELEMENT__PRIORIZE_LINKS);
		createEReference(contextElementEClass, CONTEXT_ELEMENT__EXTENDS_LINK);
		createEReference(contextElementEClass, CONTEXT_ELEMENT__EXCLUDE_LINKS);
		createEReference(contextElementEClass, CONTEXT_ELEMENT__CLASSIFIED_FEATURES);

		contextInstanceEClass = createEClass(CONTEXT_INSTANCE);
		createEAttribute(contextInstanceEClass, CONTEXT_INSTANCE__NAME);
		createEReference(contextInstanceEClass, CONTEXT_INSTANCE__INCLUDE_LINKS);

		classifiedFeatureEClass = createEClass(CLASSIFIED_FEATURE);
		createEAttribute(classifiedFeatureEClass, CLASSIFIED_FEATURE__NAME);
		createEReference(classifiedFeatureEClass, CLASSIFIED_FEATURE__FEATURE);
		createEAttribute(classifiedFeatureEClass, CLASSIFIED_FEATURE__CLASSIFICATION);

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
		ViewmappingPackage theViewmappingPackage = (ViewmappingPackage)EPackage.Registry.INSTANCE.getEPackage(ViewmappingPackage.eNS_URI);
		FeaturePackage theFeaturePackage = (FeaturePackage)EPackage.Registry.INSTANCE.getEPackage(FeaturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(containerEClass, org.west.es.context.contextModel.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1, org.west.es.context.contextModel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Author(), ecorePackage.getEString(), "author", null, 0, 1, org.west.es.context.contextModel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Version(), ecorePackage.getEString(), "version", null, 0, 1, org.west.es.context.contextModel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, org.west.es.context.contextModel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_ContextElements(), this.getContextElement(), null, "contextElements", null, 0, -1, org.west.es.context.contextModel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_ContextInstances(), this.getContextInstance(), null, "contextInstances", null, 0, -1, org.west.es.context.contextModel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_AssociatedMappingModel(), theViewmappingPackage.getMappingModel(), null, "associatedMappingModel", null, 1, 1, org.west.es.context.contextModel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextElementEClass, ContextElement.class, "ContextElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextElement_AssociatedMapping(), theViewmappingPackage.getMapping(), null, "associatedMapping", null, 1, 1, ContextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextElement_PriorizeLinks(), this.getContextElement(), null, "priorizeLinks", null, 0, -1, ContextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextElement_ExtendsLink(), this.getContextElement(), null, "extendsLink", null, 0, 1, ContextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextElement_ExcludeLinks(), this.getContextElement(), null, "excludeLinks", null, 0, -1, ContextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextElement_ClassifiedFeatures(), this.getClassifiedFeature(), null, "classifiedFeatures", null, 0, -1, ContextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextInstanceEClass, ContextInstance.class, "ContextInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextInstance_IncludeLinks(), this.getContextElement(), null, "includeLinks", null, 0, -1, ContextInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifiedFeatureEClass, ClassifiedFeature.class, "ClassifiedFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifiedFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassifiedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifiedFeature_Feature(), theFeaturePackage.getFeature(), null, "feature", null, 1, 1, ClassifiedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifiedFeature_Classification(), this.getClassification(), "classification", null, 1, 1, ClassifiedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classificationEEnum, Classification.class, "Classification");
		addEEnumLiteral(classificationEEnum, Classification.UNBOUND);
		addEEnumLiteral(classificationEEnum, Classification.ALIVE);
		addEEnumLiteral(classificationEEnum, Classification.DEAD);

		// Create resource
		createResource(eNS_URI);
	}

} //ContextModelPackageImpl
