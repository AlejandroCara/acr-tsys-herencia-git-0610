
public class Electrodomestico {
	
	private double precioBase = 100;
	private String color = "blanco";
	private char consumoEnergetico = 'F';
	private double peso = 5;
	
	public Electrodomestico() {
		
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
			case 'A':
				this.consumoEnergetico = letra;
				break;
			case 'B':
				this.consumoEnergetico = letra;
				break;
			case 'C':
				this.consumoEnergetico = letra;
				break;
			case 'D':
				this.consumoEnergetico = letra;
				break;
			case 'E':
				this.consumoEnergetico = letra;
				break;
			case 'F':
				this.consumoEnergetico = letra;
				break;
			default:
				break;
		}
	}
	
	private void comprobarColor(String color) {
		switch (color.toLowerCase()) {
			case "blanco":
				this.color = color.toLowerCase();
				break;
			case "negro":
				this.color = color.toLowerCase();
				break;
			case "rojo":
				this.color = color.toLowerCase();
				break;
			case "azul":
				this.color = color.toLowerCase();
				break;
			case "gris":
				this.color = color.toLowerCase();
				break;
			default:
				break;
		}
	}
	
	public int precioFinal() {
		int total = 0;
		
		switch (this.consumoEnergetico) {
			case 'A':
				total += 100;
				break;
			case 'B':
				total += 80;
				break;
			case 'C':
				total += 60;
				break;
			case 'D':
				total += 50;
				break;
			case 'E':
				total += 30;
				break;
			case 'F':
				total += 10;
				break;
			default:
				break;
		}
		
		if(this.peso >= 0 && this.peso <= 19) {
			total += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			total += 50;
		} else if(this.peso >= 50 && this.peso <= 79) {
			total += 80;
		} else {
			total += 100;
		}
		
		return total;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
	
}
