package prgramacion3;

public class direccion {

	String calle;
	int portal;
	int codigopostal;
	
	
	
	public direccion(String calle, int portal, int codigopostal) {
		this.calle = calle;
		this.portal = portal;
		this.codigopostal = codigopostal;
	}
	
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getPortal() {
		return portal;
	}
	public void setPortal(int portal) {
		this.portal = portal;
	}
	public int getCodigopostal() {
		return codigopostal;
	}
	public void setCodigopostal(int codigopostal) {
		this.codigopostal = codigopostal;
	}

	
	

	@Override
	public String toString() {
		return "direccion [calle=" + calle + ", portal=" + portal + ", codigopostal=" + codigopostal + "]";
	}
	
	
	
}
