package Exercici1_Metodes;

public class Metodes1_7 {

	public static void main(String[] args) {
		int dimensio = 3;

	    int[][] matriu1 = generarMatriuBinaria(dimensio);
	    int[][] matriu2 = generarMatriuBinaria(dimensio);

	    System.out.println("Matriu 1:");
	    mostrarMatriu(matriu1);
	    System.out.println("Matriu 2:");
	    mostrarMatriu(matriu2);

	    System.out.println("Les matrius són iguals? " + equals(matriu1, matriu2));
	}

	
	public static boolean equals(int[] a, int[] b) {
		
		
		
	}
}
