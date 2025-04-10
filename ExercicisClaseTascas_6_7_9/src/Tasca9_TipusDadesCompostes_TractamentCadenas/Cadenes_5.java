package Tasca9_TipusDadesCompostes_TractamentCadenas;

import java.util.Scanner;

public class Cadenes_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		System.out.println("Introdueix una cadena: ");
		String chain = in.nextLine();
		
		int countInt = 0;
		
		for (int i = 0; i < chain.length(); i++) {
			char c = chain.charAt(i);
			if (Character.isDigit(c)) {
				countInt += c - '0';
			}
		}
		
		System.out.println(countInt);
		
	}

}
