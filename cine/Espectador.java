package cine;

public class Espectador {

	String nombre;
	int edad;
	int dinero;
	
	
	public Espectador(String nombre, int edad, int dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}


	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}


	public int getDinero() {
		return dinero;
	}


	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
	
	
	public boolean paga(int cantidad) {
		if (dinero < cantidad) {
			return false;
		}else {
			dinero -= cantidad;
			return true;
		}
	}
}
