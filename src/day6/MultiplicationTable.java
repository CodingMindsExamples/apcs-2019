package day6;

public class MultiplicationTable {

	public static void main(String[] args) {		
		for(int j = 1; j <= 10; j++) {
			for(int i = 1; i <= 10; i++) {				
				System.out.println(j + " * " + i + " = " + j*i);
			}
		}
	}

}
