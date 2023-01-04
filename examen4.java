package random;
import java.util.*;
public class examen4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int mes;
		int anio;
		do {
		System.out.println("introduce un mes(1-12): ");
		mes = teclado.nextInt();
		System.out.println("introduce un anio(2000-2099): ");
		anio = teclado.nextInt();
		if (mes == 1 ||mes == 3 ||mes == 5 ||mes == 7 ||mes == 8 ||mes == 10 ||mes == 12) {
			System.out.println("este mes tiene 31 dias");
		} else if(mes == 4 ||mes == 6 ||mes == 9 ||mes == 11) {
			System.out.println("este mes tiene 30 dias");
		}else if(mes == 2) {
			if(anio % 4 == 0) {
				if(anio % 100 == 0) {
					if(anio % 400 == 0) {
						System.out.println("este mes tiene 29 dias");
					}else {
						System.out.println("este mes tiene 28 dias");
					}
				}else {
					System.out.println("este mes tiene 29 dias");

				}
			}else {
				System.out.println("este mes tiene 28 dias");
			}
		}
		if ((mes < 1 || mes > 12) && (anio > 2099 || anio < 2000)) {
			System.out.println("los datos introducidos son incorrectos introduzcalos de nuevo\n\n##############################################\n");
		}
		}while((mes < 1 || mes > 12) && (anio > 2099 || anio < 2000));
	}

}
