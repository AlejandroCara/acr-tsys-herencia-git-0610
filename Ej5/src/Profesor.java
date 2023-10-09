import java.util.Random;

public class Profesor extends Persona{

	private Ej5App.materias materia;
	
	public Profesor(String nombre, int edad, char sexo, Ej5App.materias materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
	}
	
	public boolean estarPresente() {
		Random random = new Random();
		return random.nextDouble()<0.2;
	}

	public Ej5App.materias getMateria() {
		return materia;
	}

	public void setMateria(Ej5App.materias materia) {
		this.materia = materia;
	}
	
	
	
	/*private materias checkMateria(String materia) {
	    String tmpMater = materia.toLowerCase();
	    for (materias mater : materias.values()) {
	    	 if (mater.equals(tmpMater)) {
	    		 return mater;
	    	 }
	    }
	    return materias.matematicas;
	}*/
}
