package deportistas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atleta extends Deportista{
	
	String lugarprueba;
	int distanciarecorrida;
	LocalTime marca;
	
	public Atleta(String dni, String nombre, LocalDate fechanacimiento,String lugarprueba,int distanciarecorrida,LocalTime marca) {
		super(dni, nombre, fechanacimiento);
		this.lugarprueba = lugarprueba;
		this.distanciarecorrida  = distanciarecorrida;
		this.marca = marca;
	}

	public String getLugarprueba() {
		return lugarprueba;
	}

	public int getDistanciarecorrida() {
		return distanciarecorrida;
	}

	public LocalTime getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "atleta dni="+dni+" nombre="+nombre+" fechanacimiento="+fechanacimiento+"[lugarprueba=" + lugarprueba + ", distanciarecorrida=" + distanciarecorrida + ", marca=" + marca
				+ "]\n";
	}
	
	
	

}
