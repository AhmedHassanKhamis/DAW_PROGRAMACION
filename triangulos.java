
public class triangulos {

	private double iguales;
	private double distinto;
	
	public void triangulos (double iguales, double distinto) {
		this.iguales = iguales;
		this.distinto = distinto;
	}
	
	public double dameLongiutdLadosIguales() {
		return iguales;
	}
	
	public double dameLongitudLadoDistinto() {
		return distinto;
	}
	
	public double perimetro() {
		return (2 * iguales) + distinto;
	}
	
	public double area() {
		double base = distinto;
		double altura = Math.sqrt(Math.pow(iguales, 2) - Math.pow(base/2, 2));
		return altura;
	}
}
