package do_while문;

import java.util.Random;
import java.util.Scanner;

public class ex05bonus {

	public static void main(String[] args) {
		// 1부터 100사이 숫자 맞추기 게임!
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num = r.nextInt(100) + 1;

		do {
			System.out.print("1과 100사이 정수를 입력하세요>>");
			int ans = sc.nextInt();

			if (num < ans) {
				System.out.println("더 작은 수로 다시 시도 해보세요");
			} else if (num > ans) {
				System.out.println("더 큰 수로 다시 시도 해보세요");

			} else {
				System.out.println(num + "정답입니다!!");
				break;
			}

		} while (true);
		sc.close();
		

	}

}
