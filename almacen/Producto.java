package almacen;

public class Producto implements Comparable<Producto>{

	int numeroreferencia;
	String nombre;
	int precio;
	int stock;
	
	
	public Producto(int numero, String nombre, int precio, int stock) {
		this.numeroreferencia = numero;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}


	public int getNumero() {
		return numeroreferencia;
	}


	public String getNombre() {
		return nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public int getStock() {
		return stock;
	}


	
	public void aniadirStock(int stock) {
		this.stock += stock;
	}


	@Override
	public String toString() {
		return "Producto numero=" + numeroreferencia + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock+"\n" ;
	}


	@Override
	public int compareTo(Producto o) {
		return this.precio-o.getPrecio();
	}


	public void restarStock(int numerosolicitado) {
		this.stock -= numerosolicitado;
	}
	
	
	
	
	
}
