package exam09_배열;

public class ArrayTest01_1차원배열 {

	public static void main(String[] args) {
		
		// 정수값 3개 저장하자. 10, 20, 30
		
		//1. 배열 선언
		int [] num;       //num변수? 참조형변수, int 배열타입의 변수, 로컬변수(stack에저장 되고 주소값을 가짐)
		
		//2. 배열 생성 (new이용, new 하면 무조건 heap메모리에 생성됨)
		num = new int[3];     //3개의 요소로 구성된 배열이  heap 메모리에 생성된다.
		
		//한번에 하기
		int [] num2 = new int[3];
		
		//3. 배열요소 접근 (자동 초기화 되어져 있음, 인덱스는 배열 길이보다 1이 더 작다)
		System.out.println("num배열의 크기: " + num.length);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		//4, 배열 초기화
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		//System.out.println(num[3]);  //없는 요소 접근시 예외 발생됨. ArrayIndexOutOfBoundsException
		
		
		
		

	}

}
