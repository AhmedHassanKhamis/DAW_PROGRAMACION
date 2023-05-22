package prgramacion3;

import java.time.LocalDate;

public class material implements Comparable{

	int codigo;
	String nombre;
	LocalDate fechaestreno;
	String fechaestrenoString;
	String categoria;
	
	
	public material(int codigo, String nombre, LocalDate fechaestreno, String categoria) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaestreno = fechaestreno;
		this.categoria = categoria;
	}
	
	public material(int codigo, String nombre, String fechaestrenoString, String categoria) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaestrenoString = fechaestrenoString;
		this.categoria = categoria;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaestreno() {
		return fechaestreno;
	}
	public void setFechaestreno(LocalDate fechaestreno) {
		this.fechaestreno = fechaestreno;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	
	
	@Override
	public String toString() {
		return "material [codigo=" + codigo + ", nombre=" + nombre + ", fechaestreno=" + fechaestreno + ", categoria="
				+ categoria + "]";
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
