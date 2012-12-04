/**
 */
package contextmapper.impl;

import contextmapper.Context;
import contextmapper.ContextmapperPackage;
import contextmapper.ExcludeConnection;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclude Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link contextmapper.impl.ExcludeConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link contextmapper.impl.ExcludeConnectionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExcludeConnectionImpl extends CDOObjectImpl implements ExcludeConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcludeConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextmapperPackage.Literals.EXCLUDE_CONNECTION;
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
	public Context getSource() {
		return (Context)eGet(ContextmapperPackage.Literals.EXCLUDE_CONNECTION__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Context newSource) {
		eSet(ContextmapperPackage.Literals.EXCLUDE_CONNECTION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getTarget() {
		return (Context)eGet(ContextmapperPackage.Literals.EXCLUDE_CONNECTION__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Context newTarget) {
		eSet(ContextmapperPackage.Literals.EXCLUDE_CONNECTION__TARGET, newTarget);
	}

} //ExcludeConnectionImpl
