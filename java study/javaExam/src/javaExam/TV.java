package javaExam;

public class TV {
	


	int channel;
	String color;

	public void print() {

		System.out.printf("Tv의 현재 채널은 : %d이고, Tv의 색깔은 %S 입니다.", channel, color);

	}

	public void channeUp() {
		
		channel++;
	}

	public void channeDown() {
		
		channel--;
	}

}