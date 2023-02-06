package 이차원배열;

public class ex01이채원배열실습 {

	public static void main(String[] args) {
		// 3x3 행렬만들기
		
		int[][] array=new int[3][3];		
		array[0][0]=10;
		array[0][1]=20;
		array[0][2]=30;
		System.out.print(array[0][0]+" ");
		System.out.print(array[0][1]+" ");
		System.out.print(array[0][2]+" ");
		System.out.println();				
		array[1][0]=40;
		array[1][1]=50;
		array[1][2]=60;
		System.out.print(array[1][0]+" ");
		System.out.print(array[1][1]+" ");
		System.out.print(array[2][2]+" ");
		System.out.println();		
		array[2][0]=70;
		array[2][1]=80;
		array[2][2]=90;
		System.out.print(array[2][0]+" ");
		System.out.print(array[2][1]+" ");
		System.out.print(array[2][2]+" ");
		System.out.println();
		
		//이중 포문을 사용해서 한번에 쓰기
		//int cnt=10;
		for(int j=0;j<array.length;j++) {
			for(int i=0;i<array[j].length;i++) {
				//array[j][i]=cnt;
				//cnt+=10;
				array[j][i]=(j*30)+10*(i+1);
				System.out.print(array[j][i]+" ");
			}System.out.println();
		}
		
		//이차원 배열의 길이를 알 수 있는 방법
		//1. 행의 길이를 알 수 있는 방법
		//행의 길이: array.length
		System.out.println("행의 길이: "+array.length);
		//2. 열의 길이
		// 0열의 길이를 알 수 있는 방법(array 0번쨰가 알 고있다)
		System.out.println("열의 길이: "+array[0].length);
		// 1열의 길이
		System.out.println("열의 길이: "+array[1].length);
		
		

	}

}
