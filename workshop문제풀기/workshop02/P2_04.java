package workshop02;

public class P2_04 {

	public static void main(String[] args) {
		
		/*화씨를 섭씨로 변경하는 프로그램을 작성 하시오. 
          C(celcius): 섭씨, F(fahrenheit): 화씨 
          공식: C = 5/9 * (F-32)
	    */
		// 출력 결과   : Fahrenheit:100 
		//                   Celcius:37.77778
		
		int fahrenheit = 100; 
		float celcius =  (float)5/9 * (fahrenheit-32); 
		System.out.println("Fahrenheit:"+fahrenheit); 
		System.out.println("Celcius:"+celcius);
		
		//think1 : 그냥 공식을 대입했더니 0.0 이란 결과가 나오길래 5/9 부분에 수정이 필요하다고 생각하여 다음과 같이 비교해봤다.
		System.out.println(5/9);    // 0
		System.out.println((float)5/9);    //0.5555556    그래서 float으로 데이터형 변경을 해줘야겠다고 생각했다.
		
		
	}

}
