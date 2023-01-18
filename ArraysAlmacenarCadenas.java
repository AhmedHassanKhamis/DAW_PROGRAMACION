//Crear un vector de tipo cadena que almacene 10 elementos e imprimir la palabra java seguido del número de elemento.
package random;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAlmacenarCadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String array[] = new String [10];
		for (int i = 0; i < array.length; i++) {
			System.out.println("introduce un palabra:"); 
			array[i] = teclado.nextLine();
		}
		System.out.println("valores introducidos: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("palabra: "+array[i]+" numero del elemento: "+i);
		}
	}

}
