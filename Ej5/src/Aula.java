
import java.util.ArrayList;

public class Aula {
	
	private final int MAXESTUDIANTES = 10;
	
	private int id = 0;
	private static int idGen = 0;
	private Ej5App.materias materia;
	private Profesor profesor;
	private ArrayList<Estudiante> alumnos = new ArrayList<Estudiante>();
	
	public Aula(Profesor profe) {
		this.id = Aula.idGen;
		this.profesor = profe;
		Aula.idGen++;
	}
	
	public void addEstudiante(Estudiante estudiante) {
		if(alumnos.size() < MAXESTUDIANTES) {
			alumnos.add(estudiante);
		}
	}
	
	public boolean isDarClase() {
		return profesor.estarPresente();
	}
	
	
}
