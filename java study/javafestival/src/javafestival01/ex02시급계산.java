package javafestival01;

import java.util.Scanner;

public class ex02시급계산 {

	public static void main(String[] args) {
		// 일한 시간을 입력받아 총 임금을 계산하는 시급 계산기 입니다.
		// 시급은 5000원 이며 8시간보다 초과 근무한 시간에 대해 1.5배의 시급이 책정됩니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요: ");
		int workH = sc.nextInt();
		int pay = 0;

		if (workH > 8) {
			pay = 5000 * 8;
			pay += (workH - 8) * 7500;
		} else {
			pay = 5000 * workH;
		}

		System.out.print("총 임금은 " + pay + "원 입니다.");

	}

}
