package 일차원배열;

public class ex12별찍기 {// 돌아온별찍기

	public static void main(String[] args) {
		// 배열의 인덱스 수 많큼 별찍기
		int[] starcount = { 3, 4, 4, 2, 1 };

		for (int i = 0; i < starcount.length; i++) {
			System.out.print(starcount[i] + ":");

			for (int j = 0; j < starcount[i]; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
