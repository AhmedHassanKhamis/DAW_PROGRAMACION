package prgramacion3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	ficherocompleto fichero;
	public static Map<cliente, Map<Integer, material>> visualizaciones;
	public static Map<Integer, material> materiales;
	public static Map<Integer,cliente> clientes;

	public Main() {
		fichero = new ficherocompleto();
		if (fichero.getFichero().exists()) {
			this.materiales = fichero.leerFichero1();
			this.clientes = fichero.leerFichero2();
			this.visualizaciones = fichero.leerFichero3();
			System.out.println("¡Fichero 'qtveo.dat' leido correctamente!");
		} else {
			System.out.println("No hay un 'qtveo.dat' creado.");
			this.materiales = new TreeMap<>();
			this.clientes = new TreeMap<>();
			this.visualizaciones = new TreeMap<>();

		}
	}

	
	public static void main(String[] args) {
		Main main = new Main();
		
		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				insertarMaterial();
				break;
			case 2:
				darAlta();
				break;
			case 3:
				realizarVisualizacion();
				break;
			case 4:
				aumentarTemporadas();
				break;
			case 5:
				main.fichero.escribirFichero1(materiales);
				main.fichero.escribirFichero2(clientes);
				main.fichero.escribirFichero3(visualizaciones);
				System.out.println("adios!");
				break;
			default:
				System.out.println("Error: Opcion no reconocida");
				break;
			}
		} while (op !=5);
	}

	private static void aumentarTemporadas() {
			Iterator<material> it = materiales.values().iterator();
			while(it.hasNext()) {
				material material = (material) it.next();
				if (material instanceof serie) {
					serie serie = (serie) material;
					if (serie.posiblidadnueva == true) {
						serie.temporadas += 2;
					}
				}
			}
		}


	private static void realizarVisualizacion() {
		int nif = teclado.leerInt("introduce nif del cliente:");
		if (clientes.containsKey(nif)) {
			System.out.println(materiales.toString());
		}

	}


	private static void darAlta() {
		System.out.println("****AÑADIR cliente****");
		int nif = 0;
		boolean referenciaValida = false;
		do {
			try {
				nif = teclado.leerInt("Introduce el nif: ");
				if (clientes == null) {
					pedirDatosclienteAdd(nif);
					referenciaValida = true;
				}else {
					if(clientes.containsKey(nif)) {
						System.out.println("Error, el nif: " + nif + " YA EXISTE!!!");
					} else {
						pedirDatosclienteAdd(nif);
						referenciaValida = true;
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("Error de dato: " + e.getMessage() + "\nPor favor introduce un Número válido");
				System.out.println("cliente NO añadido.");
				referenciaValida = false;
			}
		} while(!referenciaValida);
		
		
	}

	private static void pedirDatosclienteAdd(int nif) {
			cliente cliente;
			String nombre = teclado.leerString("Nombre del cliente: ");
			int cuota = teclado.leerInt("Introduce cuota: ");
			String calle = teclado.leerString("introduce calle: ");
			int portal = teclado.leerInt("introduce portal: ");
			int codigpostal = teclado.leerInt("introduce codigo postal: ");
			direccion direccion = new direccion(calle, portal, codigpostal);
			cliente = new cliente(nif, nombre, cuota, direccion);
			clientes.put(nif, cliente);
			System.out.println("cliente añadido correctamente!");
	}



	private static void insertarMaterial() {
		System.out.println("****AÑADIR material****");
		int codigo = 0;
		boolean referenciaValida = false;
		do {
			try {
				codigo = teclado.leerInt("Introduce el codigo: ");
				if(materiales.containsKey(codigo)) {
					System.out.println("Error, el codigo: " + codigo + " YA EXISTE!!!");
				} else {
					pedirDatosmaterialAdd(codigo);
					referenciaValida = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Error de dato: " + e.getMessage() + "\nPor favor introduce un Número válido");
				System.out.println("material NO añadido.");
				referenciaValida = false;
			}
		} while(!referenciaValida);
		
		
	}

	private static void pedirDatosmaterialAdd(int codigo) {
		System.out.println("Qué tipo de material es:");
		System.out.println("1) pelicula");
		System.out.println("2) serie");
		int opcion = teclado.leerInt("");
		if (opcion == 1) {
			pelicula material;
			String nombre = teclado.leerString("Nombre del material: ");
			String fechaestrenoString = teclado.leerString("Introduce fecha de estreno (DD-MM-AAAA): ");
			String categoria = teclado.leerString("Categoria: ");
			String actor = teclado.leerString("Actor: ");
			material = new pelicula(codigo, nombre, fechaestrenoString, categoria, actor);
			materiales.put(codigo, material);
			System.out.println("material añadido correctamente!");
		} else if (opcion == 2) {
			serie material;
			String nombre = teclado.leerString("Nombre del material: ");
			String fechaestrenoString = teclado.leerString("Introduce fecha de estreno (DD-MM-AAAA): ");
			String categoria = teclado.leerString("Categoria: ");
			int temporadas = teclado.leerInt("temporadas");
			boolean posibilidadnueva = (Boolean) null;
			String posibilidadraw = teclado.leerString("posibilidad de realizar futuras temporadas(si/no)");
			if (posibilidadraw.equalsIgnoreCase("si")) {
				 posibilidadnueva = true;	
			}else {
				 posibilidadnueva = false;
			}
			material = new serie(codigo, nombre, fechaestrenoString, categoria, temporadas, posibilidadnueva);
			materiales.put(codigo, material);
			System.out.println("material añadido correctamente!");
		} else {
			System.out.println("Opción no válida!");
		}
	}


	public static int menu() {
		System.out.println("1.Insertar un nuevo material");
		System.out.println("2.Dar de alta nuevo cliente");
		System.out.println("3.Realizar una visualizacion");
		System.out.println("4.Aumentar dos temporadas");
		System.out.println("5.Salir");
		return teclado.leerInt("Escoja una opcion:");
	}

}
