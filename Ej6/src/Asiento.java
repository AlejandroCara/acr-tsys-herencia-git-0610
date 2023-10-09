
public class Asiento {
	
	private char fila;
	private Integer columna;
	private boolean ocupado;
	
	public Asiento() {
		this.fila = 'A';
		this.columna = 0;
		this.ocupado = false;
	}
	
	public Asiento(char fila, Integer columna, Boolean ocupado) {
		this.fila = fila;
		this.columna = columna;
		this.ocupado = ocupado;
	}
	
	public char getFila() {
		return fila;
	}
	public void setFila(char fila) {
		this.fila = fila;
	}
	public Integer getColumna() {
		return columna;
	}
	public void setColumna(Integer columna) {
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
