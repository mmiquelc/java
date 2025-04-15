package Tasca8_MatriusUnidimensionals;

import java.util.Iterator;
import java.util.Scanner;

public class Tasca8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int Array[] = new int[5];
		
		for (int i = 0; i < Array.length; i++) {
			System.out.print("Escriu el "+ (i+1) + " numero: ");
			Array[i] = in.nextInt();
		}
		
		System.out.println("Quantes posicions vols desplaçar la matriu cap a la dreta: ");
		int position = in.nextInt();
		
		// Creating new Array to clone
		int cloneArray[] = new int[Array.length];
		
		for (int i = 0; i < Array.length; i++) {
			cloneArray[i] = Array[i+position];
		}
		
		
		// Showing array with new position
		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");
		}
		
		
	}

}
