/**
 */
package feature.impl;

import feature.FeaturePackage;
import feature.FeatureTreeNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link feature.impl.FeatureTreeNodeImpl#getMinCardinality <em>Min Cardinality</em>}</li>
 *   <li>{@link feature.impl.FeatureTreeNodeImpl#getMaxCardinality <em>Max Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureTreeNodeImpl extends EObjectImpl implements FeatureTreeNode {
	/**
	 * The default value of the '{@link #getMinCardinality() <em>Min Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinCardinality() <em>Min Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCardinality()
	 * @generated
	 * @ordered
	 */
	protected int minCardinality = MIN_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCardinality() <em>Max Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCardinality() <em>Max Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCardinality()
	 * @generated
	 * @ordered
	 */
	protected int maxCardinality = MAX_CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureTreeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.FEATURE_TREE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinCardinality() {
		return minCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCardinality(int newMinCardinality) {
		int oldMinCardinality = minCardinality;
		minCardinality = newMinCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.FEATURE_TREE_NODE__MIN_CARDINALITY, oldMinCardinality, minCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxCardinality() {
		return maxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCardinality(int newMaxCardinality) {
		int oldMaxCardinality = maxCardinality;
		maxCardinality = newMaxCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.FEATURE_TREE_NODE__MAX_CARDINALITY, oldMaxCardinality, maxCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturePackage.FEATURE_TREE_NODE__MIN_CARDINALITY:
				return getMinCardinality();
			case FeaturePackage.FEATURE_TREE_NODE__MAX_CARDINALITY:
				return getMaxCardinality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeaturePackage.FEATURE_TREE_NODE__MIN_CARDINALITY:
				setMinCardinality((Integer)newValue);
				return;
			case FeaturePackage.FEATURE_TREE_NODE__MAX_CARDINALITY:
				setMaxCardinality((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeaturePackage.FEATURE_TREE_NODE__MIN_CARDINALITY:
				setMinCardinality(MIN_CARDINALITY_EDEFAULT);
				return;
			case FeaturePackage.FEATURE_TREE_NODE__MAX_CARDINALITY:
				setMaxCardinality(MAX_CARDINALITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeaturePackage.FEATURE_TREE_NODE__MIN_CARDINALITY:
				return minCardinality != MIN_CARDINALITY_EDEFAULT;
			case FeaturePackage.FEATURE_TREE_NODE__MAX_CARDINALITY:
				return maxCardinality != MAX_CARDINALITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minCardinality: ");
		result.append(minCardinality);
		result.append(", maxCardinality: ");
		result.append(maxCardinality);
		result.append(')');
		return result.toString();
	}

} //FeatureTreeNodeImpl
