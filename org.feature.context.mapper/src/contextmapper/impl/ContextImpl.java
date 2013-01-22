/**
 */
package contextmapper.impl;

import contextmapper.Classifier;
import contextmapper.Context;
import contextmapper.ContextmapperPackage;
import contextmapper.ExcludeConnection;
import contextmapper.ExtendConnection;
import contextmapper.PriorConnection;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.feature.multi.perspective.mapping.viewmapping.Mapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link contextmapper.impl.ContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link contextmapper.impl.ContextImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link contextmapper.impl.ContextImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link contextmapper.impl.ContextImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link contextmapper.impl.ContextImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link contextmapper.impl.ContextImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link contextmapper.impl.ContextImpl#getPriorize <em>Priorize</em>}</li>
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
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected Mapping mapping;
	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifier;
	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendConnection> extend;
	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<ExcludeConnection> exclude;
	/**
	 * The cached value of the '{@link #getExcluded() <em>Excluded</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcluded()
	 * @generated
	 * @ordered
	 */
	protected EList<ExcludeConnection> excluded;
	/**
	 * The cached value of the '{@link #getPriorize() <em>Priorize</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorize()
	 * @generated
	 * @ordered
	 */
	protected EList<PriorConnection> priorize;

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
		return ContextmapperPackage.Literals.CONTEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextmapperPackage.CONTEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMapping() {
		if (mapping != null && mapping.eIsProxy()) {
			InternalEObject oldMapping = (InternalEObject)mapping;
			mapping = (Mapping)eResolveProxy(oldMapping);
			if (mapping != oldMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextmapperPackage.CONTEXT__MAPPING, oldMapping, mapping));
			}
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping basicGetMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(Mapping newMapping) {
		Mapping oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextmapperPackage.CONTEXT__MAPPING, oldMapping, mapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, ContextmapperPackage.CONTEXT__CLASSIFIER);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PriorConnection> getPriorize() {
		if (priorize == null) {
			priorize = new EObjectContainmentWithInverseEList<PriorConnection>(PriorConnection.class, this, ContextmapperPackage.CONTEXT__PRIORIZE, ContextmapperPackage.PRIOR_CONNECTION__SOURCE);
		}
		return priorize;
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
			case ContextmapperPackage.CONTEXT__EXTEND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtend()).basicAdd(otherEnd, msgs);
			case ContextmapperPackage.CONTEXT__EXCLUDE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExclude()).basicAdd(otherEnd, msgs);
			case ContextmapperPackage.CONTEXT__EXCLUDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExcluded()).basicAdd(otherEnd, msgs);
			case ContextmapperPackage.CONTEXT__PRIORIZE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPriorize()).basicAdd(otherEnd, msgs);
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
			case ContextmapperPackage.CONTEXT__CLASSIFIER:
				return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
			case ContextmapperPackage.CONTEXT__EXTEND:
				return ((InternalEList<?>)getExtend()).basicRemove(otherEnd, msgs);
			case ContextmapperPackage.CONTEXT__EXCLUDE:
				return ((InternalEList<?>)getExclude()).basicRemove(otherEnd, msgs);
			case ContextmapperPackage.CONTEXT__EXCLUDED:
				return ((InternalEList<?>)getExcluded()).basicRemove(otherEnd, msgs);
			case ContextmapperPackage.CONTEXT__PRIORIZE:
				return ((InternalEList<?>)getPriorize()).basicRemove(otherEnd, msgs);
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
			case ContextmapperPackage.CONTEXT__NAME:
				return getName();
			case ContextmapperPackage.CONTEXT__MAPPING:
				if (resolve) return getMapping();
				return basicGetMapping();
			case ContextmapperPackage.CONTEXT__CLASSIFIER:
				return getClassifier();
			case ContextmapperPackage.CONTEXT__EXTEND:
				return getExtend();
			case ContextmapperPackage.CONTEXT__EXCLUDE:
				return getExclude();
			case ContextmapperPackage.CONTEXT__EXCLUDED:
				return getExcluded();
			case ContextmapperPackage.CONTEXT__PRIORIZE:
				return getPriorize();
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
			case ContextmapperPackage.CONTEXT__NAME:
				setName((String)newValue);
				return;
			case ContextmapperPackage.CONTEXT__MAPPING:
				setMapping((Mapping)newValue);
				return;
			case ContextmapperPackage.CONTEXT__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case ContextmapperPackage.CONTEXT__EXTEND:
				getExtend().clear();
				getExtend().addAll((Collection<? extends ExtendConnection>)newValue);
				return;
			case ContextmapperPackage.CONTEXT__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends ExcludeConnection>)newValue);
				return;
			case ContextmapperPackage.CONTEXT__EXCLUDED:
				getExcluded().clear();
				getExcluded().addAll((Collection<? extends ExcludeConnection>)newValue);
				return;
			case ContextmapperPackage.CONTEXT__PRIORIZE:
				getPriorize().clear();
				getPriorize().addAll((Collection<? extends PriorConnection>)newValue);
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
			case ContextmapperPackage.CONTEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextmapperPackage.CONTEXT__MAPPING:
				setMapping((Mapping)null);
				return;
			case ContextmapperPackage.CONTEXT__CLASSIFIER:
				getClassifier().clear();
				return;
			case ContextmapperPackage.CONTEXT__EXTEND:
				getExtend().clear();
				return;
			case ContextmapperPackage.CONTEXT__EXCLUDE:
				getExclude().clear();
				return;
			case ContextmapperPackage.CONTEXT__EXCLUDED:
				getExcluded().clear();
				return;
			case ContextmapperPackage.CONTEXT__PRIORIZE:
				getPriorize().clear();
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
			case ContextmapperPackage.CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextmapperPackage.CONTEXT__MAPPING:
				return mapping != null;
			case ContextmapperPackage.CONTEXT__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
			case ContextmapperPackage.CONTEXT__EXTEND:
				return extend != null && !extend.isEmpty();
			case ContextmapperPackage.CONTEXT__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
			case ContextmapperPackage.CONTEXT__EXCLUDED:
				return excluded != null && !excluded.isEmpty();
			case ContextmapperPackage.CONTEXT__PRIORIZE:
				return priorize != null && !priorize.isEmpty();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtendConnection> getExtend() {
		if (extend == null) {
			extend = new EObjectContainmentWithInverseEList<ExtendConnection>(ExtendConnection.class, this, ContextmapperPackage.CONTEXT__EXTEND, ContextmapperPackage.EXTEND_CONNECTION__SOURCE);
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExcludeConnection> getExclude() {
		if (exclude == null) {
			exclude = new EObjectContainmentWithInverseEList<ExcludeConnection>(ExcludeConnection.class, this, ContextmapperPackage.CONTEXT__EXCLUDE, ContextmapperPackage.EXCLUDE_CONNECTION__SOURCE);
		}
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExcludeConnection> getExcluded() {
		if (excluded == null) {
			excluded = new EObjectWithInverseResolvingEList<ExcludeConnection>(ExcludeConnection.class, this, ContextmapperPackage.CONTEXT__EXCLUDED, ContextmapperPackage.EXCLUDE_CONNECTION__TARGET);
		}
		return excluded;
	}

} //ContextImpl
