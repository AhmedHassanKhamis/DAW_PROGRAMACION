package random;

import java.util.Scanner;
public class funcion1 {

        public static void eco2 (int altura, int radio) {
                double area = 2 * 3.14 * radio * (altura + radio);
                double volumen = 3.14 * radio*2 * altura;
                System.out.println("El area del cilindro es " + area);
                System.out.println("El volumen del cilindro es " + volumen);
        }

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                int altura, radio;
                Scanner teclado = new Scanner(System.in);
                System.out.println("Dame la altura del cilindro: ");
                altura = teclado.nextInt();
                System.out.println("Dame el radio del cilindro: ");
                radio = teclado.nextInt();
                eco2(altura,radio);

        }

}