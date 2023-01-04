package random;
import java.util.*;
public class examenpractica1 {
	
	public static int generarPrimoAleatorio(int n1,int n2) {
		int resultado = 0,temporal = 0;
		boolean esprimo = false;
		do {
			Random r = new Random();
			temporal  = r.nextInt(n2-n1)+n1;
			esprimo = esPrimo(temporal);
		} while (esprimo == false);
		resultado = temporal;
		return resultado;
	}
	
	public static boolean esPrimo(int n1) {
		boolean resultado = false;
		int contador = 0;
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0) {
				contador++;
			}
		}
		if (contador <= 2) {
			resultado = true;
		}		
		return resultado;
	}
	
	
	public static boolean hayPrimos(int n1,int n2) {
		boolean resultado = false;
		int contador2 = 0;
		
		for (int i = n1; i < n2 ; i++) {
			int contador = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					contador++;
				}
			}
			if (contador <= 2) {
				contador2++;
			}
		}
			if (contador2 > 0) {
				resultado = true;
			}
		return resultado;
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1,n2,pos1,pos2;
		boolean comprobar;
		System.out.println("introduce primer limite");
		n1 = teclado.nextInt();
		System.out.println("introduce segundo limite");
		n2 = teclado.nextInt();		
		if (n1 < n2) {
			pos1 = n1;
			pos2 = n2;
		} else {
			pos1 = n2;
			pos2 = n1;
		}
		comprobar = hayPrimos(n1, n2);
		if (comprobar == false) {
			System.out.println("-1");
		}else {
			System.out.println(generarPrimoAleatorio(n1, n2));
		}
		
		
	}

}
