package BARAJA;

public class Partida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Baraja baraja = new Baraja();
		System.out.println(baraja);
		baraja.darCartas(7);
		System.out.println(baraja.cartasDisponibles());
		System.out.println(baraja.cartasMonton());
	}

}
