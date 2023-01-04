package random;
import java.util.Scanner;
public class examen3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce la cantidad de numeros que desea introducir");
		int cantidad = teclado.nextInt();
		int primero = 0;
		int contador = 0;
		for (int i = 0; i < cantidad; i++) {
			System.out.println("introduce un numero");
			int num = teclado.nextInt();
			if (i == 0) {
				primero = num;
			}
			if (num < primero) {
			System.out.println("el numero introducido no es mayor que el primero");
			}else if(num > primero){
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("no se ha introducido ningun numero mayor que el primero");			
		}else {
			System.out.println("se han introducido "+contador+" numeros mayores que el primero numero");
		}

	}
}