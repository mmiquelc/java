package Tasca8_MatriusUnidimensionals;

import java.util.Scanner;

public class Tasca8_4 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Introdueix la mida de la matriu: ");
		 int size = in.nextInt();
		 
		 int m[] = new int[size];
		 
		 for (int i = 0; i < m.length; i++) {
			System.out.print("Entra un numero per l'index " + i + ": ");
			m[i] = in.nextInt();
		}
		 	
		int odd = 0; // even
		int even = 0; // par
		
		for (int i = 0; i < m.length; i++) {
			if (m[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		
		int mOdd[] = new int[odd];
		int mEven[] = new int [even];
		
		int indexOdd = 0, indexEven = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] % 2 == 0) {
				mEven[indexEven++] = m[i];
			} else {
				mOdd[indexOdd++] = m[i];
			}
		}
		
		System.out.println();
		
		System.out.println("<--- VECTOR ORIGINAL --->");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("<--- VECTOR SENARS --->");
		for (int i = 0; i < mOdd.length; i++) {
			System.out.print(mOdd[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("<--- VECTOR PARELLS --->");
		for (int i = 0; i < mEven.length; i++) {
			System.out.print(mEven[i] + " ");
		}
		
		in.close();
		
	}

}
