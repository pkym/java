package javafestival01;

import java.util.Scanner;

public class ex14가운데글자구하기 {

	public static void main(String[] args) {
		// getMiddle메소드는 하나의 단어를 입력 받습니다.
		// 단어를 입력받아 가운데 글자를 반환하도록 getMiddle메소드를 만들어보세요
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요: ");
		String word=sc.next();
		System.out.println(getMiddle(word));

	}

	public static String getMiddle(String word) {
		String[] array = word.split("");
		if (array.length % 2 == 0) {
			return array[array.length / 2 - 1] + array[array.length / 2];
		} else {
			return array[array.length];
		}

	}

}
