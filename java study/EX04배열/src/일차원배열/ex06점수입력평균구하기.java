package 일차원배열;

import java.util.Scanner;

public class ex06점수입력평균구하기 {

	public static void main(String[] args) {
		// 입력한 점수의 총합과 평균을 출력하세요

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int sum = 0;
		int avg = 0;
		///각 인덱스 안에 키보드로 부터 입력받은 값을 넣기
		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + "번째 입력>>");
			array[i] = sc.nextInt();
			sum += array[i];
			avg = sum / 5;
		}
		/////각 인덱스 안의 값 출력
		System.out.print("입력된 점수: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(array[i] + " ");
		}
		/////최저,최고 점수 구해서 출력
		int max = array[0];
		int min = array[0];
		for (int i = 1; i < 5; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		///총합 변수 만들어서 각 인덱스의 값 누적해서 출력
		System.out.println();
		System.out.println("최고점수: " + max);
		System.out.println("최저점수: " + min);
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);

	}

}
