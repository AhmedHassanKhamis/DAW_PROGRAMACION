package almacen;

import java.time.LocalDate;

public class Perecedor extends Producto {
		LocalDate fechacaducidad;

		public Perecedor(int numeroreferencia, String nombre, int precio, int stock, LocalDate fechacaducidad) {
			super(numeroreferencia, nombre, precio, stock);
			this.fechacaducidad = fechacaducidad;
		}

		public LocalDate getFechacaducidad() {
			return fechacaducidad;
		}

		@Override
		public String toString() {
			return "Perecedor [numero=" + numeroreferencia + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock
					+ ", fechacaducidad=" + fechacaducidad + "]";
		}
		
		
		
}


