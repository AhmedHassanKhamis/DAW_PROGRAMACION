package netflix;

import java.time.LocalDate;

public class Material implements Comparable<Material>{

	int codigo;
	String nombre;
	LocalDate fechaestreno;
	Categoria categoria;
	
	
	public Material(int codigo, String nombre, LocalDate fechaestreno, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaestreno = fechaestreno;
		this.categoria = categoria;
	}


	public int getCodigo() {
		return codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public LocalDate getFechaestreno() {
		return fechaestreno;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	@Override
	public String toString() {
		return "Material [codigo=" + codigo + ", nombre=" + nombre + ", fechaestreno=" + fechaestreno + ", categoria="
				+ categoria + "]";
	}


	@Override
	public int compareTo(Material o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}
	
	
	
	
}
