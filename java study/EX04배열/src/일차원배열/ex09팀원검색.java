package 일차원배열;

import java.util.Scanner;

public class ex09팀원검색 {

	public static void main(String[] args) {
		// 팀원검색 프로그램
		// 키보드로부터 팀원이름 입력받아 일치하는 사람이 존재한다면
		// 영민은 1번 위치에 존재합니다.
		// 일치하는 사람이 존재 안한다면
		// 해당 팀원은 존재하지 않습니다.

		String[] team = { "영민", "미연", "성규", "근호", "준수" };
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();

		boolean ischeck = true;

		for (int i = 0; i < 5; i++) {
			if (name.equals(team[i])) {
				System.out.print(team[i] + "는 " + (i + 1) + "번위치에 존재합니다");
				break;
			}
		}
		if (ischeck) {
			System.out.println("해당 팀원은 존재하지 않습니다.");
		}

	}

}
