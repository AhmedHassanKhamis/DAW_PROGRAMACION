package random;

import java.util.Scanner;

public class quecaracter {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una cadena para saber sus tipos de caracteres: ");
		String cadena = teclado.nextLine();
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (Character.isUpperCase(caracter) == true) {
				System.out.println(caracter+" es una letra mayuscula");
			}else if (Character.isLowerCase(caracter) == true) {
				System.out.println(caracter+" es una letra minuscula");
			}else if (caracter == ' ') {
				System.out.println(caracter+" es un espacio");
			}else if (Character.isDigit(caracter) == true) { 
				System.out.println(caracter+" es un digito");
			}else{
				System.out.println(caracter+" es un signo");
			}
				
		}
	}

}
