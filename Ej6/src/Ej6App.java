
public class Ej6App {

	public static void main(String[] args) {
        // Crear una pel�cula
        Pelicula pelicula = new Pelicula("Titanic", 180, 12, "James Cameron");
        
        // Crear un cine con la pel�cula y precio de entrada
        Cine cine = new Cine(pelicula, 10.0);
        
        Asiento[][] asientos = cine.getAsientos();

        // Crear espectadores
        Espectador espectador1 = new Espectador("Alice", 14, 15.0);
        Espectador espectador2 = new Espectador("Bob", 18, 8.0);
        Espectador espectador3 = new Espectador("Charlie", 22, 12.0);

        // Sentar espectadores en el cine
        cine.sentarEspectador(espectador1);
        cine.sentarEspectador(espectador2);
        cine.sentarEspectador(espectador3);

        // Verificar el estado de los asientos despu�s de sentar a los espectadores
        System.out.println("Estado de los asientos despu�s de sentar a los espectadores: \n");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j].isOcupado() ? "X " : "O ");
            }
            System.out.println();
        }
    }

}
