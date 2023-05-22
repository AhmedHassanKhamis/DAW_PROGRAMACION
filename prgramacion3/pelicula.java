package prgramacion3;

import java.time.LocalDate;

public class pelicula extends material{
	String actor;

	public pelicula(int codigo, String nombre, LocalDate fechaestreno, String categoria,String actor) {
		super(codigo, nombre, fechaestreno, categoria);
		this.actor = actor;
	}

	public pelicula(int codigo, String nombre, String fechaestrenoString, String categoria, String actor) {
		super(codigo, nombre, fechaestrenoString, categoria);
		this.actor = actor;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	

	@Override
	public String toString() {
		return "pelicula [actor=" + actor + ", codigo=" + codigo + ", nombre=" + nombre + ", fechaestreno="
				+ fechaestreno + ", categoria=" + categoria + "]";
	}
	
	

}
