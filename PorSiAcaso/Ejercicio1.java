import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {

	public static void iniciales(String nombres[]) {
		for (int i = 0; i < nombres.length; i++) {
			String iniciales = "";
			iniciales += nombres[i].charAt(0);
			for (int j = 0; j < nombres[i].length(); j++) {
				if (nombres[i].charAt(j) == ' ') {
					iniciales += nombres[i].charAt(j+1);
				}
			}
			System.out.println(iniciales.toUpperCase());
		}
	}
	
	public static void leer(String nombres[],int i) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce nombre completo:");
		nombres[i] = teclado.nextLine();
	}
	
	
	public static void main(String[] args) {
		System.out.println("Programa de Iniciales");
		String nombres[] = new String[10];
		for (int i = 0; i < nombres.length; i++) {
			leer(nombres,i);
		}
		iniciales(nombres);
	}

}
