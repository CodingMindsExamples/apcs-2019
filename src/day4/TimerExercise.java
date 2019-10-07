package day4;

import java.util.Scanner;

public class TimerExercise {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 1. input time 1
		System.out.println("Please input the first time: ");
		String time1 = s.nextLine();
		// 2. input time 2
		System.out.println("Please input the second time: ");
		String time2 = s.nextLine();
		
		// 3. calculate the interval 		
		String hour1Str = time1.substring(0, 2);
		String min1Str = time1.substring(2, 4);
		
		int hour1 = Integer.parseInt(hour1Str); // convert a String to an integer
		int min1 = Integer.parseInt(min1Str);   
		
		int time1TotalMins = hour1 * 60 + min1; 		
		
		String hour2Str = time2.substring(0, 2);
		String min2Str = time2.substring(2, 4);
		
		int hour2 = Integer.parseInt(hour2Str);
		int min2 = Integer.parseInt(min2Str);
		
		int time2TotalMins = hour2 * 60 + min2;
		
		// if time2 is smaller than time1 
		if (time2TotalMins < time1TotalMins) {			
			time2TotalMins = time2TotalMins + 24 * 60;
		}
		
		int totalIntevalMins = time2TotalMins - time1TotalMins;
		// 4. print the interval   				
		System.out.println("Total interval: " +  (totalIntevalMins / 60)  + " hours " 
					+  (totalIntevalMins % 60)  + " mins");
	}
}
