//Crear un vector entero en donde almacene 10 número e imprimir dicho números.
package random;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArraysAlmacenarElementos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int array[] = new int [10];
		for (int i = 0; i < array.length; i++) {
			System.out.println("introduce un valor:"); 
			array[i] = teclado.nextInt();
		}
		System.out.println("valores introducidos: ");
		System.out.println(Arrays.toString(array));
	}

}
