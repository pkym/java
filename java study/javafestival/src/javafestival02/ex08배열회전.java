package javafestival02;

public class ex08배열회전 {

	public static void main(String[] args) {
		// 2차원 배열을 왼쪽으로 90도 회전하여 출력하시오
		
		
		//원래 배열
		int[][] array1= new int[5][5];
		int cnt1=1;
		
		for(int j=0;j<array1.length;j++) {
			for(int i=0;i<array1[0].length;i++) {
				array1[j][i]=cnt1;
				cnt1++;
			}
		}
		for(int j=0;j<array1.length;j++) {
			for(int i=0;i<array1[0].length;i++) {
				System.out.print(array1[j][i]+"\t");
			}System.out.println();
		}
		System.out.println();
		//90도 회전	
		int[][] array2= new int[5][5];
		int cnt2=1;
		
		for(int j=0;j<array2.length;j++) {
			for(int i=0;i<array2[0].length;i++) {
				array2[4-i][j]=cnt2;
				cnt2++;
			}
		}
		for(int j=0;j<array2.length;j++) {
			for(int i=0;i<array2[0].length;i++) {
				System.out.print(array2[j][i]+"\t");
			}System.out.println();
		}

	}

}
