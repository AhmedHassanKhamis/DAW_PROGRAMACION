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
	
	public static boolean finpartida(String array[][]) {
		boolean check1 = true,check2 = true;
		for (int i = 0; i < array.length; i++) {
			if ((array[i][0] == "x" && array[i][1] == "x" && array[i][2] == "x") || (array[i][0] == "o" && array[i][1] == "o" && array[i][2] == "o")) {
				check1 = false;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if ((array[0][i] == "x" && array[1][i] == "x" && array[2][i] == "x") || (array[0][i] == "o" && array[1][i] == "o" && array[2][i] == "o")) {
				check1 = false;
			}
		}
		if ((array[0][0] == "x" && array[1][1] == "x" && array[2][2] == "x") || (array[0][0] == "o" && array[1][1] == "o" && array[2][2] == "o")) {
			check1 = false;
		}
		if ((array[2][0] == "x" && array[1][1] == "x" && array[0][2] == "x") || (array[2][0] == "o" && array[1][1] == "o" && array[0][2] == "o")) {
			check1 = false;
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] == "-") {
					check2 = true;
				}
			}
		}
		
		if (check1 == true && check2 == true) {
			return false;
		}else {
			return true;
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
			System.out.println("cambio de turno!!!");
			turno = turno(turno);
		}while(finpartida(tablero) == false);
		System.out.println("fin de la partida!!!");
		mostrartablero(tablero);
	}

}
