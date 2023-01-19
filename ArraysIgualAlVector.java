//Dada la matriz de m*n y el vector de tamaño n, determinar que columna de la matriz es igual al vector.

package random;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysIgualAlVector {
	
	public static void esIgual(int matriz[][],int array[]) {
		for (int i = 0; i < matriz.length; i++) {
			if (array[0] == matriz[0][i] && array[1] == matriz[1][i] && array[2] == matriz[2][i]) {
				System.out.println("coincide la columna o columnas siguientes: ");
				System.out.println("columna: "+i);
				System.out.println("valores: "+Arrays.toString(matriz[i]));
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("## NOTA: si no aparece nada es que no ha encontrado similitudes!!! ##");
		int matriz[][]  = {{1,2,3},{4,5,6},{7,8,9}};
		int array[] = {4,5,6};
		System.out.println("vector: "+Arrays.toString(array));
		System.out.println("matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		System.out.println("####################################3");
		esIgual(matriz, array);		
	}

}
