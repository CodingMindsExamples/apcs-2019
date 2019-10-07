package day9;

import java.util.Random;
import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		r.nextInt(100);
		Random r2 = new Random();
		r2.nextInt();
		
		// Class vs Object 对象 instance 实例
		// stu1: Object
		HSStudent stu1 = new HSStudent(); 
		stu1.name = "Andy";
		stu1.studentId = "0001";
		stu1.age = 14;
		stu1.gradeLevel = 9;
		stu1.printNameTag();
		// stu2: Object 对象 instance 实例
		HSStudent stu2 = new HSStudent();
		stu2.name = "Eric";
		stu2.age = 15;
		stu2.gradeLevel = 10;
		stu2.studentId = "0002";
		stu2.printNameTag();
	}

}
