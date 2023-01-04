package random;
import java.util.*;
public class solicitaralumnosnotasarrays {
	public static int mostrarmenu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("#########MENU NOTAS ALUMNOS##########");
		System.out.println("1.Mostrar el alumno con la nota mas alta.");
		System.out.println("2.Mostrar el alumno con la nota mas baja.");
		System.out.println("3.Mostrar nota media de cada evaluacion.");
		System.out.println("4.Mostrar los alumnos que estan un punto por encima o por debajo de la nota media");
		System.out.println("5.Mostrar la moda de las notas");
		System.out.println("6.Listado de alumnos con nota final");
		System.out.println("7.Salir\n\n");
		System.out.println("introuduce la opcion deseada: ");
		int opcion = teclado.nextInt();
		return opcion;
	}
	
	public static void leer(String nombre[],int notas1[],int notas2[],int notas3[],int i) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce nombre: ");
		nombre[i] = teclado.nextLine();
		System.out.println("introduce nota 1º evaluacion: ");
		notas1[i] = teclado.nextInt();
		System.out.println("introduce nota 2º evaluacion: ");
		notas2[i] = teclado.nextInt();
		System.out.println("introduce nota 3º evaluacion: ");
		notas3[i] = teclado.nextInt();
	}
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0,alumnos = 0;
		System.out.println("Introduce la cantidad de alumnos a registrar: ");
		alumnos = teclado.nextInt();
		String nombre[] = new String[alumnos];
		int notas1[] = new int[alumnos];
		int notas2[] = new int[alumnos];
		int notas3[] = new int[alumnos];
		for (int i = 0; i < alumnos; i++) {
			leer(nombre,notas1,notas2,notas3,i);
		}	
		do {
			opcion = mostrarmenu();
		} while (opcion != 7);
		for (int i = 0; i < notas3.length; i++) {
			System.out.println(notas3[i]);
		}
		
	}
}
