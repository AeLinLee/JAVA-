package exam06_표준입력_Scanner;

import java.util.Scanner;  		//import를 통해서 다른 패키지에 있음을 알려줌.

public class ScannerTest {

	public static void main(String[] args) {
		
		//Scanner 클래스 객체 생성
		// 문법:  클래스명 변수명 = new 클래스명([값,값2....]);
		
		Scanner scn = new Scanner(System.in);   //클래스를 사용하려면 객체생성을 해야한다.
		
		System.out.println("나이를 입력하시오.");
		int age = scn.nextInt();
		System.out.println("이름을 입력하시오.");
		String name = scn.next();
		System.out.println("주소를 입력하시오.");  //ex)부산시 해운대구
		//String address = scn.nextLine();  // nextLine()은 \n을 포함하고있어 밑 sysout까지 자동으로 출력됨.
		String add1 = scn.next();
		String add2 = scn.nextLine();  //이 부분에는 next보다 nextLine이 더 효율적일것 같다.
		
		System.out.printf("나이: %d\n", age);
		System.out.printf("이름: %s\n", name);
		System.out.printf("주소: %s %s", add1, add2);
		


	}

}
