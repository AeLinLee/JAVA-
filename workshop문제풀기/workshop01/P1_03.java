package workshop01;

public class P1_03 {

	public static void main(String[] args) {

		/*
	       Q. 다음과 같은 변수에 값이 저장되어 있을 때, 두 변수의 값을 바꾸는 코드를 작성하시오. 
               ( 즉, n 변수에는 20을 저장하고 n2 변수에는 10이 저장되도록 한다. 직접 입력하지 말고 변
               수를 통해서 값이 바뀌어야 된다.)
               
               int n = 10; 
               int n2 = 20; 
   
               //값 변경 코드 구현
            
            출력은 아래와 같이 이루어 진다. 
              n 값은 20 
              n2값은 10 
		 */
		
		
		
		   int n = 10; 
           int n2 = 20;
           
           // n2 = n;   // think 1 : 이 상태에서는 n2=10, n=10 인 상태이다. 이렇게 되면 n에 20인 값을 넣을 순 없다.
           
          int x = n;   // think 2 : 가상의 x 변수를 만들어서 여기에 일단 10을 저장해놓자. x=10
          
          n=n2;  // n과 n2 모두 20
          n2=x;  // think 3 : n2는 10이 들어가야 하니까 x를 넣어주자.
          
          // think 4 : 위 예시처럼 출력해보자.
          System.out.println("n값은 " + n);
          System.out.println("n2값은 " + n2);
          
		
        		
		
	}

}
