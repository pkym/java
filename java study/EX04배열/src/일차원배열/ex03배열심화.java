package 일차원배열;

public class ex03배열심화 {

	public static void main(String[] args) {
		// 배열을 만드는 방법
		// -길이가 3인 정수형 배열 만들기
		// 각 인덱스에는 10,20,30이 들어간다.
		// 어떤 값이 들어갈 지 모를 때 쓰는 방법1-비어있는 칸에 어레이 지정 후 값 담음
		int[] array1 = new int[3];
		array1[0] = 10;
		// 어떤 값이 들어갈지 알 떄 쓰는 방법-처음부터 칸안에 값 넣고 어레이 지정
		int[] array2 = { 10, 20, 30 };
		// 배열의 복사
		int[] array3 = { 10, 20, 30, 40, 50 };
		int[] array4 = array3;
		
		array3[3]=100;
		System.out.println(array3[3]);
		System.out.println(array4[3]);
		

	}

}
