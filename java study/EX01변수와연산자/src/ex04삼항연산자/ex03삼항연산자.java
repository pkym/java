package ex04삼항연산자;

import java.util.Scanner;

public class ex03삼항연산자 {
	public static void main(String[] args) {
		// Q2. 농구공을 담기 위해 필요한 상자의 개수를 구하세요.
		// 하나의 상자에는 농구공이 5개 들어갈수 있습니다

		// 1.입력받는 도구꺼내기
		Scanner sc1 = new Scanner(System.in);
		// 2.출력문
		System.out.print("농구공의 개수를 입력하세요:");
		// 3.입력받기
		int ball = sc1.nextInt();
		// 4.농구공 개수에 따른 상자 개수 연산
		int box = ball % 5 == 0 ? ball / 5 : ball / 5 + 1;
		System.out.print("필요한 상자의 수:" + box);
		
		sc1.close();
		

	}

}
