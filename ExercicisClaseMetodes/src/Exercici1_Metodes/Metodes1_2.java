package Exercici1_Metodes;

public class Metodes1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(min(5,2,3));
		
		System.out.println(mitjana(10,5,6));
	}
	
	public static double min(double x, double y, double z) {
		
		double  min = 0;
		
		if (x <y && x < z) {
			min = x;
		} else if (y < x && y < z) {
			min = y;
		} else {
			min = z;
		}
		
		return min;
		
	}
	
	public static double mitjana(double x, double y, double z) {
	    double suma = x + y + z; 
	    double avg = suma / 3;    
	    return avg;               
	}


}
