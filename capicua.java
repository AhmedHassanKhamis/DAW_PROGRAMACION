package random;

import java.util.Scanner;

public class capicua {

    public static String capicua (String frase) {
    		String resultado = "";
            for (int i= frase.length()-1; i>=0 ;i--) {
            	resultado = resultado + String.valueOf(frase.charAt(i));
            }
            return resultado;
    }

    public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner teclado = new Scanner(System.in);
            String frase;
            System.out.println("Introduce una frase: ");
            frase = teclado.nextLine();
            System.out.println(capicua(frase));
    }

}
