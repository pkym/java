package javafestival02;

public class ex06별찍기반전 {

	public static void main(String[] args) {
		// 별찍기 반전

		for (int j = 0; j < 5; j++) {
			for (int i = 4; i > j; i--) {
				System.out.print(" ");
			}
			for (int i = 0; i <=j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
