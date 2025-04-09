package matrius;

import java.util.Scanner;

public class CreacióMatriusBidimensionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int m[][] = new int [2][3];
		
		System.out.println("Introduce los elementos de la matriz (2 filas y 3 columnas):");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Elemento [" + i + "][" + j + "]: ");
				m[i][j] = in.nextInt();
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(m[i][j] + " ");
			}
			// Aquest print vuit es important per separar les files "enter"
			System.out.println();
		}
		
		
	}

}
