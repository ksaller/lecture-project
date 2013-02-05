package contextmapper.logic;

import java.util.List;

import org.featuremapper.models.feature.FeatureModel;

import contextmapper.Classifier;
import contextmapper.Context;

public interface IFixpointSolver {

	/**
	 * erstellt einen FixpointSolver
	 * 
	 * @param c
	 *            Der Kontext der gesolvt werden soll
	 * @param fm
	 *            Das Featuremodell mit den Constraints
	 * @param considerMapping
	 *            gibt an, ob das Mapping des Kontexts c mit einbezogen werden
	 *            soll, sollte für eine RuntimeConfig auf false gesetzt werden
	 */
	void create(Context c, FeatureModel fm, boolean considerMapping);

	/**
	 * ruft den Fixpunkt-Algorithmus auf
	 * 
	 * @return und erstellt ein neuer Kontext, der alle nötigen
	 *         Klassifizierungen enthält
	 * @throws ConstraintViolation
	 */
	public List<Classifier> solve() throws ConstraintViolation;

	/**
	 * ruft den Fixpunkt-Algorithmus auf
	 * 
	 * @return true, wenn der Kontext den Constraints genügt, false, wenn nicht
	 */
	public boolean validate();

}
