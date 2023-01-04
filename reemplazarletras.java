package random;

import java.util.Scanner;

public class reemplazarletras {
	   public static String espacios (String cadena,String letra1,String letra2) {
           String resultado="";
           for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra1.charAt(0)) {
				resultado += letra2;
			} else {
				resultado += cadena.charAt(i);
			}
		}
           return resultado;
   }

   public static void main(String[] args) {
           // TODO Auto-generated method stub
           Scanner teclado = new Scanner(System.in);
           String frase,letra1,letra2;
           System.out.println("Introduce una frase para reemplazar las letras que se solicitaran a continuacion: ");
           frase = teclado.nextLine();
           System.out.println("letra1: ");
           letra1 = teclado.nextLine();
           System.out.println("letra1: ");
           letra2 = teclado.nextLine();
           System.out.println(espacios(frase,letra1,letra2));
   }

}
