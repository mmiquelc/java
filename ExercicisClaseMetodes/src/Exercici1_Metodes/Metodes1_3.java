package Exercici1_Metodes;

public class Metodes1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(totsIguals(2,2,2));
		System.out.println(totsDiferents(5,4,5));
		System.out.println(estanOrdenats(3,2,2));
		
		
	}

	
	public static boolean totsIguals(double x, double y, double z) {
		
		if (x == y && y == z && x == z) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean totsDiferents(double x, double y, double z) {
		
		if (x != y && y != z && x != z) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean estanOrdenats(double x, double y, double z) {
		
		if (x < y && y < z && x < z) {
			return true;
		} else if (x > y && y > z && x > z) {
			return true;
		} else {
			return false;
		}
		
	}
}
