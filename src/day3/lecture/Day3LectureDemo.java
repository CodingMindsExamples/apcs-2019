package day3.lecture;

import java.util.Scanner;

public class Day3LectureDemo {

	public static void main(String[] args) {
		// conditional 
		// Math quiz
		// 34 + 89 = ? 	
		System.out.println("34 + 89 = ?");
		Scanner s = new Scanner(System.in);
		double answer = s.nextDouble();				
				
		// 1. condition must be wrapped in a ( )
		// 2. you NEED to use { } to wrap the commands for each condition
		if (answer == 123) { 
			System.out.println("Good job!");
		}
		else { 
			System.out.println("Wrong!");
			System.out.println("You suck! Go back to learn more Math!");
		}
		
		// Andy: < 4pm      > 8:00 
		// Eric: 
		// Steven: 1-2:30 | 5:00-7:00 
		// Michael:  
		// Tuesday 7:30 or 8:00 - 10:00
		
	}
}
