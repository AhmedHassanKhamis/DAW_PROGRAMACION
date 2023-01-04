package random;

import java.util.Scanner;

public class sinvocales {

    public static String sinvocales (String frase) {
    		String resultado = "";
            for (int i= 0; i<=frase.length()-1 ;i++) {
            	if (frase.charAt(i) != 'a' && frase.charAt(i) != 'e' && frase.charAt(i) != 'i' && frase.charAt(i) != 'o' && frase.charAt(i) != 'u' && frase.charAt(i) != 'A' && frase.charAt(i) != 'E' && frase.charAt(i) != 'I' && frase.charAt(i) != 'O' && frase.charAt(i) != 'U') {
                	resultado = resultado + String.valueOf(frase.charAt(i));
				}
            }
            return resultado;
    }

    public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner teclado = new Scanner(System.in);
            String frase;
            System.out.println("Introduce una frase: ");
            frase = teclado.nextLine();
            System.out.println(sinvocales(frase));
    }

}
