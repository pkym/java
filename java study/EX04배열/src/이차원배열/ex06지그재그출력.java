package 이차원배열;

public class ex06지그재그출력 {

	public static void main(String[] args) {
		// ㄹ형태로 출력

		int[][] array = new int[5][5];

		int cnt = 21;
		for (int j = 0; j < 5; j++) {

			for (int i = 0; i < 5; i++) {
				if (j % 2 == 0) {
					array[j][i] = cnt;

				} else if (j % 2 == 1) {
					array[j][4 - i] = cnt;
				}
				cnt++;

			}
		}

		for(int[]array1 : array) {
			for(int num :array1) {
				System.out.print(num+" ");
				
			}System.out.println();
		}
		
//		0 0  21
//		0 1  22
//		0 2
//		0 3
//		0 4
//		
//		1 4  26
//		1 3  27
//		1 2
//		1 1 
//		1 0
//		
//		2 0
//		2 1
//		2 2
//		2 3 
//		2 4

	}

}
