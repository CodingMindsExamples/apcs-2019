package day13;

public class SystemTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Elon Musk");
		p1.setAge(50);
		p1.setHeight(5.11);
		p1.setWeight(170);
		
		System.out.println(p1);		
		
		Student s1 = new Student();
		s1.setName("Eric");
		s1.setGpa(5.5);
		s1.setGpa(10);
		s1.setHeight(5.9);
		s1.setWeight(150);
		s1.setAge(15);
		System.out.println(s1);
		
		Teacher t1 = new Teacher();
		t1.setName("Thomas");
		t1.setGender("M");
		t1.setAge(40);
		t1.setHeight(6.1);
		t1.setWeight(160);
		t1.setSubject("CS");
		System.out.println(t1);
	}

}
