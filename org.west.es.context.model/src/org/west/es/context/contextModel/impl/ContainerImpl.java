/**
 */
package org.west.es.context.contextModel.impl;

import java.util.Collection;
import java.util.Date;

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

import org.west.es.context.contextModel.Container;
import org.west.es.context.contextModel.ContextElement;
import org.west.es.context.contextModel.ContextInstance;
import org.west.es.context.contextModel.ContextModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.west.es.context.contextModel.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContainerImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContainerImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContainerImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContainerImpl#getContextElements <em>Context Elements</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContainerImpl#getContextInstances <em>Context Instances</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContainerImpl#getAssociatedMappingModel <em>Associated Mapping Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends EObjectImpl implements Container {
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
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContextElements() <em>Context Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> contextElements;

	/**
	 * The cached value of the '{@link #getContextInstances() <em>Context Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextInstance> contextInstances;

	/**
	 * The cached value of the '{@link #getAssociatedMappingModel() <em>Associated Mapping Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMappingModel()
	 * @generated
	 * @ordered
	 */
	protected MappingModel associatedMappingModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelPackage.Literals.CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CONTAINER__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CONTAINER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CONTAINER__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getContextElements() {
		if (contextElements == null) {
			contextElements = new EObjectContainmentEList<ContextElement>(ContextElement.class, this, ContextModelPackage.CONTAINER__CONTEXT_ELEMENTS);
		}
		return contextElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextInstance> getContextInstances() {
		if (contextInstances == null) {
			contextInstances = new EObjectContainmentEList<ContextInstance>(ContextInstance.class, this, ContextModelPackage.CONTAINER__CONTEXT_INSTANCES);
		}
		return contextInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel getAssociatedMappingModel() {
		if (associatedMappingModel != null && associatedMappingModel.eIsProxy()) {
			InternalEObject oldAssociatedMappingModel = (InternalEObject)associatedMappingModel;
			associatedMappingModel = (MappingModel)eResolveProxy(oldAssociatedMappingModel);
			if (associatedMappingModel != oldAssociatedMappingModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextModelPackage.CONTAINER__ASSOCIATED_MAPPING_MODEL, oldAssociatedMappingModel, associatedMappingModel));
			}
		}
		return associatedMappingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel basicGetAssociatedMappingModel() {
		return associatedMappingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedMappingModel(MappingModel newAssociatedMappingModel) {
		MappingModel oldAssociatedMappingModel = associatedMappingModel;
		associatedMappingModel = newAssociatedMappingModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CONTAINER__ASSOCIATED_MAPPING_MODEL, oldAssociatedMappingModel, associatedMappingModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextModelPackage.CONTAINER__CONTEXT_ELEMENTS:
				return ((InternalEList<?>)getContextElements()).basicRemove(otherEnd, msgs);
			case ContextModelPackage.CONTAINER__CONTEXT_INSTANCES:
				return ((InternalEList<?>)getContextInstances()).basicRemove(otherEnd, msgs);
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
			case ContextModelPackage.CONTAINER__NAME:
				return getName();
			case ContextModelPackage.CONTAINER__AUTHOR:
				return getAuthor();
			case ContextModelPackage.CONTAINER__VERSION:
				return getVersion();
			case ContextModelPackage.CONTAINER__CREATION_DATE:
				return getCreationDate();
			case ContextModelPackage.CONTAINER__CONTEXT_ELEMENTS:
				return getContextElements();
			case ContextModelPackage.CONTAINER__CONTEXT_INSTANCES:
				return getContextInstances();
			case ContextModelPackage.CONTAINER__ASSOCIATED_MAPPING_MODEL:
				if (resolve) return getAssociatedMappingModel();
				return basicGetAssociatedMappingModel();
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
			case ContextModelPackage.CONTAINER__NAME:
				setName((String)newValue);
				return;
			case ContextModelPackage.CONTAINER__AUTHOR:
				setAuthor((String)newValue);
				return;
			case ContextModelPackage.CONTAINER__VERSION:
				setVersion((String)newValue);
				return;
			case ContextModelPackage.CONTAINER__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case ContextModelPackage.CONTAINER__CONTEXT_ELEMENTS:
				getContextElements().clear();
				getContextElements().addAll((Collection<? extends ContextElement>)newValue);
				return;
			case ContextModelPackage.CONTAINER__CONTEXT_INSTANCES:
				getContextInstances().clear();
				getContextInstances().addAll((Collection<? extends ContextInstance>)newValue);
				return;
			case ContextModelPackage.CONTAINER__ASSOCIATED_MAPPING_MODEL:
				setAssociatedMappingModel((MappingModel)newValue);
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
			case ContextModelPackage.CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextModelPackage.CONTAINER__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case ContextModelPackage.CONTAINER__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ContextModelPackage.CONTAINER__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case ContextModelPackage.CONTAINER__CONTEXT_ELEMENTS:
				getContextElements().clear();
				return;
			case ContextModelPackage.CONTAINER__CONTEXT_INSTANCES:
				getContextInstances().clear();
				return;
			case ContextModelPackage.CONTAINER__ASSOCIATED_MAPPING_MODEL:
				setAssociatedMappingModel((MappingModel)null);
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
			case ContextModelPackage.CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextModelPackage.CONTAINER__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case ContextModelPackage.CONTAINER__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ContextModelPackage.CONTAINER__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case ContextModelPackage.CONTAINER__CONTEXT_ELEMENTS:
				return contextElements != null && !contextElements.isEmpty();
			case ContextModelPackage.CONTAINER__CONTEXT_INSTANCES:
				return contextInstances != null && !contextInstances.isEmpty();
			case ContextModelPackage.CONTAINER__ASSOCIATED_MAPPING_MODEL:
				return associatedMappingModel != null;
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
		result.append(", author: ");
		result.append(author);
		result.append(", version: ");
		result.append(version);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
