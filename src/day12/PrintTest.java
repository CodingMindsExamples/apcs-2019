package day12;

import day11.HSStudent;

public class PrintTest {

	public static void main(String[] args) {
		// @85485945     
		HSStudent stu1 = new HSStudent(); 
		stu1.setName("Andy");
		stu1.setStudentId("0001");
		stu1.setAge(34);
		stu1.setGradeLevel(9);		
		
		// @85485945
		HSStudent stu2 = new HSStudent();
		stu2.setName("Eric");
		stu2.setAge(45);
		stu2.setGradeLevel(12);
		stu2.setStudentId("0002");
		
		System.out.println(stu1);
		System.out.println(stu1.toString());
		stu1.printMySelf();
		
//		System.out.println(stu2);
//		
//		stu1 = stu2;
//		System.out.println(stu1);
//		System.out.println(stu2);
//		
//		stu1.setAge(15);
//		stu2.setAge(60);
//		System.out.println(stu1);
//		System.out.println(stu2);
	}

}
