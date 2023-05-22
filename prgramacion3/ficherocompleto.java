package prgramacion3;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ficherocompleto {
	public static final String RUTA_FICHERO = "materials.dat";
	private File fichero;

	public ficherocompleto() {
		this.fichero = new File(ficherocompleto.RUTA_FICHERO);
	}
	
	public File getFichero() {
		return fichero;
	}
	
	public void escribirFichero1(Map<Integer, material> materials) {
		ObjectOutputStream output = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream(fichero));
			Iterator<material> it = materials.values().iterator();
			output.writeInt(materials.size());
			while(it.hasNext()) {
				material material = (material) it.next();
				if (material instanceof pelicula) {
					pelicula pelicula = (pelicula) material;
					output.writeChar('P');
					output.writeInt(pelicula.getCodigo());
					output.writeUTF(pelicula.getNombre());
					output.writeInt(pelicula.getFechaestreno().getDayOfYear());
					output.writeInt(pelicula.getFechaestreno().getMonthValue());
					output.writeInt(pelicula.getFechaestreno().getYear());
					output.writeUTF(pelicula.getCategoria());
					output.writeUTF(pelicula.getActor());

					
				} else {
					serie serie = (serie) material;
					output.writeChar('S');
					output.writeInt(serie.getCodigo());
					output.writeUTF(serie.getNombre());
					output.writeInt(serie.getFechaestreno().getDayOfYear());
					output.writeInt(serie.getFechaestreno().getMonthValue());
					output.writeInt(serie.getFechaestreno().getYear());
					output.writeUTF(serie.getCategoria());
					output.writeInt(serie.getNumerotemporadas());
					output.writeBoolean(serie.isPosiblidadnueva());
					
				}
			}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e.getMessage());
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					System.out.println("Error E/S: " + e.getMessage());
				}
			}
		}
	}
	
	public Map<Integer, material> leerFichero1() {
		Map<Integer, material> materials = new TreeMap<>();
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(new FileInputStream(fichero));
			
			int cantidadmaterials = input.readInt();
			for(int i = 0; i < cantidadmaterials; i++) {
				char tipomaterial = input.readChar();
				if (Character.toUpperCase(tipomaterial) == 'P') {
					pelicula pelicula;
					int codigo = input.readInt();
					String nombre = input.readUTF();
					int dia = input.readInt();
					int mes = input.readInt();
					int anio = input.readInt();
					String fechaestreno = dia + "-" + mes  + "-" +anio;
					String categoria = input.readUTF();
					String actor = input.readUTF();
					pelicula = new pelicula(codigo, nombre, fechaestreno,categoria,actor);
					materials.put(codigo, pelicula);
				} else {
					serie serie;
					int codigo = input.readInt();
					String nombre = input.readUTF();
					int dia = input.readInt();
					int mes = input.readInt();
					int anio = input.readInt();
					String fechaestreno = dia + "-" + mes  + "-" +anio;
					String categoria = input.readUTF();
					int temporadas = input.readInt();
					boolean posibilidadnueva = input.readBoolean();
					serie = new serie(codigo, nombre, fechaestreno,categoria,temporadas,posibilidadnueva );
					materials.put(codigo, serie);
				}
			}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					System.out.println("Error E/S: " + e.getMessage());
				}
			}
		}
		return materials;
	}
	
	public void escribirFichero2(Map<Integer, cliente> clientes) {
		ObjectOutputStream output = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream(fichero));
			Iterator<cliente> it = clientes.values().iterator();
			output.writeInt(clientes.size());
			while(it.hasNext()) {
				cliente cliente = (cliente) it.next();
					output.writeChar('P');
					output.writeInt(cliente.getNif());
					output.writeUTF(cliente.getNombre());
					output.writeInt(cliente.getCuota());
					output.writeUTF(cliente.getDireccion().getCalle());
					output.writeInt(cliente.getDireccion().getPortal());
					output.writeInt(cliente.getDireccion().getCodigopostal());
		}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e.getMessage());
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					System.out.println("Error E/S: " + e.getMessage());
				}
			}
		}
	}
	
	public Map<Integer, cliente> leerFichero2() {
		Map<Integer, cliente> clientes = new TreeMap<>();
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(new FileInputStream(fichero));
			int cantidadmaterials = input.readInt();
			for(int i = 0; i < cantidadmaterials; i++) {
				char tipomaterial = input.readChar();
					cliente cliente;
					int nif = input.readInt();
					String nombre = input.readUTF();
					int cuota = input.readInt();
					String calle = input.readUTF();
					int portal = input.readInt();
					int codigopostal = input.readInt();
					direccion direccion = new direccion(calle, portal, codigopostal);
					cliente = new cliente(nif, nombre, cuota,direccion);
					clientes.put(nif, cliente);
			}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					System.out.println("Error E/S: " + e.getMessage());
				}
			}
		}
		return clientes;
	}

	public Map<cliente, Map<Integer, material>> leerFichero3() {
		return null;
	}

	public void escribirFichero3(Map<cliente, Map<Integer, material>> visualizaciones) {
		
	}
	
}
