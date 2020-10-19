package java_Example;
import java.util.Scanner;

public class Exam25 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수a : ");
		int a = stdIn.nextInt();
		System.out.print("정수b : ");
		int b = stdIn.nextInt();
		
		
		int m;
		
		if ( a > b)
			m = a-b;
		else
			m = b-a;
		
		
		
		System.out.println("두 값의 차는 " + m + "입니다.");
		
		
		
	}

}
