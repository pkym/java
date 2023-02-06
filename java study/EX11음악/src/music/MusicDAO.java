package music;

import java.util.ArrayList;

public class MusicDAO {

	// 필드 (musicList라는 이름의 어레이변수생성)

	private ArrayList<MusicDTO> mList;

	// 메소드 (select라는 이름의 메소드 생성)

	public ArrayList<MusicDTO> select() {

		mList = new ArrayList<>();

		MusicDTO music1 = new MusicDTO("뉴진스", "하입보이", "C:/music/mp3/뉴진스-HypeBoy.mp3");
		MusicDTO music2 = new MusicDTO("르세라핌", "안티프레져", "C:/music/mp3/르세라핌-Antifragile.mp3");
		MusicDTO music3 = new MusicDTO("아이브", "러브다이브", "C:/music/mp3/아이브-LoveDive.mp3");
		MusicDTO music4 = new MusicDTO("윤하", "사건의지평선", "C:/music/mp3/윤하-사건의지평선.mp3");
		MusicDTO music5 = new MusicDTO("카라", "웬아이무브", "C:/music/mp3/카라-WhenIMove.mp3");

		mList.add(music1);
		mList.add(music2);
		mList.add(music3);
		mList.add(music4);
		mList.add(music5);

		return mList;

	}

	// 뮤직리스트는 heap에 올라감

}
