
public class Lavadora extends Electrodomestico{

	private static final double DEF_CARGA = 5;
	
	private double carga;
	
	public Lavadora() {
		super();
		this.carga = DEF_CARGA;
	}
	
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = DEF_CARGA;
	}
	
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super( precioBase, color, consumoEnergetico, peso);
		this.carga = DEF_CARGA;
	}
	
	public Double getCarga() {
		return carga;
	}
	
	@Override
	public double precioFinal() {
		double precio = super.precioFinal();

        if (carga > 30) {
        	precio += 50;
        }

        return precio;
	}
}
