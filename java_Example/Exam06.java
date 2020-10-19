package java_Example;
import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		/*
		 * 키보드로 입력받은 정숫값에 10을 더한 값과 10을 뺀 값을 출력하라. 출력결과 정숫값 : 7 10을 더한 값은 17입니다. 10을 뺀
		 * 값은 -3입니다.
		 */

		Scanner stdIn = new Scanner(System.in);

		System.out.print("정숫갑 : ");

		int x = stdIn.nextInt();
		int y = 10;

		System.out.println("10을 더한 값은" + (x + y) + "입니다.");
		System.out.println("10을 뺀 값은" + (x - y) + "입니다.");

	}

}
