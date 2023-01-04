package random;

import java.util.Scanner;

public class cuantasveceshay {

    public static int funcion (String frase,String palabra) {
    		int resultado = 0;
            String[] words = frase.split(" ");
    		for (int i = 0; i <= words.length-1; i++) {
	    		if(words[i].equalsIgnoreCase(palabra) == true) {
	    			resultado++;
	    		}
			}
    		return resultado;
    }

    public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner teclado = new Scanner(System.in);
            String frase="",palabra="";
            System.out.println("introduce la frase que quieres analizar: ");
            frase = teclado.nextLine();
            System.out.println("palabra a contar: ");
            palabra = teclado.nextLine();
            System.out.println("numero de veces que se repite: "+ funcion(frase,palabra));
            
    }

}