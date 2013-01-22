/**
 */
package contextmapper.impl;

import contextmapper.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextmapperFactoryImpl extends EFactoryImpl implements ContextmapperFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextmapperFactory init() {
		try {
			ContextmapperFactory theContextmapperFactory = (ContextmapperFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/feature/context/mapper/model/contextmapper.ecore"); 
			if (theContextmapperFactory != null) {
				return theContextmapperFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContextmapperFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextmapperFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ContextmapperPackage.CONTEXT: return createContext();
			case ContextmapperPackage.CLASSIFIER: return createClassifier();
			case ContextmapperPackage.RUNTIME_CONFIG: return createRuntimeConfig();
			case ContextmapperPackage.CONTEXT_DIAGRAM: return createContextDiagram();
			case ContextmapperPackage.EXTEND_CONNECTION: return createExtendConnection();
			case ContextmapperPackage.EXCLUDE_CONNECTION: return createExcludeConnection();
			case ContextmapperPackage.PRIOR_CONNECTION: return createPriorConnection();
			case ContextmapperPackage.INCLUDE_CONNECTION: return createIncludeConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ContextmapperPackage.CLASSIFICATION:
				return createClassificationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ContextmapperPackage.CLASSIFICATION:
				return convertClassificationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createClassifier() {
		ClassifierImpl classifier = new ClassifierImpl();
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeConfig createRuntimeConfig() {
		RuntimeConfigImpl runtimeConfig = new RuntimeConfigImpl();
		return runtimeConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDiagram createContextDiagram() {
		ContextDiagramImpl contextDiagram = new ContextDiagramImpl();
		return contextDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeConnection createExcludeConnection() {
		ExcludeConnectionImpl excludeConnection = new ExcludeConnectionImpl();
		return excludeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeConnection createIncludeConnection() {
		IncludeConnectionImpl includeConnection = new IncludeConnectionImpl();
		return includeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorConnection createPriorConnection() {
		PriorConnectionImpl priorConnection = new PriorConnectionImpl();
		return priorConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendConnection createExtendConnection() {
		ExtendConnectionImpl extendConnection = new ExtendConnectionImpl();
		return extendConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification createClassificationFromString(EDataType eDataType, String initialValue) {
		Classification result = Classification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextmapperPackage getContextmapperPackage() {
		return (ContextmapperPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContextmapperPackage getPackage() {
		return ContextmapperPackage.eINSTANCE;
	}

} //ContextmapperFactoryImpl
