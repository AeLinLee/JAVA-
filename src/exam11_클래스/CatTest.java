package exam11_클래스;

public class CatTest {
          // main 메서드가 없는 Cat 클래스 관리할 목적
	public static void main(String[] args) {
	
		// 1) 클래스 객체 생성
		Cat c = new Cat();
		
        // 2) 고양이 정보 설정  < Cat 클래스의 인스턴스 변수 초기화
		c.name = "야옹이";
		c.age = 2;
		c.gender = "암컷";
		
	    //3) 고양이 정보 조회
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.gender);
	}

}
