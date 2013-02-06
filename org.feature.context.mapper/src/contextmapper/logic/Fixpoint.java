package contextmapper.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.feature.model.slicer.formulaSlicer.formula.builder.SAT4JCNFFormulaFactory;
import org.feature.multi.perspective.mapping.viewmapping.Mapping;
import org.featuremapper.models.feature.Feature;
import org.featuremapper.models.feature.FeatureFactory;
import org.featuremapper.models.feature.FeatureModel;

import contextmapper.Classification;
import contextmapper.Classifier;
import contextmapper.Context;
import contextmapper.ContextmapperFactory;

public class Fixpoint implements IFixpointSolver {

	List<String> v = null;
	List<String> e = new ArrayList<String>();
	Map<String, Feature> features = new HashMap<String, Feature>();
	String[] cnf;

	/**
	 * der eigentliche Fixpoint-Algorithmus
	 */
	private boolean fixpoint() throws ConstraintViolation {
		String[] tempCnf;
		boolean result = false;
		// step 2: entferne die Negation ein-elementiger Klauseln aus der CNF
		tempCnf = cnf.clone();
		for (String clause : cnf) {
			if (isSingularClause(clause)) {
				for (int i = 0; i < cnf.length; i++) {
					tempCnf[i] = tempCnf[i].replace(
							not(clause.substring(0, clause.length() - 1)), "");
					if (tempCnf[i].equals("/"))
						throw new ConstraintViolation(clause.substring(1,
								clause.length() - 2));
					result |= !(cnf[i].equals(tempCnf[i]));
				}
			}
		}
		cnf = tempCnf.clone();

		// System.out.println("Step 2:\n\n");
		// for (String i : cnf)
		// System.out.println(i);
		// System.out.println("\n\n");

		// step 3: entferne redundante Klauseln aus der CNF
		tempCnf = cnf.clone();
		boolean contains = false;
		String[] tempArray;
		for (int j = 0; j < cnf.length; j++) {
			if (!cnf[j].equals("")) {
				tempArray = cnf[j].split(" ");
				for (int i = 0; i < cnf.length; i++) {
					if (j != i) {
						contains = true;
						for (String Literal : tempArray) {
							// System.out.println(Literal + " in " +
							// tempCnf[i]);
							contains &= cnf[i].contains(Literal);
						}
						if (contains)
							cnf[i] = "";
					}
				}
			}
		}

		List<String> tempList = new ArrayList<String>();
		for (String i : cnf)
			if (!i.equals(""))
				tempList.add(i);
		cnf = tempList.toArray(new String[tempList.size()]);

		result |= !(cnf.length == tempCnf.length);

		// System.out.println("Step 3:\n\n");
		// for (String i : cnf)
		// System.out.println(i);
		// System.out.println("\n\n");

		return result;
	}

	@Override
	public List<Classifier> solve() throws ConstraintViolation {
		List<Classifier> result = new ArrayList<Classifier>();
		int iterations = 0;
		while (fixpoint())
			System.out.print(iterations++ + " ,");

		// System.out.println("e = ");
		// for (String st : e) System.out.println(st);
		// System.out.println("v = ");
		// for (String st : v) System.out.println(st);

//		 System.out.println("Step 4:\n\n");
//		 for (String clause : cnf)
//		 System.out.println(clause);
//		 System.out.println("\n\n");
		
		for (int j = 0; j < cnf.length; j++) {
			if (isSingularClause(cnf[j])) {
				String temp = cnf[j].substring(0, cnf[j].length() - 2);

				// System.out.println("temp("+i+") = " + temp);

				if (!e.contains(temp)
						&& v.contains(temp.substring(1))){
					result.add(createClassifier(temp));
				}
				cnf[j] = "";
			}
		}
		String resultString = "";
		for(String es : e) resultString += es.substring(1) + " ";
		for(Classifier cl : result) resultString += cl.getFeature().getName() + " ";
		for (int i = 0; i < v.size(); i++){
			if(!resultString.contains(v.get(i)))
				result.add(createClassifier(v.get(i)));
		}
		
		List<String> tempList = new ArrayList<String>();
		for (String clause : cnf)
			if (!clause.equals(""))
				tempList.add(clause);
		cnf = tempList.toArray(new String[tempList.size()]);


		return result;
	}

	@Override
	public void create(Context c, FeatureModel fm, boolean considerMapping) {

		for (Feature f : fm.getAllFeatures()) {
			features.put(f.getName(), f);
		}

		SAT4JCNFFormulaFactory builder = new SAT4JCNFFormulaFactory();
		String temp = builder.createFormulaName(fm);

		v = new ArrayList<String>();
		if (considerMapping) {
			for (Feature f : c.getMapping().getFeatures())
				v.add(f.getName());
		} else {
			for (Feature f : fm.getAllFeatures())
				v.add(f.getName());
		}
		temp += "\n";
		temp = addPlusToCNF(temp);
		temp += "+" + fm.getRoot().getName() + " +0\n";
		for (Classifier cl : c.getClassifier()) {
			if (cl.getFeatureClassification().equals(Classification.ALIVE)) {
				temp += "+" + cl.getFeature().getName() + " +0\n";
				e.add("+" + cl.getFeature().getName());
			} else if (cl.getFeatureClassification()
					.equals(Classification.DEAD)) {
				temp += "-" + cl.getFeature().getName() + " +0\n";
				e.add("-" + cl.getFeature().getName());
			}
		}
		cnf = temp.split("\n");
		int i = 0;
		for (String row : cnf) {
			cnf[i] = row.substring(0, row.length() - 3).concat(" /");
			i++;
		}
		// for (String row : cnf)
		// System.out.println(row);
	}

	/**
	 * Stellt den ALIVE klassifizierten Features der CNF ein + voran mittels
	 * Stringmanipulation
	 */
	private String addPlusToCNF(String temp) {
		if (temp.charAt(0) != '-' && temp.charAt(0) != '0')
			temp = "+".concat(temp);
		for (int i = 0; i < temp.length(); i++) {
			if (i != temp.length() - 1 && temp.charAt(i) == ' ')
				if (temp.charAt(i + 1) != '-')
					temp = temp.substring(0, i).concat(" +")
							.concat(temp.substring(i + 1, temp.length()));
			if (i != temp.length() - 1 && temp.charAt(i) == '\n')
				if (temp.charAt(i + 1) != '-')
					temp = temp.substring(0, i).concat("\n+")
							.concat(temp.substring(i + 1, temp.length()));
		}
		return temp;
	}

	// der Eingabestring muss die Form +feature oder -feature haben
	private Classifier createClassifier(String feature) {
		Classifier result = ContextmapperFactory.eINSTANCE.createClassifier();
		int temp = 1;
		if (feature.charAt(0) == '+')
			result.setFeatureClassification(Classification.ALIVE);
		else if (feature.charAt(0) == '-')
			result.setFeatureClassification(Classification.DEAD);
		else {result.setFeatureClassification(Classification.UNBOUND);
			temp = 0;
		}
		Feature f = features.get(feature.substring(temp));
		result.setFeature(f);
		return result;
	}

	private boolean isSingularClause(String clause) {
		return clause.indexOf(' ') == clause.length() - 2
				&& clause.indexOf(' ') != -1;
	}

	private String not(String literal) {
		if (literal.charAt(0) == '-')
			return "+".concat(literal.substring(1));
		else
			return "-".concat(literal.substring(1));
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

}
