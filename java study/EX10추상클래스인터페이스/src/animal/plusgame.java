package animal;

import java.util.Random;

public class plusgame implements Igame {

	int num1, num2;
	int 난이도 = 9;

	public void rankUp() {
		난이도 *= 10;
	}

	@Override
	public void makeRandom() {

		Random r = new Random();
		num1 = r.nextInt(난이도) + 1;
		num2 = r.nextInt(난이도) + 1;

	}

	@Override
	public void quiz() {
		System.out.printf("%d + %d = ", num1, num2);
		// 스캐너 미리 권장 하지 않는다
		// 뷰라는 화면에서 입력받는 기능들은 몰아넣는 게 좋다

	}

	@Override // 입력을 answer에서 받을 수 있음
	public boolean checkAnswer(int answer) {

		return answer == num1 + num2;

	}

}
