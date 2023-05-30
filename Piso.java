package inmobiliaria;

import java.time.LocalDate;

public class Piso extends Anuncio{

	int numerodormitorios;
	int numerobanios;
	boolean calefaccion;
	
	
	public Piso(int codigo, int importe, LocalDate fechapublicacion, Estado estado, Direccion direccion,
			int numerodormitorios, int numerobanios, boolean calefaccion) {
		super(codigo, importe, fechapublicacion, estado, direccion);
		this.numerodormitorios = numerodormitorios;
		this.numerobanios = numerobanios;
		this.calefaccion = calefaccion;
	}

	
	

	public Piso(int codigo, int importe, LocalDate fechapublicacion, LocalDate fechabaja, Estado estado, Direccion direccion,
			int numerodormitorios, int numerobanios, boolean calefaccion) {
		super(codigo, importe, fechapublicacion, fechabaja, estado, direccion);
		this.numerodormitorios = numerodormitorios;
		this.numerobanios = numerobanios;
		this.calefaccion = calefaccion;
	}




	public int getNumerodormitorios() {
		return numerodormitorios;
	}


	public int getNumerobanios() {
		return numerobanios;
	}


	public boolean isCalefaccion() {
		return calefaccion;
	}




	@Override
	public String toString() {
		return "Piso [codigo=" + codigo + ", importe=" + importe + ", fechapublicacion=" + fechapublicacion
				+ ", fechabaja=" + fechabaja + ", estado=" + estado + ", direccion=" + direccion
				+ ", numerodormitorios=" + numerodormitorios + ", numerobanios=" + numerobanios + ", calefaccion="
				+ calefaccion + "]";
	}




	
}
