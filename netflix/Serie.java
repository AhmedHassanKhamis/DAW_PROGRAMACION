package netflix;

import java.time.LocalDate;
import java.util.TreeMap;

public class Serie extends Material{

	int temporadasprevistas;
	boolean posibilidadtemporada;
	
	
	public Serie(int codigo, String nombre, LocalDate fechaestreno, Categoria categoria, int temporadasprevistas,
			boolean posibilidadtemporada) {
		super(codigo, nombre, fechaestreno, categoria);
		this.temporadasprevistas = temporadasprevistas;
		this.posibilidadtemporada = posibilidadtemporada;
	}


	public int getTemporadasprevistas() {
		return temporadasprevistas;
	}


	public boolean isPosibilidadtemporada() {
		return posibilidadtemporada;
	}
	
	public void temporadasmasdos() {
		this.temporadasprevistas += 2;
	}
	


	@Override
	public String toString() {
		return "Serie [codigo=" + codigo + ", nombre=" + nombre + ", fechaestreno=" + fechaestreno + ", categoria="
				+ categoria + ", temporadasprevistas=" + temporadasprevistas + ", posibilidadtemporada="
				+ posibilidadtemporada + "]";
	}
	
	
	
	
}
