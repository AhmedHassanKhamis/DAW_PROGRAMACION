package Cuenta;

public class Main {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("pepe");
		System.out.println(cuenta1);
		cuenta1.ingresar(1000);
		System.out.println(cuenta1);
		cuenta1.ingresar(-10000);
		System.out.println(cuenta1);
		cuenta1.retirar(-1000);
		System.out.println(cuenta1);
		
	}

}
