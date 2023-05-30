package inmobiliaria;

public class Direccion {

	String calle;
	int portal;
	String localidad;
	int codigopostal;
	
	
	public Direccion(String calle, int portal, String localidad, int codigopostal) {
		super();
		this.calle = calle;
		this.portal = portal;
		this.localidad = localidad;
		this.codigopostal = codigopostal;
	}


	public String getCalle() {
		return calle;
	}


	public int getPortal() {
		return portal;
	}


	public String getLocalidad() {
		return localidad;
	}


	public int getCodigopostal() {
		return codigopostal;
	}


	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", portal=" + portal + ", localidad=" + localidad + ", codigopostal="
				+ codigopostal + "]";
	}
	
	
}
