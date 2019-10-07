package day5;

public class ForLoopTest {

	public static void main(String[] args) {		
		// print  odd numbers 1-1000
		// SUM = 1 + 3 + 5 + ..... + 997 + 999
		int sum = 0;
		for(int i = 1; i < 1001; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		// randomly generate a number 1-100
		// ask player to guess the number
		// give hints whether it's bigger or smaller until the user guesses the correct number
		// limit 10 times
	}

}
