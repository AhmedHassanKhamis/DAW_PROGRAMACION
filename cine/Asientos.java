package cine;

public class Asientos {
	int fila;
	char columna;
	Espectador espectador;
	
	public Asientos(int fila, char columna) {
		this.fila = fila;
		this.columna = columna;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}


	public int getFila() {
		return fila;
	}


	public char getColumna() {
		return columna;
	}




	public boolean disponible() {
		return espectador == null;
	}
	

	@Override
	public String toString() {
		return "Asientos [fila=" + fila + ", columna=" + columna + ", espectador=" + espectador + "]";
	}
	
	
	
	
	
	
}
