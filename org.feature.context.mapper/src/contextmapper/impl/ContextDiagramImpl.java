/**
 */
package contextmapper.impl;

import contextmapper.Context;
import contextmapper.ContextDiagram;
import contextmapper.ContextmapperPackage;
import contextmapper.RuntimeConfig;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.feature.multi.perspective.mapping.viewmapping.MappingModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link contextmapper.impl.ContextDiagramImpl#getMappingReference <em>Mapping Reference</em>}</li>
 *   <li>{@link contextmapper.impl.ContextDiagramImpl#getContainsContexts <em>Contains Contexts</em>}</li>
 *   <li>{@link contextmapper.impl.ContextDiagramImpl#getContainsRuntimeConfigs <em>Contains Runtime Configs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextDiagramImpl extends EObjectImpl implements ContextDiagram {
	/**
	 * The cached value of the '{@link #getMappingReference() <em>Mapping Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingReference()
	 * @generated
	 * @ordered
	 */
	protected MappingModel mappingReference;

	/**
	 * The cached value of the '{@link #getContainsContexts() <em>Contains Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> containsContexts;

	/**
	 * The cached value of the '{@link #getContainsRuntimeConfigs() <em>Contains Runtime Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsRuntimeConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeConfig> containsRuntimeConfigs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextmapperPackage.Literals.CONTEXT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel getMappingReference() {
		if (mappingReference != null && mappingReference.eIsProxy()) {
			InternalEObject oldMappingReference = (InternalEObject)mappingReference;
			mappingReference = (MappingModel)eResolveProxy(oldMappingReference);
			if (mappingReference != oldMappingReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextmapperPackage.CONTEXT_DIAGRAM__MAPPING_REFERENCE, oldMappingReference, mappingReference));
			}
		}
		return mappingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel basicGetMappingReference() {
		return mappingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingReference(MappingModel newMappingReference) {
		MappingModel oldMappingReference = mappingReference;
		mappingReference = newMappingReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextmapperPackage.CONTEXT_DIAGRAM__MAPPING_REFERENCE, oldMappingReference, mappingReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getContainsContexts() {
		if (containsContexts == null) {
			containsContexts = new EObjectContainmentEList<Context>(Context.class, this, ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_CONTEXTS);
		}
		return containsContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeConfig> getContainsRuntimeConfigs() {
		if (containsRuntimeConfigs == null) {
			containsRuntimeConfigs = new EObjectContainmentEList<RuntimeConfig>(RuntimeConfig.class, this, ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_RUNTIME_CONFIGS);
		}
		return containsRuntimeConfigs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_CONTEXTS:
				return ((InternalEList<?>)getContainsContexts()).basicRemove(otherEnd, msgs);
			case ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_RUNTIME_CONFIGS:
				return ((InternalEList<?>)getContainsRuntimeConfigs()).basicRemove(otherEnd, msgs);
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
			case ContextmapperPackage.CONTEXT_DIAGRAM__MAPPING_REFERENCE:
				if (resolve) return getMappingReference();
				return basicGetMappingReference();
			case ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_CONTEXTS:
				return getContainsContexts();
			case ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_RUNTIME_CONFIGS:
				return getContainsRuntimeConfigs();
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
			case ContextmapperPackage.CONTEXT_DIAGRAM__MAPPING_REFERENCE:
				setMappingReference((MappingModel)newValue);
				return;
			case ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_CONTEXTS:
				getContainsContexts().clear();
				getContainsContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_RUNTIME_CONFIGS:
				getContainsRuntimeConfigs().clear();
				getContainsRuntimeConfigs().addAll((Collection<? extends RuntimeConfig>)newValue);
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
			case ContextmapperPackage.CONTEXT_DIAGRAM__MAPPING_REFERENCE:
				setMappingReference((MappingModel)null);
				return;
			case ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_CONTEXTS:
				getContainsContexts().clear();
				return;
			case ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_RUNTIME_CONFIGS:
				getContainsRuntimeConfigs().clear();
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
			case ContextmapperPackage.CONTEXT_DIAGRAM__MAPPING_REFERENCE:
				return mappingReference != null;
			case ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_CONTEXTS:
				return containsContexts != null && !containsContexts.isEmpty();
			case ContextmapperPackage.CONTEXT_DIAGRAM__CONTAINS_RUNTIME_CONFIGS:
				return containsRuntimeConfigs != null && !containsRuntimeConfigs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextDiagramImpl