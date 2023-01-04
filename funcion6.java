package random;

import java.util.Scanner;

public class funcion6 {

		public static double factorial(int n1) {
			double resultado = 1;
			for (int i = n1; i >= 1; i--) {
				resultado *= i;
			}

			return resultado;
		}
		
	
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce  numero m:");
		int m  = teclado.nextInt();
		System.out.println("introduce  numero n:");
		int n  = teclado.nextInt();
		int resta = m - n;
		double resultado = factorial(m)/(factorial(n)*factorial(resta)); 
		System.out.println("El numero correspondiente de (mn): ");
		System.out.println(resultado);
		
		
		
	}

}
