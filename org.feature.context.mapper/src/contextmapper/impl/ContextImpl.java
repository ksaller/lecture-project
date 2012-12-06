/**
 */
package contextmapper.impl;

import contextmapper.Classifier;
import contextmapper.Context;
import contextmapper.ContextmapperPackage;
import contextmapper.ExcludeConnection;
import contextmapper.ExtendConnection;
import contextmapper.PriorConnection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
public class ContextImpl extends CDOObjectImpl implements Context {
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
		return (String)eGet(ContextmapperPackage.Literals.CONTEXT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ContextmapperPackage.Literals.CONTEXT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMapping() {
		return (Mapping)eGet(ContextmapperPackage.Literals.CONTEXT__MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(Mapping newMapping) {
		eSet(ContextmapperPackage.Literals.CONTEXT__MAPPING, newMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getClassifier() {
		return (EList<Classifier>)eGet(ContextmapperPackage.Literals.CONTEXT__CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PriorConnection> getPriorize() {
		return (EList<PriorConnection>)eGet(ContextmapperPackage.Literals.CONTEXT__PRIORIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtendConnection> getExtend() {
		return (EList<ExtendConnection>)eGet(ContextmapperPackage.Literals.CONTEXT__EXTEND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExcludeConnection> getExclude() {
		return (EList<ExcludeConnection>)eGet(ContextmapperPackage.Literals.CONTEXT__EXCLUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExcludeConnection> getExcluded() {
		return (EList<ExcludeConnection>)eGet(ContextmapperPackage.Literals.CONTEXT__EXCLUDED, true);
	}

} //ContextImpl
