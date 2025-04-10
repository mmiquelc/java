package Tasca9_TipusDadesCompostes_TractamentCadenas;

import java.util.Scanner;

public class Cadenes_1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Entra un caràcter: ");
		String myChar = in.nextLine();
		
		System.out.print("Entra una cadena: ");
		String chain = in.nextLine();
		
		int countChar = 0;
		int countUpper = 0;
		
		// Looking for the same character
		for (int i = 0; i <chain.length(); i++) {
			if (chain.charAt(i) == myChar.charAt(0)) {
				countChar++;
			}
		}
		
		// Searching for UpperCase letters
		for (int i = 0; i < chain.length(); i++) {
			if (Character.isUpperCase(chain.charAt(i))) {
				countUpper++;
			}
		}
		
		System.out.println("Aparicions del caràcter <" + myChar + ">: " + countChar);
		System.out.println("Nombre de majúscules: " + countUpper);
		
	}

}
