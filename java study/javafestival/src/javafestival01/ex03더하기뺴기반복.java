package javafestival01;

public class ex03더하기뺴기반복 {

	public static void main(String[] args) {
		// 1-2+3-4+5-6.....99-100 를 계산해 출력하세요
		int sum = 0;
				
		
		for (int i = 1; i < 101; i++) {

			if (i % 2 == 1) {

				sum += i;
				System.out.print(i+" ");

			} else {
				sum -= i;
				System.out.print("-"+i+" ");
			}

		}System.out.println();
		System.out.print("결과: " + sum);

	}

}
