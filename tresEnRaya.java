package random;

import java.util.Iterator;
import java.util.Scanner;

public class tresEnRaya {
	public static void inicializartablero(String array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = "-";
			}
		}
	}
	
	
	public static void mostrartablero(String array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j]+" | ");
			}
			System.out.println();
		}
	}
	
	public static char turno(char n) {
		if (n == 'o') {
			return 'x';
		}else {
			return 'o';
		}
	}
	
	public static boolean check(String array[][],int pos1 , int pos2) {
		if (array[pos1][pos2]!="-") {
			return false;
		}else {
			return true;	
		}
	}
	
	public static String finpartida(String array[][]) {
		boolean check1 = true,check2 = false;
		String resultado ="";
		//parte horizontal
		for (int i = 0; i < array.length; i++) {
			if (array[i][0].equals("x") && array[i][1].equals("x") && array[i][2].equals("x")) {
				check1 = false;
				resultado = "Ganador: x";
			}
			if (array[i][0].equals("o") && array[i][1].equals("o") && array[i][2].equals("o")) {
				check1 = false;
				resultado = "Ganador: o";
			}
			
		}
		//parte vertical
		for (int i = 0; i < array.length; i++) {
			if (array[0][i].equals("x") && array[1][i].equals("x") && array[2][i].equals("x")) {
				check1 = false;
				resultado = "Ganador: x";
			}
			if (array[0][i].equals("o") && array[1][i].equals("o") && array[2][i].equals("o")) {
				check1 = false;
				resultado = "Ganador: o";
			}
		}
		
		//parte diagonal
		
		if (array[0][0].equals("x") && array[1][1].equals("x") && array[2][2].equals("x")) {
			check1 = false;
			resultado = "Ganador: x";
		}
		if (array[0][0].equals("o") && array[1][1].equals("o") && array[2][2].equals("o")) {
			check1 = false;
			resultado = "Ganador: o";
		}
		
		//parte diagonal inversa
		
		if (array[2][0].equals("x") && array[1][1].equals("x") && array[0][2].equals("x")) {
			check1 = false;
			resultado = "Ganador: x";
		}
		if (array[2][0].equals("o") && array[1][1].equals("o") && array[0][2].equals("o")) {
			check1 = false;
			resultado = "Ganador: o";
		}

		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] == "-") {
					check2 = true;
				}
			}
		}
		
		if (check1 == true && check2 == true) {
			return resultado = "" ;
		}else if(check1 == true && check2 == false){
			return resultado = "Empate";
		}else{
			return resultado;
		}
	}
	
	public static void juega(String array[][],int pos1 , int pos2, char turno) {
		String cambiarformato = ""+turno;	
		array[pos1][pos2] = cambiarformato;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char turno = 'x';
		System.out.println("!Bienvenido al tres en raya!");
		String[][] tablero = new String[3][3];
		inicializartablero(tablero);
		int pos1,pos2;
		do {
			mostrartablero(tablero);
			System.out.println("turno de: "+turno);
			do {
			System.out.println("introduce la fila: ");
			pos1 = scan.nextInt();
			System.out.println("introduce la columna: ");
			pos2 = scan.nextInt();
			if (check(tablero,pos1,pos2) != true) {
				System.out.println("Ups!..esa celda ya fue usada");
			}
			}while(check(tablero,pos1,pos2) != true);
			juega(tablero,pos1,pos2,turno);
			if (finpartida(tablero).equals("")) {
				System.out.println("cambio de turno!!!");
				turno = turno(turno);
			}
		}while(finpartida(tablero).equals(""));
		System.out.println();
		System.out.println("################################## fin de la partida ##################################");
		mostrartablero(tablero);
		System.out.println(finpartida(tablero));
	}

}
