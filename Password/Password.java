package Password;

import java.util.Iterator;

public class Password {

	int longitud;
	String contrasenia;
	
	
	public Password() {
		this.longitud = 8;
		this.contrasenia = GenerarContra();
	}


	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasenia = GenerarContra();
	}
	
	
	public String GenerarContra() {
		String cadena = "!#$%&()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^abcdefghijklmnopqrstuvwxyz{|}~";
		String pass;
			pass = "";
			for (int i = 0; i < longitud; i++) {
				pass += cadena.charAt((int)(Math.random()*cadena.length()));
			}	
		return pass;
	}
	
	public boolean EsFuerte() {
		int mayus = 0,minus = 0,nums = 0;
		for (int i = 0; i < contrasenia.length(); i++) {
			if(Character.isUpperCase(contrasenia.charAt(i))) {
				mayus++;
			}
			if(Character.isLowerCase(contrasenia.charAt(i))) {
				minus++;
			}
			if(Character.isDigit(contrasenia.charAt(i))) {
				nums++;
			}
		}
		if (mayus > 2 && minus > 1 && nums > 5) {
			return true;	
		}else {
			return false;	
		}
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public String getContrasenia() {
		return contrasenia;
	}
	
	
	
	
	
}
