package 일차원배열;

public class ex14확장for문 {

	public static void main(String[] args) {
		// for-each (확장for문)
		// 배열안에 값을 순차적으로 꺼낼 때 편리한 for문
		int[] array = { 5, 7, 9, 4, 3, 1, 5, 6, 7, 8 };
		// 기존방식
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		// for-each 방식
		// for(배열의 값을 꺼냈을 때 변수 : 사용하고 싶은 배열){}
		System.out.println();
		for(int num:array) {
			System.out.print(num+" ");
		}
		
		
		
		
		
		
		

	}

}
