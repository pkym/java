package javafestival01;

import java.util.Scanner;

public class ex04거스름돈지폐출력 {

	public static void main(String[] args) {
		// 거스름돈을 입력받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램을 작성하세요
		// 단, 최대단위는 10000원, 최소단위는 100원

		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력: ");
		int money = sc.nextInt();

		System.out.print("잔돈: " + money + "원");
		System.out.println();

		int num1 = money / 10000;
		System.out.println("10000원: " + num1);

		int num2 = money % 10000 / 5000;
		System.out.println("5000원: " + num2);

		int num3 = money % 10000 % 5000 / 1000;
		System.out.println("1000원: " + num3);

		int num4 = money % 10000 % 5000 % 1000 / 500;
		System.out.println("5000원: " + num4);

		int num5 = money % 10000 % 5000 % 1000 % 500 / 100;
		System.out.println("100원: " + num5);

	}

}
