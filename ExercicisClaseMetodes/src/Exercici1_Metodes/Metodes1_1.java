package Exercici1_Metodes;

public class Metodes1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumaRang(4,7));
		
	}

	
	public static int sumaRang(int limit1, int limit2) {
		
		int suma = 0;
		
		for (int i = limit1; i <= limit2; i++) {
			suma += i;
		}
		
		System.out.print("(" + limit1 + " , " + limit2 + ") -> ");
		return suma;
		
	}
}
