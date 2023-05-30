package deportistas;

import java.time.LocalDate;

public class Ciclista extends Deportista{
	
	String nombreprueba;
	int numeroetapas;
	int puestoclasificacion;
	int etapasganadas;

	public Ciclista(String dni, String nombre, LocalDate fechanacimiento, String nombreprueba, int numeroetapas,
			int puestoclasificacion, int etapasganadas) {
		super(dni, nombre, fechanacimiento);
		this.nombreprueba = nombreprueba;
		this.numeroetapas = numeroetapas;
		this.puestoclasificacion = puestoclasificacion;
		this.etapasganadas = etapasganadas;
	}

	public String getNombreprueba() {
		return nombreprueba;
	}

	public int getNumeroetapas() {
		return numeroetapas;
	}

	public int getPuestoclasificacion() {
		return puestoclasificacion;
	}

	public int getEtapasganadas() {
		return etapasganadas;
	}

	@Override
	public String toString() {
		return "ciclista [dni=" + dni + ", nombre=" + nombre + ", fechanacimiento=" + fechanacimiento
				+ ", nombreprueba=" + nombreprueba + ", numeroetapas=" + numeroetapas + ", puestoclasificacion="
				+ puestoclasificacion + ", etapasganadas=" + etapasganadas + "]\n";
	}
	
	
	
	
	
	
	
	
	

}
