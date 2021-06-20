package aima.core.search.csp.examples;

import java.io.IOException;
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
//		colocar o sabado como opcional no csp/psr
		boolean incluirSabado = false; // por padrao o sabado nao é incluido
		boolean repetir = true;
//		loop de execucao enquanto o usuario desejar
		while (repetir) {

//			perguntar se o sabado deve ser incuido no csp/psr
			System.out.flush();
			System.out.println("\nAlocação de horario do estudante:");
			System.out.println("\nO sabado deve ser incluido na distribuição de horarios? s (sim) ou n (não)\n");
			char ch = 'n', ignore;
			try {
				ch = (char) System.in.read();
//				System.out.println("Your key is: " + ch);

				// descarta qualquer outro caractere do buffer de entrada
				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // obtém um char
			if (ch == 's' || ch == 'S')
				incluirSabado = true;

			CSP<Variable, String> csp;

			if (incluirSabado) {
				csp = new Horario3CSP(incluirSabado);

			} else {
				csp = new Horario3CSP();

			}

			CspListener.StepCounter<Variable, String> stepCounter = new CspListener.StepCounter<>();

			CspSolver<Variable, String> solver;

			Optional<Assignment<Variable, String>> solution;

			solver = new MinConflictsSolver<>(1000);

			solver.addCspListener(stepCounter);

			stepCounter.reset();

//			System.out.println("Map Coloring (Minimum Conflicts)");
//			
//			solution = solver.solve(csp);
//			
//			solution.ifPresent(System.out::println);
//			
//			System.out.println(stepCounter.getResults() + "\n");
//			
//			solver = new FlexibleBacktrackingSolver<Variable, String>().setAll();
//			
//			solver.addCspListener(stepCounter);
//			
//			stepCounter.reset();
//			
//			
//			System.out.println("Map Coloring (Backtracking + MRV & DEG + LCV + AC3)");
//			
//			solution = solver.solve(csp);
//			
//			solution.ifPresent(System.out::println);
//			
//			System.out.println(stepCounter.getResults() + "\n");
			//
//			solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg());
//			
//			solver.addCspListener(stepCounter);
//			
//			stepCounter.reset();
//			
//			
//			System.out.println("Map Coloring (Backtracking + MRV & DEG)");
//			
//			solution = solver.solve(csp);
//			
//			solution.ifPresent(System.out::println);
//			
//			System.out.println(stepCounter.getResults() + "\n");
//			
//			solver = new FlexibleBacktrackingSolver<>();
//			
//			solver.addCspListener(stepCounter);
//			
//			stepCounter.reset();

			System.out.println("\nHorario Academico\n");

			solution = solver.solve(csp);

			solution.ifPresent(System.out::println);

			System.out.println(stepCounter.getResults() + "\n");

//			perguntar sobre novo processamento do horario

			try {
				System.out.println("Deseja fazer novo processamento do horario? s (sim) ou n (não)\n");

				ch = (char) System.in.read();
				if (ch == 'n' || ch == 'N') {
					repetir = false;
				}

//				// descarta qualquer outro caractere do buffer de entrada
//				do {
//				ignore = (char) System.in.read();
//				} while(ignore != '\n');

//				System.out.println("Your key is: " + ch);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Final do processamento!");

	}

}
