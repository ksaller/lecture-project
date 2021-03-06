package org.feature.model.slicer.formulaSlicer.formula.builder;

import java.util.Set;

import org.feature.model.sat.solver.IFeatureSolver;
import org.featuremapper.models.feature.Feature;
import org.featuremapper.models.feature.FeatureModel;

/**
 * interface for a formula factory which handle a model or a model with bounded
 * features
 * 
 * @author Saller
 * 
 */
public interface IFormulaFactory {

	/**
	 * convert a model to a formula, using feature names
	 * 
	 * @param model
	 *            to convert, which can contains bounded features
	 * @return cnf with feature names
	 */
	public String createFormulaName(FeatureModel model);
	
	/**
	 * convert a model to a formula, using feature ids
	 * 
	 * @param model
	 *            to convert, which can contains bounded features
	 * @return cnf with feature ids
	 */
	public String createFormulaId(FeatureModel model);

	/**
	 * convert a model with bounded features to a formula, using feature names
	 * 
	 * @param model
	 *            model to convert, which can contains bounded features
	 * @param boundedAlive
	 *            additional bounded alive features
	 * @param boundedDead
	 *            additional bounded dead features
	 * @return cnf with feature names
	 */
	public String createFormulaName(FeatureModel model, Set<Feature> boundedAlive, Set<Feature> boundedDead);
	
	/**
	 * convert a model with bounded features to a formula, using feature ids
	 * 
	 * @param model
	 *            model to convert, which can contains bounded features
	 * @param boundedAlive
	 *            additional bounded alive features
	 * @param boundedDead
	 *            additional bounded dead features
	 * @return cnf with feature ids
	 */
	public String createFormulaId(FeatureModel model, Set<Feature> boundedAlive, Set<Feature> boundedDead);
	
	/**
	 * convert a model with bounded features to a minimized formula, using feature names
	 * 
	 * @param solverModel
	 *            solver model builder, already initialized with a feature model
	 * @param boundedAlive
	 *            additional bounded alive features
	 * @param boundedDead
	 *            additional bounded dead features
	 * @return minimized cnf with the name of features
	 */
	public String createFormulaNameMinimized(IFeatureSolver solverModel, Set<Feature> boundedAlive, Set<Feature> boundedDead);
	
	/**
	 * convert a model with bounded features to a minimized formula, using feature ids
	 * 
	 * @param model
	 *            model to convert, which can contains bounded features
	 * @param boundedAlive
	 *            additional bounded alive features
	 * @param boundedDead
	 *            additional bounded dead features
	 * @return minimized cnf with the feature ids
	 */
	public String createFormulaIdMinimized(FeatureModel model, Set<Feature> boundedAlive, Set<Feature> boundedDead);
}