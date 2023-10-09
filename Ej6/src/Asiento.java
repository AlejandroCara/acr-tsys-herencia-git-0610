
public class Asiento {
	
	private Integer fila;
	private char columna;
	private boolean ocupado;
	
	public Asiento() {
		this.columna = 'A';
		this.fila = 0;
		this.ocupado = false;
	}
	
	public Asiento(Integer fila, char columna, Boolean ocupado) {
		this.columna = columna;
		this.fila = fila;
		this.ocupado = ocupado;
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
	
	/*public Integer checkColumna(Integer columna) {
		if(MIN_FILA<=columna || MAX_FILA>=columna) {
			return columna;
		}else {
			return 0;
		}
	}*/
	
	/*public char checkFila(char fila) {
		if(MIN_FILA<=columna || MAX_FILA>=columna) {
			return columna;
		}else {
			return 'A';
		}
	}*/
}
