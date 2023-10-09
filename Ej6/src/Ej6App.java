
public class Ej6App {

	public static void main(String[] args) {
        // Crear una película
        Pelicula pelicula = new Pelicula("Titanic", 180, 12, "James Cameron");

        // Crear un cine con la película y precio de entrada
        Cine cine = new Cine(pelicula, 10.0);

        // Crear espectadores
        Espectador espectador1 = new Espectador("Alice", 14, 15.0);
        Espectador espectador2 = new Espectador("Bob", 18, 8.0);
        Espectador espectador3 = new Espectador("Charlie", 22, 12.0);

        // Sentar espectadores en el cine
        cine.sentarEspectador(espectador1);
        cine.sentarEspectador(espectador2);
        cine.sentarEspectador(espectador3);

        // Verificar el estado de los asientos después de sentar a los espectadores
        System.out.println("Estado de los asientos después de sentar a los espectadores:");
        for (int fila = 0; fila < cine.getFilas(); fila++) {
            for (int columna = 0; columna < cine.getColumnas(); columna++) {
                Asiento asiento = cine.getAsientos(fila, columna);
                System.out.print(asiento.isOcupado() ? "X " : "O ");
            }
            System.out.println();
        }
    }

}
