/**
 */
package contextmapper.impl;

import contextmapper.ContextmapperPackage;
import contextmapper.IncludeConnection;
import contextmapper.RuntimeConfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link contextmapper.impl.RuntimeConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link contextmapper.impl.RuntimeConfigImpl#getInclude <em>Include</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeConfigImpl extends CDOObjectImpl implements RuntimeConfig {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextmapperPackage.Literals.RUNTIME_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ContextmapperPackage.Literals.RUNTIME_CONFIG__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ContextmapperPackage.Literals.RUNTIME_CONFIG__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IncludeConnection> getInclude() {
		return (EList<IncludeConnection>)eGet(ContextmapperPackage.Literals.RUNTIME_CONFIG__INCLUDE, true);
	}

} //RuntimeConfigImpl
