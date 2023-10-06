public class Ej4App {

	public static void main(String[] args) {
        Raices raices = new Raices(1, -5, 6); //Ecuacion de: x^2 - 5x + 6 = 0
        raices.calcular();
        
        if (raices.tieneRaices()) {
            System.out.println("La ecuacion tiene al menos una raiz real.");
        } else {
            System.out.println("La ecuacion no tiene raices reales.");
        }

        if (raices.tieneRaiz()) {
            System.out.println("La ecuacion tiene una unica raiz real.");
        } else {
            System.out.println("La ecuacion no tiene una unica raiz real.");
        }
    }

}
