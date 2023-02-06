package while문;

public class ex06 {

	public static void main(String[] args) {
		// 문제. 369게임
		// 1부터 50까지 숫자를 출력
		// 1부터 50까지의 숫자중 1의 자리가 3,6,9인 경우는
		// 숫자가 아닌 박수를 출력

		int num = 1;
		while (num <= 50) {
			int temp = num%10;
			if (temp == 3 || temp == 6 || temp == 9) {
				System.out.println("박수");
			} else {
				System.out.println(num);
			}
			num++;

		}

	}

}
