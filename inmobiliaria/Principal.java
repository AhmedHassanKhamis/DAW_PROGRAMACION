package inmobiliaria;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Principal {

	static TreeMap<Integer, Cliente> clientes;
	TreeMap<Integer, Anuncio> anuncios;
	File fichero;
	FicheroStream ficherostream;
	
	
	public Principal() {
		fichero = new File("todovendo.dat");
		ficherostream = new FicheroStream();
		if (fichero.exists() == true) {
			ficherostream.leerFichero(fichero);
			System.out.println("cargando datos del fichero....");
			clientes = ficherostream.getclientes();
			anuncios = ficherostream.getanuncios();
		}else {
			System.out.println("creando datos del fichero....");
			clientes = new TreeMap<>();
			anuncios = new TreeMap<>();		
		}
	}
	
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.ejecutar();
	}
	
	public void ejecutar() {
		clientes.put(1, new Cliente(1, "prueba", LocalDate.now(), new Direccion("calle", 1, "madrid", 1)));
		int opcion = 0;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				importarClientes();
				break;
			case 2:
				insertarAnuncio();
				break;
			case 3:
				darBajaAnuncio();
				break;
			case 4:
				eliminarAnuncio();
				break;
			case 5:
				listar();
				break;
			case 6:
				ficherostream.escribirFichero(clientes,anuncios,fichero);
				System.out.println("adios!");
				break;

			default:
				System.out.println("opcion incorrecta!!!");
				break;
			}
		} while (opcion != 6);
	}


	public void listar() {
		TreeSet<Anuncio> lista = new TreeSet<>();
		int codigopostal = Teclado.leerInt("codigo postal:");
		for (Anuncio anuncio : anuncios.values()) {
			if (anuncio.getDireccion().getCodigopostal() == codigopostal) {
				lista.add(anuncio);
			}
		}
		System.out.println("LISTA DE ANUNCIOS:");
		if (lista.isEmpty() == false) {
			for (Anuncio anuncio : lista) {
				System.out.println("codigo referencia:"+anuncio.getCodigo());
				String tipo;
				if (anuncio instanceof Piso) {
					tipo = "Piso";
				}else {
					tipo = "Habitacion";
				}
				System.out.println("tipo de alquiler:"+tipo);
				System.out.println("precio:"+anuncio.getImporte());
				System.out.println("---------------------------");
			}
		}else {
			System.out.println("no existe ningun anuncio con dicho codigo postal!!!");
		}
	}


	public void eliminarAnuncio() {
		ArrayList<Anuncio> pochos = new ArrayList<>();
		int sumaprecio = 0;
		for (Anuncio anuncio : anuncios.values()) {
			if (anuncio.getFechabaja().isBefore(LocalDate.now())) {
				pochos.add(anuncio);
				sumaprecio += anuncio.getImporte();
				anuncios.remove(anuncio.getCodigo());
			}
		}
		System.out.println("numero de anuncios borrados:"+pochos.size());
		System.out.println("precio total de anuncios borrados:"+sumaprecio);
	}


	public void darBajaAnuncio() {
		int codigo = Teclado.leerInt("codigo referencia:");
		if (anuncios.containsKey(codigo) == true) {
			int dia = Teclado.leerInt("dia de baja:");
			int mes = Teclado.leerInt("mes de baja:");
			int anio = Teclado.leerInt("anio de baja:");
			LocalDate fechabaja = LocalDate.of(anio, mes, dia);
			if (fechabaja.isAfter(anuncios.get(codigo).getFechapublicacion())) {
				Anuncio anuncio = anuncios.get(codigo);
				anuncio.setFechabaja(fechabaja);
				System.out.println("Fecha de baja establecida con exito!!");
			}else {
				System.out.println("no se puede establecer fecha de baja antes de publicacion!!!!");
			}
		}else {
			System.out.println("no existe ese anuncio!!");
		}
	}


	public void insertarAnuncio() {
		int nif = Teclado.leerInt("NIF cliente:");
		if (clientes.containsKey(nif) == true) {
			int codigo = Teclado.leerInt("codigo referencia:");
			if (anuncios.containsKey(codigo)==false) {
				int importe = Teclado.leerInt("importe:");
				int dia = Teclado.leerInt("dia publicacion:");
				int mes = Teclado.leerInt("mes publicacion:");
				int anio = Teclado.leerInt("anio publicacion:");
				LocalDate fechapublicacion = LocalDate.of(anio, mes, dia);
				String temporal = Teclado.leerString("introduce estado de la publicacion(Libre,Señalizado,Alquilado):");
				Estado estado;
				if (temporal.equalsIgnoreCase("libre")) {
					estado = Estado.LIBRE;
				}else if (temporal.equalsIgnoreCase("señalizado")) {
					estado = Estado.SENIALIZADO;
				}else{
					estado = Estado.ALQUILADO;
				}
				String calle = Teclado.leerString("calle:");
				int portal = Teclado.leerInt("portal:");
				String localidad = Teclado.leerString("localidad:");
				int codigopostal = Teclado.leerInt("codigo Postal:");
				Direccion direccion = new Direccion(calle, portal, localidad, codigopostal);
				int tipoAnuncio = Teclado.leerInt("introduce el tipo de anuncio(1.piso 2.habitacion)");
				if (tipoAnuncio ==1) {
					int numerodormitorios = Teclado.leerInt("numero dormitorios:");
					for (int i = 0; i < numerodormitorios; i++) {
						importe += 20;
					}
					int numerobanios = Teclado.leerInt("numero baños:");
					int haycalefaccion = Teclado.leerInt("calefaccion(1.si 2.no)");
					boolean calefaccion;
					if (haycalefaccion == 1) {
						calefaccion = true;
						importe += 50;
					}else {
						calefaccion = false;
					}
					anuncios.put(codigo, new Piso(codigo, importe, fechapublicacion, estado, direccion, numerodormitorios, numerobanios, calefaccion));
					System.out.println("anuncio agregado con exito!!!");
				}else {
					int metros = Teclado.leerInt("metros cuadrados:");
					for (int i = 0; i < metros; i++) {
						importe += 1;
					}
					int permitemascota = Teclado.leerInt("permite mascota(1.si 2.no)");
					boolean mascota;
					if (permitemascota == 1) {
						mascota = true;
						importe += 15;
					}else {
						mascota = false;
					}
					anuncios.put(codigo, new Habitacion(codigo, importe, fechapublicacion, estado, direccion, metros, mascota));
					System.out.println("anuncio agregado con exito!!!");
				}
			}else {
				System.out.println("Anuncio ya Existente!!!\nListado de anuncios:");
				System.out.println(anuncios.values());
			}
		} else {
			System.out.println("Usuario no existente!!");
		}
	}


	public void importarClientes() {
		File ficheroclientes = new File("clientes.csv");
		FicheroTexto ficherotextoclientes = new FicheroTexto();
		if (ficheroclientes.exists() == true) {
			System.out.println("cargando clientes del fichero....");
			//clientes = ficherotextoclientes.leerClientes(ficheroclientes);
		}else {
			System.out.println("No existe dicho fichero!!");
		}	
	}
	
	

	public int menu() {
		System.out.println("----------------------");
		System.out.println("1.importar clientes");
		System.out.println("2.insertar anuncio");
		System.out.println("3.dar baja anuncio");
		System.out.println("4.eliminar anuncio");
		System.out.println("5.listar anuncios");
		System.out.println("6.Salir");
		return Teclado.leerInt("introduce opcion:");
	}
	
	
	
	
	
	
}
