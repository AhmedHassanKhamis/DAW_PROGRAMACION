package EjercicioOrdenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Programa {
	Scanner teclado = new Scanner(System.in);
	Scanner teclado2 = new Scanner(System.in);
	private ArrayList<Alumno> alumnos;
	
	public Programa () {
	this. alumnos = new ArrayList<Alumno>();
	}
	private int mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("1- Añadir alumno");
			System.out.println("2- Mostrar alumos ordenados por edad");
			System.out.println("3- Mostrar alumos ordenados por nota");
			System.out.println("4- Mostrar alumos ordenados por nombre");
			System.out.println("5- Mostrar alumos ordenados por apellidos");
			opcion = teclado.nextInt();
		}while(opcion < 1 || opcion > 5);
		return opcion;
	}
	
	public void ejecutar() {
		boolean salir = false;
		do {
			int opcion = mostrarMenu();
			
			switch (opcion) {
			case 1:
				leerAlumno();
				break;

			case 2:
				Collections.sort(alumnos, new CompararEdades());
				break;

			case 3:
				
				break;
			
			case 6:
				System.out.println("Adios!!");
				salir = true;
				break;

			default:
				
				break;
			}
		} while (!salir);
		
		}
	
	private Alumno leerAlumno() {
		System.out.print("Dame el nombre: ");
		String nombre = teclado2.nextLine();
		System.out.print("Dame el apellidos: ");
		String apellidos = teclado2.nextLine();
		System.out.print("Dame la edad: ");
		int edad = teclado.nextInt();
		System.out.print("Dame la nota: ");
		int nota = teclado.nextInt();
		float notaNumerica = 0;
		/**do {
			try {
				notaNumerica = Float.parseFloat(nota);
			}catch (NumberFormatException ex) {
				System.out.println("¡¡¡¡¡Mete bien la nota!!!!");
				notaNumerica = -1;
			}
		} while(notaNumerica == -1);
		**/
		Alumno alumno = new Alumno(nombre, apellidos, edad, nota);
		return alumno;
	}
	

	public static void main(String[] args) {
		Programa p = new Programa();
		p.ejecutar();
	}

	
	class CompararEdades implements Comparator <Alumno>{
		@Override
		public int compare (Alumno o1, Alumno  o2) {
			return o1.getEdad() - o2.getEdad();
		}
	}
	
	class CompararApellidosNombre implements Comparator <Alumno>{
		@Override
		public int compare (Alumno o1, Alumno  o2) {
			if (o1.getApellidos().compareTo(o2.getApellidos()) == 0) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
			return o1.getApellidos().compareTo(o2.getApellidos());
		}
	}
	
}
