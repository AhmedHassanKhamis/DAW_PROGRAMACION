package almacen;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.TreeMap;
import java.util.TreeSet;

public class Principal {

	static File fichero;
	static FicheroStream ficheroproductos;
	static TreeMap<Integer, Producto> productos;
	
	
	public Principal() {
		fichero = new File("productos.dat");
		ficheroproductos = new FicheroStream();
		if (fichero.exists() == true) {
			System.out.println("cargando datos del fichero....");
			productos = ficheroproductos.leerFichero(fichero);
		}else {
			System.out.println("creando nuevo fichero con datos......");
			productos = new TreeMap<>();
		}
		
	}
	
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		Principal.ejecutar();
		
	}
	
	public static int menu() {
		System.out.println("-----------------");
		System.out.println("1.Añadir producto");
		System.out.println("2.modificar stock producto");
		System.out.println("3.servir pedido");
		System.out.println("4.mostrar precios");
		System.out.println("5.eliminar caducados");
		System.out.println("6.salir");
		return Teclado.leerInt("introduce un opcion:");
	}
	
	public static void ejecutar() {
		int opcion = 0;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				aniadirProducto();
				break;
			case 2:
				modificarStock();
				break;
			case 3:
				servirPedido();
				break;
			case 4:
				mostrarPrecios();
				break;
			case 5:
				elliminarCaducados();
				break;
			case 6:
				System.out.println("adios!!");
				ficheroproductos.escribirFichero(productos,fichero);
				break;

			default:
				System.out.println("Opcion incorrecta!!");
				break;
			}
		} while (opcion != 6);
	}
	
	
	
	
	private static void elliminarCaducados() {
		
	}
	
	
	
	
	private static void mostrarPrecios() {
		TreeSet<Producto> a = new TreeSet<>();
		a.addAll(productos.values());
		for (Producto producto : a) {
			System.out.println("numRef:"+producto.getNumero()+" nombre:"+producto.getNombre()+" precio:"+producto.getPrecio());
			
		}
	}
	
	
	
	
	private static void servirPedido() {
		TreeSet<Producto> servir = new TreeSet();
		int numeroref = 0;
		System.out.println("para dejar de agregar productos introduzca 0!!");
		do {
			numeroref = Teclado.leerInt("introduzca numero de referencia para argregar producto:");
			if (productos.containsKey(numeroref)==true) {
				int numerosolicitado = Teclado.leerInt("introduzca la cantidad a pedir");
				if (numerosolicitado > productos.get(numeroref).getStock()) {
					System.out.println("no se puede introducir una cantidad a servir mayor que el stock actual!!\nstock:"+productos.get(numeroref).getStock());
				}else {
					Producto producto = new Producto(numerosolicitado, productos.get(numeroref).getNombre(), productos.get(numeroref).getPrecio(), numerosolicitado);
					servir.add(producto);
					productos.get(numeroref).restarStock(numerosolicitado);
				}
			}else {
				System.out.println("no existe ese producto!!!");
			}
		} while (numeroref != 0);
		System.out.println(servir);
		int suma = 0;
		for (Producto producto : servir) {
			suma += producto.getPrecio();
		}
		System.out.println("total:"+suma);
	}
	
	
	
	
	
	
	
	
	
	
	private static void modificarStock() {
		int numeroreferencia = Teclado.leerInt("Introduce numero referencia:");
		if (productos.containsKey(numeroreferencia) == true) {
			int stocknuevo = 0;
			do {
				stocknuevo = Teclado.leerInt("introduce la cantidad a añadir:");
				if (stocknuevo < 0) {
					System.out.println("La nueva cantidad no puede ser negativa!!!");
				}
			} while (stocknuevo < 0);
			productos.get(numeroreferencia).aniadirStock(stocknuevo);
			System.out.println("Producto modificado con exito!!");
		}else {
			System.out.println("Producto no existente!!");
		}
	}
	
	
	
	
	
	
	
	
	
	private static void aniadirProducto() {
		int numeroreferencia = Teclado.leerInt("Introduce numero referencia:");
		if (productos.containsKey(numeroreferencia) == false) {
			String nombre = Teclado.leerString("nombre:");
			int precio = Teclado.leerInt("precio:");
			int stock = Teclado.leerInt("stock:");
			int tipo = Teclado.leerInt("tipo de producto:\n1.perecedero\n2.No perecedero");
			if (tipo == 1) {
				int dia = Teclado.leerInt("dia caducidad:");
				int mes = Teclado.leerInt("mes caducidad:");
				int anio = Teclado.leerInt("anio caducidad:");
				LocalDate fechacaducidad = LocalDate.of(anio, mes, dia);
				int duracion;
				duracion = Period.between(LocalDate.now(),fechacaducidad).getDays();
				System.out.println(duracion);
				if (duracion >  5) {
					precio *= 2;
				}else if ( duracion<= 5 &&  duracion >=  3) {
					precio *= 1.5;
				}else if(duracion <= 3 && duracion >  0){
					precio = precio;
				}else {
					precio = 0;
				}
				productos.put(numeroreferencia, new Perecedor(numeroreferencia, nombre, precio, stock, fechacaducidad));
				System.out.println("Producto añadido con exito!!");
			}else {
				String temporal = Teclado.leerString("introduce tipo:(belleza,consumible,limpieza");
				Tipo tipo2;
				if (temporal.equalsIgnoreCase("belleza")) {
					 tipo2 = Tipo.BELLEZA;
				} else if (temporal.equalsIgnoreCase("limpieza")) {
					 tipo2 = Tipo.LIMPIEZA;
				}else {
					 tipo2 = Tipo.CONSUMIBLE;
				}
				String paisprocedencia = Teclado.leerString("pais procedencia:");
				if (tipo2.equals(Tipo.CONSUMIBLE)) {
					precio *=1.40;
				}else {
					if (!paisprocedencia.equalsIgnoreCase("españa")) {
						precio *=1.60;
					}else {
						precio *=1.40;	
					}
				}
				productos.put(numeroreferencia, new NoPerecedor(numeroreferencia, nombre, precio, stock, tipo2, paisprocedencia));	
				System.out.println("Producto añadido con exito!!");
			}
			
		}else {
			System.out.println("EL PRODUCTO EXISTE MAMAGUEBO");
		}
	}
	
	
	
	
	
	
	
	
}
