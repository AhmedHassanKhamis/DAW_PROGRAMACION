package random;
import java.util.*;
public class funcion2 {
//Escribir una funcion a la que se le pasen dos enteros. Mostrar todos lo numeros
//comprendidos entre ellos.

        public static void eco2 (int primerEntero, int segundoEntero) {
                int menor,mayor;
                if (primerEntero>segundoEntero) {
                         mayor = primerEntero;
                         menor = segundoEntero;
                }else {
                         menor = primerEntero;
                         mayor = segundoEntero;
                }
                for (int i=menor;i<=mayor;i++) {
                        System.out.println(i);
                }
        }

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                int primerEntero, segundoEntero;
                Scanner teclado = new Scanner(System.in);
                System.out.println("Dame el primer numero");
                primerEntero = teclado.nextInt();
                System.out.println("Dame el segundo numero");
                segundoEntero = teclado.nextInt();
                eco2(primerEntero,segundoEntero);

        }

}

