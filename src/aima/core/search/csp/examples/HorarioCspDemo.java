package aima.core.search.csp.examples;

import java.util.Optional;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.CSP;
import aima.core.search.csp.Variable;
import aima.core.search.csp.solver.*;

/**
 * Application which demonstrates basic constraint algorithms based on map
 * coloring problems. It shows the constraint graph, lets the user select a
 * solution strategy, and allows then to follow the progress step by step.
 *
 * @author Ruediger Lunde
 */

public class HorarioCspDemo {
	
	public static void main(String[] args) {
	
		CSP<Variable, String> csp = new Horario3CSP();
		
		CspListener.StepCounter<Variable, String> stepCounter = new CspListener.StepCounter<>();
		
		CspSolver<Variable, String> solver;
		
		Optional<Assignment<Variable, String>> solution;
		
		
		solver = new MinConflictsSolver<>(1000);
		
		solver.addCspListener(stepCounter);
		
		stepCounter.reset();
		
		
//		System.out.println("Map Coloring (Minimum Conflicts)");
//		
//		solution = solver.solve(csp);
//		
//		solution.ifPresent(System.out::println);
//		
//		System.out.println(stepCounter.getResults() + "\n");
//		
//		solver = new FlexibleBacktrackingSolver<Variable, String>().setAll();
//		
//		solver.addCspListener(stepCounter);
//		
//		stepCounter.reset();
//		
//		
//		System.out.println("Map Coloring (Backtracking + MRV & DEG + LCV + AC3)");
//		
//		solution = solver.solve(csp);
//		
//		solution.ifPresent(System.out::println);
//		
//		System.out.println(stepCounter.getResults() + "\n");
//
//		solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg());
//		
//		solver.addCspListener(stepCounter);
//		
//		stepCounter.reset();
//		
//		
//		System.out.println("Map Coloring (Backtracking + MRV & DEG)");
//		
//		solution = solver.solve(csp);
//		
//		solution.ifPresent(System.out::println);
//		
//		System.out.println(stepCounter.getResults() + "\n");
//		
//		solver = new FlexibleBacktrackingSolver<>();
//		
//		solver.addCspListener(stepCounter);
//		
//		stepCounter.reset();
		
		
		System.out.println("\nHorario Academico\n");
		
		solution = solver.solve(csp);
		
		solution.ifPresent(System.out::println);
		
		System.out.println(stepCounter.getResults() + "\n");
	
	}
}
