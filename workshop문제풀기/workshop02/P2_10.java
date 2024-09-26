package workshop02;

import java.util.Scanner;

public class P2_10 {

	public static void main(String[] args) {
		
		//Scanner 클래스를 사용하여 키보드로 주소값을 입력 받아서 도/시/구 이름을 출력하는 코드
//		출력결과: 
//		주소를 입력하시오. 
//		경기도  용인시 수지구  
//		도명: 경기도  
//		시명: 용인시  
//		구명: 수지구 
		
	      Scanner scn = new Scanner(System.in);
	      System.out.println("주소를 입력하시오.");
	      String add1 = scn.next();
	      String add2 = scn.next();
	      String add3 = scn.next();
	      
	      System.out.println("도명: " + add1);
	      System.out.println("시명: " + add2);
	      System.out.println("구명: " + add3);
		
	}

}
