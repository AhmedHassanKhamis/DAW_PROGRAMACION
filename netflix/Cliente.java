package netflix;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

public class Cliente {
	int nif;
	String nombre;
	int cuota;
	Direccion direccion;
	ArrayList<Visualizacion> visualizaciones;
	
	
	public Cliente(int nif, String nombre, int cuota, Direccion direccion) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.cuota = cuota;
		this.direccion = direccion;
		this.visualizaciones = new ArrayList<>();
	}


	public int getNif() {
		return nif;
	}


	public String getNombre() {
		return nombre;
	}


	public int getCuota() {
		return cuota;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public ArrayList<Visualizacion> getVisualizaciones() {
		return visualizaciones;
	}
	
	public void realizarvisualizacion(int num,TreeMap<Integer, Material> materiales) {
		LocalDate hoy = LocalDate.now();
		Visualizacion visualizacion = new Visualizacion(hoy, materiales.get(num));
		this.visualizaciones.add(visualizacion);
	}


	@Override
	public String toString() {
		return "clientes [nif=" + nif + ", nombre=" + nombre + ", cuota=" + cuota + ", direccion=" + direccion
				+ ", visualizaciones=" + visualizaciones + "]";
	}
	
	
	
	
	
	
	
}
