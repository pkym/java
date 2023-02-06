package 일차원배열;

import java.util.Random;

public class ex05max구하기 {

	public static void main(String[] args) {
		// 큰수 찾기
		int[] array = { 0, 1, 8, 72, 31, 100, 105 };
		// 가장 큰 수를 저장할 변수
		int max = 0;
		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("가장 큰 값은" + max + "입니다");

	}

}
