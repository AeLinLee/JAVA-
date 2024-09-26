package workshop02;

public class P2_03 {

	public static void main(String[] args) {
		
		// 문자형 변수 ch가 영문자(대문자 또는 소문자)일 때만  변수 b의 값이 true가 되도록 프로그램을 완성 하시오. 
        // 실행 결과 :  true
		
		char ch = 'z'; 
		//think1 : 소문자와 대문자 각각의 알파벳의 범위를 정해줘야 겠다고 생각했다.
		boolean b = (ch>='a' && ch<='z') || (ch>='A' && ch<='Z');                            
		
		System.out.println(b);
		
	}

}
