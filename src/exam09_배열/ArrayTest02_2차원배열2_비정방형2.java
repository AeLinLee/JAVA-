package exam09_배열;

public class ArrayTest02_2차원배열2_비정방형2 {

	public static void main(String[] args) {
		
	// 비정방형 2차원 배열 생성하는 방법 3가지
		
		//1. new 이용
		int [][] num = new int[3][];
		
		//열 생성
		num[0] = new int[1];
		num[1] = new int[3];
		num[2] = new int[2];
	
	     // 초기화
		num[0][0] = 1;
		num[1][0] = 2;
		num[1][1] = 3;
		num[1][2] = 4;
		num[2][0] = 5;
		num[2][1] = 6;
		
		//2. 리터럴 이용
		int [][] num2 = { {1}, {2,3,4}, {5,6} };
		
		for (int[] is : num2) {
			for(int v : is) {
				System.out.println(v);
			}
		}
		
		//3. new+리터럴 이용
		int [][ ] num3; 
		num3 = new int [][] { {1}, {2,3,4}, {5,6} };
		
	
	
	
	
	}
	}


