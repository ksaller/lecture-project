/**
 */
package metamodel.impl;

import java.util.Collection;

import metamodel.Classifier;
import metamodel.Connection;
import metamodel.Context;
import metamodel.IncludeConnection;
import metamodel.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.ContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.impl.ContextImpl#getClassifies <em>Classifies</em>}</li>
 *   <li>{@link metamodel.impl.ContextImpl#getTargetConnections <em>Target Connections</em>}</li>
 *   <li>{@link metamodel.impl.ContextImpl#getIncluded <em>Included</em>}</li>
 *   <li>{@link metamodel.impl.ContextImpl#getSourceConnections <em>Source Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends EObjectImpl implements Context {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassifies() <em>Classifies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifies()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifies;

	/**
	 * The cached value of the '{@link #getTargetConnections() <em>Target Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> targetConnections;

	/**
	 * The cached value of the '{@link #getIncluded() <em>Included</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluded()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludeConnection> included;

	/**
	 * The cached value of the '{@link #getSourceConnections() <em>Source Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> sourceConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CONTEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifies() {
		if (classifies == null) {
			classifies = new EObjectResolvingEList<Classifier>(Classifier.class, this, MetamodelPackage.CONTEXT__CLASSIFIES);
		}
		return classifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getTargetConnections() {
		if (targetConnections == null) {
			targetConnections = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, MetamodelPackage.CONTEXT__TARGET_CONNECTIONS, MetamodelPackage.CONNECTION__SOURCE);
		}
		return targetConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeConnection> getIncluded() {
		if (included == null) {
			included = new EObjectWithInverseResolvingEList<IncludeConnection>(IncludeConnection.class, this, MetamodelPackage.CONTEXT__INCLUDED, MetamodelPackage.INCLUDE_CONNECTION__TARGET);
		}
		return included;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getSourceConnections() {
		if (sourceConnections == null) {
			sourceConnections = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, MetamodelPackage.CONTEXT__SOURCE_CONNECTIONS, MetamodelPackage.CONNECTION__TARGET);
		}
		return sourceConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.CONTEXT__TARGET_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetConnections()).basicAdd(otherEnd, msgs);
			case MetamodelPackage.CONTEXT__INCLUDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncluded()).basicAdd(otherEnd, msgs);
			case MetamodelPackage.CONTEXT__SOURCE_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceConnections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.CONTEXT__TARGET_CONNECTIONS:
				return ((InternalEList<?>)getTargetConnections()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.CONTEXT__INCLUDED:
				return ((InternalEList<?>)getIncluded()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.CONTEXT__SOURCE_CONNECTIONS:
				return ((InternalEList<?>)getSourceConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.CONTEXT__NAME:
				return getName();
			case MetamodelPackage.CONTEXT__CLASSIFIES:
				return getClassifies();
			case MetamodelPackage.CONTEXT__TARGET_CONNECTIONS:
				return getTargetConnections();
			case MetamodelPackage.CONTEXT__INCLUDED:
				return getIncluded();
			case MetamodelPackage.CONTEXT__SOURCE_CONNECTIONS:
				return getSourceConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.CONTEXT__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.CONTEXT__CLASSIFIES:
				getClassifies().clear();
				getClassifies().addAll((Collection<? extends Classifier>)newValue);
				return;
			case MetamodelPackage.CONTEXT__TARGET_CONNECTIONS:
				getTargetConnections().clear();
				getTargetConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case MetamodelPackage.CONTEXT__INCLUDED:
				getIncluded().clear();
				getIncluded().addAll((Collection<? extends IncludeConnection>)newValue);
				return;
			case MetamodelPackage.CONTEXT__SOURCE_CONNECTIONS:
				getSourceConnections().clear();
				getSourceConnections().addAll((Collection<? extends Connection>)newValue);
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
			case MetamodelPackage.CONTEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.CONTEXT__CLASSIFIES:
				getClassifies().clear();
				return;
			case MetamodelPackage.CONTEXT__TARGET_CONNECTIONS:
				getTargetConnections().clear();
				return;
			case MetamodelPackage.CONTEXT__INCLUDED:
				getIncluded().clear();
				return;
			case MetamodelPackage.CONTEXT__SOURCE_CONNECTIONS:
				getSourceConnections().clear();
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
			case MetamodelPackage.CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.CONTEXT__CLASSIFIES:
				return classifies != null && !classifies.isEmpty();
			case MetamodelPackage.CONTEXT__TARGET_CONNECTIONS:
				return targetConnections != null && !targetConnections.isEmpty();
			case MetamodelPackage.CONTEXT__INCLUDED:
				return included != null && !included.isEmpty();
			case MetamodelPackage.CONTEXT__SOURCE_CONNECTIONS:
				return sourceConnections != null && !sourceConnections.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
