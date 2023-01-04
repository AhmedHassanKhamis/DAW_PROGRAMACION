package random;

import java.util.Scanner;

public class funcion7 {

		public static double media(int max,int min) {
			double resultado = (max + min)/2;	
			return resultado;
		}
		
	
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce  numero de dias");
		int dias  = teclado.nextInt();
		for (int i = 0; i < dias; i++) {
			System.out.println("introduce  temperatura max:");
			int max  = teclado.nextInt();
			System.out.println("introduce  temperatura min:");
			int min  = teclado.nextInt();
			System.out.println("la temperatura media del dia "+ i +" es:");
			System.out.println(media(max,min));
			
		}
	}

}
