/**
 */
package viewmapping;

import feature.FeatureModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import viewmodel.GroupModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link viewmapping.MappingModel#getMappings <em>Mappings</em>}</li>
 *   <li>{@link viewmapping.MappingModel#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link viewmapping.MappingModel#getViewModel <em>View Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see viewmapping.ViewmappingPackage#getMappingModel()
 * @model
 * @generated
 */
public interface MappingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link viewmapping.Mapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see viewmapping.ViewmappingPackage#getMappingModel_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Feature Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Model</em>' reference.
	 * @see #setFeatureModel(FeatureModel)
	 * @see viewmapping.ViewmappingPackage#getMappingModel_FeatureModel()
	 * @model required="true"
	 * @generated
	 */
	FeatureModel getFeatureModel();

	/**
	 * Sets the value of the '{@link viewmapping.MappingModel#getFeatureModel <em>Feature Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Model</em>' reference.
	 * @see #getFeatureModel()
	 * @generated
	 */
	void setFeatureModel(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Model</em>' reference.
	 * @see #setViewModel(GroupModel)
	 * @see viewmapping.ViewmappingPackage#getMappingModel_ViewModel()
	 * @model required="true"
	 * @generated
	 */
	GroupModel getViewModel();

	/**
	 * Sets the value of the '{@link viewmapping.MappingModel#getViewModel <em>View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Model</em>' reference.
	 * @see #getViewModel()
	 * @generated
	 */
	void setViewModel(GroupModel value);

} // MappingModel
