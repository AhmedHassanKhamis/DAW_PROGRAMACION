package netflix;

import java.io.File;
import java.time.LocalDate;
import java.util.TreeMap;
import java.util.TreeSet;

public class Principal {
	
	static TreeMap<Integer, Material> materiales;
	static TreeMap<Integer, Cliente> clientes;
	static File fichero;
	static FicheroStream ficherostream;
	
	
	public Principal() {
		fichero = new File("qtveo.dat");
		ficherostream = new FicheroStream();
		if (fichero.exists()) {
			System.out.println("cargando datos de fichero...");
			materiales = ficherostream.getmateriales();
			clientes = ficherostream.getclientes();
		}else {
			System.out.println("creando datos de fichero...");
			materiales = new TreeMap<>();
			clientes = new TreeMap<>();
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.ejecutar();
	}
	
	public static void ejecutar() {
		int opcion = 0;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				insertarMaterial();
				break;
			case 2:
				darAlta();
				break;
			case 3:
				visualizar();
				break;
			case 4:
				aumentarTemporadas();
				break;
			case 5:
				System.out.println("adios!");
				ficherostream.escribirFichero(clientes, materiales, fichero);
				break;
			default:
				System.out.println("opcion incorrecta!!");
				break;
			}
		} while (opcion !=5 );
	}
	
	
	
	
	private static void aumentarTemporadas() {
		int dia = 1;
		int mes = 1;
		int anio = LocalDate.now().getYear();
		LocalDate comienzo = LocalDate.of(anio, mes, dia);
		for (Material material: materiales.values()) {
			if (material instanceof Serie) {
				Serie serie = (Serie) material;
				if (serie.getFechaestreno().isBefore(comienzo)) {
					serie.temporadasmasdos();
				}
				
			}
		}
	}




	private static void visualizar() {
		TreeSet<Material> lista= new TreeSet<>();
		for (Material material : materiales.values()) {
			if (material.getFechaestreno().isBefore(LocalDate.now())) {
				lista.add(material);
			}
		}
		int nif = Teclado.leerInt("NIF:");
		if (clientes.containsKey(nif) == true) {
			System.out.println(lista);
			int numref = Teclado.leerInt("introduce el numero de referencia de pelicula a visualizar:");
			Cliente cliente = clientes.get(nif);
			cliente.realizarvisualizacion(numref, materiales);
			clientes.put(nif, cliente);
			System.out.println("has visualizado:" +numref);
		}else {
			System.out.println("Ese cliente no existe!!!");
		}
	}




	private static void darAlta() {
		int nif = Teclado.leerInt("NIF:");
		if (clientes.containsKey(nif)== false) {
			String nombre = Teclado.leerString("nombre:");
			int cuota = Teclado.leerInt("cuota:");
			String calle = Teclado.leerString("calle:");
			int portal = Teclado.leerInt("portal:");
			String localidad = Teclado.leerString("localidad:");
			int codigopostal = Teclado.leerInt("codigopostal:");
			Direccion direccion = new Direccion(calle, portal, localidad, codigopostal);
			clientes.put(nif, new Cliente(nif, nombre, cuota, direccion));
			System.out.println("cliente dado de alta con exito!!");
		}else {
			System.out.println("Ese cliente ya existe!!!");
		}
	}




	private static void insertarMaterial() {
		int numeroreferencia = Teclado.leerInt("Numero referencia:");
		if (materiales.containsKey(numeroreferencia)== false) {
			String nombre = Teclado.leerString("nombre:");
			int dia = Teclado.leerInt("dia estreno:");
			int mes = Teclado.leerInt("mes estreno:");
			int anio = Teclado.leerInt("anio estreno:");
			LocalDate fechaestreno = LocalDate.of(anio, mes, dia);
			String tipo = Teclado.leerString("introduce Categoria:(AVENTURA,ACCION,TERROR,COMEDIA)");
			Categoria categoria;
			if (tipo.equalsIgnoreCase("AVENTURA")) {
				categoria = Categoria.AVENTURA;
			} else if (tipo.equalsIgnoreCase("ACCION")) {
				categoria = Categoria.ACCION;
			} else if (tipo.equalsIgnoreCase("TERROR")) {
				categoria = Categoria.TERROR;
			}else {
				categoria = Categoria.COMEDIA;
			}
			
			int tipomaterial = Teclado.leerInt("introduce tipo material:\n1.pelicula\n2.serie");
				if (tipomaterial == 1) {
				String actor = Teclado.leerString("Actor:");
				materiales.put(numeroreferencia, new Pelicula(numeroreferencia, nombre, fechaestreno, categoria, actor));
				System.out.println("Material insertado con exito!!!");
			}else {
				int temporadasprevistas = Teclado.leerInt("temporadas:");
				int posibilidad = Teclado.leerInt("1.si\n2.no");
				boolean posibilidadtemporadas = false;
				if (posibilidad == 1) {
					posibilidadtemporadas = true;
				}else {
					posibilidadtemporadas = false;
				}
				System.out.println("Material insertado con exito!!!");
				materiales.put(numeroreferencia, new Serie(numeroreferencia, nombre, fechaestreno, categoria, temporadasprevistas,posibilidadtemporadas));
			}
		}else {
			System.out.println("Ese material ya existe!!!\nlistado de existentes:");
			for (Material material : materiales.values()) {
				System.out.println(material.getCodigo());
			}
		}
	}




	public static int menu() {
		System.out.println("-----------------");
		System.out.println("1.insertar material");
		System.out.println("2.dar alta");
		System.out.println("3.visualizacion");
		System.out.println("4.aumentar temporadas");
		System.out.println("5.salir");
		return Teclado.leerInt("introduce opcion:");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
