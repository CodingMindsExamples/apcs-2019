package day6;

public class GuessNumber {

	public static void main(String[] args) {
		int i;
		double n = 1 / 2;
		for (i = 2; i <= 5; i++) { 
			n = n + 1.0 / i; 
		} 
		System.out.println(i);
		System.out.println(n);
	}

}
