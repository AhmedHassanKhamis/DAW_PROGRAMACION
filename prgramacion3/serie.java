package prgramacion3;

import java.time.LocalDate;

public class serie extends material {

	int temporadas;
	boolean posiblidadnueva;
	
	
	public serie(int codigo, String nombre, LocalDate fechaestreno, String categoria,int temporadas,boolean posibilidadnueva) {
		super(codigo, nombre, fechaestreno, categoria);
		this.temporadas = temporadas;
		this.posiblidadnueva = posibilidadnueva;
	}

	

	public serie(int codigo, String nombre, String fechaestrenoString, String categoria, int temporadas,
			boolean posiblidadnueva) {
		super(codigo, nombre, fechaestrenoString, categoria);
		this.temporadas = temporadas;
		this.posiblidadnueva = posiblidadnueva;
	}



	public int getNumerotemporadas() {
		return temporadas;
	}


	public void setNumerotemporadas(int temporadas) {
		this.temporadas = temporadas;
	}


	public boolean isPosiblidadnueva() {
		return posiblidadnueva;
	}


	public void setPosiblidadnueva(boolean posiblidadnueva) {
		this.posiblidadnueva = posiblidadnueva;
	}


	@Override
	public String toString() {
		return "serie [numerotemporadas=" + temporadas + ", posiblidadnueva=" + posiblidadnueva + ", codigo="
				+ codigo + ", nombre=" + nombre + ", fechaestreno=" + fechaestreno + ", categoria=" + categoria + "]";
	}
	
	
	
}
