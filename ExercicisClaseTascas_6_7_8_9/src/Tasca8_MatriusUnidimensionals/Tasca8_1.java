package Tasca8_MatriusUnidimensionals;

import java.util.Scanner;

public class Tasca8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int m[] = new int[5];

		// Demanem que l'usuari entri els numeros
		for (int i = 0; i < m.length; i++) {
			System.out.printf("Entra un numero per l'index %d: ", i);
			m[i] = in.nextInt();
		}
		
		// Mostrem els numeros en l'ordre invers
		for (int i = m.length - 1; i >= 0; i--) {
			System.out.print(m[i] + " ");
		}
		
		in.close();
		
	}

}
