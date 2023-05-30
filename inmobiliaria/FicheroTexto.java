package inmobiliaria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class FicheroTexto {

	static TreeMap<Integer, Cliente> clientes;
	
	public FicheroTexto() {
		clientes = new TreeMap<>();
	}
	
	public static TreeMap<Integer, Cliente> leerClientes(File fichero) throws IOException{
		BufferedReader in = null;
		try {
			 in = new BufferedReader(new FileReader(fichero));
			 for (int i = 0; i < fichero.length(); i++) {
				 String linea = in.readLine();
				 String separador =  ";";
				 StringTokenizer lineaseparada = new StringTokenizer(linea, separador);
				 String nif = lineaseparada.nextElement().toString();
				 String nombre = lineaseparada.nextElement().toString();
				 String fechanacimiento = lineaseparada.nextElement().toString();
				 String calle = lineaseparada.nextElement().toString();
				 String portal = lineaseparada.nextElement().toString();
				 String localidad = lineaseparada.nextElement().toString();
				 String codigopostal = lineaseparada.nextElement().toString();
				 Direccion direccion = new Direccion(calle, portal, localidad, codigopostal);
				 clientes.put(nif, new Cliente(nif, nombre, portal, direccion));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return clientes;
	}
	
	
	
}
