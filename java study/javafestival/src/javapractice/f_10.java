package javapractice;

import java.util.Random;
import java.util.Scanner;

public class f_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		int num1 = r.nextInt(9);
		int num2 = r.nextInt(9);
		for (int i = 0; i < 6; i++) {
			System.out.print(num1 + "+" + num2 + "=");
			int num = sc.nextInt();
			if (num == num1 + num2) {
				System.out.println("success");
			} else {
				System.out.println("fail");
			}

		}
		System.out.println("game over");

	}

}
