package cine;

import java.util.Iterator;

public class Sala {

	Pelicula pelicula;
	int precio;
	Asientos [] asientos;
	
	
	public Sala(Pelicula pelicula, int precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		asientos = new Asientos[72];
		int i = 0;
		for (int fila = 0; fila < 8; fila++) {
			for (char columna = 'A'; columna < 'I'; columna++) {
				Asientos asiento = new Asientos(fila,columna);
				asientos[i++] = asiento;
			}
		}
	}
	
	
	public boolean admitido(Espectador espectador) {
		if (espectador.getEdad()>pelicula.getEdad()&&hayAsientos()) {
			return espectador.paga(precio);
		}else {
			return false;
		}
	}
	
	public boolean hayAsientos() {
		for (int i = 0; i < asientos.length; i++) {
			return asientos[i].disponible();
		}
		return false;
	}
	
	public String mostrarAsientos() {
		String resultado = "";
		for (int i = 0; i < asientos.length; i++) {
			resultado += asientos[i] + "\t";
			if (i % 8 == 0) {
				resultado += "\n";
			}
		}
		return resultado;
	}
	
	public Asientos buscarAsiento(int fila,char columna) {
		for (int i = 0; i < asientos.length; i++) {
			if (fila == asientos[i].getFila()&&columna == asientos[i].getColumna()) {
				return asientos[i];
			}
		}
		return null;
	}
	
	public boolean asignarAsiento(Espectador espectador,int fila,char columna) {
		Asientos asiento = buscarAsiento(fila, columna);
		if (asiento.disponible()) {
			asiento.setEspectador(espectador);
			return true;
		}
		return false;
	}
}
