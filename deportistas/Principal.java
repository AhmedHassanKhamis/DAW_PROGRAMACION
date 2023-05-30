package deportistas;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collections;
import java.util.HashMap;

import netflix.Teclado;


public class Principal {

	File fichero;
	HashMap <String,Deportista> deportistas;
	FicheroStream fs;
	LocalTime tiempoinicio;
	
	public Principal() {
		this.fichero = new File("deportistas.dat");
		this.tiempoinicio = LocalTime.now();
		fs = new FicheroStream();	
		if (this.fichero.exists()) {
			System.out.println("Cargando base de datos....");
			fs.leerFichero(fichero);
			this.deportistas = fs.getdeportistas2();
		}else {
			System.out.println("Creando base de datos....");
			this.deportistas = new HashMap<>();
		}
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.ejecutar();
	}
	
	public static int menu() {
		System.out.println("--------------");
		System.out.println("1.Dar alta deportista");
		System.out.println("2.Dar baja deportista");
		System.out.println("3.Edicion deportista");
		System.out.println("4.listar deportista por tipo");
		System.out.println("5.salir");
		return Teclado.leerInt("introduzca opcion deseada");
	}
	
	public void ejecutar() {
		int op = 0;
		do {
			try {
				op = menu();
				switch (op) {
				case 1:
					darAlta();
					break;
				case 2:
					darbaja();
					break;
				case 3:
					edicion();
					break;
				case 4:
					lista();
					break;
				case 5:
					LocalTime tiempofin = LocalTime.now();
					Duration duracion = Duration.between(tiempoinicio, tiempofin);
					fs.escribirFichero(deportistas, fichero);
					System.out.println("Adios!");
					System.out.println("Tiempo transcurrido en segundos: "+ duracion.getSeconds());
					break;

				default:
					System.out.println("Error: opcion invalida");
					break;
				}	
			} catch (Exception e) {
				e.printStackTrace();
				op = 5;
			}
		} while (op != 5);
	}


	private void lista() {
		int op = 0;
		HashMap<String, Deportista> deportistas2 = new HashMap<>();
		do {
			op = Teclado.leerInt("selecciona tipo a listar:\n1.atletas\n2.cicilistas");
			switch (op) {
			case 1:
				for (Deportista deportista : deportistas.values()) {
					if (deportista instanceof Atleta) {
						deportistas2.put(deportista.getDni(), deportista);
					}
				}
				System.out.println(deportistas2.values());
				break;
			case 2:
				for (Deportista deportista : deportistas.values()) {
					if (deportista instanceof Ciclista) {
						deportistas2.put(deportista.getDni(), deportista);
					}
				}
				System.out.println(deportistas2.values());
				break;

			default:
				System.out.println("opcion incorrecta!!");
				break;
			}
		} while (op!=1 && op != 2);
	}


	private void edicion() {
		String dni = Teclado.leerString("dni");
		if (deportistas.containsKey(dni) == true) {
			String nombre = Teclado.leerString("nombre:");
			int dianaci = Teclado.leerInt("dia de nacimiento:");
			int mesnaci = Teclado.leerInt("mes nacimiento(en numero):");
			int anionaci = Teclado.leerInt("anio nacimiento:");
			LocalDate fechanaci = LocalDate.of(anionaci, mesnaci, dianaci);
			if (deportistas.get(dni) instanceof Atleta) {
				String lugarprueba = Teclado.leerString("lugar prueba:");
				int distanciareccorida = Teclado.leerInt("distancia recorrida:");
				int segmarca = Teclado.leerInt("segundos de marca:");
				int minmarca = Teclado.leerInt("minutos de marca:");
				int horamarca = Teclado.leerInt("hora de marca:");
				LocalTime marca = LocalTime.of(horamarca, minmarca,segmarca);
				deportistas.put(dni, new Atleta(dni, nombre, fechanaci, lugarprueba, distanciareccorida, marca));
				System.out.println("Deportista (atleta:"+dni+") editado correctamente!");
			}else {
				String nombreprueba = Teclado.leerString("nombre prueba:");
				int numeroetapas = Teclado.leerInt("numero etapas:");
				int puestoclasificacion = Teclado.leerInt("puesto clasificacion global:");
				int etapasganadas = Teclado.leerInt("etapas ganadas:");
				deportistas.put(dni, new Ciclista(dni, nombre, fechanaci, nombreprueba, numeroetapas, puestoclasificacion, etapasganadas));
				System.out.println("Deportista (ciclista:"+dni+") editado correctamente!");
			}
		}else {
			System.out.println("Usuario no existente!");
		}
	}


	private void darbaja() {
		String dni = Teclado.leerString("dni de deportista a borrar: ");
		if (deportistas.containsKey(dni) == true) {
			deportistas.remove(dni);
			System.out.println("deportista eliminado correctamente!");
		}else {
			System.out.println("deportista no existente para borrar!!");
		}
	}


	private void darAlta() {
		String dni = Teclado.leerString("nuevo dni");
		if (deportistas.containsKey(dni) == false) {
			String nombre = Teclado.leerString("nombre:");
			int dianaci = Teclado.leerInt("dia de nacimiento:");
			int mesnaci = Teclado.leerInt("mes nacimiento(en numero):");
			int anionaci = Teclado.leerInt("anio nacimiento:");
			LocalDate fechanaci = LocalDate.of(anionaci, mesnaci, dianaci);
			int op = 0;
			do {
				op = Teclado.leerInt("introduzca tipo: \n1.atleta \n2.ciclista:");
				if (op == 1) {
					String lugarprueba = Teclado.leerString("lugar prueba:");
					int distanciareccorida = Teclado.leerInt("distancia recorrida:");
					int segmarca = Teclado.leerInt("segundos de marca:");
					int minmarca = Teclado.leerInt("minutos de marca:");
					int horamarca = Teclado.leerInt("hora de marca:");
					LocalTime marca = LocalTime.of(horamarca, minmarca,segmarca);
					deportistas.put(dni, new Atleta(dni, nombre, fechanaci, lugarprueba, distanciareccorida, marca));
					System.out.println("Deportista (atleta:"+dni+") agregado correctamente!");
				}else if (op == 2) {
					String nombreprueba = Teclado.leerString("nombre prueba:");
					int numeroetapas = Teclado.leerInt("numero etapas:");
					int puestoclasificacion = Teclado.leerInt("puesto clasificacion global:");
					int etapasganadas = Teclado.leerInt("etapas ganadas:");
					deportistas.put(dni, new Ciclista(dni, nombre, fechanaci, nombreprueba, numeroetapas, puestoclasificacion, etapasganadas));
					System.out.println("Deportista (ciclista:"+dni+") agregado correctamente!");
				}else {
					System.out.println("opcion incorrecta!!");
				}
			} while (op != 1 && op != 2);
		}else {
			System.out.println("Usuario ya existente!");
		}
	}
	
	
}
