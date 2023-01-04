package random;
import java.util.*;
public class pruebadebug {

	public static float mediaPositivos(int[] grupo) {
		float resultado = 0;
		int suma = 0, contador = 0;
		for (int i = 0; i < grupo.length; i++) {
			if(grupo[i] >= 0) {
				suma += grupo[i];
				contador ++;
			}
		}
		if (contador > 0) {
			resultado = (float) suma / contador;	
		}		return resultado;
	}
	
	public static float mediaNegativos(int[] grupo) {
		float resultado = 0;
		int suma = 0, contador = 0;
		for (int i = 0; i < grupo.length; i++) {
			if(grupo[i] < 0) {
				suma += grupo[i];
				contador ++;
			}
		}
		if (contador > 0) {
			resultado = suma / contador;	
		}
		return resultado;
	}
	
	public static int ceroApariciones(int[] grupo,int n) {
		int resultado = 0;
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i] == n) {
				resultado++;
			}
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int grupo[] = new int[5];
		int suma = 0,n = 0;
		float media = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("introduce el siguiente numero: ");
			grupo[i] = teclado.nextInt();
		}
		System.out.println("introduce el numero a buscar: ");
		n = teclado.nextInt();
		for (int i = 0; i < grupo.length; i++) {
			suma += grupo[i];
		}
		media = suma / grupo.length;
		System.out.println("Media general: "+media);
		System.out.println("Media Positivos: "+mediaPositivos(grupo));
		System.out.println("Media Negativos: "+mediaNegativos(grupo));
		System.out.println(n +" aparecidos: "+ceroApariciones(grupo,n));
		
	}

}
