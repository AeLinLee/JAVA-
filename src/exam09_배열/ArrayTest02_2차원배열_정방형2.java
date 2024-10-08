package exam09_배열;

public class ArrayTest02_2차원배열_정방형2 {

	public static void main(String[] args) {
		
	// 정방형 2차원 배열 생성하는 3가지 방법
		
		//1. new 이용
		int [][] num = new int [3][2];     //3행 2열
		
		num[0][0]=1;
		num[0][1]=2;
		num[1][0]=3;
		num[1][1]=4;
		num[2][0]=5;
		num[2][1]=6;
        System.out.println();
		
		//2. 리터럴 이용
        //문법: 데이터타입 [][] 배열명 = { { 값, 값}, { 값, 값 }, { 값, 값} };
        // 안에 있는 중괄호 갯수가 행의 개수, 안에 있는 값들이 열의 갯수
        int [][] num2 = { {1,2}, {3,4}, {5,6} };
        
        for (int[] n : num2) {
			for( int v: n) {
				System.out.println(v);
			}
		}
        System.out.println();
        
       //3. new + 리터럴 혼합
        // 문법: 데이터타입 [][] 배열명 = new 데이터타입[][] { { 값, 값}, { 값, 값 }, { 값, 값} };
		int [][] num3; 
	    num3 = new int [][] { {1,2}, {3,4}, {5,6} };
		
	    for (int[] n : num3) {
	 			for( int v: n) {
	 				System.out.println(v);
	 			}
	 		}
		
	}
	}


