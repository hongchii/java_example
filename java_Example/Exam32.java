package java_Example;
import java.util.Scanner;

public class Exam32 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇월입니까?: ");
		int month = stdIn.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
			System.out.println("가을입니다.");
			break;
		case 11:
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}

}
