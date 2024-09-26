package workshop02;

import java.util.Scanner;

public class P2_09 {

	public static void main(String[] args) {
		
		//Scanner 클래스를 사용하여 키보드로 값을 입력 받아서 실행 결과와 같이 출력하시오. 단, 3항 연산자만 사용할 것 
//		출력결과: 
//		1.정수 입력하세요. 
//		10 
//		2.정수 입력하세요. 
//		50 
//		정수 10 과  정수  50 중에서  최대값: 50
		
	      Scanner scn = new Scanner(System.in);
	      System.out.println("1.정수 입력하세요.");
	      int n1 = scn.nextInt();
	      System.out.println("2.정수 입력하세요.");
	      int n2 = scn.nextInt();
	      
	      int result = (n1>n2)?n1:n2;
	      
	      System.out.printf("정수 %d과 정수 %d중에서 최대값: %d", n1, n2, result);
		
	}

}
