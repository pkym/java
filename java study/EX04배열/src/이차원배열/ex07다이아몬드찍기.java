package 이차원배열;

public class ex07다이아몬드찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[5][5];
		int cnt = 1;

		for (int j = 0; j < 5; j++) {
			if (j % 2 == 0 && j != 2) {
				for (int i = 2; i < 3; i++) {
					array[j][i] = cnt;
					cnt++;
				}
			} else if (j % 2 == 1) {
				for (int i = 1; i < 4; i++) {
					array[j][i] = cnt;
					cnt++;
				}
			} else if (j == 2) {
				for (int i = 0; i < 5; i++) {
					array[j][i] = cnt;
					cnt++;
				}

			}
		}
		for (int[] array1 : array) {
			for (int num : array1) {
				System.out.print(num +"\t");
			}
			System.out.println();
		}

//		int i=0;i<5;i++

//		if(i==2)
//		array[0][i]=cnt

//		if(i==1,2,3)
//		array[1][i]=cnt

//		if(i==0,1,2,3,4)
//		array[2][i]=cnt

//		if(i==1,2,3)
//		array[3][i]=cnt

//		if(i==2)
//		array[4][i]=cnt

//		
//		array0 0   0
//		array0 1   0
//		array0 2   1
//		array0 3   0
//		array0 4   0
//		 
//		array1 0   0
//		array1 1   2
//		array1 2   3
//		array1 3   4
//		array1 4   0
//		
//		array2 0   5
//		array2 1   6
//		array2 2   7
//		array2 3   8
//		array2 4   9
//		

	}

}
