
import java.util.ArrayList;

public class Aula {
	
	private final int MAXESTUDIANTES = 10;
	
	private int id = 0;
	private static int idGen = 0;
	private Ej5App.materias materia;
	private Profesor profesor;
	private ArrayList<Estudiante> alumnos = new ArrayList<Estudiante>();
	
	public Aula(Profesor profe, Ej5App.materias materia) {
		this.id = Aula.idGen;
		this.profesor = profe;
		this.materia = materia;
		Aula.idGen++;
	}

	public void addAlumno(Estudiante estudiante) {
		if(alumnos.size() < MAXESTUDIANTES) {
			alumnos.add(estudiante);
		}
	}

	public boolean isDarClase() {
		return profesor.estarPresente() && (profesor.getMateria()==materia) && alumnos.size() > Math.floor(MAXESTUDIANTES/2);
	}

	public int getMaxEstudiantes() {
		return MAXESTUDIANTES;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Profesor getProfesor() {
		return this.profesor;
	}
	
	public Ej5App.materias getMateria(){
		return this.materia;
	}
	
	public void setMateria(Ej5App.materias materia) {
		this.materia = materia;
	}
	
	public ArrayList<Estudiante> getAlumnos(){
		return this.alumnos;
	}
}
