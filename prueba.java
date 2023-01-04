package random;
import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("INTRODUCE UN NUMERO Y TE MOSTRARE LOS PRIMOS QUE TIENE DESDE EL 1: ");
		int n = teclado.nextInt();
		//int cont2 = 0;
		for (int i = 1; i < n; i++) {
			int cont = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					cont++;
				}
			}
			if  (cont < 3) {
				//cont2++;
				System.out.println(i);
			}
		}
		//System.out.println("este es el numero de primos que hay"+cont2);
	}

}
