package random;

import java.util.Scanner;

public class funcion8 {

		public static int tarot(int videncia) {
			//* FORMA SUCIA
			String n1,n2,n3,n4,n5,n6;
			int resultado,subresultado;
			String cadena = String.valueOf(videncia);
			n1 = String.valueOf(cadena).substring(0,1);
			n2 = String.valueOf(cadena).substring(1,2);
			n3 = String.valueOf(cadena).substring(2,3);
			n4 = String.valueOf(cadena).substring(3,4);
			subresultado = Integer.valueOf(n1) +Integer.valueOf(n2) + Integer.valueOf(n3) + Integer.valueOf(n4);
			n5 = String.valueOf(subresultado).substring(0,1);
			n6 = String.valueOf(subresultado).substring(1,2);
			resultado = Integer.valueOf(n6) + Integer.valueOf(n5);
			/*
			int n1,n2,n3,n4,n5,n6,resultado,subresultado;
			n1 = videncia / 1000;
			n2 = (videncia / 100) - (n1 * 10) ;
			n3 = (videncia / 10) - (n2 * 10) - (n1 * 100);
			n4 = (videncia / 1) -  (n3 * 10) -(n2 * 100) - (n1 * 1000);
			subresultado = n1 + n2 + n3 + n4;
			n5 = subresultado / 10;
			n6 = subresultado - (n5 * 10) ;
			resultado = n5 + n6;
			*/
			return resultado;
			
			
		}
		
		public static int suma(int dia,int mes, int anio) {
			int resultado = dia + mes + anio;
			return resultado;
		}
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce dia");
		int dia  = teclado.nextInt();
		System.out.println("introduce mes");
		int mes  = teclado.nextInt();
		System.out.println("introduce anio");
		int anio  = teclado.nextInt();
		
		System.out.println("tu numero del tarot es: "+tarot(suma(dia,mes,anio)));
			
		}
	}
