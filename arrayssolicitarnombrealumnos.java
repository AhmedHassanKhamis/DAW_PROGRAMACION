package random;
import java.util.*;
public class arrayssolicitarnombrealumnos {
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
	
	public static void notaalta(String nombre[],int notas1[], int notas2[], int notas3[]) {
		int alta1=0,alta2=0,alta3=0,mayor,posicion = 0;
		alta1 = Arrays.stream(notas1).max().getAsInt();
		alta2 = Arrays.stream(notas2).max().getAsInt();
		alta3 = Arrays.stream(notas3).max().getAsInt();
		if (alta1 > alta2 && alta1 > alta3) {
			mayor = alta1;
		}else if (alta2 > alta1 && alta2 > alta3) {
			mayor = alta2;
		}else {
			mayor = alta3;
		}
		for (int i = 0; i < notas3.length; i++) {
			if (notas1[i] == mayor) {
				posicion = i;
			}else if (notas2[i] == mayor) {
				posicion = i;
			}else if (notas3[i] == mayor) {
				posicion = i;
			}
		}
		System.out.println("nota mas alta "+ mayor + " del alumno "+nombre[posicion]);
		
	}
	
	public static void notabaja(String nombre[],int notas1[], int notas2[], int notas3[]) {
		int alta1=0,alta2=0,alta3=0,menor,posicion = 0;
		alta1 = Arrays.stream(notas1).min().getAsInt();
		alta2 = Arrays.stream(notas2).min().getAsInt();
		alta3 = Arrays.stream(notas3).min().getAsInt();
		if (alta1 < alta2 && alta1 < alta3) {
			menor = alta1;
		}else if (alta2 < alta1 && alta2 < alta3) {
			menor = alta2;
		}else {
			menor = alta3;
		}
		for (int i = 0; i < notas3.length; i++) {
			if (notas1[i] == menor) {
				posicion = i;
			}else if (notas2[i] == menor) {
				posicion = i;
			}else if (notas3[i] == menor) {
				posicion = i;
			}
		}
		System.out.println("nota mas baja "+ menor + " del alumno "+nombre[posicion]);
		
	}

	public static void notamedia(int notas1[], int notas2[], int notas3[]) {
		double media1=0,media2=0,media3=0;
		media1 = Arrays.stream(notas1).average().orElse(Double.NaN);
		media2 = Arrays.stream(notas2).average().orElse(Double.NaN);
		media3 = Arrays.stream(notas3).average().orElse(Double.NaN);
		System.out.println("la media de la primera evaluacion: "+media1);
		System.out.println("la media de la segunda evaluacion: "+media2);
		System.out.println("la media de la tercera evaluacion: "+media3);
		
	}

	public static void poruno(String nombre[],int notas1[], int notas2[], int notas3[]) {
		double media1=0,media2=0,media3=0,menor,posicion = 0;
		media1 = Arrays.stream(notas1).average().orElse(Double.NaN);
		media2 = Arrays.stream(notas2).average().orElse(Double.NaN);
		media3 = Arrays.stream(notas3).average().orElse(Double.NaN);
		System.out.println("la media de la primera evaluacion: "+media1);
		for (int i = 0; i < notas1.length; i++) {
			if (notas1[i] == (int)media1 +1 || notas1[i] == (int)media1 -1) {
				System.out.println(nombre[i]+"-nota: "+notas1[i]);
			}
		}
		System.out.println("la media de la segunda evaluacion: "+media2);
		for (int i = 0; i < notas2.length; i++) {
			if (notas2[i] == (int)media2 +1 || notas2[i] == (int)media2 -1) {
				System.out.println(nombre[i]+"-nota: "+notas2[i]);
			}
		}
		System.out.println("la media de la tercera evaluacion: "+media3);
		for (int i = 0; i < notas3.length; i++) {
			if (notas3[i] == (int)media3 +1 || notas3[i] == (int)media3 -1) {
				System.out.println(nombre[i]+"-nota: "+notas3[i]);
			}
		}
	}
	
	public static void moda(int notas1[], int notas2[], int notas3[]) {
		int j = 0;
		int array[]  = new int [notas1.length+notas2.length+notas3.length];
		for (int i = 0; i < array.length; i+=3) {
			array[i] = notas1[j];
			array[i+1] = notas2[j];
			array[i+2] = notas3[j];
			j++;
		}
		System.out.println(Arrays.toString(array));
		 int moda = 0,contadorold = 0;
		for (int i = 0; i < array.length; i++) {
			int contador = 0;
			for (int k = 0; k < array.length; k++) {
				if (array[i]==array[k]) {
					contador++;
				}
			}
			if (contador > contadorold ) {
				moda = array[i];
				contadorold = contador;
			}
		}
		System.out.println(("moda: "+moda));
	}
	
	public static void notafinal(String nombre[],int notas1[],int notas2[],int notas3[]) {
		int suma = 0;
		double media = 0;
		for (int i = 0; i < nombre.length; i++) {
			suma = notas1[i]+notas2[i]+notas3[i];
			media = suma / 3;
			System.out.println("nota final de "+nombre[i]+" : "+media);
		}
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
			switch (opcion) {
			case 1:
				notaalta(nombre,notas1, notas2, notas3);
				break;
				
			case 2:
				notabaja(nombre,notas1, notas2, notas3);
				break;
				
			case 3:
				notamedia(notas1, notas2, notas3);
				break;
				
			case 4:
				poruno(nombre,notas1, notas2, notas3);
				break;
				
			case 5:
				moda(notas1, notas2, notas3);
				break;
				
			case 6:
				notafinal(nombre,notas1, notas2, notas3);
				break;
				
			case 7:
				System.out.println("Adios!");
				break;

			default:
				System.out.println("Error: opcion no reconocida");
				break;
			}
		} while (opcion != 7);
		
		
	}
}
