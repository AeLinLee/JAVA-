package exam05_연산자;

public class Operator05_증감연산자 {

	public static void main(String[] args) {
	
		//5. 증감 연산자 ( ++, -- )
		
		//가. 증가 연산자
		//++변수명;    (앞에 붙인거 전치)
		//변수명++;    (뒤에 붙인거 후치)
		
		int n = 10;
		++n;
		System.out.println(n);    // 11
		
		n++;
		System.out.println(n);   //12
		
		
		//나. 감소 연산자
		//--변수명;    (앞에 붙인거 전치)
		//변수명--;    (뒤에 붙인거 후치)
	
		int n2 = 10;
		--n2;
		System.out.println(n2);   // 9
		
        n2--;
        System.out.println(n2);    //8
        
        //실행결과의 특징은 다른 연산자와 같이 사용하지 않고 독자적으로 증감연산자를 사용한 경우에는
        //전치와 후치의 실행결과는 동일하다.
        
	}

}
