package random;
import java.util.Scanner;

public class eldobledelpasado {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int num;
	System.out.print("Introduzca un numero: ");
	num=teclado.nextInt();
	doble(num);
	}
	static void doble(int num) {
	int doble;
	doble=2*num;
	System.out.println("El doble es: " +doble); 
	}
	}
