
public class Cine {
	private static final int DEF_FILAS = 8;
	private static final int DEF_COLUMNAS = 9;
	
	private Pelicula pelicula;
	private double precio;
	private int filas;
	private int columnas;
	private Asiento[][] asientos;
	
	
	public Cine(Pelicula pelicula, double precio) {
		this.filas = DEF_FILAS;
		this.columnas = DEF_COLUMNAS;
		this.pelicula = pelicula;
		this.precio = precio;
		asientos = new Asiento[this.filas][this.columnas];
		
		for (int fila = 0; fila < this.filas; fila++) {
            char letra = 'A';
            for (int columna = 0; columna < this.columnas; columna++) {
                //asientos[fila][columna] = new Asiento(fila + 1, letra++);
            }
        }
	}
	/*public void sentarEspectador(Espectador espectador) {
		Random rand = new Random();
		while (true) {
            int fila = rand.nextInt(this.filas);
            int columna = rand.nextInt(this.columnas);

            Asiento asiento = asientos[fila][columna];
            
            if (!asiento.isOcupado() && espectador.cumpleRequisitos(pelicula, precio)) {
                asiento.ocupar();
                System.out.println(espectador.getNombre() + " ha ocupado el asiento: " + asiento.getFila() + asiento.getColumna());
                return;
            }

            if (!espectador.cumpleRequisitos(pelicula, precio)) {
                System.out.println(espectador.getNombre() + " no ha ocupado ningún asiento, no cumple con los requisitos: Edad mínima " + pelicula.getEdadMinima() + "/" + espectador.getEdad() + ", Dinero disponible " + precio + "/" + espectador.getDinero());
                return;
            }
        }
	}*/
}
