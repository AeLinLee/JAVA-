package exam02_변수;

public class variableTest03_변수종류 {

	//매서드 밖(class영역)
	int size = 20;  //인스턴스 변수
	static int age = 10;   //클래스 변수, static 변수
	static int age2;   // 0, 선언만 하고 초기화하지 않으면 자동으로 기본값으로 초기화 된다.
	static String name; //null, 참조형의 기본값은 null이다.
	static char name2;  // 문자데이터 타입의 기본값은 \u0000 이다.
	
	public static void main(String[] args) {
		
		//메서드 안(main)
		int num = 10;  //로컬 변수
		int num2;  //로컬 변수, 미초기화
		
	
		
		//System.out.println(num2); //미초기화 로컬 변수를 사용하면 에러 발생됨.
		System.out.println(variableTest03_변수종류.age2); //static 변수를 사용할때는 원래는 클래스 변수 점 으로 쓰는게 정확한것.
		System.out.println(age2);   //static 변수는 프로그램 실행시 생성되니까 접근 가능. 
		System.out.println(name);
		System.out.println(name2);   //공백과 비슷한 문자이기 때문에 콘솔창에 아무것도 출력되지 않은 것처럼 보여짐.
		System.out.println((int) name2);  // 해당 문자의 유니코드 값을 출력해서 확인해보자.
		
		
		
		//인스턴스 변수 접근 방법 => 인스턴스 변수는 new 이용했을 때 생성됨.
		variableTest03_변수종류 s = new variableTest03_변수종류();   //문법> 클래스 변수 = new 클래스() ;
		//System.out.println(size);  //그냥 접근하려고 하면 에러발생.
		System.out.println(s.size);
		
		
		
		
	}//안

}//밖
