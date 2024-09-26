package exam05_연산자;

public class Operator05_증감연산자2_다른연산자와같이사용한경우 {

	public static void main(String[] args) {
	
		//5. 증감 연산자 ( ++, -- ) 와 다른 연산자 같이 사용하는 경우
		
		int num = 10;
		int num2 = 10;
		
		// 문제1 : num을 1 증가시키고 새로운 변수 result에 저장하시오.
		
		int result = ++num;
        System.out.println(result + " "+ num);    //11   11   전치: 먼저 증가되고 나중에 할당됨.
		
        
        //문제2 : num2를 1 증가시키고 새로운 변수 result2에 저장하시오.
		int result2 = num2++;
        System.out.println(result2 + " "+ num2);   //10    11  후치: 먼저 할당되고 나중에 증가됨.
	
	}

}
