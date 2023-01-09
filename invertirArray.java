package random;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class invertirArray {
		
	
	public static boolean parImpar(int n) {
		if (n % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void invertir(int array[]) {
		int auxiliar = 0;
		for (int i = 0; i < array.length/2; i++) {
			auxiliar = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1]= auxiliar;
		}
	}
	
	public static int  minimo(int array[]) {
		int minimo =  array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}
	
	public static int  maximo(int array[]) {
		int maximo =  array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximo) {
				maximo = array[i];
			}
		}
		return maximo;
	}
	
	public static void intercambio(int array1[],int array2[],int maximo ,int minimo) {
		for (int i = 0; i < array1.length; i++) {
			if (array1[i]== minimo) {
				array1[i] = maximo;
			}
		}
		
		for (int i = 0; i < array2.length; i++) {
			if (array2[i]== maximo) {
				array2[i] = minimo;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduce el tamaño del array: ");
		int n = scan.nextInt();
		int array [] = new int [n];
		int a[] = {1,2,3,3,546,43,4,64,32,546,464};
		int b[] = {1,2,3,3,546,43,4,64,32,546,464};
		for(int i = 0; i < n; i++) {
			array[i] = i+1;
		} 
		if (parImpar(n) == true) {
			invertir(array);
		} 
		
		System.out.println(Arrays.toString(array));
		System.out.println("###############arrays antes del intercambio##########");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		intercambio(a, b, maximo(b), minimo(a));
		System.out.println("###############arrays despues del intercambio##########");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
	}

}
