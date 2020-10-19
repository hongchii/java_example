package java_Example;
import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int n = stdIn.nextInt();

		if (n > 0)
			if (n % 3 == 0)
				System.out.println("이 값은 3으로 나누어집니다.");
			else if (n % 3 == 1)
				System.out.println("이 값을 3으로 나눈 나머지는 1 입니다.");
			else
				System.out.println("이 값을 3으로 나눈 나머지는 2 입니다.");
		else
			System.out.println("음수를 입력하셨습니다.");
	}

}
