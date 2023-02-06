package 일차원배열;

public class ex01배열 {

	public static void main(String[] args) {
		//배열-동일한 데이터 타입이 순차적으로 저장되어 있는 것
		//배열의 특징
		//1.배열의 크기는 고정적이며 변경할 수 없다
		//2.배열안에 데이터를 저장하거나 불러오기 위해 숫자를 매겨놨으며
		//이 숫자를 우리는 인덱스라고 부르며 인덱스는 0부터 시작한다
		//3. 배열은 레퍼런스 변수에 속하며 레퍼런스 변수는 값을 저장하는 게 아니라
		//주소를 저장하는 것이다.
		
		//정수 길이가 5인 정수형 배열 array만들기
		int [] array=new int[5];
		System.out.println(array);
		//실행시 주소값이 나옴 [I@7c30a502
		array[0]=10;
		System.out.println(array[0]);
		array[1]=20;
		System.out.println(array[1]);
		array[2]=30;
		System.out.println(array[2]);
		array[3]=40;
		System.out.println(array[3]);
		array[4]=50;
		System.out.println(array[4]);
		
		
		
		
		
		
	}

}
