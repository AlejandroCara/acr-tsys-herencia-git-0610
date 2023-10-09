
public class Ej6App {

	public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Titanic", 180, 12, "James Cameron");
        
        Cine cine = new Cine(pelicula, 10.0);
        
        Asiento[][] asientos = cine.getAsientos();

        Espectador espectador1 = new Espectador("Alice", 14, 15.0);
        Espectador espectador2 = new Espectador("Bob", 18, 8.0);
        Espectador espectador3 = new Espectador("Charlie", 22, 12.0);

        cine.sentarEspectador(espectador1);
        cine.sentarEspectador(espectador2);
        cine.sentarEspectador(espectador3);

        System.out.println("Estado de los asientos despues de sentar a los espectadores: \n");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j].isOcupado() ? "X " : "O ");
            }
            System.out.println();
        }
    }

}
