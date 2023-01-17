package random;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ordenarArray {

	public static void ordenar(int [] array) {
		int menor = array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] < menor) {
					menor = array[j];
				}
			}
			if (array[i] < menor) {
				menor = array[i];
			}else {
				array[i]=menor;
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
