package BARAJA;

import java.util.Arrays;

public class Baraja {

	private Carta[] cartas = new Carta[40];
	private int cima;
	
	public Baraja() {
		cima = 0;
		int i=0;
		for (Palo palo : Palo.values()) {
			for(Numero numero:Numero.values()){
				cartas[i] = new Carta(numero,palo);
				i++;
			}
		}
	}

	public void barajar() {
		int intercambios = (int) (15 * Math.random())+17;
		for (int i = 0; i < intercambios; i++) {
			intercambiarDosCartas();
		}
	}
	
	private void intercambiarDosCartas() {
		int origen = (int)(40 * Math.random());
		int destino = (int)(40 * Math.random());
		Carta aux = cartas[origen];
		cartas[origen] = cartas[destino];
		cartas[destino] = aux;
	}
	
	public Carta dar() {
		return cartas[cima++];
	}
	
	
	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "]";
	}
	
	
	
}
