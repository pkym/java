package animal;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		plusgame game = new plusgame();
		Scanner sc = new Scanner(System.in);

		while (true) {

			game.makeRandom();
			game.quiz();
			int answer = sc.nextInt();

			if (game.checkAnswer(answer)) {
				System.out.println("정답입니다");
				game.rankUp();

			} else {
				System.out.println("오답입니다");
			}
			;

		}

	}

}
