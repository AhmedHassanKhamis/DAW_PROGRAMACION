package random;

import java.util.Scanner;

public class separarcadena {

    public static String funcion (String frase) {
    		String resultado = " ";
            	resultado =  frase + resultado;
            return resultado;
    }

    public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner teclado = new Scanner(System.in);
            String frase="",resultado="";
            do {
            	System.out.println("Introduce una palabra: ");
                frase = teclado.nextLine();	
            	if (frase.equalsIgnoreCase("fin") == false) {
                    resultado += funcion(frase);	
				}
			} while ((frase.equalsIgnoreCase("fin")) == false);
            System.out.println(resultado);
            
    }

}
