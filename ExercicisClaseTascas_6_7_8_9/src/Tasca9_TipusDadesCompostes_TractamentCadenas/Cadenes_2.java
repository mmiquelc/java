package Tasca9_TipusDadesCompostes_TractamentCadenas;

import java.util.Scanner;

public class Cadenes_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		char vowlesArray[] = {'a', 'e', 'i', 'o', 'u'};
		
		System.out.println("Escriu una lletra: ");
		String myChar = in.nextLine();
		
		boolean isVowel = false;

		for (int i = 0; i < vowlesArray.length; i++) {
			if (myChar.charAt(0) == vowlesArray[i]) {
				isVowel = true;
			}
		}
		
		if (isVowel) {
			System.out.println(myChar + " és una vocal");
		} else {
			System.out.println(myChar + " és una consonant");
		}
		

		
		
		
		
	}

}
