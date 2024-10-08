package exam09_배열;

public class ArrayTest03_커맨드라인_arguments2 {

	public static void main(String[] args) {
		
	   // c:\> java Hello 10 + 20
		// 문자열 "10" ==> 정수형 10로 변환 필요
		// int n = Integer.parseInt("10")  
		
	   int v1 = Integer.parseInt (args[0]) ;
	   String op = args[1];
	   int v2 =  Integer.parseInt (args[2]) ;
	    
	   int result = 0;
	   switch(op) {
	   
	   case "+": result = v1+v2; break;
	   case "-": result = v1-v2; break;
	   
	   }
	    System.out.println("결과값:" + result );
		System.out.println("end");
	
	  }//end main
	}//end class


