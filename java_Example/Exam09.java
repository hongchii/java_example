package java_Example;
import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		/*
		 * 삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하자 출력결과 삼각형의 넓이를 구합니다. 밑변 : 6.5 높이 :
		 * 3.5 넓이는 11.375입니다. 밑변*높이/2
		 */

		Scanner stdIn = new Scanner(System.in);
		System.out.println("삼각형의 넓이를 구합니다.");

		System.out.print("밑변 : ");
		double x = stdIn.nextDouble();
		System.out.print("높이 : ");
		double y = stdIn.nextDouble();

		System.out.println("넓이는 " + (x * y) / 2 + "입니다.");

	}

}
