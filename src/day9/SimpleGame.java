package day9;

public class SimpleGame {
	// class and objects
	// Java: Object-Oriented Programming Language
	// Everything should be an object!!!
	
	public static void printNameTag(String name, int age, String studentId, int gradeLevel) {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("# Name: " + name + "                   #");
		System.out.println("# Age: " + age + "                      #");
		System.out.println("# Student Id: " + studentId + "           #");
		System.out.println("# Grade Level: " + gradeLevel + "               #");
		System.out.println("################################");
	}
	
	public static void main(String args[]) {
		// Student
		//   attributes: name, age, studentId, gradeLevel (data)
		//   method: printNameTag                         (function - things to do with the data)
		String name = "Andy";
		int age = 14;
		String studentId = "00111A";
		int gradeLevel = 9;
		printNameTag(name, age, studentId, gradeLevel);
		
		String name2 = "Eric";
		int age2 = 15;
		String studentId2 = "00BD1A";
		int gradeLevel2 = 10;
		printNameTag(name2, age2, studentId2, gradeLevel2);
		
		String name3 = "Nathan";
		int age3 = 15;
		String studentId3 = "00BDFF";
		int gradeLevel3 = 10;
		printNameTag(name3, age3, studentId3, gradeLevel3);
		
		String name4 = "Steven";
		int age4 = 14;
		String studentId4 = "00BD11";
		int gradeLevel4 = 9;
		printNameTag(name4, age4, studentId4, gradeLevel4);
	}
}
