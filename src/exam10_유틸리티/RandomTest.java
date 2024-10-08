package exam10_유틸리티;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int n = r.nextInt();
		System.out.println(n);
		
		int n2 = r.nextInt(5);    //nextInt(int bound),  0~4까지의 랜덤값을 반환해줌
		System.out.println(n2);
		
		float f = r.nextFloat();
		System.out.println(f);
		
		double d = r.nextDouble();
		System.out.println(d);
		
		boolean b = r.nextBoolean();
		System.out.println(b);

	}

}
