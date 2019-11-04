package day13b;

public class SystemTest {

	public static void main(String[] args) {
		Person p1 = new Person("Elon Musk", 50, 5.6, 160);		
		System.out.println(p1);
		
		Student s1 = new Student("Eric", 14, 5.6, 160, 4.4, 10);		
		System.out.println(s1);
		
		Teacher t1 = new Teacher();
		t1.setName("Thomas");
		t1.setAge(35);
		t1.setSubject("Math");
		t1.setGender("M");
		t1.setHeight(5.5);
		t1.setWeight(150);
		
		System.out.println(t1);
	}

}
