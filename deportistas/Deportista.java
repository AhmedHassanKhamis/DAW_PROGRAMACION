package deportistas;

import java.time.LocalDate;
import java.util.Comparator;


public class Deportista implements Comparable<Deportista> {

	String dni;
	String nombre;
	LocalDate fechanacimiento;
	
	
	public Deportista() {
		
	}
	
	public Deportista(String dni, String nombre, LocalDate fechanacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechanacimiento = fechanacimiento;
	}




	public String getDni() {
		return dni;
	}




	public String getNombre() {
		return nombre;
	}




	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}




	@Override
	public int compareTo(Deportista o) {
		return this.nombre.compareTo(o.getNombre());
	}




	@Override
	public String toString() {
		return "deportista [dni=" + dni + ", nombre=" + nombre + ", fechanacimiento=" + fechanacimiento + "]\n";
	}
	
	
	
	
}
