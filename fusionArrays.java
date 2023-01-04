package random;

import java.util.Arrays;
import java.util.Scanner;

/*
 Ejercicio 2:

Leer por teclado 2 arrays de 10 números enteros y mezclarlas en una tercera de la forma:
 el 1º de la A, el 1º de la B, el 2º de la A, el 2º de la B, etc..
 */
public class fusionArrays {

	public static void fusionarrays(int array1[],int array2[],int fusion[]) {
		int j = 0;
		for (int i = 0; i < 10; i++) {
			fusion[j]=array1[i];
			fusion[j+1]=array2[i];
			j+=2;
		}
		
		
		
	}
	
	public static void solicitarnumeros (int array[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("introduce un numero");
			array[i] = teclado.nextInt();
		}
	}
	
	
	public static void main(String[] args) {
		int array1[] = new int [10],array2[] = new int[10],fusion[]= new int[array1.length+array2.length];
		System.out.println("solicitud para array 1: ");
		solicitarnumeros(array1);
		System.out.println("solicitud para array 2: ");
		solicitarnumeros(array2);
		fusionarrays(array1, array2,fusion);
		System.out.println(Arrays.toString(fusion));
	}

}
