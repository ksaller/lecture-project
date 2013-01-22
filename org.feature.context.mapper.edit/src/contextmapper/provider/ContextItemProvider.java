/**
 */
package contextmapper.provider;


import contextmapper.Context;
import contextmapper.ContextmapperFactory;
import contextmapper.ContextmapperPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.feature.multi.perspective.mapping.viewmapping.Mapping;

/**
 * This is the item provider adapter for a {@link contextmapper.Context} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addMappingPropertyDescriptor(object);
			//addClassifierPropertyDescriptor(object);
			//addExcludedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Context_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Context_name_feature", "_UI_Context_type"),
				 ContextmapperPackage.Literals.CONTEXT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addMappingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(new ItemPropertyDescriptor
						(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						 getResourceLocator(),
						 getString("_UI_Context_mapping_feature"),
						 getString("_UI_PropertyDescriptor_description", "_UI_Context_mapping_feature", "_UI_Context_type"),
						 ContextmapperPackage.Literals.CONTEXT__MAPPING,
						 true,
						 false,
						 false,
						 null,
						 null,
						 null){
							@Override
							public IItemLabelProvider getLabelProvider(Object object){
								final IItemLabelProvider defaultLabelProvider = super.getLabelProvider(object);
								return new IItemLabelProvider() {
									
									@Override
									public String getText(Object object) {
										if (object instanceof Mapping) {
											Mapping mapping = (Mapping) object;
											return mapping.getViewgroup().getName();
										}
										return defaultLabelProvider.getText(object);
									}
									
									@Override
									public Object getImage(Object object) {
										return defaultLabelProvider.getImage(object);
									}
								};
							}
						}
					);
	}

	/**
	 * This adds a property descriptor for the Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Context_classifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Context_classifier_feature", "_UI_Context_type"),
				 ContextmapperPackage.Literals.CONTEXT__CLASSIFIER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Excluded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Context_excluded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Context_excluded_feature", "_UI_Context_type"),
				 ContextmapperPackage.Literals.CONTEXT__EXCLUDED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ContextmapperPackage.Literals.CONTEXT__EXTEND);
			childrenFeatures.add(ContextmapperPackage.Literals.CONTEXT__EXCLUDE);
			childrenFeatures.add(ContextmapperPackage.Literals.CONTEXT__PRIORIZE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Context.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Context"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Context)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Context_type") :
			getString("_UI_Context_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Context.class)) {
			case ContextmapperPackage.CONTEXT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContextmapperPackage.CONTEXT__EXTEND:
			case ContextmapperPackage.CONTEXT__EXCLUDE:
			case ContextmapperPackage.CONTEXT__PRIORIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ContextmapperPackage.Literals.CONTEXT__EXTEND,
				 ContextmapperFactory.eINSTANCE.createExtendConnection()));

		newChildDescriptors.add
			(createChildParameter
				(ContextmapperPackage.Literals.CONTEXT__EXCLUDE,
				 ContextmapperFactory.eINSTANCE.createExcludeConnection()));

		newChildDescriptors.add
			(createChildParameter
				(ContextmapperPackage.Literals.CONTEXT__PRIORIZE,
				 ContextmapperFactory.eINSTANCE.createPriorConnection()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ContextmapperEditPlugin.INSTANCE;
	}

}
