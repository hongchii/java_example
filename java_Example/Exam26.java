package java_Example;
import java.util.Scanner;

public class Exam26 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수x : ");
		int x = stdIn.nextInt();
		System.out.print("정수y : ");
		int y = stdIn.nextInt();

		int m = x >= y ? x - y : y - x;
		
		if (m > 10)
			System.out.println("두 값의 차는 11이상입니다.");
		else
			System.out.println("두 값의 차는 10이하입니다.");
	}

}
