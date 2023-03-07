package cine;

public class Pelicula {

	String titulo;
	int duracion;
	int edad;
	String director;
	
	
	public Pelicula(String titulo, int duracion, int edad, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad = edad;
		this.director = director;
	}


	public String getTitulo() {
		return titulo;
	}


	public int getDuracion() {
		return duracion;
	}


	public int getEdad() {
		return edad;
	}


	public String getDirector() {
		return director;
	}


	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", edad=" + edad + ", director=" + director
				+ "]";
	}
	
	
	
	
	
	
	
}
