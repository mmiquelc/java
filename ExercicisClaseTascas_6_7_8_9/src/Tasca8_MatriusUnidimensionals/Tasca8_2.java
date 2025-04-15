package Tasca8_MatriusUnidimensionals;

import java.util.Iterator;
import java.util.Scanner;

public class Tasca8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Entra la mida de la matriu: ");
		int sizeArray = in.nextInt();

		int Array1[] = new int[sizeArray * 3];
		int Array2[] = new int[sizeArray * 3];
		int ArrayAux[] = new int[Array1.length + Array2.length];

		for (int i = 0; i < Array1.length; i++) {
			System.out.println("Entra el " + (i + 1) + " numero: ");
			Array1[i] = in.nextInt();
		}

		for (int i = 0; i < Array2.length; i++) {
			System.out.println("Entra el " + (i + 1) + " numero: ");
			Array2[i] = in.nextInt();
		}

		int count = 0;
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < sizeArray; i++) {
			for (int j = 0; j < 3; j++) {
				ArrayAux[count] = Array1[count1];
				count1++;
				count++;
			}
			for (int j = 0; j < 3; j++) {
				ArrayAux[count] = Array2[count2];
				count2++;
				count++;
			}

		}
		
		for (int i : ArrayAux) {
			System.out.print(i+" ");
		}
	}

}
