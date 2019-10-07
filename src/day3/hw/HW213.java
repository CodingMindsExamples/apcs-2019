package day3.hw;

import java.util.Scanner;

public class HW213 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input a number from 1,000 to 999,999: ");
		String numStr = s.nextLine();    		                              		
		int length = numStr.length();
		System.out.println(numStr.substring(0, length - 4));
		System.out.println(numStr.substring(length - 4 + 1, length));
		System.out.println(numStr.substring(0, length - 4) + numStr.substring(length - 4 + 1, length));
		
		// a different way
		int commaIndex = numStr.indexOf(",");
		System.out.println(numStr.substring(0, commaIndex) + numStr.substring(commaIndex + 1));
		
		// solve the same problem with  replace()
		// search how String.replace() works in the Java Doc
		
		
		// How do we remove a char at a certain position? 
		System.out.println("Please input a random String: ");
		String myStr = s.nextLine();
		// remove chat at index 5 
		// ?
		// abcdefg
		// abcdfg
		System.out.println(myStr.substring(0, 4) + myStr.substring(6));
		System.out.println(myStr.substring(0, 4) + myStr.substring(6, myStr.length()));
	}
}
