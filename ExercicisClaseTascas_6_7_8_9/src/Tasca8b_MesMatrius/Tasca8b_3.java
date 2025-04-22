package Tasca8b_MesMatrius;

import java.util.Random;
import java.util.Scanner;

public class Tasca8b_3 {

	public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        final int y = 5; 
        final int x = 5; 
        
        String[][] Array = new String[y][x]; 
        
    
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = "*";
            }
        }

        // Showing initial board
        System.out.println("  A B C D E");
        for (int i = 0; i < Array.length; i++) {
            System.out.print((i + 1));
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(" " + Array[i][j]);
            }
            System.out.println();
        }

        // Ship One random row & column
        int shipOneColumn = random.nextInt(x);
        int shipOneRow = random.nextInt(y); 

        // Ship Two random row & column
        int shipTwoColumn = random.nextInt(x);
        int shipTwoRow = random.nextInt(y);
        
        int attempts = 0; 
        boolean sunkenShipOne = false;
        boolean sunkenShipTwo = false;

        while (!sunkenShipOne || !sunkenShipTwo) {
            System.out.println("Entra una coordenada (ex. A1, B2, etc.): ");
            String coord = in.nextLine().toUpperCase();

         
            int playerRow = Integer.parseInt(coord.substring(1)) - 1; 
            int playerColumn = coord.charAt(0) - 'A'; 

           
            if (playerRow >= 0 && playerRow < y && playerColumn >= 0 && playerColumn < x) {
               

                // Checking if ship one is guessed
                if (shipOneRow == playerRow && shipOneColumn == playerColumn) {
                    sunkenShipOne = true;
                    Array[playerRow][playerColumn] = "V"; 
                    System.out.println(coord + " = TOCAT I ENFONSAT.");
                } else {
                    Array[playerRow][playerColumn] = "A"; 
                    System.out.println(coord + " = AIGUA");
                }

                // Checking if ship two is guessed
                if (shipTwoRow == playerRow && shipTwoColumn == playerColumn) {
                    sunkenShipTwo = true; 
                    Array[playerRow][playerColumn] = "V"; 
                    System.out.println(coord + " = TOCAT I ENFONSAT.");
                } else {
                    Array[playerRow][playerColumn] = "A"; 
                    System.out.println(coord + " = AIGUA");
                }
                
                attempts++; 
                // Showing board updated
                System.out.println("  A B C D E");
                for (int i = 0; i < Array.length; i++) {
                    System.out.print((i + 1));
                    for (int j = 0; j < Array[i].length; j++) {
                        System.out.print(" " + Array[i][j]);
                    }
                    System.out.println();
                }
            } 
        }
        
        System.out.println("  A B C D E");
        for (int i = 0; i < Array.length; i++) {
            System.out.print((i + 1));
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(" " + Array[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Has trobat els dos vaixells en " + attempts + "intents");

        in.close(); 
    }

}
