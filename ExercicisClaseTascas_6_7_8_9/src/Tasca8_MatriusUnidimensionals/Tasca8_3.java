package Tasca8_MatriusUnidimensionals;

import java.util.Scanner;

public class Tasca8_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introdueix el valor de n: ");
        int n = in.nextInt();

        int[] m = new int[n];
        int[] m2 = new int[m.length + 1];

        for (int i = 0; i < m.length - 1; i++) {
            System.out.printf("Entra un numero per l'index %d: ", i);
            m[i] = in.nextInt();
        }

        System.out.print("Introdueix el numero a inserir: ");
        int numero = in.nextInt();

        System.out.printf("Introdueix la posisió (0-%d): ", n - 1);
        int position = in.nextInt();

        // Copiar els elements de m a m2 fins a la posició indicada
        for (int i = 0; i < position; i++) {
            m2[i] = m[i];
        }

        // Inserir el nou número a la posició indicada
        m2[position] = numero;

        // Copiar els elements restants de m a m2
        for (int i = position; i < m.length; i++) {
            m2[i +1] = m[i];
        }

        // Mostrar la matriu resultant
        System.out.println("L'Array queda aixi:");
        for (int i = 0; i < m2.length - 1; i++) {
            System.out.print(m2[i] + " ");
        }
        
        in.close();
    }
}
