/**
 */
package org.west.es.context.contextModel;

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
 * @see org.west.es.context.contextModel.ContextModelFactory
 * @model kind="package"
 * @generated
 */
public interface ContextModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contextModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.eclipse.org/context";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "context";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextModelPackage eINSTANCE = org.west.es.context.contextModel.impl.ContextModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.west.es.context.contextModel.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.west.es.context.contextModel.impl.ContainerImpl
	 * @see org.west.es.context.contextModel.impl.ContextModelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CREATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Context Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTEXT_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Context Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTEXT_INSTANCES = 5;

	/**
	 * The feature id for the '<em><b>Associated Mapping Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ASSOCIATED_MAPPING_MODEL = 6;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.west.es.context.contextModel.impl.ContextElementImpl <em>Context Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.west.es.context.contextModel.impl.ContextElementImpl
	 * @see org.west.es.context.contextModel.impl.ContextModelPackageImpl#getContextElement()
	 * @generated
	 */
	int CONTEXT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Associated Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__ASSOCIATED_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Priorize Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__PRIORIZE_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Extends Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__EXTENDS_LINK = 3;

	/**
	 * The feature id for the '<em><b>Exclude Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__EXCLUDE_LINKS = 4;

	/**
	 * The feature id for the '<em><b>Classified Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__CLASSIFIED_FEATURES = 5;

	/**
	 * The number of structural features of the '<em>Context Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.west.es.context.contextModel.impl.ContextInstanceImpl <em>Context Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.west.es.context.contextModel.impl.ContextInstanceImpl
	 * @see org.west.es.context.contextModel.impl.ContextModelPackageImpl#getContextInstance()
	 * @generated
	 */
	int CONTEXT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Include Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INSTANCE__INCLUDE_LINKS = 1;

	/**
	 * The number of structural features of the '<em>Context Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.west.es.context.contextModel.impl.ClassifiedFeatureImpl <em>Classified Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.west.es.context.contextModel.impl.ClassifiedFeatureImpl
	 * @see org.west.es.context.contextModel.impl.ContextModelPackageImpl#getClassifiedFeature()
	 * @generated
	 */
	int CLASSIFIED_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIED_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIED_FEATURE__FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIED_FEATURE__CLASSIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Classified Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIED_FEATURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.west.es.context.contextModel.Classification <em>Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.west.es.context.contextModel.Classification
	 * @see org.west.es.context.contextModel.impl.ContextModelPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 4;


	/**
	 * Returns the meta object for class '{@link org.west.es.context.contextModel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.west.es.context.contextModel.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.west.es.context.contextModel.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.west.es.context.contextModel.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.west.es.context.contextModel.Container#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.west.es.context.contextModel.Container#getAuthor()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.west.es.context.contextModel.Container#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.west.es.context.contextModel.Container#getVersion()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.west.es.context.contextModel.Container#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.west.es.context.contextModel.Container#getCreationDate()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_CreationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.west.es.context.contextModel.Container#getContextElements <em>Context Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Elements</em>'.
	 * @see org.west.es.context.contextModel.Container#getContextElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ContextElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.west.es.context.contextModel.Container#getContextInstances <em>Context Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Instances</em>'.
	 * @see org.west.es.context.contextModel.Container#getContextInstances()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ContextInstances();

	/**
	 * Returns the meta object for the reference '{@link org.west.es.context.contextModel.Container#getAssociatedMappingModel <em>Associated Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Mapping Model</em>'.
	 * @see org.west.es.context.contextModel.Container#getAssociatedMappingModel()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_AssociatedMappingModel();

	/**
	 * Returns the meta object for class '{@link org.west.es.context.contextModel.ContextElement <em>Context Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Element</em>'.
	 * @see org.west.es.context.contextModel.ContextElement
	 * @generated
	 */
	EClass getContextElement();

	/**
	 * Returns the meta object for the attribute '{@link org.west.es.context.contextModel.ContextElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.west.es.context.contextModel.ContextElement#getName()
	 * @see #getContextElement()
	 * @generated
	 */
	EAttribute getContextElement_Name();

	/**
	 * Returns the meta object for the reference '{@link org.west.es.context.contextModel.ContextElement#getAssociatedMapping <em>Associated Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Mapping</em>'.
	 * @see org.west.es.context.contextModel.ContextElement#getAssociatedMapping()
	 * @see #getContextElement()
	 * @generated
	 */
	EReference getContextElement_AssociatedMapping();

	/**
	 * Returns the meta object for the reference list '{@link org.west.es.context.contextModel.ContextElement#getPriorizeLinks <em>Priorize Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Priorize Links</em>'.
	 * @see org.west.es.context.contextModel.ContextElement#getPriorizeLinks()
	 * @see #getContextElement()
	 * @generated
	 */
	EReference getContextElement_PriorizeLinks();

	/**
	 * Returns the meta object for the reference '{@link org.west.es.context.contextModel.ContextElement#getExtendsLink <em>Extends Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends Link</em>'.
	 * @see org.west.es.context.contextModel.ContextElement#getExtendsLink()
	 * @see #getContextElement()
	 * @generated
	 */
	EReference getContextElement_ExtendsLink();

	/**
	 * Returns the meta object for the reference list '{@link org.west.es.context.contextModel.ContextElement#getExcludeLinks <em>Exclude Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclude Links</em>'.
	 * @see org.west.es.context.contextModel.ContextElement#getExcludeLinks()
	 * @see #getContextElement()
	 * @generated
	 */
	EReference getContextElement_ExcludeLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.west.es.context.contextModel.ContextElement#getClassifiedFeatures <em>Classified Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classified Features</em>'.
	 * @see org.west.es.context.contextModel.ContextElement#getClassifiedFeatures()
	 * @see #getContextElement()
	 * @generated
	 */
	EReference getContextElement_ClassifiedFeatures();

	/**
	 * Returns the meta object for class '{@link org.west.es.context.contextModel.ContextInstance <em>Context Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Instance</em>'.
	 * @see org.west.es.context.contextModel.ContextInstance
	 * @generated
	 */
	EClass getContextInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.west.es.context.contextModel.ContextInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.west.es.context.contextModel.ContextInstance#getName()
	 * @see #getContextInstance()
	 * @generated
	 */
	EAttribute getContextInstance_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.west.es.context.contextModel.ContextInstance#getIncludeLinks <em>Include Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Include Links</em>'.
	 * @see org.west.es.context.contextModel.ContextInstance#getIncludeLinks()
	 * @see #getContextInstance()
	 * @generated
	 */
	EReference getContextInstance_IncludeLinks();

	/**
	 * Returns the meta object for class '{@link org.west.es.context.contextModel.ClassifiedFeature <em>Classified Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classified Feature</em>'.
	 * @see org.west.es.context.contextModel.ClassifiedFeature
	 * @generated
	 */
	EClass getClassifiedFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.west.es.context.contextModel.ClassifiedFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.west.es.context.contextModel.ClassifiedFeature#getName()
	 * @see #getClassifiedFeature()
	 * @generated
	 */
	EAttribute getClassifiedFeature_Name();

	/**
	 * Returns the meta object for the reference '{@link org.west.es.context.contextModel.ClassifiedFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.west.es.context.contextModel.ClassifiedFeature#getFeature()
	 * @see #getClassifiedFeature()
	 * @generated
	 */
	EReference getClassifiedFeature_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.west.es.context.contextModel.ClassifiedFeature#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see org.west.es.context.contextModel.ClassifiedFeature#getClassification()
	 * @see #getClassifiedFeature()
	 * @generated
	 */
	EAttribute getClassifiedFeature_Classification();

	/**
	 * Returns the meta object for enum '{@link org.west.es.context.contextModel.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classification</em>'.
	 * @see org.west.es.context.contextModel.Classification
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
	ContextModelFactory getContextModelFactory();

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
		 * The meta object literal for the '{@link org.west.es.context.contextModel.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.west.es.context.contextModel.impl.ContainerImpl
		 * @see org.west.es.context.contextModel.impl.ContextModelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__AUTHOR = eINSTANCE.getContainer_Author();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__VERSION = eINSTANCE.getContainer_Version();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CREATION_DATE = eINSTANCE.getContainer_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Context Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTEXT_ELEMENTS = eINSTANCE.getContainer_ContextElements();

		/**
		 * The meta object literal for the '<em><b>Context Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTEXT_INSTANCES = eINSTANCE.getContainer_ContextInstances();

		/**
		 * The meta object literal for the '<em><b>Associated Mapping Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ASSOCIATED_MAPPING_MODEL = eINSTANCE.getContainer_AssociatedMappingModel();

		/**
		 * The meta object literal for the '{@link org.west.es.context.contextModel.impl.ContextElementImpl <em>Context Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.west.es.context.contextModel.impl.ContextElementImpl
		 * @see org.west.es.context.contextModel.impl.ContextModelPackageImpl#getContextElement()
		 * @generated
		 */
		EClass CONTEXT_ELEMENT = eINSTANCE.getContextElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ELEMENT__NAME = eINSTANCE.getContextElement_Name();

		/**
		 * The meta object literal for the '<em><b>Associated Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ELEMENT__ASSOCIATED_MAPPING = eINSTANCE.getContextElement_AssociatedMapping();

		/**
		 * The meta object literal for the '<em><b>Priorize Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ELEMENT__PRIORIZE_LINKS = eINSTANCE.getContextElement_PriorizeLinks();

		/**
		 * The meta object literal for the '<em><b>Extends Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ELEMENT__EXTENDS_LINK = eINSTANCE.getContextElement_ExtendsLink();

		/**
		 * The meta object literal for the '<em><b>Exclude Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ELEMENT__EXCLUDE_LINKS = eINSTANCE.getContextElement_ExcludeLinks();

		/**
		 * The meta object literal for the '<em><b>Classified Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ELEMENT__CLASSIFIED_FEATURES = eINSTANCE.getContextElement_ClassifiedFeatures();

		/**
		 * The meta object literal for the '{@link org.west.es.context.contextModel.impl.ContextInstanceImpl <em>Context Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.west.es.context.contextModel.impl.ContextInstanceImpl
		 * @see org.west.es.context.contextModel.impl.ContextModelPackageImpl#getContextInstance()
		 * @generated
		 */
		EClass CONTEXT_INSTANCE = eINSTANCE.getContextInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_INSTANCE__NAME = eINSTANCE.getContextInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Include Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_INSTANCE__INCLUDE_LINKS = eINSTANCE.getContextInstance_IncludeLinks();

		/**
		 * The meta object literal for the '{@link org.west.es.context.contextModel.impl.ClassifiedFeatureImpl <em>Classified Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.west.es.context.contextModel.impl.ClassifiedFeatureImpl
		 * @see org.west.es.context.contextModel.impl.ContextModelPackageImpl#getClassifiedFeature()
		 * @generated
		 */
		EClass CLASSIFIED_FEATURE = eINSTANCE.getClassifiedFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIED_FEATURE__NAME = eINSTANCE.getClassifiedFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIED_FEATURE__FEATURE = eINSTANCE.getClassifiedFeature_Feature();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIED_FEATURE__CLASSIFICATION = eINSTANCE.getClassifiedFeature_Classification();

		/**
		 * The meta object literal for the '{@link org.west.es.context.contextModel.Classification <em>Classification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.west.es.context.contextModel.Classification
		 * @see org.west.es.context.contextModel.impl.ContextModelPackageImpl#getClassification()
		 * @generated
		 */
		EEnum CLASSIFICATION = eINSTANCE.getClassification();

	}

} //ContextModelPackage
