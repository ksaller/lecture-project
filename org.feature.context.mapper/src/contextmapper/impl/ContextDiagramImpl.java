/**
 */
package contextmapper.impl;

import contextmapper.Context;
import contextmapper.ContextDiagram;
import contextmapper.ContextmapperPackage;
import contextmapper.RuntimeConfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.feature.multi.perspective.mapping.viewmapping.MappingModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link contextmapper.impl.ContextDiagramImpl#getMappingReference <em>Mapping Reference</em>}</li>
 *   <li>{@link contextmapper.impl.ContextDiagramImpl#getContext <em>Context</em>}</li>
 *   <li>{@link contextmapper.impl.ContextDiagramImpl#getRuntimeconfig <em>Runtimeconfig</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextDiagramImpl extends CDOObjectImpl implements ContextDiagram {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel getMappingReference() {
		return (MappingModel)eGet(ContextmapperPackage.Literals.CONTEXT_DIAGRAM__MAPPING_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingReference(MappingModel newMappingReference) {
		eSet(ContextmapperPackage.Literals.CONTEXT_DIAGRAM__MAPPING_REFERENCE, newMappingReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Context> getContext() {
		return (EList<Context>)eGet(ContextmapperPackage.Literals.CONTEXT_DIAGRAM__CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RuntimeConfig> getRuntimeconfig() {
		return (EList<RuntimeConfig>)eGet(ContextmapperPackage.Literals.CONTEXT_DIAGRAM__RUNTIMECONFIG, true);
	}

} //ContextDiagramImpl
