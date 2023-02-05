
public class ProgramaTriangulos {

	public static void inicializar(triangulos[] triangulos) {
		for(int i= 0; i<triangulos.length;i++){
			double iguales, distinto;
			iguales  = Math.random()*100;
			distinto = Math.random()*100;
			triangulos triangulo = new triangulos(iguales, distinto);
			triangulos[i] = triangulo;
		}
	}
	
	public static triangulos buscarTrianguloMayor(triangulos[] triangulos) {
		triangulos mayor = triangulos[0];
		for(int i=0;i<triangulos.length;i++) {
			triangulos triangulo = triangulos[i];
			if(triangulo.area()>mayor.area()) {
				mayor = triangulo;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangulos[] triangulos = new triangulos[100];
		inicializar(triangulos);
		triangulos areaMayor = buscarTrianguloMayor(triangulos);
		System.out.println("El de mayor area es el de los lados: ");
		
		
	}

}
