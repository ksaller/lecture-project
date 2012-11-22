/**
 */
package org.west.es.context.contextModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.feature.multi.perspective.mapping.viewmapping.Mapping;

import org.west.es.context.contextModel.ClassifiedFeature;
import org.west.es.context.contextModel.ContextElement;
import org.west.es.context.contextModel.ContextModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.west.es.context.contextModel.impl.ContextElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContextElementImpl#getAssociatedMapping <em>Associated Mapping</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContextElementImpl#getPriorizeLinks <em>Priorize Links</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContextElementImpl#getExtendsLink <em>Extends Link</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContextElementImpl#getExcludeLinks <em>Exclude Links</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ContextElementImpl#getClassifiedFeatures <em>Classified Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextElementImpl extends EObjectImpl implements ContextElement {
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
	 * The cached value of the '{@link #getAssociatedMapping() <em>Associated Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMapping()
	 * @generated
	 * @ordered
	 */
	protected Mapping associatedMapping;

	/**
	 * The cached value of the '{@link #getPriorizeLinks() <em>Priorize Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorizeLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> priorizeLinks;

	/**
	 * The cached value of the '{@link #getExtendsLink() <em>Extends Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsLink()
	 * @generated
	 * @ordered
	 */
	protected ContextElement extendsLink;

	/**
	 * The cached value of the '{@link #getExcludeLinks() <em>Exclude Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> excludeLinks;

	/**
	 * The cached value of the '{@link #getClassifiedFeatures() <em>Classified Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassifiedFeature> classifiedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelPackage.Literals.CONTEXT_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CONTEXT_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getAssociatedMapping() {
		if (associatedMapping != null && associatedMapping.eIsProxy()) {
			InternalEObject oldAssociatedMapping = (InternalEObject)associatedMapping;
			associatedMapping = (Mapping)eResolveProxy(oldAssociatedMapping);
			if (associatedMapping != oldAssociatedMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextModelPackage.CONTEXT_ELEMENT__ASSOCIATED_MAPPING, oldAssociatedMapping, associatedMapping));
			}
		}
		return associatedMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping basicGetAssociatedMapping() {
		return associatedMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedMapping(Mapping newAssociatedMapping) {
		Mapping oldAssociatedMapping = associatedMapping;
		associatedMapping = newAssociatedMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CONTEXT_ELEMENT__ASSOCIATED_MAPPING, oldAssociatedMapping, associatedMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getPriorizeLinks() {
		if (priorizeLinks == null) {
			priorizeLinks = new EObjectResolvingEList<ContextElement>(ContextElement.class, this, ContextModelPackage.CONTEXT_ELEMENT__PRIORIZE_LINKS);
		}
		return priorizeLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextElement getExtendsLink() {
		if (extendsLink != null && extendsLink.eIsProxy()) {
			InternalEObject oldExtendsLink = (InternalEObject)extendsLink;
			extendsLink = (ContextElement)eResolveProxy(oldExtendsLink);
			if (extendsLink != oldExtendsLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextModelPackage.CONTEXT_ELEMENT__EXTENDS_LINK, oldExtendsLink, extendsLink));
			}
		}
		return extendsLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextElement basicGetExtendsLink() {
		return extendsLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendsLink(ContextElement newExtendsLink) {
		ContextElement oldExtendsLink = extendsLink;
		extendsLink = newExtendsLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CONTEXT_ELEMENT__EXTENDS_LINK, oldExtendsLink, extendsLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getExcludeLinks() {
		if (excludeLinks == null) {
			excludeLinks = new EObjectResolvingEList<ContextElement>(ContextElement.class, this, ContextModelPackage.CONTEXT_ELEMENT__EXCLUDE_LINKS);
		}
		return excludeLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassifiedFeature> getClassifiedFeatures() {
		if (classifiedFeatures == null) {
			classifiedFeatures = new EObjectContainmentEList<ClassifiedFeature>(ClassifiedFeature.class, this, ContextModelPackage.CONTEXT_ELEMENT__CLASSIFIED_FEATURES);
		}
		return classifiedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextModelPackage.CONTEXT_ELEMENT__CLASSIFIED_FEATURES:
				return ((InternalEList<?>)getClassifiedFeatures()).basicRemove(otherEnd, msgs);
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
			case ContextModelPackage.CONTEXT_ELEMENT__NAME:
				return getName();
			case ContextModelPackage.CONTEXT_ELEMENT__ASSOCIATED_MAPPING:
				if (resolve) return getAssociatedMapping();
				return basicGetAssociatedMapping();
			case ContextModelPackage.CONTEXT_ELEMENT__PRIORIZE_LINKS:
				return getPriorizeLinks();
			case ContextModelPackage.CONTEXT_ELEMENT__EXTENDS_LINK:
				if (resolve) return getExtendsLink();
				return basicGetExtendsLink();
			case ContextModelPackage.CONTEXT_ELEMENT__EXCLUDE_LINKS:
				return getExcludeLinks();
			case ContextModelPackage.CONTEXT_ELEMENT__CLASSIFIED_FEATURES:
				return getClassifiedFeatures();
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
			case ContextModelPackage.CONTEXT_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ContextModelPackage.CONTEXT_ELEMENT__ASSOCIATED_MAPPING:
				setAssociatedMapping((Mapping)newValue);
				return;
			case ContextModelPackage.CONTEXT_ELEMENT__PRIORIZE_LINKS:
				getPriorizeLinks().clear();
				getPriorizeLinks().addAll((Collection<? extends ContextElement>)newValue);
				return;
			case ContextModelPackage.CONTEXT_ELEMENT__EXTENDS_LINK:
				setExtendsLink((ContextElement)newValue);
				return;
			case ContextModelPackage.CONTEXT_ELEMENT__EXCLUDE_LINKS:
				getExcludeLinks().clear();
				getExcludeLinks().addAll((Collection<? extends ContextElement>)newValue);
				return;
			case ContextModelPackage.CONTEXT_ELEMENT__CLASSIFIED_FEATURES:
				getClassifiedFeatures().clear();
				getClassifiedFeatures().addAll((Collection<? extends ClassifiedFeature>)newValue);
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
			case ContextModelPackage.CONTEXT_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextModelPackage.CONTEXT_ELEMENT__ASSOCIATED_MAPPING:
				setAssociatedMapping((Mapping)null);
				return;
			case ContextModelPackage.CONTEXT_ELEMENT__PRIORIZE_LINKS:
				getPriorizeLinks().clear();
				return;
			case ContextModelPackage.CONTEXT_ELEMENT__EXTENDS_LINK:
				setExtendsLink((ContextElement)null);
				return;
			case ContextModelPackage.CONTEXT_ELEMENT__EXCLUDE_LINKS:
				getExcludeLinks().clear();
				return;
			case ContextModelPackage.CONTEXT_ELEMENT__CLASSIFIED_FEATURES:
				getClassifiedFeatures().clear();
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
			case ContextModelPackage.CONTEXT_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextModelPackage.CONTEXT_ELEMENT__ASSOCIATED_MAPPING:
				return associatedMapping != null;
			case ContextModelPackage.CONTEXT_ELEMENT__PRIORIZE_LINKS:
				return priorizeLinks != null && !priorizeLinks.isEmpty();
			case ContextModelPackage.CONTEXT_ELEMENT__EXTENDS_LINK:
				return extendsLink != null;
			case ContextModelPackage.CONTEXT_ELEMENT__EXCLUDE_LINKS:
				return excludeLinks != null && !excludeLinks.isEmpty();
			case ContextModelPackage.CONTEXT_ELEMENT__CLASSIFIED_FEATURES:
				return classifiedFeatures != null && !classifiedFeatures.isEmpty();
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

} //ContextElementImpl
