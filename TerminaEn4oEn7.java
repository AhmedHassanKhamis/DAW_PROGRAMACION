package random;
import java.util.Scanner;
public class examen2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		do {
			System.out.println("introduce un numero positivo: ");
			n1 = teclado.nextInt();
			System.out.println("introduce un numero positivo mayor que el primero");
			n2 = teclado.nextInt();	
			if (n1 > n2) {
				System.out.println("ERROR: INTRODUCE EL NUMERO 2 MAYOR QUE EL NUMERO1");
			}
		} while (n1 > n2);
		String num;
		for (int i = n1; i < n2; i++) {
			num = String.valueOf(i);
			if ((num.substring(num.length()-1)).equals("4")) {
				System.out.println(i+" termina en 4");
			}
			if ((num.substring(num.length()-1)).equals("7")) {
				System.out.println(i+" termina en 7");
			}
		}
		
			
		
		
	}

}
