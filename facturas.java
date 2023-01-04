package random;
import java.util.*;
public class facturas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int total = 0,contmas600 = 0,litrosart1 = 0;
		int cod,litros,precio;
		for (int i = 1; i <= 5; i++) {
			System.out.println("introduce el codigo de articulo"+i+": ");
			cod = teclado.nextInt();
			System.out.println("introduce la cantidad de litros"+i+": ");
			litros = teclado.nextInt();
			System.out.println("introduce el precio"+i+": ");
			precio = teclado.nextInt();
			
			total = total + precio;
			if (precio > 600) {
				contmas600++;				
			}
			
			if (cod == 1) {
				litrosart1 = litrosart1 + litros;
			}
		}
		System.out.println("\n\n\n\n\n\n\n############################\nFacturacion Total: "+total+"\nLitros de articulo 1: "+litrosart1+"\nArticulos con facturacion mayor que 600: "+contmas600);
	}

}
