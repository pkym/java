package 이차원배열;

public class ex02가로로넣고출력 {

	public static void main(String[] args) {
		// -->이방향 출력
		int[][] array = new int[5][5];
		
		int cnt=21;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = cnt;
				cnt++;
			}
		}
		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
//		
//		array[0][0]=1;
//		array[0][1]=2;
//		array[0][2]=3;
//		array[0][3]=4;
//		array[0][4]=5;
//		
//		array[1][0]=1+5*1;
//		array[1][1]=2+5*1;
//		array[1][2]=3+5*1;
//		array[1][3]=4+5*1;
//		array[1][4]=5+5*1;

		
		
		
		
		
		
		
		

	}

}
