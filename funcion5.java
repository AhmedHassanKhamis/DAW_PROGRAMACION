package random;

import java.util.Scanner;

public class funcion5 {

		public static int fibonacci(int n1) {
			if (n1 == 1) {
				return 1;
			}else {
				int pos1 = 1,pos2 = 0,resultado = 0;
				for (int i = 0; i < n1; i++) {
					resultado = pos1 + pos2;
					pos2 = pos1;
					pos1 = resultado;
				}	
				return resultado;

			}
		}
		
	
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce  numero:");
		int n1  = teclado.nextInt();
		System.out.println("El numero correspondiente de fibonacci es: ");
		System.out.println(fibonacci(n1));
		
		
	}

}
