package matrius;

import java.util.Scanner;

public class clonarUnaMatriu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Declaring Arrays
        int m[] = new int[5];
        int n[] = new int[m.length];
        
        // Assign numbers for each position 
        for (int i = 0; i < m.length; i++) {
            System.out.printf("Introdueix un numero per l'index %d: %n", i);
            m[i] = in.nextInt();
        }
        
        // Cloning Array m to array n
        for (int i = 0; i < m.length; i++) {
            n[i] = m[i] + 1;
        }
        
        // Showing each number for each position
        System.out.print("Array m: ");
        for (int j = 0; j < m.length; j++) {
            System.out.print(m[j] + " ");
        }
        
        System.out.println(); // New line for better formatting
        
        System.out.print("Array n: ");
        for (int j = 0; j < n.length; j++) {
            System.out.print(n[j] + " ");
        }

        in.close(); // Always good practice to close the scanner
    }
}
