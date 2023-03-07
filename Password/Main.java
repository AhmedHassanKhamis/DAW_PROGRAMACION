package Password;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el tamaño del array de contraseñas: ");
		int tam = teclado.nextInt();
		Password array[] = new Password[tam];
		System.out.println("introduce el tamaño de las contraseñas: ");
		int tam2 = teclado.nextInt();
		boolean fuerte[] = new boolean[tam];
		for (int i = 0; i < array.length; i++) {
			Password contra = new Password(tam2);
			array[i]  = contra;
			fuerte[i] = contra.EsFuerte();
			System.out.println(array[i].getContrasenia()+" "+fuerte[i]);
		}
		
	}

}
