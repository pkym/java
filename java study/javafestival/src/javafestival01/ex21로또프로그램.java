package javafestival01;

import java.util.Random;

public class ex21로또프로그램 {

	public static void main(String[] args) {
		// 중복없이 숫자를 뽑는 로또 프로그램을 만드시오
		
		Random r= new Random();
		while (true) {
			System.out.print("행운의 숫자 : "+(r.nextInt(44)+1));
		}
		
	}

}
