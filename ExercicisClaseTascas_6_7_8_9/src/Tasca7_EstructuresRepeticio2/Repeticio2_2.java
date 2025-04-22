package Tasca7_EstructuresRepeticio2;

import java.util.Scanner;

public class Repeticio2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Entra una frase: ");
		String chain = in.nextLine();
		
		for (int i = 0; i < chain.length(); i++) {
			char c = chain.charAt(i);
			char encryptedChar = (char) ((int) c + 1); 
			System.out.print(encryptedChar);
		}
	}

}
