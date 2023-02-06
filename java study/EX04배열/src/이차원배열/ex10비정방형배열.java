package 이차원배열;

import java.util.Arrays;

public class ex10비정방형배열 {

	public static void main(String[] args) {
		// 0열의 길이 3, 1열의 길이2, 2열의 길이5

		int[][] array = new int[3][];

		// 비정방향배열생성
		// int[]arr=new int[3]; 와 같음
		array[0] = new int[3];
		array[1] = new int[2];
		array[2] = new int[5];

		// 비정방향 배열에 값 넣기
		int cnt = 1;

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = cnt;
				cnt++;
				System.out.print(array[j][i] + " " + "\t");
			}
			System.out.println();
		}

		// for문 사용 않고 배열 안의 값을 확인하는 방법
		String[] team = { "영민", "미연", "성규", "준수", "근호" };
		//배열을 문자열로 변환시켜서 반환하는 방법(메소드)
		String result = Arrays.toString(team); 		
		System.out.println(result);
		
		
		

//		for (int i = 0; i < array[0].length; i++) {
//			array[0][i] = cnt;
//			cnt++;
//		}
//		for (int i = 0; i < array[1].length; i++) {
//			array[1][i] = cnt;
//			cnt++;
//		}
//
//		for (int i = 0; i < array[2].length; i++) {
//			array[2][i] = cnt;
//			cnt++;
//		}

//		array[0][0] = cnt;
//		cnt++;
//		array[0][1] = cnt;
//		cnt++;
//		array[0][2] = cnt;
//		cnt++;

//		array[1][0] = cnt;
//		cnt++;
//		array[1][1] = cnt;
//		cnt++;

//		array[2][0] = cnt;
//		cnt++;
//		array[2][1] = cnt;
//		cnt++;
//		array[2][2] = cnt;
//		cnt++;
//		array[2][3] = cnt;
//		cnt++;
//		array[2][4] = cnt;
//		cnt++;
	}

}
