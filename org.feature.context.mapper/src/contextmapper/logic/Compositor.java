package contextmapper.logic;

import java.util.HashMap;
import java.util.Map.Entry;

import org.feature.multi.perspective.mapping.viewmapping.ViewmappingFactory;
import org.featuremapper.models.feature.Feature;

import contextmapper.Classification;
import contextmapper.Classifier;
import contextmapper.Context;
import contextmapper.ContextmapperFactory;
import contextmapper.PriorConnection;

public class Compositor {
	
	/**
	 * @author Melvil
	 * @param a Context
	 * @param b Context
	 * @return komponierter Context
	 * @throws ContradictionException wenn sich zwei Klassifizierungen widersprechen
	 */
	public static Context compose(Context a, Context b) throws ContradictionException {
		// HashMap zum leichteren Verwalten der Features und Klassifizierungen erstellen
		HashMap<Feature, Classifier> features = new HashMap<Feature, Classifier>();
		
		// Fallunterscheidung: je nachdem, ob eine PriorConnection existiert oder nicht
		if(priorConnectionBetween(a, b))		// Priorize von a nach b
			composeWithPriorize(a, b, features);
		else if(priorConnectionBetween(b, a))	// Priorize von b nach a
			composeWithPriorize(b, a, features);
		else 									// kein Priorize
			composeWithLogicTable(a, b, features);
		
		// Erstellen des komponierten Kontexts
		Context composedContext = ContextmapperFactory.eINSTANCE.createContext();
		composedContext.setMapping(ViewmappingFactory.eINSTANCE.createMapping());
		Classifier t;
		for (Entry<Feature, Classifier> entry : features.entrySet()) {
			composedContext.getMapping().getFeatures().add(entry.getKey());
			t = ContextmapperFactory.eINSTANCE.createClassifier();
			t.setFeature(entry.getValue().getFeature());
			t.setFeatureClassification(entry.getValue().getFeatureClassification());
			composedContext.getClassifier().add(t);
		}
				
		return composedContext;
	}
	
	/**
	 * @author Melvil
	 * @param from Context
	 * @param to Context
	 * @return ob vom Context from zum Context to eine PriorConnection ist
	 */
	public static boolean priorConnectionBetween(Context from, Context to){
		for(PriorConnection connection : from.getPriorize()){
			if(connection.getTarget() == to)
				return true;
		}
		return false;
	}
	
	/**
	 * @author Melvil
	 * @param priorizing Context, der die Source der PriorConnection ist
	 * @param priorized Context, der das Target der PriorConnection ist
	 * @param features HashMap, in die die Klassifizierung des komponierten Contextes geschrieben werden
	 */
	public static void composeWithPriorize(Context priorizing, Context priorized,
			HashMap<Feature,Classifier> features){
		for (Classifier c : priorized.getClassifier()){	// erst die Features vom unwichtigen Kontext
			features.put(c.getFeature(), c);
		}
		for (Classifier c : priorizing.getClassifier()){// dann die vom wichtigen Kontext
			features.put(c.getFeature(), c);
		}
	}
	
	/**
	 * @author Timo
	 * @param a Context
	 * @param b Context
	 * @param features HashMap, in die die Klassifizierung des komponierten Contextes geschrieben werden
	 * @throws ContradictionException wenn sich zwei Klassifizierungen widersprechen
	 */
	public static void composeWithLogicTable(Context a, Context b, HashMap<Feature, Classifier> features)
			throws ContradictionException {

		// erstmal die Features des einen Kontextes setzen
		for (Classifier c : a.getClassifier()) {
			features.put(c.getFeature(), c);
		}

		// Setzen der neuen Klassifizierungen gemaess der Logiktabelle
		for (Classifier c : b.getClassifier()) {
			if (features.containsKey(c.getFeature())) {
				switch (features.get(c.getFeature()).getFeatureClassification()) {
				case ALIVE:
					if (c.getFeatureClassification() == Classification.DEAD)
						throw new ContradictionException();
					break;
				case DEAD:
					if (c.getFeatureClassification() == Classification.ALIVE)
						throw new ContradictionException();
					break;
				case UNBOUND:
					if (c.getFeatureClassification() == Classification.ALIVE
							|| c.getFeatureClassification() == Classification.DEAD)
						features.put(c.getFeature(), c);
					break;
				default:
					features.put(c.getFeature(), c);
					break;
				}
			} else {
				features.put(c.getFeature(), c);
			}
		}		
	}

}
