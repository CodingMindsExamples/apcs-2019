package day3.hw;

import java.util.Scanner;

public class HW225 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int due = s.nextInt();
		int received = s.nextInt();
		// dollar   100
		// quarter  25
		// dime     10
		// nickel   5
		// pennies	1 
		int change = received - due;  // 234 => 2 dollars; 25 quarter; 1 nickel; 4 pennies;
		System.out.println("You need to give change for: " + change);
		System.out.println("Dollars: " + change / 100);
		//change = change - (change / 100 * 100); 
		change = change % 100;
		System.out.println("You still need to give change for: " + change);
		System.out.println("Quarters: " + change / 25);
		change = change % 25;
		System.out.println("You still need to give change for: " + change);
		System.out.println("Dimes: " + change / 10);
		change = change % 10;
		System.out.println("You still need to give change for: " + change);
		System.out.println("Nickels: " + change / 5);
		change = change % 5;
		System.out.println("You still need to give change for: " + change);
		System.out.println("Pennies: " + change / 1);
		change = change % 1;
		System.out.println("You still need to give change for: " + change);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the Total cost: ");
//		double first = scan.nextDouble();
//		
//		System.out.print("Enter the Money received: ");
//		double second = scan.nextDouble();
//		scan.close();
//		
//		double hhhh = second - first;
//		//dollars = 1    quarter = 0.25  dime = 0.1   nickel = 0.05  penny = 0.01
//		
//		double dollar = hhhh/1;
//		System.out.println("Dollars: " + dollar);
//		double nondollars = hhhh % 1;
//		System.out.println("Remaining: " + nondollars);
//		double dollars = Math.floor(dollar); // 4.5 => 4.0    round: 5.0   ceiling: 4.2 => 5.0
//		System.out.print(dollars);
//		
//		nondollars = nondollars % 0.25;
//		System.out.println("Remaining: " + nondollars);
	}

}
