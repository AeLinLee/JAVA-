package exam07_제어문;

public class Statement02_if_else문 {

	public static void main(String[] args) {

        // if~else문 : 조건에 따라서 실행하는 문장이 달라진다.
		//조건이 true이면 문장2 실행하고 false이면 문장 3이 실행되는 경우의 코드.
		
       System.out.println("문장1");
		
       if(true) {
		System.out.println("문장2");  
       }else {
		System.out.println("문장3");
		System.out.println("문장3-1");
       }
		
       System.out.println("end");

	}

}
