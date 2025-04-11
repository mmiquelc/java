package Tasca9_TipusDadesCompostes_TractamentCadenas;

import java.util.Scanner;

public class Cadenes_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		int number = -1;
		
		// Checking if number is positive
		do {
			System.out.println("Entra un numero enter positiu: ");
			number = in.nextInt();
		} while (number < 0);
	
		
		int[] Binari = new int[16];
		int index = 0;
		
		while (number > 0) {
			Binari[index] = number % 2 ;
			number /= 2;
			index++;
		}		
		
		System.out.println("Numero en Binari");
		for (int i = Binari.length-1; i >= 0; i--) {
			System.out.print(Binari[i]);
		}
		
		
	}

}
