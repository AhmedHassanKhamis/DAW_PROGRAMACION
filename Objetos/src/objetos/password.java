package objetos;

import java.util.Iterator;

public class password {
	private int longitud = 8;
	private String clave;
	
	public password() {
		generarPassword();
	}
	
	public password(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}

	public void generarPassword() {
		this.clave = "";
		for (int i = 0; i < longitud; i++) {
			this.clave += caracteraleatorio();
		}
	}
	
	public char caracteraleatorio() {
		String caracteres  ="!\"#$%&\\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
		int posicion =  (int)( Math.random() * caracteres.length());
		return caracteres.charAt(posicion);
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
