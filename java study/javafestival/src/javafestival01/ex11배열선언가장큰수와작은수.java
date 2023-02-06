package javafestival01;

import java.util.Random;

public class ex11배열선언가장큰수와작은수 {

	public static void main(String[] args) {
		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후
		// 가장 큰 수와 작은 수를 각각 출력하시오.

		int[] array = new int[8];
		Random r = new Random();
		System.out.print("배열에 있는 모든 값: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100) + 1;
			System.out.print(array[i] + " ");
		}

		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.println();
		System.out.print("가장 큰 값: " + max);
		System.out.println();
		System.out.print("가장 작은 값: " + min);

	}

}
