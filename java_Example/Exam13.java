package java_Example;
import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("주소 : ");
		/*String adress = stdIn.next();
		 * 주소같이 공백이 포함된 문자열에 next();를 사용하면 공백전까지만 출력됨.
		 * 그래서 이럴 땐 nextLine();을 사용하면 공백도 문자열로 포함해서 전부 출력해줌.
		 */
		String adress = stdIn.nextLine();
		System.out.println("주소는 " + adress + "입니다.");

	}

}
