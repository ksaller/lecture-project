package contextmapper.diagram.sheet;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.featuremapper.models.feature.Feature;

import contextmapper.Classification;
import contextmapper.Classifier;
import contextmapper.Context;
import contextmapper.ContextmapperFactory;
import contextmapper.diagram.customized.ClassifierCommand;
//import org.eclipse.gmf.runtime.diagram.ui.properties.sections.grid.RulerGridPropertySection;; DiagramGeneralSection;

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
	protected Composite wrap, comp;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite, org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	// Verantwortlich für die graphische Darstellung der Properties-View
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		parent.setLayout(new FillLayout(SWT.VERTICAL));
		wrap = getWidgetFactory().createFlatFormComposite(parent);
		
		comp = getWidgetFactory().createFlatFormComposite(wrap);
		comp.setLayout(new GridLayout(1, true));
		
		page = new PropertySheetPage();

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

	@Override
	public void refresh() {
		super.refresh();
//		System.err.println("Refresh");
		
		// Hier wird der zur Zeit ausgewählte Context ausgelesen:
		StructuredSelection ss = (StructuredSelection) getSelection();
		Context selContext = (Context) (EObject) ss.getFirstElement();
		
		createClassificationForm(selContext);

	}
	
	/**
	 * Creates the classification form for the given context
	 * @param context
	 * @author Daniel
	 */
	protected void createClassificationForm(Context context) {
		
		// Alten Inhalt entfernen 
		if (comp != null)
			 comp.dispose();
		 
		comp = getWidgetFactory().createFlatFormComposite(wrap);
		comp.setLayout(new GridLayout(1, true));
		if(context.getMapping() == null) {
			getWidgetFactory().createLabel(comp, "No Mapping selected!");
			return;
			}
		getWidgetFactory().createLabel(comp, "Classifiers for "+context.getName());
		
//		Context c2 = GlobalObjectGetter.getContextDiagram().getContext().get(0);//(Context) eObjectSelected; 
		EList<Feature> features = context.getMapping().getFeatures();

		SelectionListener sl = new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				CCombo cc = (CCombo) e.widget;

				Context c = (Context) cc.getData("c");
				Feature f = (Feature) cc.getData("f");
				
				Classifier classf = ContextmapperFactory.eINSTANCE.createClassifier();
				classf.setFeature(f);
				
				classf.setFeatureClassification(Classification.get(cc.getSelectionIndex()-1));

				ICommandProxy addClassifierCommand = new ICommandProxy(
						new ClassifierCommand(getEditingDomain(),c, classf));
				addClassifierCommand.execute();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		};
		
		Composite subcomp;
		CCombo cc;
		for (Feature feature : features) {
			
			subcomp = getWidgetFactory().createFlatFormComposite(comp);
			subcomp.setLayout(new GridLayout(2, true));
			getWidgetFactory().createCLabel(subcomp, feature.getName());
			cc = getWidgetFactory().createCCombo(subcomp);
			cc.add("", 0);
			cc.add("DEAD", 1);
			cc.add("ALIVE", 2);
			cc.add("UNBOUND", 3);
			cc.addSelectionListener(sl);
			cc.setData("c", context);
			cc.setData("f", feature);
			
			// Sucht nach bereits vorhandenem Classifier und setzt den Wert entsprechend
			EList<Classifier> cls = context.getClassifier();
			for (int i = 0; i < cls.size(); ++i) {
				if(feature.equals(cls.get(i).getFeature())) {
					cc.select(cls.get(i).getFeatureClassification().getValue()+1);
					break;
				}
			}
		}
		
		// Parent-Composite aktualisieren
		wrap.layout(true);
	}

	
}
