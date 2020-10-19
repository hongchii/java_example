package java_Example;
import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		/*
		 * 키보드로 문자열을 입력받아 아래와 같이 출력하기.
		 * 출력결과 
		 * 성:홍 
		 * 이름:길동 
		 * 안녕하세요. 홍길동 씨.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("성:");
		String lastname = stdIn.next();
		System.out.print("이름:");
		String firstname = stdIn.next();
		
		String str = lastname+firstname;
		
		System.out.println("안녕하세요. " + str + " 씨");
		
	}

}
