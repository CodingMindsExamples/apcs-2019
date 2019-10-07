package day3.hw;

import java.util.Scanner;

public class HW2Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input the cost of the car: ");
		int cost = s.nextInt();
		System.out.println("Please input the miles per year: ");
		int milesPerYear = s.nextInt();
		System.out.println("Please input the gas price: ");
		double gasPrice = s.nextDouble();
		System.out.println("Please input the MPG: ");
		int milesPerGallon = s.nextInt();
		System.out.println("Please input the resale value after 5 years: ");
		int resaleValue = s.nextInt();
		System.out.println("Cost of the car: " + cost);
		System.out.println("Miles per Year: " + milesPerYear);
		System.out.println("Gas Price: " + gasPrice);
		System.out.println("MPG: " + milesPerGallon);
		System.out.println("Resale: " + resaleValue);
		
		double moneyToPay = milesPerYear * 5 / milesPerGallon * gasPrice + (cost - resaleValue);
		System.out.println("Total money to pay: " + moneyToPay);
	}
}
