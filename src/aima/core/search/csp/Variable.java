package aima.core.search.csp;

/**
 * A variable is a distinguishable object with a name.
 * 
 * Uma variável é um objeto distinguível com um nome.
 *
 * @author Ruediger Lunde
 */

public class Variable {
	
	 private final String name;

	    public Variable(String name) {
	        this.name = name;
	    }

	    public final String getName() {
	        return name;
	    }

	    public String toString() {
	        return name;
	    }

	    /** Variables with equal names are equal. */
	    @Override
	    public final boolean equals(Object obj) {
	        return (obj != null && obj.getClass() == getClass()) && name.equals(((Variable) obj).name);
	    }

	    @Override
	    public final int hashCode() {
	        return name.hashCode();
	    }
	}



	
//	private final String diaSemana;
//	
//	private Horario[] horario = new Horario[20];
//
//	public Variable(String name) {
//		this.diaSemana = name;
//		for (int i = 0; i < horario.length; i++) {
//			horario[i].setHoraAula(i);
//			horario[i].setAtividade("Vago");
//			horario[i].setCargaHoraria(0);
//		}
//
//	}
//
//	public String toString() {
//		return diaSemana;
//	}
//
//	public String getHorario(int i) {
//		return horario[i].getAtividade();
//	}
//
//	/** Variables with equal names are equal. */
//	@Override
//	public final boolean equals(Object obj) {
//		return (obj != null && obj.getClass() == getClass()) && diaSemana.equals(((Variable) obj).diaSemana);
//	}
//
//	@Override
//	public final int hashCode() {
//		return diaSemana.hashCode();
//	}
//
////    metodos get
//	public final String getDiaSemana() {
//		return diaSemana;
//	}
//
//
//
//}
