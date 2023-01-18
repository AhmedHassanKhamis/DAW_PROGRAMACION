//Contar el numero de dígitos de cada elemento de una matriz.


package random;

import java.util.Arrays;

public class arraysContarElementos {

	public static void main(String[] args) {
		int array[][]  = {{1},{2,3},{4,5,6}};
		for (int i = 0; i < array.length; i++) {
		System.out.println("Numero de elementos del array "+i);
		System.out.println(array[i].length);
		System.out.println(Arrays.toString(array[i]));
		}
		
		
		
	}

}
