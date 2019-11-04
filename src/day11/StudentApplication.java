package day11;

import java.util.Random;
import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) {		
		// Class vs Object 对象 instance 实例
		// stu1: Object		
		
		HSStudent stu1 = new HSStudent(); 
		stu1.setName("Andy");
		stu1.setStudentId("0001");
		stu1.setAge(34);
		stu1.setGradeLevel(9);
		HSStudent.count++;
		stu1.printNameTag();
		
		// stu2: Object 对象 instance 实例
		HSStudent stu2 = new HSStudent();
		stu2.setName("Eric");
		stu2.setAge(45);
		stu2.setGradeLevel(12);
		stu2.setStudentId("0002");
		HSStudent.count++;
		stu2.printNameTag();
		
		HSStudent stu3 = null;
		
		System.out.println("Total Student: " + HSStudent.count);
		HSStudent.printSystemVersionNum();
		
		System.out.println(stu2.getAge());
		System.out.println(stu3.getName());
		System.out.println(stu3.getAge());
		
		// 
	}

}
