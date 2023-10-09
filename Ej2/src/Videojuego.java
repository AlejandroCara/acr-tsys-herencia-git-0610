
public class Videojuego implements Entregable{

	private static final Integer DEF_HORAS = 10;
	
	private String titulo;
	private Integer horasEstimadas;
	private Boolean entregado; 
	private String genero; 
	private String company; 

	public Videojuego() {
		titulo="";
		horasEstimadas = DEF_HORAS;
		entregado = false;
		genero = "";
		company ="";
	}
	
	public Videojuego(String titulo, Integer horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		entregado = false;
		genero = "";
		company ="";
	}
	
	public Videojuego(String titulo, Integer horasEstimadas, String genero, String company) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		entregado = false;
		this.genero = genero;
		this.company = company;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void entregar() {
		this.entregado = true;
	
}

	@Override
	public void devolver() {
		this.entregado = false;
	
}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	
	@Override
	public int compareTo(Object objeto) {
	// TODO Auto-generated method stub
	return Integer.compare(this.horasEstimadas, ((Videojuego)objeto).horasEstimadas);
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", company=" + company + "]";
	}
}
