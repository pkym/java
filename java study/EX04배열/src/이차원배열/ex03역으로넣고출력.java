package 이차원배열;

public class ex03역으로넣고출력 {

	public static void main(String[] args) {
		//  <<--숫자넣기

		int[][] array = new int[5][5];

		int cnt = 21;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][4 - i] = cnt;
				cnt++;
			}
		}

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}

//		array[0][4] = 21; 
//		array[0][3] = 22; 
//		array[0][2] = 23; 
//		array[0][1] = 24; 
//		array[0][0] = 25; 
//
//		array[1][4] = 26; 
//		array[1][3] = 27; 
//		array[1][2] = 28; 
//		array[1][1] = 29;
//		array[1][0] = 30;

	}

}
