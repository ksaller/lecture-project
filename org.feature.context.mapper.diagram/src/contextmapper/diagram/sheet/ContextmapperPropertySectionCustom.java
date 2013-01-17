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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
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

/**
 * @generated NOT
 * @author Daniel
 * adapted from AdvancedPropertySection (GMF)
 */
public class ContextmapperPropertySectionCustom extends AbstractModelerPropertySection {

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
        
//        getWidgetFactory().createCompositeSeparator(parent);
//        Composite composite2 = getWidgetFactory()
//                .createFlatFormComposite(parent);
//        composite2.setLayout(new GridLayout(3, true));
//        getWidgetFactory().createText(composite2, "Hello World!");
        
//        EList<Feature> l = GlobalObjectGetter.getContextDiagram().getContext().get(0).getMapping().getFeatures();
        
//        Mapping m = GlobalObjectGetter.getContextDiagram().getMappingReference().getMappings().get(0);
//        Context c = ContextmapperFactory.eINSTANCE.createContext();
//        
//        c.setName("Test");
//        Classifier classf = ContextmapperFactory.eINSTANCE.createClassifier();
//        classf.setFeature(c.getMapping().getFeatures().get(0));
//        classf.setFeatureClassification(Classification.ALIVE);
//        c.getClassifier().add(classf);
//        c.setMapping(m);
        
//        Context c1 = ((Context)((EditPart)((StructuredSelection)getSelection()).
//        		getFirstElement()).getAdapter(Context.class));
        
        Context c2 = GlobalObjectGetter.getContextDiagram().getContext().get(0);
        EList<Feature> features = c2.getMapping().getFeatures();

        SelectionListener sl = new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				CCombo cc = (CCombo) e.widget;
				
				Feature f = (Feature) cc.getData("f");
				Context c = (Context) cc.getData("c");
				
				System.err.println(c.getName() + " - " + f.getName() + ": " + cc.getSelectionIndex());
				
				
				Classifier classf = ContextmapperFactory.eINSTANCE.createClassifier();
				classf.setFeature(f);
//		        Classification clf = Classification.UNBOUND;
				
//				
//		        switch (cc.getSelectionIndex()) {
//					case 1:
//						clf = Classification.DEAD;
//						break;
//					case 2:
//						clf = Classification.ALIVE;
//						break;
//					case 3:
//						clf = Classification.UNBOUND;
//						break;
//	// TODO: Unclassified behandeln!!!
//					default:
//						break;
//				}
				
		        classf.setFeatureClassification(Classification.get(cc.getSelectionIndex()-1));
//		        c2.getClassifier().add(classf);
	
		        ICommandProxy addClassifierCommand = new ICommandProxy(new ClassifierCommand(
		        		getEditingDomain(), c, classf));
		        addClassifierCommand.execute();

			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
        for (Iterator iterator = features.iterator(); iterator.hasNext();) {
			Feature feature = (Feature) iterator.next();
			Composite comp = getWidgetFactory().createFlatFormComposite(composite);
			comp.setLayout(new GridLayout(2,true));
			getWidgetFactory().createCLabel(comp, feature.getName());
			CCombo cc = getWidgetFactory().createCCombo(comp);
			cc.add("", 0);
			cc.add("DEAD", 1);
			cc.add("ALIVE", 2);
			cc.add("UNBOUND", 3);
//			cc.select(2);
			cc.addSelectionListener(sl);
			cc.setData("c", c2);
			cc.setData("f", feature);
		}
     
        
//        getWidgetFactory().createLabel(composite, c2.getName());
//        for (Iterator iterator = l.iterator(); iterator.hasNext();) {
//			Feature feature = (Feature) iterator.next();
//			System.err.println(feature.getName());
//			getWidgetFactory().createText(composite, feature.getName());
//		}
        

//        FormData data = null;
//
//        String tableLabelStr = getTableLabel();
//        CLabel tableLabel = null;
//        if (tableLabelStr != null && tableLabelStr.length() > 0) {
//            tableLabel = getWidgetFactory().createCLabel(composite,
//                    tableLabelStr);
//            data = new FormData();
//            data.left = new FormAttachment(0, 0);
//            data.top = new FormAttachment(0, 0);
//            tableLabel.setLayoutData(data);
//        }

        page = new PropertySheetPage();
//        UndoableModelPropertySheetEntry root = new UndoableModelPropertySheetEntry(
//            OperationHistoryFactory.getOperationHistory());
        
        // Inhalt der Properties-Table bestimmen/zuweisen
//        root.setPropertySourceProvider(getPropertySourceProvider());
//        page.setRootEntry(root);
        
//        page.createControl(composite);
//        data = new FormData();
//        data.left = new FormAttachment(0, 0);
//        data.right = new FormAttachment(100, 0);
//        if (tableLabel == null) {
//            data.top = new FormAttachment(0, 0);
//        } else {
//            data.top = new FormAttachment(tableLabel, 0, SWT.BOTTOM);
//        }
//        data.bottom = new FormAttachment(100, 0);
//        data.height = 100;
//        data.width = 100;
//        page.getControl().setLayoutData(data);
//        setActionBars(aTabbedPropertySheetPage.getSite().getActionBars());
        
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

        	page.makeContributions(actionBars.getMenuManager(), actionBars
        			.getToolBarManager(), actionBars.getStatusLineManager());
        
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
    				IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
    						IItemPropertySource.class);
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
     * Returns the label for the table. The default implementation returns null,
     * that is, there is no label.
     * 
     * @return The label for the table
     */
    protected String getTableLabel() {
        return null;
    }

   
    /* (non-Javadoc)
     * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
     */
    public void setInputSuper(IWorkbenchPart part, ISelection selection) {
        IEditingDomainProvider provider = (IEditingDomainProvider) part
            .getAdapter(IEditingDomainProvider.class);
        if (provider != null) {
            EditingDomain theEditingDomain = provider.getEditingDomain();
            if (theEditingDomain instanceof TransactionalEditingDomain) {
                setEditingDomain((TransactionalEditingDomain) theEditingDomain);
            }
        }
        
        // Set the eObject for the section, too. The workbench part may not
		// adapt to IEditingDomainProvider, in which case the selected EObject
		// will be used to derive the editing domain.
		if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
            Object firstElement = ((IStructuredSelection) selection)
                .getFirstElement();
            
            if (firstElement != null) {
            	EObject adapted = unwrap(firstElement);
            	
	            if (adapted != null) {
	                setEObject(adapted);
	            }
            }
        }
        
        page.selectionChanged(part, selection);
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.views.properties.tabbed.ISection#dispose()
     */
    public void dispose() {
        super.dispose();

        if (page != null) {
            page.dispose();
            page = null;
        }

    }

 
    /* (non-Javadoc)
     * @see org.eclipse.ui.views.properties.tabbed.ISection#refresh()
     */
    public void refresh() {

        page.refresh();
    }

   
    /* (non-Javadoc)
     * @see org.eclipse.ui.views.properties.tabbed.ISection#shouldUseExtraSpace()
     */
    public boolean shouldUseExtraSpace() {
        return true;
    }

    /**
     * Update if nessesary, upon receiving the model event.
     * 
     * @see #aboutToBeShown()
     * @see #aboutToBeHidden()
     * @param notification -
     *            even notification
     * @param element -
     *            element that has changed
     */
    public void update(final Notification notification, EObject element) {
    	if (!isDisposed()) {
			postUpdateRequest(new Runnable() {

				public void run() {
					if (!isDisposed() && !isNotifierDeleted(notification))
						refresh();
				}
			});
		}
	}
   
    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.emf.core.edit.IDemuxedMListener#getFilter()
     */
    public NotificationFilter getFilter() {
        return NotificationFilter.createEventTypeFilter(Notification.SET).or(
            NotificationFilter.createEventTypeFilter(Notification.UNSET)).or(
            NotificationFilter.createEventTypeFilter(Notification.ADD)).or(
            NotificationFilter.createEventTypeFilter(Notification.ADD_MANY))
            .or(NotificationFilter.createEventTypeFilter(Notification.REMOVE))
            .or(
                NotificationFilter
                    .createEventTypeFilter(Notification.REMOVE_MANY)).and(
                NotificationFilter.createNotifierTypeFilter(EObject.class));
    }

   
    /*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
	 */
    protected boolean addToEObjectList(Object object) {
        /* not implemented */
    	return true;
    }

    
/////////////////////////////////////////////////////////////////   
// The following code is like in ContextmapperPropertySection. //
/////////////////////////////////////////////////////////////////
    
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
	 * @generated NOT
	 * (changed super.setInput() to setInputSuper() that is implemented in this class)
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty()
				|| false == selection instanceof StructuredSelection) {
			setInputSuper(part, selection);
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
		setInputSuper(part, new StructuredSelection(transformedSelection));
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
