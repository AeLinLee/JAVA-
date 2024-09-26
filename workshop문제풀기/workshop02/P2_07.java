package workshop02;

import java.util.Scanner;

public class P2_07 {

	public static void main(String[] args) {
		
		//Scanner 클래스를 사용하여 키보드로 값을 입력 받아서 실행 결과와 같이 출력하시오. 
//		출력결과: 
//		1.이름을 입력하세요. 
//		홍길동 
//		2.나이를 입력하세요. 
//		20 
//		이름은 홍길동, 나이는 20 입니다
		
	      Scanner scn = new Scanner(System.in);
	      System.out.println("1.이름을 입력하세요.");
	      String name = scn.next();
	      System.out.println("2.나이를 입력하세요.");
	      int age = scn.nextInt();
	      
	      System.out.printf("이름은 %s, 나이는 %d 입니다.",name, age);
		
	}

}
