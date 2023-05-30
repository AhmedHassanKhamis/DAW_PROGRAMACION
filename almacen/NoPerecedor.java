package almacen;

public class NoPerecedor extends Producto {
	Tipo tipo;
	String paisprocedencia;
	
	
	public NoPerecedor(int numero, String nombre, int precio, int stock, Tipo tipo, String paisprocedencia) {
		super(numero, nombre, precio, stock);
		this.tipo = tipo;
		this.paisprocedencia = paisprocedencia;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public String getPaisprocedencia() {
		return paisprocedencia;
	}


	@Override
	public String toString() {
		return "NoPerecedor [numeroreferencia=" + numeroreferencia + ", nombre=" + nombre + ", precio=" + precio
				+ ", stock=" + stock + ", tipo=" + tipo + ", paisprocedencia=" + paisprocedencia + "]";
	}

	
	
	
	
}
