
public class Espectador {

	private String nombre;
	private Integer edad;
	private Double dinero;
	
	public Espectador() {
		this.nombre = "";
		this.edad = 0;
		this.dinero = 0.0;
	}
	
	public Espectador(String nombre, Integer edad, Double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getDinero() {
		return dinero;
	}
	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}
	
	public boolean cumpleRequisitos(Pelicula peli, Double precio) {
		if(precio<=dinero && peli.getEdadMinimaRecomendada()<edad) {
			return true;
		}else {
			return false;
		}
	}
}
