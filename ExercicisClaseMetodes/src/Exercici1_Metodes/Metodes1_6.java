package Exercici1_Metodes;

public class Metodes1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][] = generarMatriuBinaria(5);
		
		mostrarMatriu(array);
		
	}

	public static int[][] generarMatriuBinaria(int dimensio) {
		
	int Array[][] = new int[dimensio][dimensio];
	
	for (int i = 0; i < Array.length; i++) {
        for (int j = 0; j < Array.length; j++) {
            Array[i][j] = (int) (Math.random() * 2); // Generar un número aleatorio entre 0 y 99
        }
    }
	
	return Array;
		
	}
	
	public static void mostrarMatriu(int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
