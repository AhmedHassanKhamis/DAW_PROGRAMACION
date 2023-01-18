//Crear una aplicación para buscar un número en una matriz, e imprimir la ubicación de dicho número.
package random;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBuscarNumero {

	public static void buscar(int array[][],int n) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] == n) {
					System.out.println("posicion del numero:");
					System.out.println("x: "+i);
					System.out.println("y: "+j);
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("buscador de numero en matriz");
		int array[][]  = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		System.out.println("introduce el numero a buscar su posicion: ");
		int n = teclado.nextInt();
		buscar(array,n);
		
		
	}

}
