package random;
import java.util.Scanner;

public class maximo {

    public static void main(String[] args) {
        int max, numUno, numDos;
        Scanner num = new Scanner(System.in);
        System.out.print("Ingresa el primer parámetro: ");
        numUno = num.nextInt();
        System.out.print("Ingresa el segundo parámetro: ");
        numDos = num.nextInt();
        max = maximo(numUno, numDos);
        System.out.println("El máximo es : " + max);
    }
    
    static int maximo(int a, int b){
        int max;
        if(a > b){
            max = a;
        }
        else{
            max = b;
        }
        return max;
    }
}