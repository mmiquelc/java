package Tasca9_TipusDadesCompostes_TractamentCadenas;

import java.util.Scanner;

public class Cadenes_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("<--El password ha de tenir com a mínim dos dígits-->");
        
        System.out.println("Escriu una contrasenya: ");
        String pswd = in.nextLine();
        
        int countLength = pswd.length();
        int countUpper = 0;
        int countLower = 0;
        int countDigits = 0;

        for (int i = 0; i < countLength; i++) {
            char c = pswd.charAt(i);
            if (Character.isUpperCase(c)) {
                countUpper++;
            } else if (Character.isLowerCase(c)) {
                countLower++;
            } else if (Character.isDigit(c)) {
                countDigits++;
            } 
        }
        
        // Checking requirements
        if (countLength >= 8 && countUpper >= 1 && countLower >= 1 && countDigits >= 2) {
            System.out.println("La contrasenya és vàlida");
        } else {
            System.out.println("La contrasenya NO és vàlida");
        }
        
        in.close(); 
    }
}
