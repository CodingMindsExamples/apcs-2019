package day7;

import java.util.Scanner;

public class AnotherTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input the integer: ");
		int range = s.nextInt();
		for(int i = 1; i <= range; i++) {
			boolean result = PrimeNumberChecker.isPrimeNumber(i);
			if (result) {
				System.out.println(i);
			}			
		}
	}

}
