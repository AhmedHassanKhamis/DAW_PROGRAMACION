//Dada una matriz intercambiar los elementos de la primera columna con la ultima columna

package random;

import java.util.Arrays;

public class arrayIntercambiarColumnas {

	
	public static void intercambiar(int array[][]) {
		int aux = 0,j = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			aux = array[i][0];
			array[i][0] = array[i][j];
			array[i][j] = aux;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		int array[][]  = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("array antes del cambio de columnas: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print("["+array[i][j]+"]"); 
			}
			System.out.println();
		}
		intercambiar(array);
		System.out.println("array despues del cambio de columnas: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print("["+array[i][j]+"]"); 
			}
			System.out.println();
		}	
		}

}
