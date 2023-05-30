package netflix;

import java.time.LocalDate;

public class Visualizacion {
	LocalDate fechavisualizacion;
	Material material;
	public Visualizacion(LocalDate fechavisualizacion, Material material) {
		super();
		this.fechavisualizacion = fechavisualizacion;
		this.material = material;
	}
	public LocalDate getFechavisualizacion() {
		return fechavisualizacion;
	}
	public Material getMaterial() {
		return material;
	}
	
	
	@Override
	public String toString() {
		return "Visualizacion [fechavisualizacion=" + fechavisualizacion + ", material=" + material + "]";
	}
	
	
	
	
}
