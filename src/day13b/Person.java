package day13b;

public class Person {

	// 1. data
	private String name;
	private int age;
	private double height;
	private double weight;		
	
	public Person() {
		System.out.println("Person Constructor NO Parameters Called!");
	}
	
	public Person(String name, int age) {
		System.out.println("Person Constructor Called!");
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, double height, double weight) {
		System.out.println("Person Constructor Called!");
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
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
	
	public String toString() {
		return "Name: " + this.name + " Age: " + this.age + " Height: " + this.height + " Weight: " + this.weight; 
	}
}
