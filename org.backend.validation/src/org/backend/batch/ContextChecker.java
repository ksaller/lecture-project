package org.backend.batch;
import java.util.HashMap;
import org.featuremapper.models.feature.Feature;
import org.west.es.context.contextModel.Classification;
import org.west.es.context.contextModel.ClassifiedFeature;
import org.west.es.context.contextModel.ContextElement;
import org.west.es.context.contextModel.ContextInstance;


public class ContextChecker {

	private ContextInstance contextInstance;

	public ContextInstance getContextInstance() {
		return contextInstance;
	}

	public void setContextInstance(ContextInstance contextInstance) {
		this.contextInstance = contextInstance;
	}
	
	public static boolean areConsistent(ContextElement c1, ContextElement c2) {
		HashMap<Feature,Classification> featureMap1 = new HashMap<Feature,Classification>();
		for(ClassifiedFeature cf : c1.getClassifiedFeatures()) {
			featureMap1.put(cf.getFeature(), cf.getClassification());
		}
		for(ClassifiedFeature cf : c2.getClassifiedFeatures()) {
			Classification cl1 = featureMap1.get(cf.getFeature());
			if(cl1 == Classification.ALIVE) {
				if(cf.getClassification() == Classification.DEAD) {
					return false;
				}
			}
			else if(cl1 == Classification.DEAD) {
				if(cf.getClassification() == Classification.ALIVE) {
					return false;
				}
			}
		}
		return true;
	}
}
