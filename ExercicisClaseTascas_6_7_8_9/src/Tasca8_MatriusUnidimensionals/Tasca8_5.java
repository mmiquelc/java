package Tasca8_MatriusUnidimensionals;

import java.util.Scanner;

public class Tasca8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		// Demanem la lognitud de la matriu
		System.out.println("Especifica la longitud de la matriu [2 - 100]: ");
		int arraySize = in.nextInt();
		
		int m[] = new int[arraySize];
		
		 for (int i = 0; i < m.length; i++) {
			 m[i] = (int) (Math.random() * 100); // Generar un número aleatorio entre 0 y 99
		 }
		
		 // Mostrem la matriu generada
		 System.out.println("Matriu generada: ");
		 for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
		 
		// Creem 2 contadors per despres crear la mida exacte de cada matriu (parells i senars)
		 int odd = 0; // even
		 int even = 0; // par
			
			for (int i = 0; i < m.length; i++) {
				if (m[i] % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
		
			// Assignem la longitud de les matrius amb els contadors anteriors
			int mOdd[] = new int[odd];
			int mEven[] = new int [even];
			
			// Assignem els valors en les respectives matrius
			int indexOdd = 0, indexEven = 0;
			for (int i = 0; i < m.length; i++) {
				if (m[i] % 2 == 0) {
					mEven[indexEven++] = m[i];
				} else {
					mOdd[indexOdd++] = m[i];
				}
			}
			
			
			// Fem els prints dels elements senars, parells i la matriu en l'ordre invers
			System.out.println();
			
			System.out.print("Elements senars: ");
			for (int i = 0; i < mOdd.length; i++) {
				System.out.print(mOdd[i] + " ");
			}
			
			System.out.println();
			
			System.out.print("Elements parells: ");
			for (int i = 0; i < mEven.length; i++) {
				System.out.print(mEven[i] + " ");
			}
	         
			System.out.println();
			
	        System.out.print("Matriu en ordre invers:");
			
			for (int i = m.length - 1; i >= 0; i--) {
				System.out.print(m[i] + " ");
			}
			
			System.out.println();
			
			// Busquem el primer i ultim element
	        if (m.length > 0) {
	            System.out.println("Primer element: " + m[0]);
	            System.out.println("Últim element: " + m[m.length - 1]);
	        }
			
		in.close();
	}

}
