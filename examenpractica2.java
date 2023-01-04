package random;

public class examenpractica2 {

	public static void funcion(String cadena) {
		String resultado = "";
		for (int i = 0; i < cadena.length(); i++) {
			int contador = 0;
			if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' && cadena.charAt(i) != 'u') {
				for (int j = 0; j < resultado.length(); j++) {
					if (cadena.charAt(i) == resultado.charAt(j)) {
						contador++;
					}	
				}
				if (contador == 0) {
					resultado += cadena.charAt(i);	
				}
			}
		}
		System.out.println(resultado);
		
	}
	
	
	
	public static void main(String[] args) {
		String cadena = "nuevo examen";
		funcion(cadena);
	}

}
