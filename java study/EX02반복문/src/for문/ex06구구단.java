package for문;

import java.util.Scanner;

public class ex06구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하세요: ");
		int num = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d*%d=%d%n", num, i, num * i);

		}
		sc.close();

		// 구구단 보충 2포문 사용해서 구하기
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {				
				System.out.printf("%d*%d=%d \t", i, j, i * j);
				
				// 아니면 힘겹게 i+"*"+j+"="+i*j+"\t" 쳐야함
			}
			System.out.println();

		}

	}

}
