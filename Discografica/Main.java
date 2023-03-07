package Discografica;

import java.util.Scanner;

public class Main {

	public static int menu() {
		int op = 0;
		System.out.println("1-AÑADIR DISCO");
		System.out.println("2-BUSCAR ALBUM");
		System.out.println("3-SUBIR PRECIOS");
		System.out.println("4-SALIR");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la opcion deseada:");
		return op = teclado.nextInt();
	}
	
	
	public static void main(String[] args) {
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Discografica discografica1 = new Discografica("Spotify");
		int op = 0;
		do {
			op = menu();
			switch (op) {
			
			case 1:
				String nombredisco,nombregrupo;
				float precio;
				Disco disco1;
				System.out.println("introduzca nombre del disco");
				nombredisco = teclado2.nextLine();
				System.out.println("introduzca nombre del grupo");
				nombregrupo = teclado2.nextLine();
				System.out.println("introduzca precio del disco");
				precio = teclado1.nextInt();
				disco1 = new Disco(nombredisco, nombregrupo, precio);
				char seguir = 's';
				do {
					Cancion cancion1;
					String nombrecancion,nombreautor;
					System.out.println("introduzca nombre de la cancion");
					nombrecancion = teclado2.nextLine();
					System.out.println("introduzca nombre del autor");
					nombreautor = teclado2.nextLine();
					cancion1 = new Cancion(nombrecancion, nombreautor);
					disco1.graba(cancion1);
					if (disco1.contador < disco1.canciones.length) {
						System.out.println("Quieres meter otra cancion?(escribe n para parar)");
						seguir = teclado2.nextLine().charAt(0);
					}else {
						System.out.println("no hay mas hueco en el disco!");
						seguir = 'n';
					}
				} while (seguir != 'n');
				discografica1.aniadirDisco(disco1);
				break;
				
			case 2:
				System.out.println("introduce el nombre del disco a buscar: ");
				String nombre = teclado2.nextLine();
				Disco discobuscado = discografica1.buscarDisco(nombre);
				System.out.println(discobuscado);
				break;
				
			case 3:
				System.out.println("introduce el porcentaje a subir en el precio: ");
				double porcentaje = teclado1.nextDouble();
				discografica1.subirPrecio(porcentaje);
				break;
				
			case 4:
				System.out.println("Adios!");
				break;
				
			default:
				System.out.println("Error: introduzca un valor comprendido 1-4!");
				break;
			}
		} while (op != 4);	
		System.out.println(discografica1);
	}
}
