package for문;

public class ex08다중for문 {

	public static void main(String[] args) {
		// 2단-9단 다중 for문으로 구현하기
		for (int j = 2; j < 10; j++) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d*%d=%d ", j, i, j * i);
			}
			System.out.println();
		}
	}

}
