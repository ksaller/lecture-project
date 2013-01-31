package contextmapper.logic;

import org.featuremapper.models.feature.FeatureModel;

import contextmapper.Context;

public interface IFixpointSolver {
	
	/**
	 * erstellt einen FixpointSolver
	 * @param c Der Kontext der gesolvt werden soll
	 * @param fm Das Featuremodell mit den Constraints
	 */
	public void create(Context c, FeatureModel fm);
	
	/**
	 * ruft den Fixpunkt-Algorithmus auf
	 * @return  und erstellt ein neuer Kontext, der alle n�tigen Klassifizierungen enth�lt
	 */
	public Context solve();
	
	/**
	 * ruft den Fixpunkt-Algorithmus auf
	 * @return true, wenn der Kontext den Constraints gen�gt, false, wenn nicht
	 */
	public boolean validate();
}
