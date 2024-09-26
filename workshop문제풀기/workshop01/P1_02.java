package workshop01;

public class P1_02 {

	public static void main(String[] args) {

		/*
	       Q. 본인의 주민번호를 정수형 변수에 선언 하고 이를 화면에 출력 하시오.
	            ex) 나의 주민번호: 8310202182637
		 */
		
		
		// think1. 주민번호는 13자리에 맞는 데이터 타입을 골라야 한다. 일단 어떤 데이터타입을 써야할지 모르기 때문에 int와 long의 데이터 저장 범위를 알아보자.
		System.out.println(Integer.MAX_VALUE);  // 2147483647 > 10자리
		System.out.println(Long.MAX_VALUE);  // 9223372036854775807 > 19자리
		
		// think2. 위 단계에서 long 데이터 타입을 사용하여 주민번호를 저장해야겠다고 생각했음.
		long myNumber = 9512345678910L;
		
		// think3. 문제 실행결과와 같이 출력하자.
		System.out.printf("나의 주민번호: %d", myNumber);
		
        		
		
	}

}
