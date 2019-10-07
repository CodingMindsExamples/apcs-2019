package day3.hw;

public class StrReplaceDemo {

	public static void main(String[] args) {
		String str = "flkdsfjlsdjflsjfljfjsfsldfjslf";
		str = str.replace("s", "$");
		System.out.println(str);
		
		str= "1,000,000";
		str = str.replace(",", "");
		System.out.println(str);
	}
}
