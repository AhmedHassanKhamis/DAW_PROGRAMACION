package random;
import java.util.*;
public class funcion4 {

	public static int mcd(int n1, int n2) {
		int resultado = 0;
		int dividendo = n1 > n2 ? n1:n2;
		int divisor = n1 < n2 ? n1:n2;
			while (dividendo % divisor != 0) {
				int resto = dividendo % divisor;
				dividendo =  divisor;
				divisor = resto;	
			}
			resultado = divisor;
		return resultado;
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce primer numero");
		int n1  = teclado.nextInt();
		System.out.println("introduce segundo numero");
		int n2  = teclado.nextInt();
		System.out.println("El mcd es: ");
		System.out.println(mcd(n1,n2));
		
	}

}
