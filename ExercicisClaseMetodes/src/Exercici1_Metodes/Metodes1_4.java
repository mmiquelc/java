package Exercici1_Metodes;

public class Metodes1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(primerDigit(123));
		System.out.println(ultimDigit(122423));
		System.out.println(contaDigits(11333));
		
	}
	
	public static int primerDigit(int n) {
		String nStr = String.valueOf(n).substring(0,1);
		return Integer.parseInt(nStr);
		 
	}
	
	public static int ultimDigit(int n) {
		return n%10;
	}
	
	public static int contaDigits(int n) {
		int contador = 0;
		
		while (n!=0) {
			n = n/10;
			contador++;
		}
		
		return contador;
	}

}
