package Exercici1_Metodes;

public class Metodes1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(caractersCentrals("aya"));
	}
	
	public static String caractersCentrals(String str) {
		
		int longitud = str.length();
		
		if (longitud % 2 == 0) {
			return str.substring(longitud/2-1,longitud/2+1);
		} else {
			return str.valueOf(str.charAt(longitud/2));
		}
	}

}
