package mvc;

import java.util.ArrayList;

public class MusicDAO {

   private ArrayList<MusicDTO> musicList;

   public ArrayList<MusicDTO> select() {

      musicList = new ArrayList<>();

      MusicDTO music1 = new MusicDTO("Antifragile", "C:/Users/SMHRD/Desktop/mp3/Antifragile.mp3");
      MusicDTO music2 = new MusicDTO("HypeBoy", "C:/Users/SMHRD/Desktop/mp3/HypeBoy.mp3");
      MusicDTO music3 = new MusicDTO("Dream", "C:/Users/SMHRD/Desktop/mp3/Dream.mp3");
      MusicDTO music4 = new MusicDTO("OMG", "C:/Users/SMHRD/Desktop/mp3/OMG.mp3");
      MusicDTO music5 = new MusicDTO("사건의지평선", "C:/Users/SMHRD/Desktop/mp3/사건의지평선.mp3");
      MusicDTO music6 = new MusicDTO("정답", "C:/Users/SMHRD/Desktop/mp3/정답.mp3");
      MusicDTO music7 = new MusicDTO("오답", "C:/Users/SMHRD/Desktop/mp3/오답.mp3");
      MusicDTO music8 = new MusicDTO("시작", "C:/Users/SMHRD/Desktop/mp3/시작.mp3");
      MusicDTO music9 = new MusicDTO("해피엔딩","C:/Users/SMHRD/Desktop/mp3/해피엔딩.mp3");
      MusicDTO music10 = new MusicDTO("노말엔딩", "C:/Users/SMHRD/Desktop/mp3/노말엔딩.mp3");
      MusicDTO music11 = new MusicDTO("배드엔딩", "C:/Users/SMHRD/Desktop/mp3/배드엔딩.mp3");
      MusicDTO music12 = new MusicDTO("무한모드", "C:/Users/SMHRD/Desktop/mp3/무한모드.mp3");
      
      musicList.add(music1);
      musicList.add(music2);
      musicList.add(music3);
      musicList.add(music4);
      musicList.add(music5);
      musicList.add(music6);
      musicList.add(music7);
      musicList.add(music8);
      musicList.add(music9);
      musicList.add(music10);
      musicList.add(music11);
      musicList.add(music12);
      
      
      return musicList;

   }
}