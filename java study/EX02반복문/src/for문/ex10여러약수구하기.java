package for문;

public class ex10여러약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 2; j <= 30; j++) {
			System.out.print(j + "의 약수: ");

			for (int i = 1; i <= j; i++) {

				if (j % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();

		}
	}
}
