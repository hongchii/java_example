package java_Example;


public class Exam14 {

	public static void main(String[] args) {
	
		
		String s1 = "ABC";
		String s2 = "XYZ";
		
		System.out.println("문자열 s1은 " + s1 + "입니다.");
		System.out.println("문자열 s1은 " + s2 + "입니다.");
		
		
		s1 = "FBI"; //변수의 값을 변경할때는 다시 선언해주지 않고, 변수명만 써야함.
		System.out.println("문자열 s1은 " + s1 + "입니다.");
		System.out.println("문자열 s1은 " + s2 + "입니다.");
	}

}
