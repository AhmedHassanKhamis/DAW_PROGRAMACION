package random;
import java.util.Scanner;
public class examen1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero el cual se desea mostrar la suma de sus divsisores");
		int n = teclado.nextInt();
		int suma = 0;
		for (int i = n; i >= 1 ; i--) {
			if (n % i == 0 && i != n && i != 1) {
				suma += i;
			}
			
		}
		System.out.println("la suma de divisores es: "+suma);
	}

}
