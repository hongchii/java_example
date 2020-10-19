package java_Example;
import java.util.Scanner;

public class Exam29 {

	public static void main(String[] args) {
		// 작은값과 큰값을 표시, 같으면 같다고 표시
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수a : ");
		int a = stdIn.nextInt();
		System.out.print("정수b : ");
		int b = stdIn.nextInt();

		if (a < b)
			System.out.println("작은 값은 " + a + "입니다." + "\n큰 값은 "+b+"입니다.");
		// System.out.println("큰 값은 "+b+"입니다.");
		else if (a > b)
			System.out.println("작은 값은 " + b + "입니다." + "\n큰 값은 " + a + "입니다.");

		else
			System.out.println("두 값이 같습니다.");

	}

}
