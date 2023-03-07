package Discografica;

import java.util.Arrays;

public class Discografica {

	String nombre;
	Disco discos[] = new Disco[3];
	int contador=0;
	
	
	public Discografica(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public Disco[] getDiscos() {
		return discos;
	}

	public void aniadirDisco(Disco disco) {
		discos[contador++] = disco;
	}
	
	public void subirPrecio(double porcentaje) {
		double porcentajefinal = porcentaje / 100 + 1;
		for (int i = 0; i < contador; i++) {
			discos[i].subirPrecio(porcentajefinal);
		}
	}

	public Disco buscarDisco(String nombre) {
		Disco discoNoEncontrado = new Disco("Disco no encontrado!!!","",0);
		for (int i = 0; i < discos.length; i++) {
			if (discos[i].getNombre().equalsIgnoreCase(nombre)) {
				return discos[i];
			}else {
				return discoNoEncontrado;
			}
		}
		return discoNoEncontrado;
	}
	

	@Override
	public String toString() {
		return "Discografica [nombre=" + nombre + ", discos=" + Arrays.toString(discos)+"]";
	}
	
	
	
	
}
