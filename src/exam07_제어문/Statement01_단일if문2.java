package exam07_제어문;

import java.util.Scanner;

public class Statement01_단일if문2 {

	public static void main(String[] args) {

         //문제 : 키보드로 정수값을 입력받아서 짝수인 경우에만 값을 출력하는 코드를 작성하시오.
		Scanner scn = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		int num = scn.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수값: " + num);
		}
		
		if(num%2 != 0) {
			System.out.println("짝수를 입력해야 합니다.");
		}
		
		System.out.println("End.");
	}

}
