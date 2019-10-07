package day4;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		// player RPS for 10 rounds		
		// for-loop i++   i = i + 1		 
		for(int i = 0; i < 10; i++) {
			System.out.println("Please input your choice 1-Rock 2-Paper 3-Scissors: ");
			Scanner s = new Scanner(System.in);
			int player = s.nextInt();
			
			Random r = new Random(); 
			int computer = r.nextInt(3) + 1;  
			
			System.out.println("Player choice: " + player);
			System.out.println("Computer choice: " + computer);				
			
			if (player == 1 && computer == 2 || player == 2 && computer == 3 || player == 3 && computer == 1) {  
				System.out.println("You lose!");
			} else if (player == 1 && computer == 3 || player == 2 && computer == 1 || player == 3 && computer == 2) {  
				System.out.println("You win!");
			} else if (player == computer) {  
				System.out.println("Tie!");
			}			
		}
	}

}
