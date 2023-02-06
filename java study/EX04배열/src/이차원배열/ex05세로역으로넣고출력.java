package 이차원배열;

public class ex05세로역으로넣고출력 {

	public static void main(String[] args) {
		// ㅗ방향으로 출력

		int[][] array = new int[5][5];

		int cnt = 21;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[4-i][j] = cnt;
				cnt++;
			}
		}

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}

//		4 0
//		3 0
//		2 0
//		1 0
//		0 0
//		
//		4 1
//		3 1
//		 
	
		
		
		
		
	}

}
