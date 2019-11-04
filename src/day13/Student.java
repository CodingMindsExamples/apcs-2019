package day13;

public class Student {

	// 1. data
	private String name;
	private int age;
	private double height;
	private double weight;
	private double gpa;
	private int gradeLevel;
	

	// 2. methods: accessor / mutator
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "Name: " + this.name + " Age: " + this.age + " Height: " + this.height + " Weight: " + this.weight + " GPA: " + this.gpa + " GradeLevel: " + this.gradeLevel; 
	}
}
