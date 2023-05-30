package inmobiliaria;

import java.time.LocalDate;

public class Anuncio implements Comparable<Anuncio>{
	
	int codigo;
	int importe;
	LocalDate fechapublicacion;
	LocalDate fechabaja;
	Estado estado;
	Direccion direccion;
	
	
	public Anuncio(int codigo, int importe, LocalDate fechapublicacion, Estado estado, Direccion direccion) {
		this.codigo = codigo;
		this.importe = importe;
		this.fechapublicacion = fechapublicacion;
		this.fechabaja = null;
		this.estado = estado;
		this.direccion = direccion;
	}
	
	


	public Anuncio(int codigo, int importe, LocalDate fechapublicacion, LocalDate fechabaja, Estado estado,
			Direccion direccion) {
		this.codigo = codigo;
		this.importe = importe;
		this.fechapublicacion = fechapublicacion;
		this.fechabaja = fechabaja;
		this.estado = estado;
		this.direccion = direccion;
	}




	public LocalDate getFechabaja() {
		return fechabaja;
	}




	public void setFechabaja(LocalDate fechabaja) {
		this.fechabaja = fechabaja;
	}




	public int getCodigo() {
		return codigo;
	}


	public int getImporte() {
		return importe;
	}


	public LocalDate getFechapublicacion() {
		return fechapublicacion;
	}


	public Estado getEstado() {
		return estado;
	}


	public Direccion getDireccion() {
		return direccion;
	}



	@Override
	public String toString() {
		return "Anuncio [codigo=" + codigo + ", importe=" + importe + ", fechapublicacion=" + fechapublicacion
				+ ", fechabaja=" + fechabaja + ", estado=" + estado + ", direccion=" + direccion + "]\n";
	}




	@Override
	public int compareTo(Anuncio o) {
		return this.getDireccion().getCodigopostal()-o.getDireccion().getCodigopostal();
	}


	
	
	
}
