/**
 */
package org.west.es.context.contextModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.west.es.context.contextModel.ContextModelPackage
 * @generated
 */
public interface ContextModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextModelFactory eINSTANCE = org.west.es.context.contextModel.impl.ContextModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Context Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Element</em>'.
	 * @generated
	 */
	ContextElement createContextElement();

	/**
	 * Returns a new object of class '<em>Context Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Instance</em>'.
	 * @generated
	 */
	ContextInstance createContextInstance();

	/**
	 * Returns a new object of class '<em>Classified Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classified Feature</em>'.
	 * @generated
	 */
	ClassifiedFeature createClassifiedFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContextModelPackage getContextModelPackage();

} //ContextModelFactory
