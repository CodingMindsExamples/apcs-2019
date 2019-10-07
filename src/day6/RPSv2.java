package day6;

import java.util.Random;
import java.util.Scanner;

public class RPSv2 {

	public static void main(String[] args) {

		System.out.println("Please input your choice 1-Rock 2-Paper 3-Scissors: ");
		Scanner s = new Scanner(System.in);
		int player = s.nextInt();
		
		while(player >= 1 && player <= 3) {			
			Random r = new Random(); 
			int computer = r.nextInt(3) + 1;  
			
			// hacking
			if (computer == 1) {
				continue;
			}
			
			System.out.println("Player choice: " + player);
			System.out.println("Computer choice: " + computer);				
			
			if (player == 1 && computer == 2 || player == 2 && computer == 3 || player == 3 && computer == 1) {  
				System.out.println("You lose!");
			} else if (player == 1 && computer == 3 || player == 2 && computer == 1 || player == 3 && computer == 2) {  
				System.out.println("You win!");
				break;
			} else if (player == computer) {  
				System.out.println("Tie!");
			}
			
			System.out.println("Please input your choice 1-Rock 2-Paper 3-Scissors: ");			
			player = s.nextInt();
		}

	}

}
