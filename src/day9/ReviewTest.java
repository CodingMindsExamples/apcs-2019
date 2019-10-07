package day9;

import java.util.Scanner; 

public class ReviewTest {

	public static boolean checkEvenNumber(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// output 
		System.out.println("Hello World!");
		// input 
		Scanner s = new Scanner(System.in);
		s.nextLine();
		// data types		
		long l;
		boolean b;
		String str = "Java";
		str.length();
		str.indexOf("v");
		str.toLowerCase();
		str.toUpperCase();
		// data type conversion 
		int a = 5;
		double d = 5.5;
		a = (int) d;
		// conditional statement
		if (a > 10 && d < 10 || a < 100) {
			System.out.println("This is the true condition");
		} else {
			System.out.println("This is the false condition");
		}
		// loop
		while(a > 100) {
			System.out.println(a);
			a++;
		}
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		// array
		int[] scores = new int[10];
		scores[0] = 1;
		scores[1] = 2;
		scores[2] = 3;
		// method/function
		checkEvenNumber(100);
		checkEvenNumber(43);
	}
	
	

}
