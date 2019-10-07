package day7;

public class CreditCardChecker {
	// design a function/method: name, input, output
	public static void checkCreditCardNumber(String creditCardNum) {
		// Step 1. Sum up the 1st round of digits
		int d1 = Integer.parseInt(creditCardNum.substring(1, 2));
		int d2 = Integer.parseInt(creditCardNum.substring(3, 4));
		int d3 = Integer.parseInt(creditCardNum.substring(5, 6));
		int d4 = Integer.parseInt(creditCardNum.substring(7, 8));
		int sum1 = d1 + d2 + d3 + d4;
		System.out.println("Sum1: " + sum1);
		// Step 2. Sum up the 2nd round of digits
		int f1 = Integer.parseInt(creditCardNum.substring(0, 1)) * 2;
		int f2 = Integer.parseInt(creditCardNum.substring(2, 3)) * 2;
		int f3 = Integer.parseInt(creditCardNum.substring(4, 5)) * 2;
		int f4 = Integer.parseInt(creditCardNum.substring(6, 7)) * 2;		
		int sum2 = f1 / 10 + f1 % 10 + f2 / 10 + f2 % 10 + f3 / 10 + f3 % 10 + f4 / 10 + f4 % 10; 
		System.out.println("Sum2: " + sum2);
		// Step 3. Check the last digit of the sum
		int sum = sum1 + sum2;
		System.out.println("Sum: " + sum);
		if ( sum % 10 == 0 ) {
			System.out.println("It's valid!");
		} else {
			System.out.println("It's not valid!");
		}
	}
	public static void main(String[] args) {
		checkCreditCardNumber("43589795");
		checkCreditCardNumber("43512795");
		checkCreditCardNumber("43589700");
	}

}
