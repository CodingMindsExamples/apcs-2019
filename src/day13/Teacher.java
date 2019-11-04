package day13;

public class Teacher {
	
	// 1. data
	private String name;
	private int age;
	private double height;
	private double weight;
	private String gender;
	private String subject;

	// 2. methods: accessor / mutator
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return "Name: " + this.name + " Age: " + this.age + " Height: " + this.height + " Weight: " + this.weight + " Gender: " + this.gender + " Sbuject: " + this.subject; 
	}
}
