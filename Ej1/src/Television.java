
public class Television extends Electrodomestico{
	private static final int RESOLUCION_DEFECTO = 20;
    private static final boolean SINTONIZADOR_TDT_DEFECTO = false;
    
	private int resolucion;
    private boolean sintonizadorTDT;
    
    
    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_TDT_DEFECTO;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_TDT_DEFECTO;
    }

    public Television(int resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    public int getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal() {
        double precio = super.precioFinal();

        if (resolucion > 40) {
        	precio += (super.getPrecioBase()/100)*30;
        }

        if (sintonizadorTDT) {
        	precio += 50;
        }

        return precio;
    }
}
