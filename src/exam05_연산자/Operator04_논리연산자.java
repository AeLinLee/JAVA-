package exam05_연산자;

public class Operator04_논리연산자 {

	public static void main(String[] args) {
	
		//4. 논리 연산자 ( &&,  ||, ! )
		// 실행결과는 논리값 (true/ false)로 반환됨.
		// &&, || 는 Short circuit logical 연산자
		
		// 가. &&  (and, 하나라도 false가 있으면 false가 나온다. )
		System.out.println(true && true );  //true
		System.out.println(true && false );  //false
		System.out.println(false && true );   //false  , Dead Code, 앞에가 false이면 보나마나 결과값이 false이니까 실행x
		System.out.println(false && false );  //false  , Dead Code
		
		
		// 나. ||  (or, 하나라도 true가 있으면 true가 나온다. )
		System.out.println(true || true );  //true  , Dead Code, 앞에가 true이면 보나마나 결과값이 true이니까 실행x
		System.out.println(true || false );  //true  , Dead Code
		System.out.println(false || true );   //true
		System.out.println(false || false );  //false
		
		
		// 다. !  (not, 부정, 반대가 나옴. )
		System.out.println( !true );  //false
		System.out.println( !false );  //true

		
		

	}

}
