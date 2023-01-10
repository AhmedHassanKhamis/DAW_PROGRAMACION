package random;
/*
 * calcular el importe a pagar a un banco al crear una tajeta de credito de pago flexible
 */
import java.util.Scanner;

public class bancoDeudas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introducir saldo deudor: ");
		double saldo = scan.nextDouble();
		System.out.println("introducir tipo de interes: ");
		double tip = scan.nextDouble();
		System.out.println("introducir cuota: ");
		double cuota = scan.nextDouble();
		int j = 0;
		double[][] liquidacion = new double[24][5];
		for (double i = saldo; i >= 1; i -= cuota) {
		liquidacion[j][0] = j;
		liquidacion[j][1] = i;
		liquidacion[j][2] = tip;
		liquidacion[j][3] =  i * tip / 100;
		liquidacion[j][4] = cuota;
		i += liquidacion[j][3];
		j++;
		}
		
		for (int i = 0; i < liquidacion.length; i++) {
			if (liquidacion[i][0]!=0) {
				for (int k = 0; k < 5; k++) {
					System.out.print(liquidacion[i][k]+"|");
				}	
				System.out.println();
			}
		}
		/*
		System.out.println("#############################################################");
		for (double i = saldo; i >= 1; i -= cuota) {
			System.out.println("saldo antes del añadido del interes: " + i);
			double interes = i * tip / 100;
			System.out.println("interes: "+interes);
			i += interes;
			System.out.println("saldo despues del añadido del interes: "+i);
			System.out.println("#############################################################");
			j++;
		}
		*/
		System.out.println("total meses a pagar: "+j);
		
		
		
	}

}
