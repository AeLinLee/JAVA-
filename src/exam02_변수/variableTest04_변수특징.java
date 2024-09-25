package exam02_변수;

public class variableTest04_변수특징 {
	
	int num = 200; //여기는 heap 메모리에 저장되는 인스턴스 변수니까 num 변수명을 또 사용 가능
	
	public static void main(String[] args) {
		
		//1. 동일 이름 사용 불가 (동일 블럭에서 같은 이름 사용 불가능 한거임)
		int num = 10;
		//String num = "100";
		System.out.println(num);
		
		//2. 로컬변수는 사용전에 반드시 초기화해야한다. 초기화 안하면 컴파일 에러가 발생됨.
		
		//3. 변수를 인식하는 범위 (블럭 scope 라고 부른다.) { } 중괄호
		//자바스크립트는 함수scope를 따른다.
		
		{
		     int k = 2;
		     System.out.println(k);  //블럭 안
			
		}	
		  //System.out.println(k); // 블럭 밖 (사용 불가)
		  
		  
		  
	}

}
