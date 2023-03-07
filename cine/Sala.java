package cine;

import java.util.Iterator;

public class Sala {

	Pelicula pelicula;
	int precio;
	Asientos [] asientos;
	
	
	public Sala(Pelicula pelicula, int precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		asientos = new Asientos[64];
		int i = 0;
		for (int fila = 1; fila <= 8; fila++) {
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
		int k = 1;
		for (int i = 0; i < asientos.length; i++) {
			resultado +=asientos[i].getColumna()+""+asientos[i].getFila()+":"+ asientos[i].disponible() + " ";
			if (k == 8) {
				resultado += "\n";
				k=0;
			}
			k++;
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
