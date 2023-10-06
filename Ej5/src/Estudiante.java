import java.util.Random;
public class Estudiante extends Persona{
	private double calificacionActual;
	private static final double CALIFICACION_MINIMA = 0;
    private static final double CALIFICACION_MAXIMA = 10;
    
	public Estudiante(String nombre, int edad, char sexo, double calificacionActual) {
		super(nombre,edad,sexo);
		if(calificacionActual>=CALIFICACION_MINIMA&&calificacionActual<=CALIFICACION_MAXIMA) {
			this.calificacionActual=calificacionActual;
		}
		else {
			this.calificacionActual=CALIFICACION_MINIMA;
		}
	}

	public double getCalificacionActual() {
		return calificacionActual;
	}
	
	public boolean estarPresente() {
		Random random = new Random();
		return random.nextDouble()<0.5;
	}
}
