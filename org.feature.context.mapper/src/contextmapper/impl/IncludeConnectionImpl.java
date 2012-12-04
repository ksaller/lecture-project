/**
 */
package contextmapper.impl;

import contextmapper.Context;
import contextmapper.ContextmapperPackage;
import contextmapper.IncludeConnection;
import contextmapper.RuntimeConfig;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link contextmapper.impl.IncludeConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link contextmapper.impl.IncludeConnectionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeConnectionImpl extends CDOObjectImpl implements IncludeConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextmapperPackage.Literals.INCLUDE_CONNECTION;
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
	public RuntimeConfig getSource() {
		return (RuntimeConfig)eGet(ContextmapperPackage.Literals.INCLUDE_CONNECTION__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(RuntimeConfig newSource) {
		eSet(ContextmapperPackage.Literals.INCLUDE_CONNECTION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getTarget() {
		return (Context)eGet(ContextmapperPackage.Literals.INCLUDE_CONNECTION__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Context newTarget) {
		eSet(ContextmapperPackage.Literals.INCLUDE_CONNECTION__TARGET, newTarget);
	}

} //IncludeConnectionImpl
