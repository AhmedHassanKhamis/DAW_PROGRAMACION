import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void intercalar(int array[]) {
		int auxiliar[] = new int[array.length];
		int j = array.length-1,x = 0;
		for (int i = 0; i < array.length; i++) {
			auxiliar[i] = array[x];
			auxiliar[i+1] = array[j];
			i++;
			j--;
			x++;
		}
		for (int i = 0; i < auxiliar.length; i++) {
			array[i] = auxiliar[i];
		}
	}
	
	
	public static void leer(int array[],int i) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		array[i] = teclado.nextInt();
	}
	
	
	public static void main(String[] args) {
		System.out.println("Programa de numeros intercalados");
		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			leer(array,i);
		}
		System.out.println("Array antes de intercalar: ");
		System.out.println(Arrays.toString(array));
		intercalar(array);
		System.out.println("Array despues de intercalar: ");
		System.out.println(Arrays.toString(array));
		
		
	}

}
