package day13b;

public class Teacher extends Person {

	private String gender;
	private String subject;
	
	public Teacher() {
		System.out.println("Teacher Constructor Called!");
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
		return "Name: " + getName() + " Age: " + this.getAge() + " Height: " + getHeight() + " Weight: " + getWeight() + " Gender: " + this.gender + " Subject: " + this.subject; 
	}
	
}
