package deportistas;

import java.util.Scanner;

public class Teclado {
	static Scanner teclado = new Scanner(System.in);
	static Scanner teclado2 = new Scanner(System.in);
	
	public static int leerInt(String frase) {
		System.out.println(frase);
		return teclado.nextInt();
	}
	
	public static float leerFloat(String frase) {
		System.out.println(frase);
		return teclado.nextFloat();

	}
	
	public static double leerDouble(String frase) {
		System.out.println(frase);
		return teclado.nextDouble();

	}
	
	public static String leerString(String frase) {
		System.out.println(frase);
		return teclado2.nextLine();

	}
	
	
	
}
