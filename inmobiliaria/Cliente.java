package inmobiliaria;

import java.time.LocalDate;

public class Cliente {

	int nif;
	String nombre;
	LocalDate fechanacimiento;
	Direccion direccion;
	
	
	public Cliente(int nif, String nombre, LocalDate fechanacimiento, Direccion direccion) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.fechanacimiento = fechanacimiento;
		this.direccion = direccion;
	}


	public int getNif() {
		return nif;
	}


	public String getNombre() {
		return nombre;
	}


	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	@Override
	public String toString() {
		return "Cliente [nif=" + nif + ", nombre=" + nombre + ", fechanacimiento=" + fechanacimiento + ", direccion="
				+ direccion + "]";
	}
	
	
	
	
}
