//Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del vector está el mayor número primo leído.


package random;

import java.util.Scanner;

public class ArraysMayorNumeroPrimo {
	
	public static boolean esPrimo(int n1) {
		boolean resultado = false;
		int contador = 0;
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0) {
				contador++;
			}
		}
		if (contador <= 2) {
			resultado = true;
		}		
		return resultado;
	}
	
	public static void MayorNumero(int array[]) {
		int mayor = 0,posicion = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor && esPrimo(array[i])==true ) {
				mayor = array[i];
				posicion = i;				
			}
		}
		System.out.println("El numero mas grande y primo: "+ mayor);
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
