package objetos;

public class CuentaCorriente {
	private int dni;
	private String nombre;
	private int saldo;
	
	public CuentaCorriente(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo  = 0;
	}
	
	
	public void ingreso(int ingesta) {
		this.saldo += ingesta;
	}
	
	public boolean reitero(int retira) {
		boolean resultado = false;
		if (this.saldo >= retira) {
			this.saldo -= retira;
			resultado = true;
		}
		return resultado;
	}
	
	public String mostrar() {
		String resultado;
		resultado =  "dni: "+this.dni+"\n"+
				"nombre: "+this.nombre+"\n"+
				"saldo: "+this.saldo+"\n";
		return resultado;
		
	}
	
}
