package ifelse문;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		// 문제.마트 계산대 프로그램입니다.
		// 만원짜리 선물세트를 구입했을 때 지불해야하는 금액을 계산해 보세요.
		// 단, 11개 이상 구매시에는 전체 금액에서 10% 할인이 적용됩니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요: ");
		int num = sc.nextInt();
		int price = num * 10000;

		if (num >= 11) {
			// 10%할인가격
			// 다른방법 price =(int)(10000*num*0.9);

			price -= price / 10;

		} else {
			// 정가

		}
		System.out.println("가격은 " + price + "원입니다.");
		sc.close();

	}

}
