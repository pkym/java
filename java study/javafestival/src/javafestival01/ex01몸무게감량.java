package javafestival01;

import java.util.Scanner;

public class ex01몸무게감량 {

	public static void main(String[] args) {
		// 현재몸무게와 목표몸무게를 각각 입력 받고 주차 별 감량 몸무게를 입력 받아 목표 달성시 축하 메시지
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게: ");
		int nowW = sc.nextInt();
		
		System.out.print("목표 몸무게: ");
		int goalW = sc.nextInt();
		
		int n = 1;
		do {
			System.out.print(n + "주차 감량 몸무게: ");
			int loseW = sc.nextInt();
			nowW = nowW - loseW;
			n++;

		} while (nowW > goalW);

		System.out.print(nowW + "Kg 달성!! 축하합니다!");
	}

}
