/*
El Departamento de Sistemas de la UCPR cuenta con cinco salas de sistemas, cada una de ellas con 20 ordenadores. Se requiere sistematizar el proceso de reserva o cancelación de turnos para dichas salas en el horario disponible (12 a 2 pm, únicamente), los demás horarios están reservados para clases.

Construir un programa que solicite al usuario la siguiente información (sala, equipo), tanto para asignar turno como para cancelarlo. Igualmente, el programa deberá permitir conocer el número de equipos disponibles (sin asignar) por sala, y el número total de turnos asignado (todas las salas).

Tener en cuenta que el programa deberá funcionar permanentemente mostrando un menú de opciones así:

1. Asignar o cancelar turno
2. Cantidad de equipos disponibles por sala
3. cantidad de turnos asignados en toda la U
4. Salir
 */
package random;

import java.util.Scanner;

public class MatricesAsignarTurnos {

	public static int Menu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("######## Universidad ########");
		System.out.println("1.Asignar o Cancelar turno");
		System.out.println("2.Cantidad de equipos disponibles por sala");
		System.out.println("3.Cantidad de turnos asignados en toda la Universidad");
		System.out.println("4.Salir");
		return teclado.nextInt();
	}
	
	public static int Seleccion() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("####################### ASIGNACION O CANCELACION #######################");
		System.out.println("1.Asignar turno");
		System.out.println("2.Cancelar turno");
		return teclado.nextInt();
	}
	
	public static void RealizarReserva(boolean universidad[][][]) {
		Scanner teclado = new Scanner(System.in);
		int sala,ordenador,turno;
		do {
			System.out.println("Introduce sala: ");
			sala = teclado.nextInt();
			System.out.println("Introduce ordenador: ");
			ordenador = teclado.nextInt();
			System.out.println("Introduce turno: ");
			turno = teclado.nextInt();
		} while (sala < 1  || sala > 5 || ordenador < 1  || ordenador > 20 || turno < 1 || turno > 2);
		sala--;
		ordenador--;
		turno--;
		if (universidad[sala][ordenador][turno] == false) {
			universidad[sala][ordenador][turno] = true;
			System.out.println("Reserva Realizada");
		}else {
			System.out.println("Fallo: Ya esta reservado!");
		}

	}
		
	public static void CancelarReserva(boolean universidad[][][]) {
		Scanner teclado = new Scanner(System.in);
		int sala,ordenador,turno;
		do {
			System.out.println("Introduce sala: ");
			sala = teclado.nextInt();
			System.out.println("Introduce ordenador: ");
			ordenador = teclado.nextInt();
			System.out.println("Introduce turno: ");
			turno = teclado.nextInt();
		} while (sala < 1  || sala > 5 || ordenador < 1  || ordenador > 20 || turno < 1 || turno > 2);
		sala--;
		ordenador--;
		turno--;
		if (universidad[sala][ordenador][turno] == true) {
			universidad[sala][ordenador][turno] = false;
			System.out.println("Reserva Cancelada");
		}else {
			System.out.println("Fallo: No habia reserva!");
		}

	}
	
	public static void CantidadEquipos(boolean universidad[][][],int sala) {
		int contador = 0;
			for (int j = 0; j < universidad[0].length; j++) {
				for (int j2 = 0; j2 < universidad[0][0].length; j2++) {
					if (universidad[sala][j][j2]==false) {
						contador++;
					}
				}
			}
			System.out.println("#############################");
			System.out.println("Equipos disponibles en sala "+(sala+1)+": "+contador);
			System.out.println("#############################");
	}	
	
	public static void TurnosAsignados(boolean universidad[][][]) {
		int contador = 0;
		for (int i = 0; i < universidad.length; i++) {
			for (int j = 0; j < universidad[0].length; j++) {
				for (int j2 = 0; j2 < universidad[0][0].length; j2++) {
					if (universidad[i][j][j2]==true) {
						contador++;
					}
				}
			}
		}
		System.out.println("#############################");
		System.out.println("Turnos asignados en la universidad: "+contador);
		System.out.println("#############################");
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int op;
		boolean universidad[][][] = new boolean[5][20][2];
		do {
			op = Menu();
			switch (op) {
				case 1:
					int op2 = Seleccion();
					if (op2 == 1) {
						RealizarReserva(universidad);
					}else if(op2 == 2){
						CancelarReserva(universidad);
					}else {
						System.out.println("Error:valores comprendidos-> (1-2) ");
					}
					break;
				case 2:
					int sala;
					do {
						System.out.println("Introduce la sala deseada:");
						sala = teclado.nextInt();
					} while (sala > 5 || sala < 1 );
					sala--;
					CantidadEquipos(universidad,sala);
					break;
				case 3:
					TurnosAsignados(universidad);
					break;
				case 4:
					System.out.println("Hasta pronto!");
					break;
				default:
					System.out.println("Error:valores comprendidos-> (1-4)");
					break;
			}

		} while (op != 4);
	}
}
