package random;
import java.util.*;
public class funcion3 {
	
	public static boolean vocal(char caracter) {
		boolean resultado = false;
		if (caracter == 'a' ||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u') {
			resultado = true;
		}
		return resultado;
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		char letra = teclado.nextLine().charAt(0);
		if (vocal(letra) == true) {
			System.out.println("Es vocal");
		}else {
			System.out.println("No es vocal");
		}
			
	}

}
