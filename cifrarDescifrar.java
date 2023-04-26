package cifrados;
/**
 * Opción 1: Cifrar texto
El programa solicita un texto por teclado, la contraseña (el desplazamiento) y la ruta del fichero que se generará con el texto cifrado.
En caso de que el fichero proporcionado exista, tendrá que preguntar al usuario si desea sobrescribir el fichero o añadir texto al final.
Opción 2: Cifrar fichero
El programa solicita la ruta del fichero a cifrar, la contraseña (el desplazamiento) y la ruta del fichero que se generará con el texto cifrado.
En caso de que el fichero a cifrar no exista, tendrá que notificarse al usuario y pedir de nuevo dicha ruta.
Opción 3: Descifrar fichero
El programa solicita la ruta del fichero a descifrar, la contraseña con la que ha sido cifrado el texto y la ruta del fichero que se generará con el texto descifrado.
En caso de que el fichero a descifrar no exista, tendrá que notificarse al usuario y pedir de nuevo dicha ruta.
Opción 4:
El programa solicita un texto cifrado por teclado, la contraseña con el que ha sido cifrado (el desplazamiento) y la ruta del fichero que se generará con el texto descifrado.
En caso de que el fichero proporcionado exista, tendrá que preguntar al usuario si desea sobrescribir el fichero o proporcionar una nueva ruta.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cifrarDescifrar{
	
	public static int menu() {
		Scanner teclado = new Scanner(System.in);
		int op = 0;
		System.out.println("1.Cifrar texto");
		System.out.println("2.Cifrar fichero");
		System.out.println("3.Descifrar fichero");
		System.out.println("4.Descifrar texto");
		System.out.println("5.Salir");
		op = teclado.nextInt();
		return op;
	}
	
	public static String cifrar(String cadena) {
		Scanner teclado = new Scanner(System.in);
		String resultado ="";
		System.out.println("indica el desplazamiento del cifrado:");
		int desplazamiento = teclado.nextInt();
		for (int i = 0; i < cadena.length(); i++) {
			char nuevo = (char) (cadena.charAt(i)+ desplazamiento);
			resultado += nuevo;
		}
		return resultado;
	}
	
	public static String descifrar(String cadena) {
		Scanner teclado = new Scanner(System.in);
		String resultado ="";
		System.out.println("indica el desplazamiento del cifrado:");
		int desplazamiento = teclado.nextInt();
		for (int i = 0; i < cadena.length(); i++) {
			char nuevo = (char) (cadena.charAt(i) - desplazamiento);
			resultado += nuevo;
		}
		return resultado;
	}
	
	public static void crear(String archivo) {
		 try {
		      File myObj = new File("../"+archivo+".txt");
		      if (!myObj.exists()) {
		    	 myObj.createNewFile();
		    	 System.out.println("Fichero creado: " + myObj.getName());
		      } else {
		        System.out.println("Fichero ya existe!.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	

	public static void leer(String archivo) {
		
	}
	
	public static void escribir(String archivo,int opcion) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Texto a escribir:");
		String cadena = teclado.nextLine();
		 try {
		      FileWriter myWriter = new FileWriter("../cifrado.txt",true);
		      myWriter.write("\n");
		      if (opcion == 1) {
			      myWriter.write(cifrar(cadena));
		      }if (opcion == 2) {
			      myWriter.write(descifrar(cadena));
		      }
		      myWriter.close();
		      System.out.println("se escribio de forma correcta en el fichero");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	public static void sobreescribir(String archivo) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Texto a sobreescribir:");
		String cadena = teclado.nextLine();
		 try {
		      FileWriter myWriter = new FileWriter("../cifrado.txt");
		      myWriter.write(cadena);
		      myWriter.close();
		      System.out.println("se escribio de forma correcta en el fichero");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int op = 0,op2 = 0;
		String archivo = "";
		do {
			op = menu();
			switch (op) {
			case 1:
				System.out.println("Archivo:");
				archivo = teclado.nextLine();
				crear(archivo);
				System.out.println("desea 1-escribir o 2-sobrescribir?");
				op2 = teclado2.nextInt();
				switch (op2) {
				case 1:
					escribir(archivo,1);
					break;
					
				case 2:
					sobreescribir(archivo);
					break;

				default:
					System.out.println("opcion no reconocida!");
					break;
				}
				break;

			case 2:
				System.out.println("Archivo:");
				 archivo = teclado.nextLine();		
				break;
			case 3:
				System.out.println("Archivo:");
				 archivo = teclado.nextLine();
				break;
			case 4:
				System.out.println("Archivo:");
				archivo = teclado.nextLine();
				crear(archivo);
				System.out.println("desea 1-escribir o 2-sobrescribir?");
				op2 = teclado2.nextInt();
				switch (op2) {
				case 1:
					escribir(archivo,2);
					break;
					
				case 2:
					sobreescribir(archivo);
					break;

				default:
					System.out.println("opcion no reconocida!");
					break;
				}
				break;
			case 5:
				System.out.println("Adios!");
				break;
				
			default:
				System.out.println("opcion incorrecta!");
				break;
			}
		} while (op !=5);
		
	}

}
