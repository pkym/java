package music;

public class ex스태틱 {

	public static void main(String[] args) {
		// p.222
		// 5와 3이라는 정수를 add라는 메소드를 통해 연산하고
		// console에 출력.

//		System.out.println(add(3,5));
		System.out.println("출력됨");
		ex스태틱 ex = new ex스태틱();
		// 힙 영역에 올라감

		System.out.println(ex.add(5, 3));

		System.out.println(new ex스태틱().add(5, 3));

	}

	public int add(int num1, int num2) {

		return num1 + num2;

	}

}
