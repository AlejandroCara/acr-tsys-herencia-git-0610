import java.util.Iterator;

public class Ej2App {

	public static void main(String[] args) {

		Serie[] series = new Serie[10];
		Videojuego[] videojuegos = new Videojuego[10];
		Videojuego maxHoras;
		Serie maxTemporadas;
		int seriesEntregadas = 0;
		int videojuegosEntregados = 0;
		
		
		series[0] = new Serie("Simpson", 25, "Comedia", "Alguien");
		series[1] = new Serie("SinShan", 26, "Comedia", "Alguien2");
		series[2] = new Serie("Dragon Ball", 5, "Accion", "Akira Toriyama");
		series[3] = new Serie("One Piece", 20, "Accion", "Eiichirō Oda");
		series[4] = new Serie("Señor de los Anillos: los anillos de poder", 1, "Fantasia", "Alguien3");
		series[5] = new Serie("Juego de Tronos", 7, "Fantasia", "Alguien4");
		series[6] = new Serie("Pokemon", 25, "Aventura", "Alguien5");
		series[7] = new Serie("Digimon", 3, "Aventura", "Alguien6");
		series[8] = new Serie("Medabots", 2, "Accion", "Alguien7");
		series[9] = new Serie("Breaking Bad", 5, "Drama", "Alguien8");

		videojuegos[0] = new Videojuego("Baldur's Gate", 98, "RPG", "Larian Studios");
		videojuegos[1] = new Videojuego("Dark Souls", 56, "RPG", "FromSoftware");
		videojuegos[2] = new Videojuego("Elden Ring", 110, "RPG", "FromSoftware");
		videojuegos[3] = new Videojuego("Pokemon Esmeralda", 35, "RPG", "Game Freak");
		videojuegos[4] = new Videojuego("Age of Empires II", 80, "RTS", "EA");
		videojuegos[5] = new Videojuego("Battlefield 3", 22, "Shooter", "ElectronicArts");
		videojuegos[6] = new Videojuego("Borderlands", 60, "Shooter Looter", "GearStudios");
		videojuegos[7] = new Videojuego("The Witcher III", 80, "RPG", "CD Project RED");
		videojuegos[8] = new Videojuego("Terraria", 75, "Sandbox", "Re-Logic");
		videojuegos[9] = new Videojuego("Blasphemous", 25, "Metroidvania", "FromSoftware");
		
		series[3].entregar();
		series[5].entregar();
		series[6].entregar();
		
		videojuegos[2].entregar();
		videojuegos[0].entregar();
		videojuegos[8].entregar();
		
		
		maxTemporadas = series[0];
		maxHoras = videojuegos[0];
		
		for(int i = 0; i < series.length; i++) {
			
			if(series[i].isEntregado()) {
				seriesEntregadas++;
				System.out.println(series[i]);
			}
			
			if(series[i].compareTo(maxTemporadas) == 1) {
				maxTemporadas = series[i];
			}
			
			if(videojuegos[i].isEntregado()) {
				videojuegosEntregados++;
				System.out.println(videojuegos[i]);
			}
			
			if(videojuegos[i].compareTo(maxHoras) == 1) {
				maxHoras = videojuegos[i];
			}
		}
		
		System.out.println("\n\n\n");
		System.out.println("Numero de series entregadas: " + seriesEntregadas);
		System.out.println("Numero de videojuegos entregados: " + videojuegosEntregados);
		System.out.println("Serie con mas temporadas: " + maxTemporadas);
		System.out.println("Videojuego con mas horas estimadas: " + maxHoras);
		System.out.println("Mejor serie: " + series[3]);
		
		
		
		
	}

}
