package switch문;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// Q. 성적계산 90점이상 A80점이상 B70점이상 C나머지D

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int grade = sc.nextInt();

		switch (grade / 10) {
		case 10:

		case 9:
			System.out.println("A학점입니다!");
			break;
		case 8:
			System.out.println("B학점입니다!");
			break;
		case 7:
			System.out.println("C학점입니다!");
		default:
			System.out.println("D학점입니다!");
			break;

		}

		sc.close();

	}

}
