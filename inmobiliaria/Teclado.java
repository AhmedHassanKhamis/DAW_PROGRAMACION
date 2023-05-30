package inmobiliaria;

import java.util.Scanner;

public class Teclado {

	
	static Scanner teclado1 = new Scanner(System.in);
	static Scanner teclado2 = new Scanner(System.in);;
	


	public static int leerInt(String frase) {
		System.out.println(frase);
		return teclado1.nextInt();
	}
	
	public static String leerString(String frase) {
		System.out.println(frase);
		return teclado2.nextLine();
	}
	
	public  static double leerDouble(String frase) {
		System.out.println(frase);
		return teclado1.nextDouble();
	}
	
	public static float leerFloat(String frase) {
		System.out.println(frase);
		return teclado1.nextFloat();
	}
	
	public static long leerLong(String frase) {
		System.out.println(frase);
		return teclado1.nextLong();
	}
	
	
}
