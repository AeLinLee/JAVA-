package exam08_반복문;

public class Statement06_for문2_중첩 {

	public static void main(String[] args) {

		// 중첩: 모든 제어문(조건문, 반복문)은 중첩이 가능하다.
		// 중첩 for문은 안에 있는 for문을 x로 치환해서 생각하면 복잡하지 않게 생각할 수 있다.
		// 실습: 구구단을 출력하시오.
		/*
		 * 2 * 1 = 2 2 * 2 = 4 ... 2 * 9 = 18 3 * 1 = 3 ... 9 * 9 = 81
		 * 
		 */

		for (int n = 2; n <= 9; ++n) {
			for (int n2 = 1; n2 <= 9; ++n2) {
				int result = n * n2;
				System.out.printf("%d * %d = %d \n", n, n2, result);
			}
		}
		System.out.println("End.");
		System.out.println("********************************************************");

		// 문제: 구구단 출력시 3단과 6단만 출력하시오.
		System.out.println("3단과 6단만 출력.");
		for (int n = 2; n <= 9; ++n) {
			if (n == 3 || n == 6) {
				for (int n2 = 1; n2 <= 9; ++n2) {
					int result = n * n2;
					System.out.printf("%d * %d = %d \n", n, n2, result);
				}//안 for문
			}// if문
		}//밖 for문
		
		
		System.out.println("End.");

	}

}
