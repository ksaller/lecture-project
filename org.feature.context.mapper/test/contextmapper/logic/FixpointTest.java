package contextmapper.logic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import contextmapper.Classification;
import contextmapper.logic.model.Assignment;
import contextmapper.logic.model.CNF;
import contextmapper.logic.model.Clause;
import contextmapper.logic.model.Constant;
import contextmapper.logic.model.Literal;
import contextmapper.logic.model.Variable;

public class FixpointTest {
	
	List<Variable> v = new ArrayList<Variable>();
	List<Assignment> e = new ArrayList<Assignment>();
	CNF cnf = new CNF();	
	
	@Test
	public void setUp(){
		Variable c = new Variable("Cell");
		Variable p = new Variable("VoIP");
		Variable w = new Variable("www");
		v.add(c);
		v.add(p);
		v.add(w);
		e.add(new Assignment(c, new Constant(Classification.DEAD)));
		e.add(new Assignment(p, new Constant(Classification.ALIVE)));
		e.add(new Assignment(w, new Constant(Classification.UNBOUND)));
		cnf.add(new Clause(new Literal(c,true), new Literal(p,true), new Literal(w,true)));
		cnf.add(new Clause(new Literal(c,true), new Literal(p,true), new Literal(w,false)));
		cnf.add(new Clause(new Literal(c,true), new Literal(p,false), new Literal(w,true)));
		cnf.add(new Clause(new Literal(c,false), new Literal(p,true), new Literal(w,false)));
		cnf.add(new Clause(new Literal(c,false), new Literal(p,false), new Literal(w,true)));
		cnf.add(new Clause(new Literal(c,false), new Literal(p,false), new Literal(w,false)));
		Clause cl1 = new Clause();
		cl1.add(new Literal(c, false));
		cnf.add(cl1);
		Fixpoint fp = new Fixpoint(v,e,cnf);
		fp.solve();
		System.out.println("Test1");
	}
}
