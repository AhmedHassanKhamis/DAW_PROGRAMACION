package random;
import java.util.*;
public class ahorcado {
	
	public static String intentar(String secreta,String intento,String solucion) {
		String resultado = "";
		for (int i = 0; i < secreta.length(); i++) {
			if (secreta.charAt(i) == intento.charAt(0)) {
				resultado += intento.charAt(0);
			}else {
				resultado += solucion.charAt(i);
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String  intento,secreta,solucion = "";
		int contador = 0;
		secreta = "rumano";
		for (int i = 0; i < secreta.length(); i++) {
			solucion += "*";
		}
	   do {
	           System.out.println("intenta adivinar");
	           intento = teclado.nextLine();
	           solucion = intentar(secreta,intento,solucion);
	           System.out.println(solucion);
	           contador++;
	   }while(contador < 10 && !solucion.equals(secreta));
	   if (solucion.equals(secreta)) {
		   System.out.println("adivinaste loco");
	   }else {
		   System.out.println("fallaste intentalo de nuevo!");
	   }
	   

		
	}

}
