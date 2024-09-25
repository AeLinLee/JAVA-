package workshop01;

public class P01 {

	public static void main(String[] args) {

		/*
		 * Q. 다음과 같은 실행결과를 내시오. 
		 * 
		 * 
		 * 1.println 사용 
		 * 이름은 홍길동 
		 * 나이는 20 이고 주소는 서울 
		 * 2.print 사용 
		 * 이름은 홍길동
		 * 나이는 20 이고 주소는 서울 
		 * 3.printf 사용 
		 * 이름은 홍길동 
		 * 나이는 20 이고 주소는 서울
		 */
		
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		
		// 1. println 사용
		System.out.println("이름은 "+ name);
		System.out.println("나이는 "+ age + " 이고 주소는 "+ address);

		// 2. print 사용
		System.out.print("이름은 "+ name + "\n나이는 " + age + " 이고 주소는 " + address);
		System.out.println();
		
		// 3. printf 사용
		System.out.printf("이름은 %s \n나이는 %d 이고 주소는 %s", name, age, address);
	}

}
