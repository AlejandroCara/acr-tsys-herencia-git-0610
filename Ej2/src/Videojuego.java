
public class Videojuego implements Entregable{

	private static final Integer DEF_HORAS = 10;
	
	private String titulo;
	private Integer horasEstimadas;
	private Boolean entregado; 
	private String genero; 
	private String compañia; 

	public Videojuego() {
		titulo="";
		horasEstimadas = DEF_HORAS;
		entregado = false;
		genero = "";
		compañia ="";
	}
	
	public Videojuego(String titulo, Integer horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		entregado = false;
		genero = "";
		compañia ="";
	}
	
	public Videojuego(String titulo, Integer horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		entregado = false;
		genero = genero;
		compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(Integer horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public void entregar() {
	// TODO Auto-generated method stub
	
}

	@Override
	public void devolver() {
	// TODO Auto-generated method stub
	
}

	@Override
	public boolean isEntregado() {
	// TODO Auto-generated method stub
	return false;
	}
	
	@Override
	public integer compareTo() {
	// TODO Auto-generated method stub
	return Integer.compare(, 0);
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}
}
