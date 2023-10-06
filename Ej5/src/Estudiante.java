import java.util.Random;
public class Estudiante extends Persona{//La clase de Estudiante viene de Persona
	private double calificacionActual;//Atributo de calificacion y despues los otros l�mintes que se pueden llegar
	private static final double CALIFICACION_MINIMA = 0;
    private static final double CALIFICACION_MAXIMA = 10;
    
	public Estudiante(String nombre, int edad, char sexo, double calificacionActual) {
		super(nombre,edad,sexo);
		if(calificacionActual>=CALIFICACION_MINIMA&&calificacionActual<=CALIFICACION_MAXIMA) {//Aqui represneta ques si la nota esta en el rango de la minima y maxima, se validara, si no, sera un 0
			this.calificacionActual=calificacionActual;
		}
		else {
			this.calificacionActual=CALIFICACION_MINIMA;
		}
	}

	public double getCalificacionActual() {//Getter de atributo calificacionActual
		return calificacionActual;
	}

	public boolean estarPresente() {//Metodo abstracto que devolvera true o false dependiendo si el estudiante esta o no por prohabilidad del 50%
		Random random = new Random();
		return random.nextDouble()<0.5;
	}
	
	public boolean estaAprobado() {
		return this.calificacionActual>5.0;
	}
}
