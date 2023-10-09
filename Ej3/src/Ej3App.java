public class Ej3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro("9781234567897", "Moby Dick", "Herman Melville", 823);
		Libro libro2 = new Libro("3586855674534", "Guerra y paz", "Leon Tolstoi", 1840);

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		compareNumPags(libro1, libro2);
	}
	public static void compareNumPags(Libro libro1, Libro libro2) {
		
		int numLib1 = libro1.getNumPaginas();
		int numLib2 = libro2.getNumPaginas();
		
		if(numLib1 > numLib2) {
			System.out.println(libro1.getTitulo()+" tiene mas paginas ("+numLib1+") que "+libro2.getTitulo()+" (con solo: "+numLib2+")");
		}else {
			System.out.println(libro1.getTitulo()+" tiene mas paginas ("+numLib2+") que "+libro2.getTitulo()+" (con solo: "+numLib1+")");
		}
	}

}
