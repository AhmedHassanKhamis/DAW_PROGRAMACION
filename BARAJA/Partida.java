package BARAJA;

public class Partida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Palo.BASTOS.ordinal());
		Baraja baraja = new Baraja();
		System.out.println(baraja);
		
		baraja.barajar();
		System.out.println(baraja);
	}

}
