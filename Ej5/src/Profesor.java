import Electrodomestico.colors;

public class Profesor extends Persona{

	private enum materias {matematicas, filosofia, fisica};
	private Integer disponible;
	
	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = checkMateria(materia);
		this.disponible = 20;
	}
	
	public boolean estarPresente() {
		Random random = new Random();
		return random.nextDouble()<0.2;
	}
	
	private materias checkMateria(String materia) {
	    String tmpMater = materia.toLowerCase();
	    for (materias mater : materias.values()) {
	    	 if (mater.equals(tmpMater)) {
	    		 return mater;
	    	 }
	    }
	    return materias.matematicas;
	}
}
