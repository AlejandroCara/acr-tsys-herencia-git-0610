
public class Pelicula {
	
	private String titulo = "";
	private int duracion = 0;
	private int edadMinimaRecomendada = 0;
	private String director = "";
	
	public Pelicula(String titulo, int duracion, int edadMinimaRecomendada, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinimaRecomendada = edadMinimaRecomendada;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getEdadMinimaRecomendada() {
		return edadMinimaRecomendada;
	}

	public String getDirector() {
		return director;
	}
	
	
}
