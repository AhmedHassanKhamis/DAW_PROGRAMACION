package random;

import java.util.Arrays;
import java.util.Scanner;

/*
Ejercicio 1
LEER POR TECLADO 10 NÚMEROS ENTEROS. 
LA APLICACIÓN DEBE INDICARNOS SI LOS NÚMEROS ESTÁN ORDENADOS  DE FORMA CRECIENTE, DECRECIENTE O DESORDENADOS.
 */
public class arraysenorden {
	
	public static int check (int grupo[]) {
		boolean ascendente = true,descendente = true;
		for (int i = 0; i < grupo.length-1; i++) {
			if (grupo[i] < grupo[i+1]) {
				descendente = false;
			}else if (grupo[i] > grupo[i+1]) {
				ascendente = false;
			}
		}
		if (descendente == false && ascendente == true) {
			return 1;
		}else if (descendente == true && ascendente == false) {
			return 2; 
		}else {
			return 3;
		}
		
	}

	public static void solicitarnumeros (int array[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("introduce un numero");
			array[i] = teclado.nextInt();
		}
		teclado.close();
	}
	
	
	
	public static void main(String[] args) {
		int array[] = new int[10];
		
		solicitarnumeros(array);
		int resultado = check(array);
		switch (resultado) {
		case 1:
			System.out.println("estan ordenados");
			break;
		case 2:
			System.out.println("estan ordenados de forma invertida");
			break;
		case 3:
			System.out.println("estan desordenados");
			break;
		default:
			System.out.println("ha ocurrido un error");
			break;
		}
		System.out.println(Arrays.toString(array));
	}

}
