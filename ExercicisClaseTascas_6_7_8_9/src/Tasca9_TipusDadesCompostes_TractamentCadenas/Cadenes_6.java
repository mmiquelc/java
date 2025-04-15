package Tasca9_TipusDadesCompostes_TractamentCadenas;

import java.util.Scanner;

public class Cadenes_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		System.out.println("Introdueix una cadena: ");
		String firstChain = in.nextLine();
		
		System.out.println("Introdueix una altre cadena: ");
		String secondChain = in.nextLine();
		
		
		if (firstChain.contains(secondChain)) {
			System.out.println("La cadena dos SI esta en la cadena 1");
		} else {
			System.out.println("La cadena dos NO està en la cadena 1");
		}
		
		
		
	}

}
