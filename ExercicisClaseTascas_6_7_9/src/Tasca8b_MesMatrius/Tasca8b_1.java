package Tasca8b_MesMatrius;

import java.util.Scanner;

public class Tasca8b_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Entra la mida de la matriu: ");
		int sizeArray = in.nextInt();
		
		int Array[][] = new int[sizeArray][sizeArray];
		
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array.length; j++) {
				System.out.print(i+j + " ");
			}
			System.out.println();
		}
		
	}

}
