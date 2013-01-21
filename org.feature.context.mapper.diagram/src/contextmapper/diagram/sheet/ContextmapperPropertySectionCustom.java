package contextmapper.diagram.sheet;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.CDOState;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.lock.CDOLockState;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.gmf.runtime.emf.ui.properties.sections.UndoableModelPropertySheetEntry;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GCData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.feature.multi.perspective.mapping.viewmapping.Mapping;
import org.featuremapper.models.feature.Feature;

import contextmapper.Classification;
import contextmapper.Classifier;
import contextmapper.Context;
import contextmapper.ContextmapperFactory;
import contextmapper.ExcludeConnection;
import contextmapper.ExtendConnection;
import contextmapper.PriorConnection;
import contextmapper.diagram.customized.ClassifierCommand;
import contextmapper.diagram.customized.GlobalObjectGetter;
//import org.eclipse.gmf.runtime.diagram.ui.properties.sections.grid.RulerGridPropertySection;; DiagramGeneralSection;
import contextmapper.impl.ContextmapperFactoryImpl;
import contextmapper.diagram.part.ContextmapperDiagramEditor;

/**
 * @generated NOT
 * @author Daniel
 * adapted from AdvancedPropertySection (GMF)
 */
public class ContextmapperPropertySectionCustom extends
		AbstractModelerPropertySection {

	/**
	 * the property sheet page for this section
	 */
	protected PropertySheetPage page;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite, org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	// Verantwortlich für die graphische Darstellung der Properties-View
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		parent.setLayout(new FillLayout(SWT.VERTICAL));
		Composite composite = getWidgetFactory()
				.createFlatFormComposite(parent);
		composite.setLayout(new GridLayout(1, true));

		Context c2 = GlobalObjectGetter.getContextDiagram().getContext().get(0);
		EList<Feature> features = c2.getMapping().getFeatures();

		SelectionListener sl = new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				CCombo cc = (CCombo) e.widget;

				Feature f = (Feature) cc.getData("f");

				Classifier classf = ContextmapperFactory.eINSTANCE
						.createClassifier();
				classf.setFeature(f);
				
				// Hier wird der zur Zeit ausgewählte Context ausgelesen:
				StructuredSelection ss = (StructuredSelection) getSelection();
				EObject eObjectSelected = (EObject) ss.getFirstElement();


				// From the editing domain a create a Set Command
				//				editingDomain.getCommandStack().execute(
				//				SetCommand.create(editingDomain, eObjectSelected, reference , classf));
				classf.setFeatureClassification(Classification.get(cc
						.getSelectionIndex() - 1));

				ICommandProxy addClassifierCommand = new ICommandProxy(
						new ClassifierCommand(getEditingDomain(),
								(Context) eObjectSelected, classf));
				addClassifierCommand.execute();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		};
		for (Iterator<Feature> iterator = features.iterator(); iterator.hasNext();) {
			Feature feature = (Feature) iterator.next();
			Composite comp = getWidgetFactory().createFlatFormComposite(
					composite);
			comp.setLayout(new GridLayout(2, true));
			getWidgetFactory().createCLabel(comp, feature.getName());
			CCombo cc = getWidgetFactory().createCCombo(comp);
			cc.add("", 0);
			cc.add("DEAD", 1);
			cc.add("ALIVE", 2);
			cc.add("UNBOUND", 3);
			cc.addSelectionListener(sl);
			cc.setData("c", c2);
			cc.setData("f", feature);
		}

		page = new PropertySheetPage();

	}

	public void setClassf(Context c, Classifier cl) {
		c.getClassifier().add(cl);
	}

	/**
	 * Sets and prepares the actionBars for this section
	 *  
	 * @param actionBars the action bars for this page
	 * @see org.eclipse.gmf.runtime.common.ui.properties.TabbedPropertySheetPage#setActionBars(org.eclipse.ui.IActionBars)
	 */
	public void setActionBars(IActionBars actionBars) {
		if (actionBars != null) {
			actionBars.getMenuManager().removeAll();
			actionBars.getToolBarManager().removeAll();
			actionBars.getStatusLineManager().removeAll();

			page.makeContributions(actionBars.getMenuManager(),
					actionBars.getToolBarManager(),
					actionBars.getStatusLineManager());

			actionBars.getToolBarManager().update(true);
		}

	}

	/**
	 * Returns the PropertySource provider. The default implementation returns
	 * static adapter factory for the properties services. If the extending
	 * class needs to use a different provider then this method has to be
	 * overwriten.
	 * 
	 * @return The PropertySource provider
	 */
	protected IPropertySourceProvider getPropertySourceProvider() {
		return new IPropertySourceProvider() {

			public IPropertySource getPropertySource(Object object) {
				if (object instanceof IPropertySource) {
					return (IPropertySource) object;
				}
				AdapterFactory af = getAdapterFactory(object);
				if (af != null) {
					IItemPropertySource ips = (IItemPropertySource) af.adapt(
							object, IItemPropertySource.class);
					if (ips != null) {
						return new PropertySource(object, ips);
					}
				}
				if (object instanceof IAdaptable) {
					return (IPropertySource) ((IAdaptable) object)
							.getAdapter(IPropertySource.class);
				}
				return null;
			}
		};
	}

	/**
	 * @generated NOT
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips != null) {
				return new PropertySource(object, ips);
				//				return new ContextPropertySource(object, ips);
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object)
					.getAdapter(IPropertySource.class);
		}
		return null;
	}

	/**
	 * Modify/unwrap selection.
	 * @generated
	 */
	protected Object transformSelection(Object selected) {

		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			View view = (View) ((IAdaptable) selected).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return selected;
	}

	/**
	 * @generated
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty()
				|| false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		ArrayList transformedSelection = new ArrayList(
				structuredSelection.size());
		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
			Object r = transformSelection(it.next());
			if (r != null) {
				transformedSelection.add(r);
			}
		}
		super.setInput(part, new StructuredSelection(transformedSelection));
	}

	/**
	 * @generated
	 */
	protected AdapterFactory getAdapterFactory(Object object) {
		if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
			return ((AdapterFactoryEditingDomain) getEditingDomain())
					.getAdapterFactory();
		}
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(object);
		if (editingDomain != null) {
			return ((AdapterFactoryEditingDomain) editingDomain)
					.getAdapterFactory();
		}
		return null;
	}

}
