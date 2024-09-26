package workshop02;

public class P2_06 {

	public static void main(String[] args) {
		
	  /*
	   * 선언된 정수형 데이터가 홀수인지 짝수인지 출력한다. 
         단, 연산처리는 삼항 연산자를 이용한다. 
	   */
//	    출력 결과 : 선언 변수 5 일때 결과: 
//	    	          숫자 5는 홀수입니다 
		
		
		int i = 5; 
		String result =  ( i%2 == 0)?"짝수" : "홀수" ;                         
		System.out.println("선언 변수 5일때 결과:");
		System.out.println("숫자 5는 " + result + "입니다.");
		
		
	}

}
