package 이차원배열;

public class ex04세로로넣고출력 {

	public static void main(String[] args) {
		// ㅜ방향으로 출력
		int[][] array = new int[5][5];

		int cnt = 21;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[i][j] = cnt;
				cnt++;
			}
		}
//
//		for (int j = 0; j < 5; j++) {
//			for (int i = 0; i < 5; i++) {
//				System.out.print(array[j][i] + " ");
//			}
//			System.out.println();
//		}
//		

		// for each문으로 꺼내기

		for (int []array1:array) {

			for (int num : array1) {
				System.out.print(num + " ");

			}
			System.out.println();
		}

//		array[0][0]=21;
//		array[1][0]=22;
//		array[2][0]=23;
//		array[3][0]=24;
//		array[4][0]=25;
//		
//		array[0][1]=26;
//		array[1][1]=27;
//		array[2][1]=28;
//		array[3][1]=29;
//		array[4][1]=30;

	}

}
