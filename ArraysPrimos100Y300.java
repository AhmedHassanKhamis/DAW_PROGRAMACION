//Almacenar en un vector de 10 posiciones los 10 números primos comprendidos entre 100 y 300. Luego mostrarlos en pantalla.
// NOTA: como hay muchos numeros y el enunciado solo nos permite un array de 10 hueco se tomaran para no dar errores los primeros 10 valores primos 

package random;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrimos100Y300 {

	
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
	
	
	public static void main(String[] args) {
		int array [] = new int [10];
		int n = 0;
		for (int i = 100; i <= 300; i++) {
			if (n < 10) {
				if (esPrimo(i)==true) {
					array[n] = i;
					n++;
				}	
			}
		}
		
		System.out.println("los 10 primeros numeros primos entre el 100 y 300:");
		System.out.println(Arrays.toString(array));
		
	}
	
}
