package javafestival01;

public class ex06계산 {

	public static void main(String[] args) {
		// (77*1) + (76*2) + (75*3) + ... + (1*77) 계산해 출력하세요
		int sum = 0;
		
		for (int i = 0; i < 77; i++) {
			sum += (77 - i) * (i + 1);			
		}
		System.out.print(sum);

	}

}
