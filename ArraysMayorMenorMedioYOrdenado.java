//Crear un vector para cargar 5 numero, e imprimir el mayor, menor, medio y la lista ordenada de menor a mayor
package random;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMayorMenorMedioYOrdenado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int array[]  = new int [5];
		for (int i = 0; i < array.length; i++) {
			System.out.println("introduzca un valor para el array:");
			System.out.print("posicion "+(i+1)+" :");
			array[i] = teclado.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Array ordenado:");
		System.out.println(Arrays.toString(array));
		System.out.println("Valor mas alto: "+array[4]);
		System.out.println("Valor medio: "+array[2]);
		System.out.println("Valor mas bajo: "+array[0]);
		
		
		
	}

}
