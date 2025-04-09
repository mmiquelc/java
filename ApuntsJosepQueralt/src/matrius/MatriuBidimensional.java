package matrius;

public class MatriuBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definicio dels vectors
		int [] vector1 = {1, 2, 3};
		int [] vector2 = {10, 20, 30};
		// Creacio de la matriu que pot tenir 2 filas
		int [][] matriu = new int[2][];
		// Assignació dels vectors a la matriu, vector1 i vector2 a las filas corresponents
		// de la matriu "Matriu"
		matriu[0] = vector1;
		matriu[1] = vector2;
		
		// Impresió de la matriu
		// Bucle extern itera sobre les filas de la matriu (2 filas)
		// Bucle intern itera sobre las columnes de cada fila (3 columnas)
		for (int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(matriu[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
