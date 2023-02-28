package telefono;

public class contacto {
	private String nombre;
	private int numero;
	
	
	public contacto(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
	}


	public String getNombre() {
		return nombre;
	}


	public int getNumero() {
		return numero;
	}
	
}