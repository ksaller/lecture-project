package contextmapper.diagram.customized;


import java.util.HashMap;
import org.featuremapper.models.feature.Feature;
import contextmapper.Classification;
import contextmapper.Classifier;
import contextmapper.Context;
import contextmapper.ContextmapperFactory;

public class Compositor {
	public static  Context compose(Context a, Context b) throws ContradictionException{
				
		// Hashmap mit den Classifiern und den zugehörigen Features erstellen zum schnelleren Zugriff
		HashMap<Feature,Classifier> features = new HashMap<Feature,Classifier>();
		for (Classifier c : a.getClassifier()){
			features.put( c.getFeature(),c);
		}
		
		// Setzen der neuen Klassifizierungen
		for (Classifier c : b.getClassifier()){
		
	        if(features.containsKey(c.getFeature())){
				switch (features.get(c.getFeature()).getFeatureClassification()) {
				case ALIVE:			
					if (c.getFeatureClassification() == Classification.DEAD)
						{
						throw new ContradictionException();}						
					break;
				case DEAD:
					if (c.getFeatureClassification() == Classification.ALIVE)
						throw new ContradictionException();	
					break;
				case UNBOUND:
					if (c.getFeatureClassification() == Classification.ALIVE
					  ||c.getFeatureClassification() == Classification.DEAD)
						 features.put(c.getFeature(), c);				
					break;
				
			
				default:  features.put(c.getFeature(), c);
					break;
				}
			}
			else features.put( c.getFeature(),c);
		}
		
		// Erstellen des neuen Kontexts und einfügen der Features und Klassifier
		Context temp = ContextmapperFactory.eINSTANCE.createContext();
		temp.setMapping(a.getMapping());
		for(Feature f : a.getMapping().getFeatures())
			
			temp.getMapping().getFeatures().add(f);
			
		for(Feature f : b.getMapping().getFeatures())
			if (!temp.getMapping().getFeatures().contains(f))
				temp.getMapping().getFeatures().add(f);
		
		temp.getClassifier().addAll(features.values());
		
		return temp;
	}
	
	
}
