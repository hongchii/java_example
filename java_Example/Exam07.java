package java_Example;
import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		/*
		 * 키보드로 입력 받은 정숫값에서 마지막 자릿수를 제외한 값과마지막 자릿수 값만 표시하는 프로그램을 작성. 실행결과 정숫값 : 1275 마지막
		 * 자릿수를 제외한 값은 127입니다. 마지막 자릿수는 5입니다.
		 */

		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값 : ");
		// 키보드 값을 받을 때 줄바꿈이 되지않게 꼭 print로 써주자.

		int x = stdIn.nextInt();

		System.out.println("마지막 자릿수를 제외한 값은" + (x / 10) + "입니다.");
		System.out.println("마지막 자릿수는" + (x % 10) + "입니다.");

		int y = x / 10;
		int z = x % 10;

		System.out.println("마지막 자릿수를 제외한 값은" + y + "입니다.");
		System.out.println("마지막 자릿수는" + z + "입니다.");

	}

}
