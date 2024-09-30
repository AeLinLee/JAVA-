package exam08_반복문;

public class Statement09_continue문 {

	public static void main(String[] args) {
		
		//continue문
		for(int n=1; n<6 ;++n) {
			if(n==3)continue;
			System.out.println("hello"+n);
		}
       System.out.println("End");
       System.out.println("******************************");
       
       //1~10까지 반복하는데 짝수값만 출력하시오.
       for(int i = 1; i<=10; i++) {
    	   if(i%2!=0)continue;
    	   System.out.println(i);
       }
       System.out.println("End");
       

    		   
       
       
	
	
	
	
	}

}
