package BARAJA;

public class Carta {
	private Palo palo;
	private Numero numero;
	
	
	public Carta(Numero numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}


	@Override
	public String toString() {
		return numero + "de" + palo;
	}
	
	
	
	
	
}