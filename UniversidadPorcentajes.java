/* 
Con base en una encuesta realizada a N estudiantes (N<=50) en una Universidad donde se solicitó la siguiente información: CÉDULA, SEXO, SUELDO, TRABAJA. Donde:

CEDULA (Es un número entero)
SEXO (1 - Masculino 2 – Femenino)
TRABAJA (1 - Si trabaja 2 - No trabaja)
SUELDO (Es un valor entero)
Escriba el programa que permita leer y almacenar en vectores los datos solicitados, luego, calcular e imprimir:

Porcentaje de hombres en la Universidad
Porcentaje de mujeres en la Universidad
Porcentaje de hombres que trabajan y sueldo promedio
Porcentaje de mujeres que trabajan y sueldo promedio
 */
package random;

import java.util.Arrays;
import java.util.Scanner;

public class UniversidadPorcentajes {

	public static void Porcentajes(int cedula[],int sexo[],int trabaja[],int sueldo[]) {
		int alumnos = sexo.length,contadorH=0,contadorM=0;
		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 1) {
				contadorH++;
				if () {
					
				}
			}else if (sexo[i] == 2) {
				contadorM++;
			}
		}
		double porH = (contadorH*100)/(contadorH+contadorM);
		double porM = (contadorM*100)/(contadorH+contadorM);
		System.out.println("Porcentaje de hombres: "+porH+"%");
		System.out.println("Porcentaje de mujeres: "+porM+"%");

		
		
		
	}
	
	
	public static void leer(int cedula[],int sexo[],int trabaja[],int sueldo[],int i) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce cedula: ");
		cedula[i] = teclado.nextInt();
		System.out.println("introduce sexo (1 - Masculino 2 – Femenino): ");
		sexo[i] = teclado.nextInt();
		System.out.println("introduce trabaja (1 - Si trabaja 2 - No trabaja): ");
		trabaja[i] = teclado.nextInt();
		System.out.println("introduce sueldo: ");
		sueldo[i] = teclado.nextInt();
	}
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int cantidadmax = 50;
		int cedula[] = new int[cantidadmax];
		int sexo[] = new int[cantidadmax];
		int trabaja[] = new int[cantidadmax];
		int sueldo[] = new int[cantidadmax];
		System.out.println("alumnos a ingestar: ");
		int alumnos = teclado.nextInt();
		for (int i = 0; i < alumnos; i++) {
			leer(cedula,sexo,trabaja,sueldo,i);
		}			
		System.out.println(Arrays.toString(sexo));
		Porcentajes(cedula, sexo, trabaja, sueldo);
		
	}
}
