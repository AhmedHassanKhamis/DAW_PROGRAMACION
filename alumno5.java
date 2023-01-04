package random;
import java.util.Scanner;
public class alumno5 {

	        public static void main(String[] args) {
	                // TODO Auto-generated method stub

	                Scanner teclado = new Scanner (System.in);
	                double altura, edad, mediaaltura, mayoresedad, menores;
	                double altos;
	                mediaaltura = 0;
	                altos = 0;
	                mayoresedad = 0;
	                menores = 0;


	                for (int i = 0; i<5; i++) {
	                        System.out.println("Dame tu altura perrito");
	                        altura = teclado.nextDouble();
	                        System.out.println("Dame tu edad cachorro");
	                        edad = teclado.nextDouble();

	                        //Cuantos mayores y menores de edad tenemos

	                        if (edad >= 18) {
	                                mayoresedad = mayoresedad + 1;
	                        }else {
	                                menores = menores + 1;
	                        }

	                        //Media de altura

	                        mediaaltura = mediaaltura + altura;
	                        System.out.println(mediaaltura);

	                        //Cantidad alumnos miden +1.75

	                        if (altura >= 1.75) {
	                                altos = altos + 1;
	                        }


	                }//el del for
	                //Media de altura fuera del bucle
	                mediaaltura = mediaaltura / 5;


	                System.out.println("En los datos recopilados podemos afirmar lo siguiente: ");
	                System.out.println("En estas cinco personas, hay altos : " + altos);
	                System.out.println("Menores de edad hay un total de : " + menores);
	                System.out.println("Mayores de edad hay un total de : " + mayoresedad);
	                System.out.println("La media de altura de esta gente es de : " + mediaaltura);


	        }

	}

