package random;
import java.util.*;
public class adivinarcontraseñas {

        public static void asteriscos(String password, String intento) {

                for(int i=0;i<password.length();i++) {
                        if((password.charAt(0+i))== (intento.charAt(0+i))) {
                                System.out.print(password.charAt(0+i));;
                        }else {
                                System.out.print("*");
                        }
                }
                System.out.println();
        }
        public static void main(String[] args) {
                // TODO Auto-generated method stub
                String password, intento;
                Scanner teclado = new Scanner(System.in);
                System.out.println("introduce la contrasena secreta: ");
                password= teclado.nextLine();

                do {
                        System.out.println("intenta adivinar");
                        intento = teclado.nextLine();
                        asteriscos(password,intento);
                }while(!intento.equals(password));
                System.out.println("adivinaste loco");

        }

}