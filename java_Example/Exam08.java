package java_Example;
import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		/*
		 * 2개의 실숫값을 입력받아 합과 평균을 구하라. 출력결과 x값 : 9.75 y값 : 2.5 합계는 12.25 입니다. 평균은 6.125
		 * 입니다.
		 */

		Scanner stdIn = new Scanner(System.in);

		System.out.print("x값 : ");
		double x = stdIn.nextDouble();
		System.out.print("y값 : ");
		double y = stdIn.nextDouble();

		double sum = x + y;
		double avg = (x + y) / 2;

		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + avg + "입니다.");

	}

}
