//Crear una aplicación que busque el número más grande del array y la posición que ocupa.
package random;

import java.util.Scanner;

public class ArraysMayorNumeroPosicion {
	public static void MayorNumero(int array[]) {
		int mayor = 0,posicion = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor ) {
				mayor = array[i];
				posicion = i;				
			}
		}
		System.out.println("El numero mas grande: "+ mayor);
		System.out.println("Su Posicion: "+posicion);		
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int array [] = new int [10];
		for (int i = 0; i < array.length; i++) {
			System.out.println("introduce un valor entero");
			array[i] = teclado.nextInt();
		}
		MayorNumero(array);
		
	}

}
