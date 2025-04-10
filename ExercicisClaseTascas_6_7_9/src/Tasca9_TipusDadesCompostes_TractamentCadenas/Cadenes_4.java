package Tasca9_TipusDadesCompostes_TractamentCadenas;

import java.util.Scanner;

public class Cadenes_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		System.out.println("Introdueix una cadena: ");
		String chain = in.nextLine();
		
		System.out.println("Elimina: ");
		String delete = in.nextLine();
		
		// String replace = chain.replace(delete, "");
		
		System.out.println(chain.replace(delete, ""));
		
	}

}
