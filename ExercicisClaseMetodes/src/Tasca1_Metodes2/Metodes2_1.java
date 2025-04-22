package Tasca1_Metodes2;

import java.util.*;

public class Metodes2_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escriu una paraula: ");
        String word = in.nextLine();
        
        String paraulaBarrejada = barrejarParaula(word);
        System.out.println("Paraula barrejada: " + paraulaBarrejada);
        
        in.close();
    }

    public static String barrejarParaula(String paraula) {
        char letters[] = paraula.toCharArray();
        char c[] = new char[paraula.length()];
        boolean[] usedPositions = new boolean[paraula.length()]; // Array per controlar les posicions utilitzades
        
        Random rand = new Random();

        for (int i = 0; i < letters.length; i++) {
            int position;
            do {
                position = rand.nextInt(paraula.length());
            } while (usedPositions[position]); // Buscar una nova posició si ja està ocupada
            
            c[position] = letters[i]; // Assignar el caràcter a la posició aleatòria
            usedPositions[position] = true; // Marcar la posició com a utilitzada
        }
        
        return new String(c); // Retornar la nova paraula barrejada
    }
}
