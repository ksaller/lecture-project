package org.feature.model.slicer.modelSlicer.transformer;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.tud.es.madras.featuresc.FeatureSCProperties;
import de.tud.es.madras.featuresc.model.FeatureType;
import de.tud.es.madras.featuresc.model.SCFeature;
import de.tud.es.madras.featuresc.model.BoundedType;

/**
 * transform remaining list of alternatives features to optional or mandatory, if the
 * transformation is possible.
 * 
 * @author Ingo Reimund
 * @create 12.05.2012
 * 
 */
public class AlternativeTransformer {
	
	/**
	 * Logger
	 */
	private static Logger logger = LoggerFactory.getLogger(AlternativeTransformer.class);

	/**
	 * name of the property which contains the variability type
	 */
	private String nameVariabilityProperty;

	/**
	 * initialize or transformer
	 */
	public AlternativeTransformer() {
		String variabilityIdentifer = FeatureSCProperties.PROPERTY_TYPE_VARIABILITY_GENERATED;
		nameVariabilityProperty = FeatureSCProperties.getInstance().getString(variabilityIdentifer);
	}

	/**
	 * transform the remaining list of alternative features to optional if the removed
	 * feature is static. If the list of remaining feature has the size of 1,
	 * this method transform the last feature to a mandatory.
	 * 
	 * @param children
	 *            remaining types in the group
	 * @param removed
	 *            removed type
	 */
	public void transform(Set<SCFeature> children, SCFeature removed) {
		switch (children.size()) {
		case 1:
			transformToMandatory(children, removed);
			break;
		}
	}
	
	/**
	 * Process transformation of all features of the list of ors which have the
	 * same kind of type like the given feature. This method does only process
	 * the required transformation if the removed features is dead. The
	 * remaining or group have to transform to a mandatory features.
	 * 
	 * @param alternatives
	 *            group of ors
	 * @param parent
	 *            removed feature
	 */
	boolean transformToMandatory(Set<SCFeature> ors, SCFeature removed) {
		logger.debug("check for transformation");
		String type = removed.getProperty(nameVariabilityProperty).getValue();

		if (BoundedType.value(type) != BoundedType.DEAD) {
			logger.debug("feature '{}' is not static, no transformation", removed.getName());
			return false;
		}

		for (SCFeature transform : ors) {
			logger.info("transform feature '{}' to mandatory", transform.getName());
			transform.getParent().removeChild(transform.getType(), transform);
			transform.setType(FeatureType.MANDATORY);
			transform.getParent().addChild(transform.getType(), transform);
		}
		return true;
	}
}