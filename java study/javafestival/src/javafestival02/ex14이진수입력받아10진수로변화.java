package javafestival02;

public class ex14이진수입력받아10진수로변화 {

	public static void main(String[] args) {
		// 문자열 형태의 2진수를 입력받아 10진수로 바꾸는 프로그램을 작성하시오

		String str = "01001101";
		String[] array = str.split("");
		int sum = 0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i].equals("1")) {
				sum=sum+power(2,array.length-(i+1));
			}
		}
		System.out.printf("%s(2) = %d(10)",str,sum);
		
		String str2 = "00101000";

	}

	public static int power(int base, int n) {
		int result = 1;
		for (int i = 1; i <= n; i++)
			result = result * base;
		return result;
	}

}
