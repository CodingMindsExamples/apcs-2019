package day13b;

// Inheritance
public class Student extends Person {

	private double gpa;
	private int gradeLevel;
	
	public Student(String name, int age, double height, double weight, double gpa, int gradeLevel) {
		super(name, age);  
		System.out.println("Student Constructor Called!");
		this.gpa = gpa;
		this.gradeLevel = gradeLevel;
	}
	
	public double getGpa() {
		return this.gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public int getGradeLevel() {
		return this.gradeLevel;
	}
	
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	public String toString() {
		return "Name: " + getName() + " Age: " + getAge() + " Height: " + getHeight() + " Weight: " + getWeight() + " GPA:" + this.gpa + " GradeLevel: " + this.gradeLevel;
	}
}
