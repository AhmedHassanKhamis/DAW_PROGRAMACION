package random;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ordenarArray {

	public static void ordenar(int [] array) {
		int aux = array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[i]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce tamaño del array:");
		int n = teclado.nextInt();
		int array[] = new int [n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("introduce valor del array "+i);
			array[i] = teclado.nextInt();
		}
		ordenar(array);
		System.out.println(Arrays.toString(array));		
	}

}
