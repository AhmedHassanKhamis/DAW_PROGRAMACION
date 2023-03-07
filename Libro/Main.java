package Libro;

public class Main {

	public static void main(String[] args) {

		Libro libro1 = new Libro ("1a","rapuncel","cervantes",50);
		Libro libro2 = new Libro ("2a","Odisea","cervantes",500);
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		Libro mayor = (libro1.getNumeropaginas() > libro2.getNumeropaginas()?libro1:libro2);
		
		System.out.println("el mas grande es:\n"+mayor);
		
	}

}
