package random;

import java.util.Scanner;

public class arrayInvertirdiagonales {
	
	
	public static void mostrar(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" | ");
			}
			System.out.println();
		}
	}
	

	public static void invertirdiagonalprincipal(int array[][]) {
		int aux = 0;
		for (int i = 0; i < array.length/2; i++) {
				aux = array[i][i];
				array[i][i] = array[array.length-i-1][array.length-i-1];
				array[array.length-i-1][array.length-i-1] = aux;
		}
	}
	
	public static void invertirdiagonalsecundaria(int array[][]) {
		int aux = 0,j=array.length -1;
		for (int i = 0; i < array.length/2; i++) {
				aux = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = aux;
				j--;
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el tamaño de la matriz");
		int n = teclado.nextInt();
		int array[][] = new int [n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = j;
			}
		}
		System.out.println("array antes de invertir su diagonal");
		mostrar(array);
		invertirdiagonalprincipal(array);
		System.out.println("array despues de invertir su diagonal principal");
		mostrar(array);
		invertirdiagonalprincipal(array);
		invertirdiagonalsecundaria(array);
		System.out.println("array despues de invertir su diagonal secundaria");
		mostrar(array);
		
		
	}

}
