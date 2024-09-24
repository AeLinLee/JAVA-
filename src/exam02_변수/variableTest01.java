package exam02_변수;

public class variableTest01 {

	public static void main(String[] args) {
		// 1. 변수선언 => 메모리에 영역확보 + 접근하기 위한 이름지정
		// 문법: 데이터타입 변수명;
		//변수명 권장방법은 의미있는 명사형, 소문자로 하기
		
		//저장 데이터? 홍길동 20 서울 182.45 67.22 false
		
		String name;   //4byte, 참조형 변수
		int age;     //4byte, 기본형 변수
		String address;   //4byte, 참조형 변수
		double height;   //8byte, 기본형 변수
		float weight;   //4byte, 기본형 변수
		boolean isMarried;   //1byte, 기본형 변수
		
		
		//2. 변수 초기화 => 생성된 변수에 처음 값을 저장하는 작업
		//문법: 변수명=값;
		
		name="홍길동";
		age=20;
		address="서울";
		height=182.45;
		weight=67.22f;  // f가 없는 실수는 기본이 double이기 때문에 큰것이 작은걸로 들어갈 수 없어서 float데이터 타입에는 f를 붙여줘야 한다.
		isMarried=false;
		
		//3.변수사용
		System.out.println(name);
		System.out.println(age);   //20
		System.out.println(address);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(isMarried);
		
		//4.변수값 변경
		age=30;
		System.out.println(age);//30
	
	}

}
