package random;

import java.util.Scanner;


public class cifrar {

	        public static String cifrar (String texto) {
	                String resultado = "";
	                for (int i = 0; i < texto.length(); i++) {
	                		char caracter = texto.charAt(i);	
	                		if (texto.charAt(i) != ' ') {
	                			resultado = resultado + (char) (caracter + 3);
	                		}else {
	                			resultado = resultado + ' ';
	                		}
					}
	                
	                return resultado;
	        }
	        //public static descifrado (String texto) {

	        //}

	        public static void main(String[] args) {
	                // TODO Auto-generated method stub
	                Scanner teclado = new Scanner(System.in);
	                String frase;
	                System.out.println("Introduce una frase: ");
	                frase = teclado.nextLine();
	                System.out.println("La frase cifrada es " + cifrar(frase));



	        }

	}

