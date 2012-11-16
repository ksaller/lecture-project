/**
 */
package viewmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see viewmodel.ViewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ViewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "viewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.feature.multi.perspective.model/schema/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "viewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewmodelPackage eINSTANCE = viewmodel.impl.ViewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link viewmodel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viewmodel.impl.ElementImpl
	 * @see viewmodel.impl.ViewmodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link viewmodel.impl.AbstractGroupImpl <em>Abstract Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viewmodel.impl.AbstractGroupImpl
	 * @see viewmodel.impl.ViewmodelPackageImpl#getAbstractGroup()
	 * @generated
	 */
	int ABSTRACT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GROUP__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>View Point Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GROUP__VIEW_POINT_REFERENCE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GROUP__GROUPS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GROUP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link viewmodel.impl.CoreGroupImpl <em>Core Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viewmodel.impl.CoreGroupImpl
	 * @see viewmodel.impl.ViewmodelPackageImpl#getCoreGroup()
	 * @generated
	 */
	int CORE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GROUP__NAME = ABSTRACT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>View Point Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GROUP__VIEW_POINT_REFERENCE = ABSTRACT_GROUP__VIEW_POINT_REFERENCE;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GROUP__GROUPS = ABSTRACT_GROUP__GROUPS;

	/**
	 * The number of structural features of the '<em>Core Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GROUP_FEATURE_COUNT = ABSTRACT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link viewmodel.impl.ViewPointImpl <em>View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viewmodel.impl.ViewPointImpl
	 * @see viewmodel.impl.ViewmodelPackageImpl#getViewPoint()
	 * @generated
	 */
	int VIEW_POINT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_POINT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contained In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_POINT__CONTAINED_IN_GROUP = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_POINT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link viewmodel.impl.GroupModelImpl <em>Group Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viewmodel.impl.GroupModelImpl
	 * @see viewmodel.impl.ViewmodelPackageImpl#getGroupModel()
	 * @generated
	 */
	int GROUP_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Core Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MODEL__CORE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>View Point Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MODEL__VIEW_POINT_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Group Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link viewmodel.impl.ViewPointContainerImpl <em>View Point Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viewmodel.impl.ViewPointContainerImpl
	 * @see viewmodel.impl.ViewmodelPackageImpl#getViewPointContainer()
	 * @generated
	 */
	int VIEW_POINT_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>View Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_POINT_CONTAINER__VIEW_POINTS = 0;

	/**
	 * The number of structural features of the '<em>View Point Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_POINT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link viewmodel.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viewmodel.impl.GroupImpl
	 * @see viewmodel.impl.ViewmodelPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ABSTRACT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>View Point Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VIEW_POINT_REFERENCE = ABSTRACT_GROUP__VIEW_POINT_REFERENCE;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPS = ABSTRACT_GROUP__GROUPS;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARENT_GROUP = ABSTRACT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ABSTRACT_GROUP_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link viewmodel.CoreGroup <em>Core Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Group</em>'.
	 * @see viewmodel.CoreGroup
	 * @generated
	 */
	EClass getCoreGroup();

	/**
	 * Returns the meta object for class '{@link viewmodel.AbstractGroup <em>Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Group</em>'.
	 * @see viewmodel.AbstractGroup
	 * @generated
	 */
	EClass getAbstractGroup();

	/**
	 * Returns the meta object for the reference list '{@link viewmodel.AbstractGroup#getViewPointReference <em>View Point Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>View Point Reference</em>'.
	 * @see viewmodel.AbstractGroup#getViewPointReference()
	 * @see #getAbstractGroup()
	 * @generated
	 */
	EReference getAbstractGroup_ViewPointReference();

	/**
	 * Returns the meta object for the containment reference list '{@link viewmodel.AbstractGroup#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see viewmodel.AbstractGroup#getGroups()
	 * @see #getAbstractGroup()
	 * @generated
	 */
	EReference getAbstractGroup_Groups();

	/**
	 * Returns the meta object for class '{@link viewmodel.ViewPoint <em>View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Point</em>'.
	 * @see viewmodel.ViewPoint
	 * @generated
	 */
	EClass getViewPoint();

	/**
	 * Returns the meta object for the reference list '{@link viewmodel.ViewPoint#getContainedInGroup <em>Contained In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained In Group</em>'.
	 * @see viewmodel.ViewPoint#getContainedInGroup()
	 * @see #getViewPoint()
	 * @generated
	 */
	EReference getViewPoint_ContainedInGroup();

	/**
	 * Returns the meta object for class '{@link viewmodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see viewmodel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link viewmodel.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see viewmodel.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link viewmodel.GroupModel <em>Group Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Model</em>'.
	 * @see viewmodel.GroupModel
	 * @generated
	 */
	EClass getGroupModel();

	/**
	 * Returns the meta object for the containment reference '{@link viewmodel.GroupModel#getCoreGroup <em>Core Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Core Group</em>'.
	 * @see viewmodel.GroupModel#getCoreGroup()
	 * @see #getGroupModel()
	 * @generated
	 */
	EReference getGroupModel_CoreGroup();

	/**
	 * Returns the meta object for the containment reference '{@link viewmodel.GroupModel#getViewPointContainer <em>View Point Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Point Container</em>'.
	 * @see viewmodel.GroupModel#getViewPointContainer()
	 * @see #getGroupModel()
	 * @generated
	 */
	EReference getGroupModel_ViewPointContainer();

	/**
	 * Returns the meta object for class '{@link viewmodel.ViewPointContainer <em>View Point Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Point Container</em>'.
	 * @see viewmodel.ViewPointContainer
	 * @generated
	 */
	EClass getViewPointContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link viewmodel.ViewPointContainer#getViewPoints <em>View Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Points</em>'.
	 * @see viewmodel.ViewPointContainer#getViewPoints()
	 * @see #getViewPointContainer()
	 * @generated
	 */
	EReference getViewPointContainer_ViewPoints();

	/**
	 * Returns the meta object for class '{@link viewmodel.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see viewmodel.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the container reference '{@link viewmodel.Group#getParentGroup <em>Parent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Group</em>'.
	 * @see viewmodel.Group#getParentGroup()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_ParentGroup();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewmodelFactory getViewmodelFactory();

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
		 * The meta object literal for the '{@link viewmodel.impl.CoreGroupImpl <em>Core Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viewmodel.impl.CoreGroupImpl
		 * @see viewmodel.impl.ViewmodelPackageImpl#getCoreGroup()
		 * @generated
		 */
		EClass CORE_GROUP = eINSTANCE.getCoreGroup();

		/**
		 * The meta object literal for the '{@link viewmodel.impl.AbstractGroupImpl <em>Abstract Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viewmodel.impl.AbstractGroupImpl
		 * @see viewmodel.impl.ViewmodelPackageImpl#getAbstractGroup()
		 * @generated
		 */
		EClass ABSTRACT_GROUP = eINSTANCE.getAbstractGroup();

		/**
		 * The meta object literal for the '<em><b>View Point Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_GROUP__VIEW_POINT_REFERENCE = eINSTANCE.getAbstractGroup_ViewPointReference();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_GROUP__GROUPS = eINSTANCE.getAbstractGroup_Groups();

		/**
		 * The meta object literal for the '{@link viewmodel.impl.ViewPointImpl <em>View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viewmodel.impl.ViewPointImpl
		 * @see viewmodel.impl.ViewmodelPackageImpl#getViewPoint()
		 * @generated
		 */
		EClass VIEW_POINT = eINSTANCE.getViewPoint();

		/**
		 * The meta object literal for the '<em><b>Contained In Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_POINT__CONTAINED_IN_GROUP = eINSTANCE.getViewPoint_ContainedInGroup();

		/**
		 * The meta object literal for the '{@link viewmodel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viewmodel.impl.ElementImpl
		 * @see viewmodel.impl.ViewmodelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link viewmodel.impl.GroupModelImpl <em>Group Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viewmodel.impl.GroupModelImpl
		 * @see viewmodel.impl.ViewmodelPackageImpl#getGroupModel()
		 * @generated
		 */
		EClass GROUP_MODEL = eINSTANCE.getGroupModel();

		/**
		 * The meta object literal for the '<em><b>Core Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_MODEL__CORE_GROUP = eINSTANCE.getGroupModel_CoreGroup();

		/**
		 * The meta object literal for the '<em><b>View Point Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_MODEL__VIEW_POINT_CONTAINER = eINSTANCE.getGroupModel_ViewPointContainer();

		/**
		 * The meta object literal for the '{@link viewmodel.impl.ViewPointContainerImpl <em>View Point Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viewmodel.impl.ViewPointContainerImpl
		 * @see viewmodel.impl.ViewmodelPackageImpl#getViewPointContainer()
		 * @generated
		 */
		EClass VIEW_POINT_CONTAINER = eINSTANCE.getViewPointContainer();

		/**
		 * The meta object literal for the '<em><b>View Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_POINT_CONTAINER__VIEW_POINTS = eINSTANCE.getViewPointContainer_ViewPoints();

		/**
		 * The meta object literal for the '{@link viewmodel.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viewmodel.impl.GroupImpl
		 * @see viewmodel.impl.ViewmodelPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Parent Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__PARENT_GROUP = eINSTANCE.getGroup_ParentGroup();

	}

} //ViewmodelPackage
