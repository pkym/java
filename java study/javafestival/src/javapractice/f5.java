package javapractice;

import java.util.Scanner;

public class f5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력>> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력>> ");
		int num2 = sc.nextInt();
		int sum1 = num1 * (num2 % 10);
		int sum2 = num1 * (num2 % 100 / 10);
		int sum3 = num1 * (num2 / 100);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum1 + sum2 * 10 + sum3 * 100);

	}

}
