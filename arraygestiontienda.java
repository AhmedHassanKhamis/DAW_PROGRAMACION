package random;

import java.util.Scanner;

/*

Realiza un programa que gestione los datos de stock de una tienda de comestibles,
 la información a recoger será: nombre del producto, precio, cantidad en stock.
 La tienda dispone de 10 productos distintos. El programa debe ser capaz de:
Dar de alta un producto nuevo.
Buscar un producto por su nombre.
Modificar el stock y precio de un producto dado.


 */


public class arraygestiontienda {
	
	
	public static int mostrarmenu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("######### Tienda ##########");
		System.out.println("1.Nuevo producto.");
		System.out.println("2.Buscar producto.");
		System.out.println("3.Modificar producto.");
		System.out.println("4.Lista de productos.");
		System.out.println("5.Salir\n\n");
		System.out.println("introuduce la opcion deseada: ");
		int opcion = teclado.nextInt();
		return opcion;
	}
	
	public static void leer(String nombre[],int precio[],int cantidad[]) {
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("introduce el id(posicion) en el cual se va a agregar el producto:");
		int i = teclado.nextInt();
		System.out.println("introduce nombre: ");
		nombre[i] = teclado2.nextLine();
		System.out.println("introduce precio: ");
		precio[i] = teclado.nextInt();
		System.out.println("introduce cantidad: ");
		cantidad[i] = teclado.nextInt();
	}
	
	public static void busqueda(String nombre[],int precio[],int cantidad[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del producto a buscar: ");
		String busca = teclado.nextLine();
		int posicion = 0;
		for (int i = 0; i < nombre.length; i++) {
			if (nombre[i] != null) {
				if (nombre[i].equals(busca)) {
					posicion = i;
				}	
			}
		}
		System.out.println("################################################");
		System.out.println("Resultado de la busqueda: \n");
		System.out.println("Nombre del articulo: "+nombre[posicion]);
		System.out.println("precio del articulo: "+precio[posicion]);
		System.out.println("cantidad del articulo: "+cantidad[posicion]);
		System.out.println("################################################");
	}
	
	public static void modificar(String nombre[],int precio[],int cantidad[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del producto a modificar: ");
		String busca = teclado.nextLine();
		int posicion = 0;
		for (int i = 0; i < nombre.length; i++) {
			if (nombre[i] != null) {
				if (nombre[i].equals(busca)) {
					posicion = i;
				}
			}
		}
		System.out.println("Nuevo precio: ");
		precio[posicion] = teclado.nextInt();
		System.out.println("Nuevo stock: ");
		cantidad[posicion] = teclado.nextInt();
		
	}
		
	public static void lista(String nombre[],int precio[],int cantidad[]) {
		System.out.println("###############listado###################");
		for (int i = 0; i < nombre.length; i++) 
			if (nombre[i] != null) {
				System.out.println("Nombre: "+nombre[i]);
				System.out.println("Precio: "+precio[i]);
				System.out.println("Cantidad: "+cantidad[i]);
				System.out.println("#############################");	
			}
		}
		
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0,alumnos = 0;
		String nombre[] = new String[10];
		int precio[] = new int[10];
		int cantidad[] = new int[10];
		do {
			opcion = mostrarmenu();
			switch (opcion) {
			case 1:
				leer(nombre,precio,cantidad);
				break;
				
			case 2:
				busqueda(nombre,precio, cantidad);
				break;
				
			case 3:
				modificar(nombre,precio, cantidad);
				break;
				
			case 4:
				lista(nombre,precio, cantidad);
				break;

			case 5:
				System.out.println("Adios!");
				break;

			default:
				System.out.println("Error: opcion no reconocida");
				break;
			}
		} while (opcion != 5);
		
		
	}

}
