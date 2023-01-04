package random;
import java.util.*;
public class espaciosblancos {

        public static int espacios (String huecos) {
                int resultado=0;
                for (int i=0;i<huecos.length();i++) {
                        if(huecos.charAt(i)==' ')
                                resultado++;
                }
                System.out.println(resultado);
                return resultado;
        }

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                Scanner teclado = new Scanner(System.in);
                String frase;
                System.out.println("Introduce una frase: ");
                frase = teclado.nextLine();
                espacios(frase);
        }

}