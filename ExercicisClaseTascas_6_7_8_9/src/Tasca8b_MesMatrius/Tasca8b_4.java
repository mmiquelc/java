package Tasca8b_MesMatrius;

import java.util.Scanner;

public class Tasca8b_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digues quants números vols entre el 0 i 100: ");
        int sizeArray = in.nextInt();

        int[] Array = new int[sizeArray];

        for (int i = 0; i < Array.length; i++) {
            System.out.print("Entra el " + (i + 1) + " número: ");
            Array[i] = in.nextInt();
        }

        int[] counts = new int[101];

        for (int i = 0; i < Array.length; i++) {
                counts[Array[i]]++;
        }

        System.out.println("---- RESULTAT ----");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " apareix " + counts[i] + " vegada" + (counts[i] > 1 ? "s" : ""));
            }
        }

        in.close();
    }
}
