/**
 */
package contextmapper.impl;

import contextmapper.Context;
import contextmapper.ContextmapperPackage;
import contextmapper.PriorConnection;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prior Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link contextmapper.impl.PriorConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link contextmapper.impl.PriorConnectionImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriorConnectionImpl extends CDOObjectImpl implements PriorConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextmapperPackage.Literals.PRIOR_CONNECTION;
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
	public Context getTarget() {
		return (Context)eGet(ContextmapperPackage.Literals.PRIOR_CONNECTION__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Context newTarget) {
		eSet(ContextmapperPackage.Literals.PRIOR_CONNECTION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getSource() {
		return (Context)eGet(ContextmapperPackage.Literals.PRIOR_CONNECTION__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Context newSource) {
		eSet(ContextmapperPackage.Literals.PRIOR_CONNECTION__SOURCE, newSource);
	}

} //PriorConnectionImpl
