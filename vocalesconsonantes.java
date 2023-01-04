package random;

import java.util.Scanner;

public class vocalesconsonantes {
	public static void vocaconso (String cadena) {
			int vocales = 0, consonantes = 0,signos=0;
            for (int i=0;i<cadena.length();i++) {
    			boolean flag = false;
            	switch (cadena.charAt(i)) {
                case 'a':            
                case 'e':           
                case 'i':           
                case 'o':            
                case 'u':            
                case 'A':
                case 'E':            
                case 'I':           
                case 'O':            
                case 'U':
                    flag = true;
            	}
            	if (flag == true) {
					vocales++;
				} else {
					if ((cadena.charAt(i)>='a'&&cadena.charAt(i)<='z')||(cadena.charAt(i)>='A'&&cadena.charAt(i)<='Z')) {
						consonantes++;
					}else {
						signos++;
					}
				}
            }
            System.out.println("vocales: "+vocales);
            System.out.println("consonantes: "+consonantes);
            System.out.println("no en el alfabeto: "+signos);
        }
	            
            

    public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner teclado = new Scanner(System.in);
            String frase;
            System.out.println("Introduce una frase para contar vocales y consonantes: ");
            frase = teclado.nextLine();
            vocaconso(frase);
    }
}
