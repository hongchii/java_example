package java_Example;
import java.util.Scanner;

public class Exam27 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수x : ");
		int x = stdIn.nextInt();
		System.out.print("정수y : ");
		int y = stdIn.nextInt();
		System.out.print("정수z : ");
		int z = stdIn.nextInt();
		
		int min = x;
		
		if (min > y)
			min = y;
		if (min > z)
			min =z;
			
			
				
				
		System.out.println("최솟값은 " + min + "입니다.");		

	}

}
