/**
 */
package contextmapper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see contextmapper.ContextmapperPackage
 * @generated
 */
public interface ContextmapperFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextmapperFactory eINSTANCE = contextmapper.impl.ContextmapperFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier</em>'.
	 * @generated
	 */
	Classifier createClassifier();

	/**
	 * Returns a new object of class '<em>Runtime Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Config</em>'.
	 * @generated
	 */
	RuntimeConfig createRuntimeConfig();

	/**
	 * Returns a new object of class '<em>Context Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Diagram</em>'.
	 * @generated
	 */
	ContextDiagram createContextDiagram();

	/**
	 * Returns a new object of class '<em>Exclude Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclude Connection</em>'.
	 * @generated
	 */
	ExcludeConnection createExcludeConnection();

	/**
	 * Returns a new object of class '<em>Include Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include Connection</em>'.
	 * @generated
	 */
	IncludeConnection createIncludeConnection();

	/**
	 * Returns a new object of class '<em>Prior Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prior Connection</em>'.
	 * @generated
	 */
	PriorConnection createPriorConnection();

	/**
	 * Returns a new object of class '<em>Extend Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extend Connection</em>'.
	 * @generated
	 */
	ExtendConnection createExtendConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContextmapperPackage getContextmapperPackage();

} //ContextmapperFactory
