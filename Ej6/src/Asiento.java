
public class Asiento {
	
	private Integer fila;
	private char columna;
	private boolean ocupado;
	
	public Asiento() {
		this.columna = 'A';
		this.fila = 0;
		this.ocupado = false;
	}
	
	public Asiento(Integer fila, char columna) {
		this.columna = columna;
		this.fila = fila;
		this.ocupado = false;
	}
	
	public Integer getFila() {
		return fila;
	}
	public void setFila(Integer fila) {
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	public void setColumna(char columna) {
		this.columna = columna;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
