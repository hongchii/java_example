package java_Example;
import java.util.Scanner;

public class Exam31 {

	public static void main(String[] args) {
		// 3개의 정숫값을 오름차순으로. 작은 숫자 부터.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수a : ");
		int a = stdIn.nextInt();
		System.out.print("정수b : ");
		int b = stdIn.nextInt();
		System.out.print("정수c : ");
		int c = stdIn.nextInt();

		int t;
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}

		System.out.println("a<= b<= c가 되도록 정렬했습니다.");
		System.out.println("변수a는 " + a + "입니다.");
		System.out.println("변수b는 " + b + "입니다.");
		System.out.println("변수c는 " + c + "입니다.");

	}

}
