package java_Example;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 키보드로 정숫값 입력받기.

		Scanner stdIn = new Scanner(System.in);

		System.out.print("정숫값 :");
		// 키보드 값을 입력 받기 전 앞에 문구가 들어 갈 경우 먼저 실행문을 작성한다.

		int x = stdIn.nextInt();
		// 입력 받을 값을 변수로 선언해준다.

		System.out.println(x + "를 입력했습니다.");

	}

}
