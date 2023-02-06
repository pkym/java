package music;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicCon {

	private MP3Player mp3 = new MP3Player();
	// mp3가 한번만 생성됨
	// play 때 쓰면 쓰고 버려버리고 다시 생성
	private ArrayList<MusicDTO> mList;

	// 여기서 new써버리면 힙에 바로 올라가서 나중에 쓸 때
	// 선언하는게 좋음

	// 1.play기능
	public void play(int index) {

		MusicDAO dao = new MusicDAO();
		mList = dao.select();

		String singer = mList.get(index).getSinger();
		String title = mList.get(index).getTitle();
		String path = mList.get(index).getPath();

		if (mp3.isPlaying() == true) {
			mp3.stop();
		}

		mp3.play(path);
		System.out.printf("%s-%s%n", singer, title);
	}

	// 2.stop기능
	public void stop() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
	}

}
