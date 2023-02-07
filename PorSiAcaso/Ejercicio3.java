import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static int menu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("######TIENDA#######");
		System.out.println("1.Añadir producto");
		System.out.println("2.Eliminar producto");
		System.out.println("3.Calcular cantidad media de productos");
		System.out.println("4.salir");
		System.out.println("seleccione una opcion:");
		return teclado.nextInt();
	}
	
	public static void agregar(String articulos[],int cantidades[]) {
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Introduce articulo:");
		String articulo = teclado.nextLine();
		System.out.println("Introduce Cantidad:");
		int cantidad = teclado2.nextInt();
		int contador=0;
		for (int j = 0; j < articulos.length; j++) {
			if (articulos[j].equals(articulo)) {
				cantidades[j]+=cantidad;
				j = articulos.length;
			}else {
				if (articulos[j].equals("")) {
					articulos[j] = articulo;
					cantidades[j] = cantidad;
					j = articulos.length;
				}else {
					contador ++;
				}
			}	
		}
		if (contador >= articulos.length) {
			System.out.println("cesta llena");	
		}
	}
	
	
	public static void eliminar(String articulos[],int cantidades[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca nombre de articulo a eliminar:");
		String eliminar = teclado.nextLine();
		int contador= articulos.length;
		for (int j = 0; j < articulos.length; j++) {
			if (articulos[j].equals(eliminar)) {
				articulos[j]= "";
				cantidades[j]= 0;
			}else {
				contador--;
			}
		}
		if (contador <= 0) {
			System.out.println("Error:No se encuentra el producto");	
		}
	}
	
	public static void media(String articulos[],int cantidades[]) {
		int suma = 0;
		for (int i = 0; i < cantidades.length; i++) {
			suma += cantidades[i];
		}
		System.out.println(suma/cantidades.length);
	}
	
	public static void listar(String articulos[],int cantidades[]) {
		for (int i = 0; i < cantidades.length; i++) {
			if (cantidades[i] > 0) {
				System.out.println("#####################################");
				System.out.println("Articulo: "+articulos[i]);
				System.out.println("Cantidad: "+cantidades[i]);
				System.out.println("#####################################");
			}
		}
	}
	
	
	public static void main(String[] args) {
		int n = 2,op = 0;
		System.out.println("BIENVENIDO A LA TIENDA");
		String articulos[] = new String[n];
		for (int i = 0; i < articulos.length; i++) {
			articulos[i]="";
		}
		int cantidades[] = new int[n];
		do {
			op = menu();
			switch (op) {
			case 1:
				agregar(articulos, cantidades);
				System.out.println(Arrays.toString(articulos));
				System.out.println(Arrays.toString(cantidades));
				break;
				
			case 2:
				eliminar(articulos, cantidades);
				break;
				
			case 3:
				media(articulos, cantidades);
				break;
				
			case 4:
				listar(articulos, cantidades);
				System.out.println("Adios!");
				break;
				
			default:
				System.out.println("opcion no reconocida!!!!");
				break;
			}
		} while (op != 4);
		
	}

}
