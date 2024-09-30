package exam09_배열;

public class ArrayTest01_1차원배열2 {

	public static void main(String[] args) {
		
		//배열 요소 접근 방법
		
		int [] num = new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		//num[0] 얻어서 변수에 저장하자.
		int n = num[0];
		
		//1. 일반 for문 이용
		for(int idx=0; idx < num.length; idx++) {
			System.out.println(num[idx]);
		}
		System.out.println();
		
		//2. foreach문 (향상된 for문)
		for (int i : num) {
			System.out.println(i);
		}
		

	}

}
