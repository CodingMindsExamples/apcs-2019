package day12;

// definition 
// class 类
// abstract   抽象
// non-specific data
public class HSStudent {

	// 1. data	  RAM
	static int count;
	
	private String name;  // null
	private int age;
	private String studentId;
	private int gradeLevel;	
	
	// mutators: mutate the variables 改变
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age > 30) {
			System.out.println("This does not seem to make sense. Please check again!");
		} else {
			this.age = age;
		}
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	// accessors (getters)
	public String getName() {
		return name;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	
	
	
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
