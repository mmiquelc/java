package Tasca7_EstructuresRepeticio2;

import java.util.*;

public class Repeticio2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		// Creating computer choice
		int computer = random.nextInt(3);
			
		// Creating scoreboard
		int winsComputer = 0;
		int winsPlayer = 0;
		
		
		do {
			
			// Updating computer choice
			computer = random.nextInt(3);
			
			//System.out.println(computer);
			System.out.println(winsComputer);
			System.out.println(winsPlayer);
			
			System.out.println("pedra (0), paper (1), tisores (2): ");
			int playerChoice = in.nextInt();
			
			// If player win...
			if (computer == 0 && playerChoice == 1) {
				System.out.println("Ordinador ha tret pedra. Jugador ha tret paper. Jugador guanya.");
				winsPlayer++;
			} else if (computer == 1 && playerChoice == 2) {
				System.out.println("Ordinador ha tret paper. Jugador ha tret tisores. Jugador guanya.");
				winsPlayer++;
			} else if (computer == 2 && playerChoice == 0) {
				System.out.println("Ordinador ha tret tisores. Jugador ha tret pedra. Jugador guanya.");
				winsPlayer++;
			}
			
			
			// If computer win...
			if (computer == 0 && playerChoice == 2) {
				System.out.println("Ordinador ha tret pedra. Jugador ha tret tisores. Ordinador guanya.");
				winsComputer++;
			} else if (computer == 1 && playerChoice == 0) {
				System.out.println("Ordinador ha tret paper. Jugador ha tret pedra. Ordinador guanya.");
				winsComputer++;
			} else if (computer == 2 && playerChoice == 1) {
				System.out.println("Ordinador ha tret tisores. Jugador ha tret paper. Ordinador guanya.");
				winsComputer++;
			}
			
			// If draw...
			if (computer == 0 && playerChoice == 0) {
				System.out.println("Ordinador ha tret pedra. Jugador ha tret pedra. És un empat.");
			} else if (computer == 1 && playerChoice == 1) {
				System.out.println("Ordinador ha tret paper. Jugador ha tret paper. És un empat.");
			} else if (computer == 2 && playerChoice == 2) {
				System.out.println("Ordinador ha tret tisores. Jugador ha tret tisores. És un empat.");
			}
			
		} while (winsComputer < 3 && winsPlayer < 3);
		
		if (winsComputer == 3) {
			System.out.println("Ha guanyat la partida l'ordinador");
		} else {
			System.out.println("Ha guanyat la partida el Jugador");
		}
		
		
		
	}

}
