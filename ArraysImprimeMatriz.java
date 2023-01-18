//Crear una aplicación que imprima la siguiente matriz###########1########.
//Crear la siguiente matriz unidad, como se muestra la gráfica###########2########

package random;

public class ArraysImprimeMatriz {

	
	public static void mostrar(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("["+matriz[i][j]+"]"); 
			}
			System.out.println();
		}	
	}
	
	
	public static void main(String[] args) {
		//###########1########
		int matriz [][] = new int [3][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (i+1) * 10 + (j+1) ;
			}
		}
		mostrar(matriz);
		System.out.println();
		
		//###########2########
		int matriz2 [][] = new int [4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(i == j) {
					matriz2[i][j] = 1;
				}
			}
		}
		mostrar(matriz2);

		
		
	}

}
