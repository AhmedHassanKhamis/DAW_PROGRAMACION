package netflix;

import java.io.File;
import java.util.TreeMap;

public class FicheroStream {

	
	TreeMap<Integer, Material> materiales;
	TreeMap<Integer, Cliente> clientes;
	
	public FicheroStream() {
		this.materiales = new TreeMap<>();
		this.clientes = new TreeMap<>();
	}

	public TreeMap<Integer, Material> getmateriales() {
		return materiales;
	}

	public TreeMap<Integer, Cliente> getclientes() {
		return clientes;
	}
	
	public void escribirFichero(TreeMap<Integer, Cliente> clientes,TreeMap<Integer, Material> materiales,File fichero) {
		
	}
}
