package javapractice;

import java.util.Scanner;

public class f_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		System.out.println(getMiddle(word));

	}

	public static String getMiddle(String word) {
		String[] array = word.split("");
		if (array.length % 2 == 0) {
			return array[array.length / 2 - 1] + array[array.length / 2];
		}
		return array[array.length / 2];

	}
}
