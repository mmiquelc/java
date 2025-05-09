package Tasca8_MatriusUnidimensionals;

import java.util.Scanner;

public class Tasca8_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int m[] = new int[4];
        
        for (int i = 0; i < m.length; i++) {
            System.out.print("Escriu el " + (i + 1) + " número: ");
            m[i] = in.nextInt();
        }
        
        boolean growing = true;
        boolean decreasing = true;
        boolean same = true;

        for (int i = 0; i < m.length - 1; i++) {
            if (!(m[i] == m[i + 1])) {
                same = false; 
            }
            if (m[i] > m[i + 1]) {
                growing = false;
            }
            if (m[i] < m[i + 1]) {
                decreasing = false;
            }
        }

        if (same) {
            System.out.println("Son iguals");
        } else if (growing) {
            System.out.println("Es creixent");
        } else if (decreasing) {
            System.out.println("Es decreixent");
        } else {
            System.out.println("Estan desordenats");
        }
        
        in.close();
    }
}
