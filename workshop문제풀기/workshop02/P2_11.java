package workshop02;

import java.util.Scanner;

public class P2_11 {

	public static void main(String[] args) {
		
		//Scanner 클래스를 사용하여 키보드로 세 개의 정수값을 입력 받아서 최대값을 구하는 코드 작업. 단, 한 번의 3항 연산자만 사용할 것 
//		출력결과: 
//		1.정수 입력하세요. 
//		77 
//		2.정수 입력하세요. 
//		66 
//		3.정수 입력하세요. 
//		78 
//		정수 77 과  정수  66 , 정수 78 중에서  최대값: 78 
		
	      Scanner scn = new Scanner(System.in);
	      System.out.println("1.정수 입력하세요.");
	      int num1 = scn.nextInt();
	      System.out.println("2.정수 입력하세요.");
	      int num2 = scn.nextInt();
	      System.out.println("3.정수 입력하세요.");
	      int num3 = scn.nextInt();

	      int result = (num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
	      //  int result = (num1>num2)?num1: ((num2>num3)?num2:num3);   >> 이렇게 할 경우 num1이 num3보다 크다는 것을 알아낼 수가 없다.
	  
	      System.out.printf("정수 %d과 정수 %d, 정수 %d 중에서 최대값: %d", num1, num2, num3, result );
		
	}

}
