package ex01변수;

public class EX01변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주석안에 작성된 글자는 번역(컴파일)하지 않고 넘어간다.
		// 한줄의 주석
		/* 여러줄의  
		 * 주석*/
		
		// 안내 - 코드를 실행하는 순간 무조건 위에서 아래로 실행이 된다.
		// java의 실행과정
		// Ex01변수.java -> 컴파일 -> Ex01변수.class -> JVM -> 실행
		// java에서 문자열은 ""안에 작성한다
		System.out.println("Hello world!");
		System.out.println("기영민");
		//출력문 자동완성-> syso + ctrl + space
		System.out.println("");
		
		//변수- 데이터를 저장하는 임시적인 공간
		//변수를 만든는 방법
		//자료형 변수명 대입연산자 값;
		//int a = 3;
		//실습. 정수를 담을 수 있는 변수 num을 선언(정의) 후 100을 할당하(넣)기
		//int num = 100;
		int num;
		num = 100;
		
		System.out.println(num);
		
		num = 50; 
		System.out.println(num);
		
		// 변수의 특징
		// 1.변수안에 새로운 값이 들어오게 된다면 이전의 값은 사라진다
		// 2.동일한 이름으로 변수를 만들 수 없다.
		
		
		// 문제.
		int myMoney = 15000;
		int yourMoney = 900000000;
		////////////////////////////////////////////
		//여기에서 서로의 금액을 바꿔주세요
		//1.직접 데이터를 손으로 넣는경우는 불가
		//yourMoney=15000;
		//2.출력문을 건드리는 경우는 불가		
		//system.out.println("나의 금액 : "yourMoney);
		//3.
		//myMoney=yourMoney;
		//yourMoney=myMoney;
		///////////////////////////////////////////
		System.out.println("나의 금액 : "+myMoney);
		System.out.println("친구의 금액 : "+yourMoney);
		
		int a = myMoney;
		myMoney = yourMoney;
		yourMoney = a;
		
		System.out.println("나의 금액 : "+myMoney);
		System.out.println("친구의 금액 : "+yourMoney);
		
		
	}


}
