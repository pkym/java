package animal;

public interface Igame {

	// 두개의 랜덤한 정수를 만드는 기능
	// ex) 범위 1~9까지
	public abstract void makeRandom();

	// 콘솔창에 문제를 출제
	// 위에서 만들어진 랜덤한 정수를 통해 문제 출제
	// ex)3+5=
	public abstract void quiz();

	// 정답체크
	public abstract boolean checkAnswer(int answer);

	

}
