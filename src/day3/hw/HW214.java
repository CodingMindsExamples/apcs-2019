package day3.hw;

import java.util.Scanner;

public class HW214 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String numStr = s.nextLine();
		System.out.println(numStr.substring(0, numStr.length() - 3) + "," + numStr.substring(numStr.length() - 3));
	}

}
