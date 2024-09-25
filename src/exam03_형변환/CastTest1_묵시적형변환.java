package exam03_형변환;

public class CastTest1_묵시적형변환 {

	public static void main(String[] args) {
		
		
	//1. byte> short > int > long > float > double
	// 큰타입 = 작은타입;
		byte b = 10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		float b5 = b4;
		double b6 = b5;
		
		//역은 불가능 (작은타입 = 큰타입)
		//int x = b6;
		
	
		//2. char (문자형 > int (정수형))
		
		char c = 'A';
		int c2 = 'A';
		int c3 = 'a';
		System.out.println(c2); //대문자 A의 정수값(아스키코드): 65
		System.out.println(c3); //소문자 a의 정수값(아스키코드) : 97
		
		int c4 = 'A'+1;
		System.out.println(c4);  //산술 가능, 66
		System.out.println('A'+1);
		
	
		//3.정수형중에서 int보다 작은 타입의 연산 결과는 기본값인 int로 반환된다.
		short s = 10;
		short s2 = 20;
		//short s3 = s+s2; //에러발생, s+s2은 int다.
	    int s3 = s+s2;
	    
	    //4.작은데이터형과 큰 데이터의 연산결과는 큰 데이터형으로 반환된다.
	    System.out.println(4+5.0);  //9.0  연산 결과가 실수가 나옴
	    
	    int k = 4;
	    float k2 = 5.0F;
	    float k3 = k+k2;
	    System.out.println(k3);
	    
	    
	    //5. 문자열+비문자열(문자열)  ==>더하기가 아님, 지정된 값이 연결되어 문자열로 반환
	    System.out.println(10 + " " + 20);
	    
	    String name = "홍길동";
	    int age = 10;
	    System.out.println("이름: "+name + ", 나이: "+age);
	}

}
