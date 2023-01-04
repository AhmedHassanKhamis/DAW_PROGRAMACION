package random;

import java.util.Arrays;
import java.util.Scanner;
/*
 Ejercicio 4:

Leer los datos correspondientes a dos tablas de 12 elementos numéricos y mezclarlos en una tercera de la forma:
 3 de la tabla A, 3 de la B, otros 3 de la A, otros 3 de la B, etc...
 */


public class arraysfusiondetrenetres {


		public static void fusionarrays(int array1[],int array2[],int fusion[]) {
			int j = 0;
			for (int i = 0; i < 12; i++) {
				fusion[j]=array1[i];
				fusion[j+1]=array1[i+1];
				fusion[j+2]=array1[i+2];
				fusion[j+3]=array2[i];
				fusion[j+4]=array2[i+1];
				fusion[j+5]=array2[i+2];
				j+=6;
				i+=2;
			}
			
			
			
		}
		
		public static void solicitarnumeros (int array[]) {
			Scanner teclado = new Scanner(System.in);
			for (int i = 0; i < 12; i++) {
				System.out.println("introduce un numero");
				array[i] = teclado.nextInt();
			}
		}
		
		
		public static void main(String[] args) {
			int array1[] = new int [12],array2[] = new int[array1.length],fusion[]= new int[array1.length+array2.length];
			System.out.println("solicitud para array 1: ");
			solicitarnumeros(array1);
			System.out.println("solicitud para array 2: ");
			solicitarnumeros(array2);
			fusionarrays(array1, array2,fusion);
			System.out.println(Arrays.toString(fusion));
		}

}
