package inmobiliaria;

import java.time.LocalDate;

public class Habitacion extends Anuncio{

	int metros;
	boolean mascota;
	
	
	public Habitacion(int codigo, int importe, LocalDate fechapublicacion, Estado estado, Direccion direccion,
			int metros, boolean mascota) {
		super(codigo, importe, fechapublicacion, estado, direccion);
		this.metros = metros;
		this.mascota = mascota;
	}

	

	public Habitacion(int codigo, int importe, LocalDate fechapublicacion,LocalDate fechabaja, Estado estado, Direccion direccion,
			int metros, boolean mascota) {
		super(codigo, importe, fechapublicacion, fechabaja, estado, direccion);
		this.metros = metros;
		this.mascota = mascota;
	}



	public int getMetros() {
		return metros;
	}


	public boolean isMascota() {
		return mascota;
	}



	@Override
	public String toString() {
		return "Habitacion [codigo=" + codigo + ", importe=" + importe + ", fechapublicacion=" + fechapublicacion
				+ ", fechabaja=" + fechabaja + ", estado=" + estado + ", direccion=" + direccion + ", metros=" + metros
				+ ", mascota=" + mascota + "]";
	}


	
	
	
	
	
}
