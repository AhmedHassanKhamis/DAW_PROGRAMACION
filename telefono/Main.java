package telefono;

import java.util.Scanner;

public class Main {
	
	public static int menu () {
		Scanner teclado = new Scanner(System.in);
		System.out.println("AGENDA");
		System.out.println("1-Añadir contacto");
		System.out.println("2-Existe contacto");
		System.out.println("3-Buscar contacto");
		System.out.println("4-Eliminar contacto");
		System.out.println("5-Agenda llena");
		System.out.println("6-Huecos libres");
		System.out.println("7-salir");
		int op = teclado.nextInt();
		return op;
	}
	
	public static void main(String[] args) {
		agenda agendanueva = new agenda();
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int op;
		do {
			op = menu();
			switch (op) {
			case 1:
				System.out.println("introduce nombre:");
				String nombre = teclado2.nextLine();
				System.out.println("introduce numero:");
				int numero = teclado.nextInt();
				contacto contactotemporal = new contacto(nombre, numero);
				agendanueva.aniadirContacto(contactotemporal);
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				System.out.println("adiosss!!!");
				break;
			default:
				System.out.println("Error: opcion no reconocida intentelo de nuevo");
				break;
			}
		}while(op != 7);
		
	}
}




