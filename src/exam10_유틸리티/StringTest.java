package exam10_유틸리티;

import java.util.Random;

public class StringTest {

	public static void main(String[] args) {
		
	// hello 문자열 생성
		
		//1. 리터럴 이용
		String s = "hello";
		
		//2. new 이용
        String s2 = new String("hello");
        
        System.out.println(s);
        System.out.println(s2);
	
	    // s와 s2가 같냐?
        System.out.println(s==s2);    // false,  s의 주소값 == s2의 주소값 이런 의도가 되어버림.
        
        //그래서 참조형에서는 == 으로 비교하지 않음.
	     System.out.println(s.equals(s2));     // true,  s의 실제값과 s2의 실제값이 같냐는 의도
	
	
	
	}

}
