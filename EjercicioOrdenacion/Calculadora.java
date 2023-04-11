package EjercicioOrdenacion;

public class Calculadora {
	public static void main(String[] args) {
		int c;
		try {
			String a = Teclado.leerString("Dame a: ");
			String b = Teclado.leerString("Dame b: ");
			int a1 = Integer.parseInt(a);
			int b1 = Integer.parseInt(b);
			c = a1/b1;
			System.out.println( a1 + "/" + b1 + "=" + c);
		}catch (NumberFormatException ex1) {
			System.out.println(ex1.getMessage());
		}catch (ArithmeticException ex2) {
			System.out.println(ex2.getMessage());
		}
	}
}
