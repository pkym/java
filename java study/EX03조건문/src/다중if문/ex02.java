package 다중if문;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// Q. int타입의 변수 totalScore을 선언하고 키보드로 값 입력받으시오
		// totalScore가 90점 이상이면 A
		// 80점이상 90점 미만이면 B
		// 70점이상 80점 미만이면 C
		// 70점 미만 D 를 출력한는 프로그램

		// 1.스캐너
		Scanner sc = new Scanner(System.in);
		// 2.점수입력받기
		System.out.print("점수를 입력하세요: ");
		// 3.점수를 totalScore에 저장
		int totalScore = sc.nextInt();

		// 4.점수를 판단하여 학점매기기
		if (totalScore >= 90) {
			System.out.println("A학점입니다:)");
		} else if (totalScore >= 80) {
			System.out.println("B학점입니다");
		} else if (totalScore >= 70) {
			System.out.println("C학점입니다");
		} else
			System.out.println("D학점입니다:(");
		
		sc.close();

	}

}
