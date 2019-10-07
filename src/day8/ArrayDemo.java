package day8;

import java.util.Arrays;

public class ArrayDemo {
	
	// write a code to search a number in the scores
	// if the number is included in this array, print the position
	// otherwise, print -1
	public static int searchNumber(int num, int[] scores) {		
		for(int i = 0; i < scores.length; i++) {
			if (num == scores[i]) {
				System.out.println("Find the number at " + i);
				return i;
			}
		}
		System.out.println("Didn't find the number.");
		return -1;		
	}

	public static void main(String[] args) {
		// Array 
		int[] scores = new int[10];
		scores[0] = 89;
		scores[1] = 91;
		scores[2] = 93;
		scores[3] = 60;
		scores[4] = 77;
		scores[5] = 78;
		scores[6] = 89;
		scores[7] = 90;
		scores[8] = 92;
		scores[9] = 95;
		System.out.println(searchNumber(77, scores));



		//		int[] scores2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//		
		//		int sum = 0;
		//		for(int i = 0; i < scores.length; i++) {
		//			System.out.println(scores[i]);
		//			sum = sum + scores[i];
		//		}		
		//		System.out.println(sum);
		//		System.out.println(sum / scores.length);
		//		System.out.println(scores.length);  
		//
		//		System.out.println(scores[0]);
		//		System.out.println(scores[1]);
		//		
		//		System.out.println(scores[10]);
	}

}
