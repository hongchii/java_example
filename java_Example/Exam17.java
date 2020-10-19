package java_Example;
import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		// 두개의 양의 정숫값을 읽어와서 후자가 전자의 약수이면 "B는 A의 약수이다."라고 표기하고, 아니면
		// "B는 A의 약수가 아니다" 라고 표시하는 프로그램을 작성하자.

		int a, b, c;
		Scanner stdIn = new Scanner(System.in);
		System.out.print("변수 A : ");
		a = stdIn.nextInt();
		System.out.print("변수 B : ");
		b = stdIn.nextInt();

		/*if ((a % b) == 0)
			System.out.println("B는 A의 약수이다.");
		else
			System.out.println("B는 A의 약수가 아니다.");
		 */
		
		if (a % b != 0)
			System.out.println("B는 A의 약수가 아니다.");
		else 
			System.out.println("B는 A의 약수이다.");
	}

}
