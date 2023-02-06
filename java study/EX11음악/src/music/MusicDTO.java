package music;

public class MusicDTO {
	//필드 생성
	private String singer, title, path;
	
	//생성자 메소드

	public MusicDTO(String singer, String title, String path) {
		
		this.singer = singer;
		this.title = title;
		this.path = path;
		
	}
	
	//getter 메소드

	public String getSinger() {
		return singer;
	}

	public String getTitle() {
		return title;
	}

	public String getPath() {
		return path;
	}

	public void contains(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
