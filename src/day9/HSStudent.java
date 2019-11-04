package day9;

// definition 
// class 类
// abstract   抽象
// non-specific data
public class HSStudent {

	// 1. data	
	static int count;
	
	String name;
	int age;
	String studentId;
	int gradeLevel;	
	
	// 2. method/function
	public void printNameTag() {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("# Name: " + name + "                   #");
		System.out.println("# Age: " + age + "                      #");
		System.out.println("# Student Id: " + studentId + "           #");
		System.out.println("# Grade Level: " + gradeLevel + "               #");
		System.out.println("################################");
	}
	
	public static void printSystemVersionNum() {
		System.out.println("Student Management System V1.005");
	}
}
