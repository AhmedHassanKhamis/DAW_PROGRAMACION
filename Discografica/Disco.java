package Discografica;

import java.util.Arrays;
import java.util.Iterator;

public class Disco {

	Cancion canciones[];
	int contador;
	float precio;
	String nombre;
	String grupo;
	
	
	
	public Disco(String nombre, String grupo, float precio) {
		canciones = new Cancion[3];
		this.precio = precio;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	public int getNumeroCanciones() {
		return contador;
	}
	
	public Cancion getCancion(int posicion) {
		if (canciones[posicion] != null) {
			return canciones[posicion];
		}
		return null;
	}
	
	public String getNombre() {
		if (nombre != null) {
			return nombre;	
		}else {
			return "No existe el disco";
		}
	}

	public boolean sobrescribe(Cancion cancion,int posicion) {
		if (posicion >= 0 && posicion<=10) {
			canciones[posicion] = cancion;
			return true;
		}else {
			return false;	
		}
		
	}
	
	public boolean graba(Cancion cancion) {
		if (contador != canciones.length&&contador >= 0&&contador<=10) {
			canciones[contador++] = cancion;
			return true;
		}else {
			return false;	
		}
	}
	
	public boolean elimina(int posicion) {
		if(posicion >= 0 && posicion <=canciones.length) {
			canciones[posicion] = null;
			return true;	
		}else {
			return false;
		}
	}
	
	public boolean elimina(Cancion cancion) {
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i] == cancion) {
				canciones[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public void subirPrecio(double porcentaje) {
		precio *= porcentaje;
	}

	@Override
	public String toString() {
		return "#############################\nDisco\nnombre: "+nombre+ "\ngrupo: "+grupo+"\nprecio: "+precio+"\n#############################\n---canciones---\n" + Arrays.toString(canciones);
	}
	
	
	
}
