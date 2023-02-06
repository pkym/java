package javafestival02;

import java.util.Scanner;

public class ex10대시의개수출력 {

	public static void main(String[] args) {
		// 대시(_)문자로 구성된 형태의 숫자를 주어진 숫자와 같이
		// 출력하고 싶을 때 사용하게 되는 대시의 개수를 출력하는 프로그램을 작성하라
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요>> ");
		String num = sc.next();
		String[] array = num.split("");
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "1":
				sum += 2;
				break;
			case "7":
				sum += 3;
				break;
			case "4":
				sum += 4;
				break;
			case "2", "3", "5":
				sum += 5;
				break;
			case "0", "6", "9":
				sum += 6;
				break;
			case "8":
				sum += 7;
				break;

			}

		}
		System.out.println("대시('-')의 총합>> " + sum);

		// 1-->2
		// 7-->3
		// 4-->4
		// 2,3,5-->5
		// 0,6,9-->6
		// 8-->7

	}

}
