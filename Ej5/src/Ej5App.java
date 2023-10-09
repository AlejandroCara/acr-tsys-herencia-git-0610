import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Ej5App {
	
	public static enum materias {matematicas, filosofia, fisica};
	
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Alice", 18, 'F', 8.5);
        Estudiante estudiante2 = new Estudiante("Bob", 20, 'M', 7.2);
        Estudiante estudiante3 = new Estudiante("Charlie", 19, 'M', 6.8);
        
        
		Profesor profesor1 = new Profesor("A", 0, 'h', materias.fisica);
		
        Aula aula = new Aula(profesor1, materias.filosofia);
        aula.addEstudiante(estudiante1);
        aula.addEstudiante(estudiante2);
        System.out.println("Estado del aula:");
        boolean darClase=aula.isDarClase();
        System.out.println("Profesor presente: " + darClase);
        //System.out.println("Numero de estudiantes: " + aula.getNumEstudiantes());
        
        if (darClase) {
            System.out.println("Se puede dar clase en esta aula.");
        } else {
            System.out.println("No se puede dar clase en esta aula.");
        }
        aula.addEstudiante(estudiante3);
        aula.addEstudiante(new Estudiante("David", 22, 'M', 7.0));
        System.out.println("Estado del aula despues de agregar mas estudiantes:");
        System.out.println("Profesor presente: " + aula.isDarClase());
        //System.out.println("Numero de estudiantes: " + aula.getNumEstudiantes());
        
        // Contar estudiantes aprobados
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        
        showEstudiantes(estudiantes);
        
        /*int aprobadosMujeres = contarAprobadosPorGenero(estudiantes, 'F');
        int aprobadosHombres = contarAprobadosPorGenero(estudiantes, 'M');
        
        System.out.println("Estudiantes aprobados (mujeres): " + aprobadosMujeres);
        System.out.println("Estudiantes aprobados (hombres): " + aprobadosHombres);*/
	}
	
	public static void showEstudiantes(List<Estudiante> alumnado) {
		
		Iterator it = alumnado.iterator();
		
		Estudiante tmpEst;
		
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		ArrayList<Estudiante> estudiantas= new ArrayList<Estudiante>();
		
		while(it.hasNext()) {
			tmpEst = (Estudiante)it.next();
			
			if(tmpEst.estaAprobado()) {
				if(tmpEst.getSexo()=='M') {
					estudiantes.add(tmpEst);
				}else {
					estudiantas.add(tmpEst);
				}
			}
		}
		
		it = estudiantes.iterator();
		String tmpName = "";
		double tmpNote = 0;
		
		System.out.println("ALUMNOS APROVADOS: "+estudiantas.size());
		
		while(it.hasNext()) {
			
			tmpEst = (Estudiante)it.next();
			 tmpName = tmpEst.getNombre();
			 tmpNote = tmpEst.getCalificacionActual();
			
			System.out.println("El alumno "+tmpName+" esta aprobado con una calificación de: "+tmpNote);
		}
		
		it = estudiantas.iterator();
		
		System.out.println("ALUMNAS APROVADAS: "+estudiantas.size());
		
		while(it.hasNext()) {
			
			tmpEst = (Estudiante)it.next();
			 tmpName = tmpEst.getNombre();
			 tmpNote = tmpEst.getCalificacionActual();
			
			System.out.println("La alumna "+tmpName+" esta aprobada con una calificación de: "+tmpNote);
		}
		
	}
	
	/*public static int contarAprobadosPorGenero(List<Estudiante> estudiantes, char genero) {
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSexo() == genero && estudiante.getCalificacionActual() >= 5.0) {
                contador++;
            }
        }
        return contador;
    }*/

}
