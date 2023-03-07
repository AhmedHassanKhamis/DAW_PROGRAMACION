package Libro;

public class Libro {

	String isbn;
	String titulo;
	String autor;
	int numeropaginas;
	
	
	public Libro(String isbn, String titulo, String autor, int numeropaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeropaginas = numeropaginas;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
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


	public int getNumeropaginas() {
		return numeropaginas;
	}


	public void setNumeropaginas(int numeropaginas) {
		this.numeropaginas = numeropaginas;
	}


	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeropaginas=" + numeropaginas
				+ "]";
	}
	
	
	
	
	
	
	
}
