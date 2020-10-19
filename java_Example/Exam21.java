package java_Example;
import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		// 입력한 정숫값이 10의 배수이면 "이 값은 10의 배수입니다."라고 표시하고
		// 아니면 "이 값은 10의 배수가 아닙니다."
		// 음숫값을 입력하면 "음의 정숫값을 입력했습니다."

		Scanner stdIn = new Scanner(System.in);

		System.out.print("정숫값 : ");
		int n = stdIn.nextInt();

		if (n > 0) {
			if (n % 10 == 0)
				System.out.println("이 값은 10의 배수입니다.");
			else if (n % 10 != 0)
				System.out.println("이 값은 10의 배수가 아닙니다.");

		} else
			System.out.println("음의 정숫값을 입력했습니다.");
	}

}
