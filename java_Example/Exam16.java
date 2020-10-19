package java_Example;
import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// 정숫값을 읽어서 절댓값을 구하라.

		Scanner stdIn = new Scanner(System.in);

		System.out.print("정숫값 : ");
		int n = stdIn.nextInt();

		if (n >= 0)
			System.out.print("절댓값은 " + n + "입니다.");
		else
			System.out.print("절댓값은 " + (-n) + "입니다.");

	}

}
