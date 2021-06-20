package aima.core.search.csp;

import java.util.List;

/**
 * A constraint specifies the allowable combinations of values for a set of
 * variables. Each constraint consists of a pair <scope, rel>, where scope is a
 * tuple of variables that participate in the constraint and rel is a relation
 * that defines the values that those variables can take on.
 * 
 * Uma restrição especifica as combinações permitidas de valores para um conjunto de variáveis. 
 * Cada restrição consiste em um par <scope, rel>, 
 * onde escopo é uma tupla de variáveis que participam da restrição 
 * e rel é uma relação que define os valores que essas variáveis podem assumir.
 * 
 * <b>Note:</b> 
 * Implementations of this interface define the different kinds of relations that constraints can represent.
 * 
 * As implementações dessa interface definem os diferentes tipos de relações que as restrições podem representar.
 * 
 * @author Ruediger Lunde
 */
public interface Constraint<VAR extends Variable, VAL> {
	/** Returns a tuple of variables that participate in the constraint. */
	List<VAR> getScope();

	/** Constrains the values that the variables can take on. */
	boolean isSatisfiedWith(Assignment<VAR, VAL> assignment);
}