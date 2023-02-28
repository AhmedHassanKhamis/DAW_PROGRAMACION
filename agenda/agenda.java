package telefono;

import java.util.Iterator;

public class agenda {
	 private contacto[] array1;
	 private int numero;

	 
	 
	public agenda() {
		numero = 0;
		array1 = new contacto[10];
	}
	
	public agenda(int tamanio) {
		numero = 0;
		array1 = new contacto[tamanio];
	}
	 
	public void aniadirContacto (contacto c) {
		if (!(existeContacto(c.getNombre())&&!agendaLlena())) {
			array1[numero] = c;
			numero++;
		}
	}
	
	public boolean existeContacto (String nombre) {
		for (int i = 0; i < array1.length; i++) {
			if(array1[i].getNombre().equals(nombre)) {
				return true;	
			} 
		}
		return false;
	}
	
    public String listarContacto () {
		String resultado = "";
    	for (int i = 0; i < array1.length; i++) {
			resultado += array1[i].getNombre()+":"+array1[i].getNumero() + "\n";
		}
    	return resultado;
	}
    	
    public contacto buscaContacto (String nombre) {
		for (int i = 0; i < array1.length; i++) {
			if (nombre.equalsIgnoreCase(array1[i].getNombre())) {
				return array1[i];
			}
		}
		return null;
	}
    
    public void eliminarContacto (String nombre) {
		for (int i = 0; i < array1.length; i++) {
			if (nombre.equalsIgnoreCase(array1[i].getNombre())) {
				array1[i] = array1[numero-1];
				array1[numero-1] = null;
				numero--;
			}
		}
	}
    
    public boolean agendaLlena () {
    	return array1.length == numero;
	}
    
    public int huecosLibres () {
		return array1.length - numero;
	}
	
}
