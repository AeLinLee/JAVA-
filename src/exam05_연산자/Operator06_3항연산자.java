package exam05_연산자;

public class Operator06_3항연산자 {

	public static void main(String[] args) {
	
		//6. 3항 연산자 
		// 문법 :    (조건식)?참문장:거짓문장;
		//조건식이 참이면 참문장을 출력 거짓이면 거짓문장을 출력한다.
		
		int n = 100;
		
		//문제 1 : n값이 5보다 크면 100을 반환하고 아니면 200을 반환하는 코드 작성해라.
		System.out.println( (n>5)?100:200 );
		
        
		//문제 2 : n값이 5보다 크고 200보다 작으면 "AAA"를 반환하고 아니면 "BBB"를 반환해라.
		String result = ( (n>5) && (n<200) )?"AAA":"BBB";
		System.out.println(result);
		
		
		//3항 연산자 중첩
		//참문장 또는 거짓문장이 새로운 3항연산자가 될 수 있다.
		int result2 = (100>200)? (100>50)?100:200  :  (100<200)?300:400 ;
		System.out.println(result2);    //300
        
	}

}
