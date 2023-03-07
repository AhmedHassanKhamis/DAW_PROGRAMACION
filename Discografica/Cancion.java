package Discografica;

public class Cancion {

	String titulo;
	String autor;
	
	
	public Cancion(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}


	public Cancion() {
		this.titulo = "";
		this.autor = "";
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "\nCancion\ntitulo: " + titulo + "\nautor: " + autor+"\n---------------------------------";
	}
	
	
	
	
	
	
}
