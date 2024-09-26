package workshop02;

public class P2_05 {

	public static void main(String[] args) {//***
		
		//변수 선언이 아래와 같이 되어 있을 때 실행 결과와 같이 출력 될 수 있도록 프로그램 하시오.
//	       출력 결과:  c=30 
//				         ch=C 
//				          f=1.5 
//				          l = 27000000000 
//				          result=true
		byte a = 10;
		byte b = 20; 
		byte c =  (byte)(a+b); //
		char ch = 'A'; 
		ch = (char)(ch+2) ; //
		float f =  (c/10)/2f  ; //  (c/10)/2f 과  (c/10)/2,  (float)(c/10)/2 이것의 결과는 1.5 와 1.0으로 다르다. 2를 2.0으로 만들어야 하는게 관건이었다.
//		long l =  3000*3000*3000L  ; //
		float f2 = 0.1f; 
		double d = 0.1; 
		boolean result = (float)d == f2  ; //
		 
		System.out.println("c="+c); 
		System.out.println("ch="+ch);
		System.out.println("f="+f); 
//		System.out.println("l="+l); 
		System.out.println("result="+result);
	}

}
