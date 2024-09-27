package exam08_반복문;

public class Statement08_do_while문 {

	public static void main(String[] args) {
		
		//for문
		for(int n=1; n<6 ;++n) {
			System.out.println("hello");
		}
       System.out.println("End");
       System.out.println("*******************************************");
       
       //while문
       int n = 1;
       
       while(n<6) {
    	   System.out.println("world" + n);
    	   ++n;
       }
       System.out.println("End");
       System.out.println("*******************************************");
       
       //do~while문
       int n2 = 10;
       do {
    	   System.out.println("happy"+n2);
    	   --n2;
       }while(n2>=5);
    		   
       
       
	
	
	
	
	}

}
