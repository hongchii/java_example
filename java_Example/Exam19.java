package java_Example;
import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		//2개의 값을 읽어서 a,b의 대소관계를 표시해라.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("변수a : ");
		int a = stdIn.nextInt();
		System.out.print("변수b : ");
		int b = stdIn.nextInt();
		
		if (a > b)
			System.out.println("a가 크다.");
		else if (a < b)
			System.out.println("b가 크다.");
		else
			System.out.println("a와 b가 같다.");
		

	}

}
