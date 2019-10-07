package day5;

import java.util.Scanner;

public class Ex312 {

	public static void main(String[] args) {
		System.out.println("Enter a letter grade: ");
		Scanner s = new Scanner(System.in);
		String letterGrade = s.nextLine();
		String letter = letterGrade.substring(0, 1);
		String sign = "N/A";
		if (letterGrade.length() > 1) {
			sign = letterGrade.substring(1, 2);
		}				
  
		if (letter.equals("A") && sign.equals("+")) {
			System.out.println(4.0);
		} else if (letter.equals("A") && sign.equals("-")) {
			System.out.println(3.7);
		} else if (letter.equals("A") && sign.equals("N/A")) {
			System.out.println(4.0);
		}
	}

}
