package workshop02;

public class P2_01 {

	public static void main(String[] args) {

		/*
		 * 다음 아스키 코드값을 활용할 수 있다. 
		 * ascii 값 ‘A’ -> 65 
		 * ascii 값 ‘B’ -> 66 
		 * ascii 값 ‘1’ -> 49
		 * ascii 값 ‘2’ -> 50
		 */
         
		/*
		 * 출력은 아래와 같이 이루어 진다. 
            12  
           true 
           131 
           51 
           99
		 */
		
		  String s1 = "1"; 
		  String s2 = "2"; 
		  boolean  bnx = false; 
		  char c1 = 'A'; 
		  char c2 = 'B'; 
		  char c3 = '1'; 
		  char c4 = '2'; 
		  int inx = 2; 
		 
		  System.out.println(  s1 + s2 ); 
		  System.out.println(  !bnx   ); 
		  System.out.println(  (int)c1+c2 ); 
		  System.out.println(  (int)c3+inx  ); 
		  System.out.println(  (int)c3+c4  ); 
		
		
	}

}
