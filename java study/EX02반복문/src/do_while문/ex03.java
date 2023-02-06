package do_while문;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// Q.몸무게 관리 프로그램
		// 1. 현재 몸무게와 목표 몸무게르 입력받으세요
		// 2. 주차별 감량 몸무게를 입력 받으세요
		// 3. 현재 몸무게가 목표 몸무게에 달성하면 축하한다는 문구를 출력하고 종료시켜주세요.

		// 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		// 몸무게 입력받기
		System.out.print("현재몸무게: ");
		int nowW = sc.nextInt();
		System.out.print("목표몸무게: ");
		int goalW = sc.nextInt();
		// n주차 반복
		int num= 1;
		do {
			System.out.print(num + "주차 감량몸무게: ");
			int minusW = sc.nextInt();
			
			nowW-=minusW;
			num++;
			// 목표달성시 break
			
			// 주차 몸무게가 목표몸무게보다 클 때 반복
		} while (goalW <= nowW);
		System.out.println(nowW+"Kg 달성! 축하합니다!");
		sc.close();

	}
	

}
