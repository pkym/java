package music;

import java.util.Scanner;

public class MusicView {

	public static void main(String[] args) {
		// Model : MusicDTO, MusicDAO
		// VIEW : MusicView
		// Controller : MusicCon

		Scanner sc = new Scanner(System.in);

		// 사용하지 않는 클래스 import 해제 / 도입
		// ctrl+shift+o

		MusicCon con = new MusicCon();
		// 재생시 Con안쪽에 있는 player만 호출하면됨

		// 5곡있다고 가정하고 진행
		System.out.println("====뮤직 플레이어====");
		int index = 0;
		while (true) {
			System.out.print("[1]재생 [2]종료 >> ");
			int menu = sc.nextInt();
			// switch 가 조금 더 빠르다

			if (menu == 1) {
				con.play(index);
				while (true) {
					System.out.println("[1]정지 [2]이전 곡 [3]다음 곡 [4]이전 메뉴");
					int input = sc.nextInt();

					if (input == 1) {
						con.stop();

					} else if (input == 2) {
						index--;
						if (index == -1) {
							index = 4;
						}

					} else if (input == 3) {
						index++;
						if (index == 5) {
							index = 0;
						}
						con.play(index);

					} else if (input == 4) {
						break;
					}

				}

			} else if (menu == 2) {
				// 종료
				System.out.println("종료 되었습니다");
				break;
			}

		}

	}

}
