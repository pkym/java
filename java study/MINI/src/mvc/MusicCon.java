package mvc;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicCon {

	private MP3Player mp3 = new MP3Player();
	private ArrayList<MusicDTO> musicList;

	public void stop() {
		if (mp3.isPlaying() == true) {
			mp3.stop();
		}
	}

	public void play(int index) {

		MusicDAO dao = new MusicDAO();

		musicList = dao.select();
		String title = musicList.get(index).getTitle();
		String path = musicList.get(index).getPath();

		if (mp3.isPlaying() == true) {
			mp3.stop();
		}

		mp3.play(path);

	}
}