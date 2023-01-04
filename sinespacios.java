package random;

import java.util.Scanner;

public class sinespacios {
        public static String espacios (String huecos) {
            String resultado="";
            for (int i=0;i<huecos.length();i++) {
                    if(huecos.charAt(i)!=' ')
                            resultado += huecos.charAt(i);
            }
            return resultado;
    }

    public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner teclado = new Scanner(System.in);
            String frase;
            System.out.println("Introduce una frase para quitar sus espacios en blanco: ");
            frase = teclado.nextLine();
            System.out.println(espacios(frase));
    }


}
