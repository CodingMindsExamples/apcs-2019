import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// tips
		// hourly rate $10/hr + tips
		// in Java, you must declare a variable before
		// using it.
		double tips = 0;		
		double salary = 10 + tips;		
		System.out.println(salary);
		tips = -2;
		salary = 10 + tips;
		System.out.println(salary);
		
		// 1 bit: 0/1
		// 1 byte:  8 bits 01010101
		// 4 bytes: 32 bits 0000000 .... 000000
		// 8 bytes: 64 bits 0011100 .... .....   000000
		
		// 64KB
		// 8MB
		// 1G = 1024MB
		
		// 8 primitive types 
		byte b1 = 23;
		short s1 = 323;
		int a = 1003232323;
		long b = 323283293238293233l;
		float f = 32323232.32323232f;
		double c = 32323233232232.23232323232;
		boolean bl = true;
		boolean bl2 = false;
		char c1 = 'g';
		
		int score_stu_1 = 43;
		
		
		int s2 = 987;
		
		// constant
		final double taxRate = 0.0725;		
		double productPrice = 59.99;		
		System.out.println(productPrice * (1 + taxRate));
		
		/* your comment in the middle */
		
		/*
		 * This is a multiline comments. 
		 * This is my second line;
		 * I can write as many lines as possible.
		 */
		
		// This is a multiline comments.
		// This is a multiline comments.
		// This is a multiline comments.
		
		/**
		 * This is a multiline comments.
		 * This is a multiline comments.
		 * This is a multiline comments.
		 */
		
		double cc = 0.334; // Liters,, in fdfdfd //  */
		System.out.println(cc);
		
		// Binary (0,1)
		// 1 =>    1
		// 4 =>  100
		// 7 =>  111
		// 8 => 1000
		double price = 4.35;
		double q = 100;
		double total = price * q;
		System.out.println(total);
		
		int points = 0;
		System.out.println(points);
		points = points + 1;
		System.out.println(points);
		points = points + 1;
		System.out.println(points);
		points += 1;
		System.out.println(points);
		points++;
		System.out.println(points);
		points--;
		System.out.println(points);
		
		System.out.println(10 % 3);  // remainder
		System.out.println(100 % 6); 
		int num = 98;
		System.out.println(num % 2);
		
		System.out.println(Math.sqrt(10000));
		System.out.println(Math.pow(10, 3));
		System.out.println(Math.round(4.999999));
		System.out.println(Math.abs(-932));
		
		int score = 900;   // 4 bytes
		double superScore = 999.0053; // 8 bytes
		long lnum = 0; // 8 bytes
		//score = superScore;
		//superScore = score;
		score = (int) superScore;		// cast
		System.out.println(score);
		
		// name = input("Please input the name:")
		// random.randint(1,3)
		// import random
		
		// .............
		// using .............;
		// using Raycast;
		
		// class {
		//    update() {
		//       Raycast rc;
		//    }
		// }
		
		Scanner s = new Scanner(System.in);
//		System.out.println("Please input your name: ");
//		String name = s.nextLine();
//		System.out.println("Your name is: " + name);
//		System.out.println("Please input your age: ");
//		int age = s.nextInt();
//		System.out.println("Your age is: " + age);
//		System.out.println("What's your GPA?");
//		double gpa = s.nextDouble();
//		System.out.println("My GPA: " + gpa);
		
		double gpa = 3.5454567677;
		System.out.println(gpa);
		System.out.printf("%.2f", gpa);
		
		String courseName = "AP CS JAVA";
		System.out.println(courseName);
		System.out.println(courseName.length());
		String courseLevel = "101";
		System.out.println(courseName + " " + courseLevel);
		System.out.println(courseName.charAt(0));
		System.out.println(courseName.charAt(1));
		System.out.println(courseName.substring(6, 10));
		
		System.out.println("Please input your first name: ");
		String firstName = s.nextLine();
		System.out.println("Please input your last name: ");
		String lastName = s.nextLine();
		System.out.println("Full name: " + firstName + " " + lastName);
		String init = firstName.substring(0, 1) + lastName.substring(0, 1);
		System.out.println("Your initial is: " + init);
	}
}
