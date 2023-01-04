package random;

import java.util.Arrays;
import java.util.Scanner;
/*
 Ejercicio 5:

Crear un programa que lea por teclado una tabla de 10 números enteros y las desplace una posición hacia abajo:
 el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente.
  El último pasa a ser el primero.
 */
public class arraydesplazo1abajo {

	public static void desplazo(int array1[],int array2[]) {
		int primera = array1[0];
		for (int i = 1; i < array1.length; i++) {
			array2[i-1]  = array1[i];
		}
		array2[array1.length-1] = primera;
	}
	
	public static void solicitarnumeros (int array[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("introduce un numero");
			array[i] = teclado.nextInt();
		}
	}
	
	
	public static void main(String[] args) {
		int array1[] = new int [10],array2[] = new int [10];
		System.out.println("solicitud para array 1: ");
		solicitarnumeros(array1);
		desplazo(array1,array2);
		System.out.println(Arrays.toString(array2));
	}

}
