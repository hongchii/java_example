package java_Example;
import java.util.Scanner;

public class Exam23 {

	public static void main(String[] args) {
		// 입력한 점수에따라 if문으로 수우미양가 출력하기 수 100-90/우 89-80/미 79-70/양 69-30/가 29-0

		Scanner stdIn = new Scanner(System.in);
		System.out.print("점수 입력 : ");

		int point = stdIn.nextInt();
		
		if (point >=0 && point <=40)
			System.out.println("가");
		else if (point >= 41 && point <= 59)
			System.out.println("양");
		else if (point >=60 && point <= 79)
			System.out.println("미");
		else if (point >=80 && point <=89)
			System.out.println("우");
		else if (point >=90 && point ==100)
			System.out.println("수");
		else 
			System.out.println("잘못된 점수 입니다.");
		

	}

}
