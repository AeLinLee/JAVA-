package exam09_배열;

public class ArrayTest02_2차원배열2_비정방형 {

	public static void main(String[] args) {
		
	// 비정방형 2차원 배열
		
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
		
		//일반 for문
		for (int i = 0; i < num.length; i++) {
			for(int c = 0; c<num[i].length; c++) {
				System.out.printf("num[%d]{%d]=%d \n", i, c, num[i][c]);
			}
		}
	
	
	
	
	}
	}


