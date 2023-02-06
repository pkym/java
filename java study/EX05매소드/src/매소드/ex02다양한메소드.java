package 매소드;

import java.util.Random;

public class ex02다양한메소드 {

	public static void main(String[] args) {
		// 다양한 메소드 만들기
		// 1. 매개변수도 O 리턴타입 O - 주스만들기
		// 2. 매개변수도 O 리턴타입 X - 옷 정리하기
		// 3. 매개변수도 X 리턴타입 O - 랜덤 과자 얻기
		// 4. 매개변수도 X 리턴타입 x - 다양한 인사

		// 메소드를 호출한 곳으로 결과값은 result1으로 들어감
//		String result1 = makeJuice("딸기");
//		System.out.println(result1);
		// 1.담지 않고 바로 출력
		System.out.println(makeJuice("수박"));
		// 2.옷정리
		clean("맨투맨 티");
		// 3. 랜덤간식
		System.out.println("오늘의 간식은? " + randomsnack());
		// 4. 인사
		hello();

	}

	// 1.
	public static String makeJuice(String fruit) {
//		String result = "맛있는" + fruit + "주스입니다!!";
//		return result;
		return "맛있는" + fruit + "주스입니다!!";
	}

	// 2.
	public static void clean(String cloth) {
		System.out.println(cloth + " 잘 정리하겠습니다");
	}

	// 3.
	public static String randomsnack() {
		Random r = new Random();
		String[] snacks = { "빼빼로", "포카칩", "초코칩", "빵또아", "허니버터칩" };
		return snacks[r.nextInt(snacks.length)];
	}

	// 4. return 이라는 키워드는 우측에 있는 데이터를 돌려주기도 하지만
	// 메소드가 끝나는 시점을 의미하기도 한다
	public static void hello() {
		System.out.println("니하오마, 곤니찌와, 굿모닝, 봉쥬르, 앗살람마이쿰");

	}

}
