package prgramacion3;

public class cliente {
	int nif;
	String nombre;
	int cuota;
	direccion direccion;
	
	
	public cliente(int nif, String nombre, int cuota, direccion direccion) {
		this.nif = nif;
		this.nombre = nombre;
		this.cuota = cuota;
		this.direccion = direccion;
	}

	
	public int getNif() {
		return nif;
	}


	public void setNif(int nif) {
		this.nif = nif;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCuota() {
		return cuota;
	}


	public void setCuota(int cuota) {
		this.cuota = cuota;
	}


	public direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(direccion direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "cliente [nif=" + nif + ", nombre=" + nombre + ", cuota=" + cuota + ", direccion=" + direccion + "]";
	}
	
	
	
}
