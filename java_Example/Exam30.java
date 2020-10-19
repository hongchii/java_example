package java_Example;
import java.util.Scanner;

public class Exam30 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수a : ");
		int a = stdIn.nextInt();
		System.out.print("정수b : ");
		int b = stdIn.nextInt();
		
		int c;
		if(a < b) {
			c=a;
			a=b;
			b=c;	
		}	
		
		System.out.println("a>=b가 되도록 정렬했습니다.");
		System.out.println("정수a는 " + a + "입니다.");
		System.out.println("정수b는 " + b + "입니다.");
		
			
		
	}

}
