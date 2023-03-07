package cine;

public class Main {

	public static void main(String[] args) {
		
		Espectador espectador1 = new Espectador("ramon", 19, 1000);
		Pelicula pelicula1  = new Pelicula("El señor de los gramillos", 90, 15, "ibaillanos");
		Sala sala1 = new Sala(pelicula1,15);
		
		
		
		
		if (sala1.admitido(espectador1)) {
			sala1.asignarAsiento(espectador1, 8, 'A');
		}
		System.out.println(sala1.mostrarAsientos());
		System.out.println(espectador1.getDinero());

	}

}
