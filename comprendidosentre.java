package random;
import java.util.Scanner;

public class comprendidosentre {

	    public static void main(String[] args) {
	        int numA, numB;
	        Scanner num = new Scanner(System.in);
	        System.out.print("Ingresa el primer valor: ");
	        numA = num.nextInt();
	        System.out.print("Ingresa el segundo Valor: ");
	        numB = num.nextInt();
	        System.out.println("Imprimiendo valores.");
	        numeros(numA, numB);
	    }
	    static void numeros(int a, int b){
	        int mayor = 0, menor = 0;
	        if(a == b){
	            System.out.println("Datos iguales.");
	        }
	        else{
	            if(a > b){
	                mayor = a;
	                menor = b;
	            }
	            else{
	                mayor = b;
	                menor = a;
	            }
	        }
	        for (int i = menor; i <= mayor; i++) {
	            System.out.print(i + " ");
	        }
	 
	    }
}
