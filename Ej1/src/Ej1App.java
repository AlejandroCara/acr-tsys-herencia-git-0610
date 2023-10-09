
public class Ej1App {

	public static void main(String[] args) {
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Lavadora(300, "blanco",'A',35, 60);
        electrodomesticos[1] = new Television(42, true, 500, "negro", 'B', 15);
        electrodomesticos[2] = new Lavadora(250, 25);
        electrodomesticos[3] = new Television(32, false, 200, "gris", 'C', 10);
        electrodomesticos[4] = new Lavadora(400, "rojo", 'D', 67,70);
        electrodomesticos[5] = new Television(50, true, 700, "azul", 'E', 50);
        electrodomesticos[6] = new Lavadora(150, "negro",'B', 53, 5);
        electrodomesticos[7] = new Television(60, false, 350, "blanco", 'F', 30);
        electrodomesticos[8] = new Electrodomestico(120, "azul", 'B', 35);
        electrodomesticos[9] = new Electrodomestico(80, 8);

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisiones = 0;
        double precioTotal=0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
        	
            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Television) {
                precioTotalTelevisiones += electrodomestico.precioFinal();
            }
            else{precioTotalElectrodomesticos += electrodomestico.precioFinal();}
            precioTotal+=electrodomestico.precioFinal();
        }

        System.out.println("Precio total de Electrodomesticos: " + precioTotalElectrodomesticos);
        System.out.println("Precio total de Lavadoras: " + precioTotalLavadoras);
        System.out.println("Precio total de Televisiones: " + precioTotalTelevisiones);
        System.out.println("Precio total de Televisiones: " + precioTotal);

    
	}

}
