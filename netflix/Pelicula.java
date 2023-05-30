package netflix;

import java.time.LocalDate;

public class Pelicula extends Material{
	
		String actor;

		public Pelicula(int codigo, String nombre, LocalDate fechaestreno, Categoria categoria, String actor) {
			super(codigo, nombre, fechaestreno, categoria);
			this.actor = actor;
		}

		public String getActor() {
			return actor;
		}

		@Override
		public String toString() {
			return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", fechaestreno=" + fechaestreno
					+ ", categoria=" + categoria + ", actor=" + actor + "]";
		}
		
		
}
