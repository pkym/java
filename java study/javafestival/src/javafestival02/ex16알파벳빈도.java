package javafestival02;

import java.util.Scanner;

public class ex16알파벳빈도 {

	public static void main(String[] args) {
		// 입력된 문장에 포함된 알파벳의 빈도를 구하는 프로그램

		Scanner sc = new Scanner(System.in);
		System.out.print("입력>> ");
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String[] array = abc.split("");
		String[] ARRAY = ABC.split("");
		String[] input = sc.nextLine().split("");

		for (int j = 0; j < array.length; j++) {
			int cnt = 0;
			System.out.print(array[j] + " : ");
			for (int i = 0; i < input.length; i++) {
				if (input[i].equals(array[j]) || input[i].equals(ARRAY[j])) {
					cnt++;
				}
			}
			System.out.println(cnt);

		}

	}

}
