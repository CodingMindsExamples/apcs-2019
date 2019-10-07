package day7;

import java.util.Scanner;

public class PrimeNumberChecker {
	
	// Function (Method)
	// 1. Function Name (Method Name)
	// 2. Function Input - Input Parameters (Variables) (Optional)
	// 3. Function Output - Output Type                 (Optional)

	public static boolean isPrimeNumber(int num) {				
		boolean isPrime = true; 		
		for(int i = 2; i <= Math.sqrt(num) + 1; i++) {			
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input the integer: ");
		int range = s.nextInt();
		for(int i = 1; i <= range; i++) {
			boolean result = isPrimeNumber(i);
			if (result) {
				System.out.println(i);
			}			
		}		
	}

}
