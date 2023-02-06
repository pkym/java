package music;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	// static이 아닌 곳에서 static을 바라볼 수 없다? 뭔 지랄

	static ArrayList<MusicDTO> mList = null;
	static MP3Player mp3 = null;

	public static void main(String[] args) {

		// 5개 음악이 담긴 뮤직 플레이어!!
		// int 쓰고 싶으면 integer는 int를 다를 수 있는 class 타입(wrapper class) 써야함
		// 마찬가지로 Float라는 클래스 사용//Boolean
		// generic 안에는 class타입만 가능

//		mList = new ArrayList<>();
//		mp3 = new MP3Player();
		// new 키워드 있어야 get이 가능
		// 만약 static 삭제 하게 되면 main 이 올라가게됨?

		// 방법1. 먼저 객체 만들기
//		MusicDTO music1 = new MusicDTO("뉴진스", "하입보이", "C:/music/mp3/뉴진스-HypeBoy.mp3");
//		MusicDTO music2 = new MusicDTO("르세라핌", "안티프레져", "C:/music/mp3/르세라핌-Antifragile.mp3");
//		MusicDTO music3 = new MusicDTO("아이브", "러브다이브", "C:/music/mp3/아이브-LoveDive.mp3");
//		MusicDTO music4 = new MusicDTO("윤하", "사건의지평선", "C:/music/mp3/윤하-사건의지평선.mp3");
//		MusicDTO music5 = new MusicDTO("카라", "웬아이무브", "C:/music/mp3/카라-WhenIMove.mp3");
//		// 어레이리스트에 객체 담기
//		mList.add(music1);
//		mList.add(music2);
//		mList.add(music3);
//		mList.add(music4);
//		mList.add(music5);

		// 방법2. 바로 넣기
//		mList.add(new MusicVO("뉴진스", "하입보이", "C:/music/mp3/뉴진스-HypeBoy.mp3"));
//		mList.add(new MusicVO("르세라핌", "안티프레져", "C:/music/mp3/르세라핌-Antifragile.mp3"));
//		mList.add(new MusicVO("아이브", "러브다이브", "C:/music/mp3/아이브-LoveDive.mp3"));
//		mList.add(new MusicVO("윤하", "사건의지평선", "C:/music/mp3/윤하-사건의지평선.mp3"));
//		mList.add(new MusicVO("카라", "웬아이무브", "C:/music/mp3/카라-WhenIMove.mp3"));

		Scanner sc = new Scanner(System.in);

		int index = 0; // 현재 재생되고 있는 인덱스
		while (true) {

			System.out.println("메뉴를 선택하세요");
			System.out.print("[1]재생 [2]검색 [3]노래 추가 [4]노래 삭제 [5]종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				// 노래 재생
				play(index);

				while (true) {
					System.out.print("[1]정지 [2]이전곡 [3]다음곡 [4]이전메뉴로 >>");
					int input = sc.nextInt();

					if (input == 1) {
						// 정지
						mp3.stop();

					} else if (input == 2) {
						// 이전 곡
						if (mp3.isPlaying() == true) {
							mp3.stop();

						}
						index--;
						if (index == -1) {
							index = 4;

						}
						play(index);

					} else if (input == 3) {// 다음 곡 stop은 재생이 되고 있을 때 멈춰야 함
						if (mp3.isPlaying() == true) {
							mp3.stop();
						}
						index++;
						if (index == 5) {
							index = 0;

						}
						play(index);

					} else if (input == 4) {
						break;
					}

				}

			} else if (menu == 2) {
				// 노래 검색
				System.out.print("검색어 입력: ");
				mList.get(0).contains("boy");

			} else if (menu == 3) {
				// 노래 추가

			} else if (menu == 4) {
				// 노래 삭제

			} else if (menu == 5) {
				// 노래 종료
				System.out.println("종료 되었습니다");

			} else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

	private static void play(int index) {
		// TODO Auto-generated method stub
		
	}

	
//	public static void play(int index) {
//		String singer = mList.get(index).getSinger();
//		String title = mList.get(index).getTitle();
//		String path = mList.get(index).getPath();
//		mp3.play(path);
//		System.out.printf("%s-%s%n", singer, title);
//
//	}
}
