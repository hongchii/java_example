package java_Example;
import java.util.Scanner;

public class Exam20 {

	public static void main(String[] args) {
		// 입력한 정숫값이 5로 나누어 떨어지면 "이 값은 5로 나누어집니다." 아니면 "이 값은 5로 나누어지지 않습니다."
		// 음수를 입력한 경우에는 "음의 정숫값을 입력했습니다." 라고 입력
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정숫값 : ");
		int n = stdIn.nextInt();

		if (n > 0) {
			if (n % 5 == 0)
				System.out.println("이 값은 5로 나누어집니다.");
			else if (n % 5 != 0)
				System.out.println("이 값은 5로 나누어지지 않습니다.");
		} else
			System.out.println("음의 정숫값을 입력했습니다.");

	}

}
