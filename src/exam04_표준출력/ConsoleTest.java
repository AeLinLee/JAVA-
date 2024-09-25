package exam04_표준출력;

public class ConsoleTest {

	public static void main(String[] args) {

        //1. System.out.println(값)
		//새로운 줄에 출력이 된다.
		System.out.println("hello");
		System.out.println("world");
		System.out.println();
		
	      //2. System.out.print(값)
			//새로운 줄 없이 현재줄에 출력된다.
			System.out.print("hello");
			System.out.print("world\n");  //이스케이프 문자 활용
			
			System.out.print("hello");
			System.out.print("world");
			System.out.println();
			
			
			//3. System.out.printf("  ", 값...);
			//새로운 줄 없이 현재줄에 출력된다.
			System.out.printf("%d \n", 19);  //정수값 %d
			System.out.printf("%f \n", 3.14F);  //실수값 %s
			System.out.printf("%f \n", 3.14D);  
			System.out.printf("%c \n", '남');  //문자값 %c
			System.out.printf("%b \n", true); //논리값 %b
			System.out.printf("%s \n", "홍길동");  //문자열값 %s
			
			//주로 이련경우에 printf를 활용한다.
			System.out.printf("%.2f \n", 3.14864532159845131); //3.14
			System.out.printf("%3d \n", 19);
	
			String name = "홍길동";
			int age = 10;
			
			System.out.println("이름: "+ name + ", 나이: "+ age);
			System.out.printf("이름: %s, 나이: %d", name, age);  //가독성이 더 좋음

	}

}
