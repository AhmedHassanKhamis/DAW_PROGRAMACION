package random;

import java.util.Scanner;

public class quienmayor {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre1,nombre2;
        int edad1,edad2;
        System.out.println("introduce nombre de persona 1: ");
        nombre1 = teclado.nextLine();
        System.out.println("introduce edad de persona 1: ");
        edad1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("introduce nombre de persona 2: ");
        nombre2 = teclado.nextLine();
        System.out.println("introduce edad de persona 2: ");
        edad2 = teclado.nextInt();
        
        if (edad1 > edad2) {
			System.out.println("mayor: "+nombre1);
		} else if (edad1 < edad2) {
			System.out.println("mayor: "+nombre2);
		}else {
			System.out.println("son de la misma edad");
		}
	}

}
