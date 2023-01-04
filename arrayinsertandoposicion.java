package random;

import java.util.Arrays;
import java.util.Scanner;
/*
 Ejercicio 3:

DISEÑAR UNA APLICACIÓN QUE DECLARE UNA TABLA DE 10 ELEMENTOS ENTEROS. LEER MEDIANTE EL TECLADO 8 NÚMEROS.
 DESPUÉS SE DEBE PEDIR UN NÚMERO Y UNA POSICIÓN, INSERTARLO EN LA POSICIÓN INDICADA, DESPLAZANDO LOS QUE ESTÉN DETRÁS.
 */
public class arrayinsertandoposicion {
	public static void desplazar(int array [],int arrayfinal[],int num, int pos) {
		for (int i = 0; i <= pos; i++) {
			if (i == pos) {
				arrayfinal[i] = num;
			}else {
				arrayfinal[i] = array[i];
			}
		}
		for (int i = pos+1; i < arrayfinal.length; i++) {
			arrayfinal[i] = array[i-1];
		}
		
	}
	
	
	public static void solicitarnumeros (int array[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			System.out.println("introduce un numero");
			array[i] = teclado.nextInt();
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0, pos = 0;
		int array[] = new int [10],arrayfinal[] = new int[10];
		System.out.println("valores del array:");
		solicitarnumeros(array);
		System.out.println("introduce el numero a insertar dentro del array:");
		num = teclado.nextInt();
		System.out.println("introduce la posicion en el array:");
		pos = teclado.nextInt();
		desplazar(array,arrayfinal,num,pos);
		System.out.println("array final:");
		System.out.println(Arrays.toString(arrayfinal));
		
	}

}
