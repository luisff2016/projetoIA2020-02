package aima.core.search.csp;

import java.util.*;

/**
 * An assignment assigns values to some or all variables of a CSP.
 * 
 * Uma atribuição atribui valores a algumas ou todas as variáveis de um CSP.
 *
 * @author Ruediger Lunde
 */
public class Assignment<VAR extends Variable, VAL> implements Cloneable {
	/**
	 * Maps variables to their assigned values.
	 * 
	 * Mapeia variáveis para seus valores atribuídos.
	 */
	private LinkedHashMap<VAR, VAL> variableToValueMap = new LinkedHashMap<>();

	public List<VAR> getVariables() {
		return new ArrayList<>(variableToValueMap.keySet());
	}

	public VAL getValue(VAR var) {
		return variableToValueMap.get(var);
	}

	public VAL add(VAR var, VAL value) {
		assert value != null;
		return variableToValueMap.put(var, value);
	}

	public VAL remove(VAR var) {
		return variableToValueMap.remove(var);
	}

	public boolean contains(VAR var) {
		return variableToValueMap.containsKey(var);
	}

	/**
	 * Returns true if this assignment does not violate any constraints of
	 * constraints.
	 * 
	 * Retorna verdadeiro se esta atribuição não violar nenhuma restrição de
	 * restrições.
	 */
	public boolean isConsistent(List<Constraint<VAR, VAL>> constraints) {
		return constraints.stream().allMatch(cons -> cons.isSatisfiedWith(this));
	}

	/**
	 * Returns true if this assignment assigns values to every variable of vars.
	 * 
	 * Retorna verdadeiro se esta atribuição atribuir valores a todas as variáveis
	 * de vars.
	 */
	public boolean isComplete(List<VAR> vars) {
		return vars.stream().allMatch(this::contains);
	}

	/**
	 * Returns true if this assignment is consistent as well as complete with
	 * respect to the given CSP.
	 * 
	 * Retorna verdadeiro se esta atribuição for consistente e completa em relação
	 * ao CSP fornecido.
	 */
	public boolean isSolution(CSP<VAR, VAL> csp) {
		return isConsistent(csp.getConstraints()) && isComplete(csp.getVariables());
	}

	@SuppressWarnings("unchecked")
	@Override
	public Assignment<VAR, VAL> clone() {
		Assignment<VAR, VAL> result;
		try {
			result = (Assignment<VAR, VAL>) super.clone();
			result.variableToValueMap = new LinkedHashMap<>(variableToValueMap);
		} catch (CloneNotSupportedException e) {
			throw new UnsupportedOperationException("Could not clone assignment."); // should never happen!
		}
		return result;
	}

//	Exibir a agenda do estudante
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder("\n");

		int hora = 12;

		boolean min = true;

		String tmp;
		result.append("HORARIO:" + "\t");
		for (Map.Entry<VAR, VAL> entry : variableToValueMap.entrySet()) {

			if (result.length() > 1) {
				result.append(entry.getKey()).append("\t\t");
			}

		}

		for (int i = 0; i < 21; i++) {

			if (i % 2 == 0)
				hora++;

			tmp = min ? hora + ":00" : hora + ":30";

			result.append("\n");

			result.append(tmp + " \t\t");

			for (Map.Entry<VAR, VAL> entry : variableToValueMap.entrySet()) {

				if (result.length() > 1)
					result.append(entry.getValue()).append("     \t");

			}

			min = !min;

		}

		result.append("\n");

		return result.toString();
	}

}