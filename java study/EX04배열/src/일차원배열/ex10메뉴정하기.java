package 일차원배열;

import java.util.Random;
import java.util.Scanner;

public class ex10메뉴정하기 {

	public static void main(String[] args) {
		// 아침 점심 저녁 메뉴 랜덤 뽑기

		String[] breakfast = { "삼선짬뽕", "간짜장", "떡국", "라면", "샌드위치" };
		String[] lunch = { "강된장", "간장게장", "순두부찌개", "제육", "김치찌개" };
		String[] dinner = { "스파게티", "피자", "라자냐", "타코", "삼겹살" };

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// 4번 누르기 전까지는 계속 반복해야함

		while (true) {
			System.out.print("식사를 선택해 주세요: ");
			System.out.print("1.아침 2.점심 3.저녁 4.종료>> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("===오늘의 추천 아침 메뉴===");
				String menu = breakfast[r.nextInt(breakfast.length)];
				System.out.println(menu);
				
			} else if (choice == 2) {
				System.out.println("===오늘의 추천 점심 메뉴===");
				int num = r.nextInt(5);
				String menu = lunch[num];
				System.out.println(menu);

			} else if (choice == 3) {
				System.out.println("===오늘의 추천 저녁 메뉴===");
				int num = r.nextInt(5);
				String menu = dinner[num];
				System.out.println(menu);

			} else if (choice == 4) {
				System.out.println("종료합니다.");
				break;
				
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}

		}

	}

}
