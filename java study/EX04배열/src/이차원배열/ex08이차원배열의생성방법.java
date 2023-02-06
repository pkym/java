package 이차원배열;

import java.util.Scanner;

public class ex08이차원배열의생성방법 {

	public static void main(String[] args) {
		// 2차원배열을 만드는 방법
		// 크기가 2x2 크기의 정수형 배열 만들기 값은 1,2,3,4,가 들어간다

		// 2.길이를 먼저 정하고 값을 넣는 방법
		int[][] array1 = new int[2][2];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[1][0] = 3;
		array1[1][1] = 4;

		// 2.값을 넣음과 동시에 길이를 정하는 방법
		int[][] array2 = { { 1, 2 }, { 3, 4 } };

		for (int[] array : array2) {
			for (int num : array) {
				System.out.print(num);
			}
			System.out.println();
		}

	
		

	}

}
