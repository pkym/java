package ifelse문;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// 문제.에버랜드 입장료 계산 프로그램입니다.
		// 기본료는 2000원이며 인원수에 따라 지불해야 하는 프로그램을 만드세요.
		// 단, 20세 미만인 경우, 50% 할인이 적용됩니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요: ");
		int num = sc.nextInt();
		
		int price;

		if (age < 20) {
			price=num * 5000/2;
			

		} else {
			price=num * 5000;

		}
		
		System.out.println("총" + price +"원 입니다.");
		
		sc.close();

	}

}
