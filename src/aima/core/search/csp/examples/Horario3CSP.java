package aima.core.search.csp.examples;

import java.util.Arrays;

import aima.core.search.csp.CSP;
import aima.core.search.csp.Domain;
import aima.core.search.csp.Variable;

/**
 * Artificial Intelligence A Modern Approach (3rd Ed.): Figure 6.1, Page
 * 204.<br>
 * <br>
 * The principal states and territories of Australia. Coloring this map can be
 * viewed as a constraint satisfaction problem (CSP). The goal is to assign
 * colors to each region so that no neighboring regions have the same color.
 * 
 * Os principais estados e territórios da Austrália. Colorir este mapa pode ser
 * visto como um problema de satisfação de restrição (CSP). O objetivo é
 * atribuir cores a cada região para que nenhuma região vizinha tenha a mesma
 * cor.
 * 
 * @author Ruediger Lunde
 * @author Mike Stampone
 */
public class Horario3CSP extends CSP<Variable, String> {

	public static final Variable SEG = new Variable("SEGUNDA");
	public static final Variable TER = new Variable("TERCA");
	public static final Variable QUA = new Variable("QUARTA");
	public static final Variable QUI = new Variable("QUINTA");
	public static final Variable SEX = new Variable("SEXTA");
	public static final Variable SAB = new Variable("SABADO");

//	public static final Variable WA = new Variable("WA");

//	public static final String RED = "RED";
//	public static final String GREEN = "GREEN";
//	public static final String BLUE = "BLUE";

//	DISCIPLINA =  (1,2,3)
//	public static final String[] COMP0455 = { "COMP0455", "4" };
//	public static final String[] COMP0481 = { "COMP0481", "2" };
//	public static final String[] COMP0408 = { "COMP0408", "4" };
//	public static final String[] COMP0409 = { "COMP0409", "4" };
//	public static final String[] COMP0438 = { "COMP0438", "4" };
//	public static final String[] COMP0412 = { "COMP0412", "4" };
//	public static final String[] ELET0043 = { "ELET0043", "2" };
//	public static final String[] MAT0096 = { "MAT0096", "4" };
//	public static final String[] MAT0154 = { "MAT0154", "4" };
//	public static final String[] ESTAT0011 = { "ESTAT0011", "4" };
//	public static final String[] COMP0415 = { "COMP0415", "4" };
//	public static final String[] COMP0417 = { "COMP0417", "2" };
//	public static final String[] PIBIC = { "PIBIC", "40" };
//	public static final String[] PIBIT = { "PIBIT", "40" };
//	public static final String[] PIBIX = { "PIBIX", "40" };
//	public static final String[] ESTAGIO20 = { "ESTAGIO", "40" };
//	public static final String[] ESTAGIO30 = { "ESTAGIO", "60" };
//	public static final String[] ESTAGIO40 = { "ESTAGIO", "80" };
//	public static final String[] TRABALHO22 = { "TRABALHO", "44" };
//	public static final String[] TRABALHO44 = { "TRABALHO", "88" };
//	public static final String[] VOLUNTARIA = { "ATV.VOLUNTARIA", "0" };
//	public static final String[] PALESTRA = { "PALESTRA", "0" };
//	public static final String[] EVENTO = { "EVENTO", "0" };
//	public static final String[] BLOCO = { "ESTUDO", "1" };
//	public static final String[] OUTROS = { "ESTUDO", "0" }; // default
	
	public static final String COMP0455 = "COMP0455";
	public static final String COMP0481 = "COMP0481";
	public static final String COMP0408 = "COMP0408";
	public static final String COMP0409 = "COMP0409";
	public static final String COMP0438 = "COMP0438";
	public static final String COMP0412 = "COMP0412";
	public static final String ELET0043 = "ELET0043";
	public static final String MAT0096 = "MAT0096";
	public static final String MAT0154 = "MAT0154";
	public static final String ESTAT0011 = "ESTAT0011";
	public static final String COMP0415 = "COMP0415";
	public static final String COMP0417 = "COMP0417";
	public static final String PIBIC = "PIBIC";
	public static final String PIBIT = "PIBIT";
	public static final String PIBIX = "PIBIX";
	public static final String ESTAGIO20 = "ESTAGIO20";
	public static final String ESTAGIO30 = "ESTAGIO30";
	public static final String ESTAGIO40 = "ESTAGIO40";
	public static final String TRABALHO22 = "TRABALHO22";
	public static final String TRABALHO44 = "TRABALHO44";
	public static final String VOLUNTARIA = "ATV.VOLUNT";
	public static final String PALESTRA = "PALESTRA";
	public static final String EVENTO = "EVENTO";
	public static final String BLOCO = "ESTUDO";
	public static final String OUTROS = "outros"; // default

	/**
	 * Constructs a map CSP for the principal states and territories of Australia,
	 * with the colors Red, Green, and Blue.
	 */
	public Horario3CSP() {
		super(Arrays.asList(SEG, TER, QUA, QUI, SEX, SAB));

		Domain<String> atividade = new Domain<>(COMP0455, COMP0481, COMP0408, COMP0409, COMP0438, COMP0412, ELET0043,
				MAT0096, MAT0154, ESTAT0011, COMP0415, COMP0417, PIBIC, PIBIT, PIBIX, ESTAGIO20, ESTAGIO30, ESTAGIO40,
				TRABALHO22, TRABALHO44, VOLUNTARIA, PALESTRA, EVENTO, BLOCO, OUTROS);
		
		for (Variable var : getVariables()) {
			setDomain(var, atividade);
		}
			

//		addConstraint(new NotEqualConstraint<>(WA, NT));
//		addConstraint(new NotEqualConstraint<>(WA, SA));
//		addConstraint(new NotEqualConstraint<>(NT, SA));
//		addConstraint(new NotEqualConstraint<>(NT, Q));
//		addConstraint(new NotEqualConstraint<>(SA, Q));
//		addConstraint(new NotEqualConstraint<>(SA, NSW));
//		addConstraint(new NotEqualConstraint<>(SA, V));
//		addConstraint(new NotEqualConstraint<>(Q, NSW));
//		addConstraint(new NotEqualConstraint<>(NSW, V));
	}
}