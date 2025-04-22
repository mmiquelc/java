package Tasca7_EstructuresRepeticio2;

import java.util.*;


public class Repeticio2_4 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        final int y = 4; 
        final int x = 4; 
        
        String[][] Array = new String[y][x]; 
        
    
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = "*";
            }
        }

        // Showing initial board
        System.out.println("  A B C D");
        for (int i = 0; i < Array.length; i++) {
            System.out.print((i + 1));
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(" " + Array[i][j]);
            }
            System.out.println();
        }

      
        int column = random.nextInt(x);
        int row = random.nextInt(y); 

        int attempts = 0; 
        boolean sunken = false; 

        while (!sunken) {
            System.out.println("Entra una coordenada (ex. A1, B2, etc.): ");
            String coord = in.nextLine().toUpperCase();

         
            int playerRow = Integer.parseInt(coord.substring(1)) - 1; 
            int playerColumn = coord.charAt(0) - 'A'; 

           
            if (playerRow >= 0 && playerRow < y && playerColumn >= 0 && playerColumn < x) {
                attempts++; 

                // Checking if guessed
                if (row == playerRow && column == playerColumn) {
                    sunken = true; 
                    Array[playerRow][playerColumn] = "V"; 
                    System.out.println(coord + " = TOCAT I ENFONSAT. ENHORABONA HAS TROBAT EL VAIXELL EN " + attempts + " jugades.");
                } else {
                    Array[playerRow][playerColumn] = "A"; 
                    System.out.println(coord + " = AIGUA");
                }

                // Showing board updated
                System.out.println("  A B C D");
                for (int i = 0; i < Array.length; i++) {
                    System.out.print((i + 1));
                    for (int j = 0; j < Array[i].length; j++) {
                        System.out.print(" " + Array[i][j]);
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Coordenada no vàlida. Prova-ho de nou.");
            }
        }

        in.close(); 
    }
}
