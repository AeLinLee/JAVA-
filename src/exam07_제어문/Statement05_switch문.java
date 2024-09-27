package exam07_제어문;

public class Statement05_switch문 {

	public static void main(String[] args) {

		// switch문
		// byte, short, int, char, String, enum

		int num = 10;

		switch (num) {

		case 5:
			System.out.println("값은 5");
			break;
		case 10:
			System.out.println("값은 10");
			break;
		case 15:
			System.out.println("값은 15");
			break;
		default:
			System.out.println("값은 default");
		}

		System.out.println("END");
////////////////////////////////////////////////////////////////////////////////////////
		char c = 'A';

		// switch를 쓰다가 ctrl+space하면 자동 생성된다.
		switch (c) {
		case 'a':
			System.out.println("값은 'a'");
			break;
		case 'A':
			System.out.println("값은 'A'");
			break;
		case 'B':
			System.out.println("값은 'B'");
			break;
		default:
			System.out.println("값은 default");
			break;
		}
		System.out.println("END");
/////////////////////////////////////////////////////////////////////////////////////
		String s = "Tue";
		switch (s) {
		case "Mon": System.out.println("값은 Mon"); 
		case "Tue": System.out.println("값은 Tue");   //break문이 없으면 일치된 case문 이후 모든 문장이 실행된다.
		case "Sun": System.out.println("값은 Sun");
		default: System.out.println("값은 default");
		}
		

	}

}
