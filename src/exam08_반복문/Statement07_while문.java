package exam08_반복문;

public class Statement07_while문 {

	public static void main(String[] args) {
		
		for(int n=1; n<6 ;++n) {
			System.out.println("hello");
		}
       System.out.println("End");
       System.out.println("*******************************************");
       
       //위 for문을 while문으로 변경해보자.
       int n = 1;
       
       while(n<6) {
    	   System.out.println("world" + n);
    	   ++n;
       }
       System.out.println("End");
    		   
       
       
	
	
	
	
	}

}
