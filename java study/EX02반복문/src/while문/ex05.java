package while문;

public class ex05 {

	public static void main(String[] args) {
		// 반복문
		// 특정코드(문장) 반복해서 실행하기 위해
		
		// while
		// 특정조건 만족 했을 때
		
		// 사용방법
		// while(조건식){
		// 조건식의 결과가 true일때 반복하고 싶은 코드 작성
		// }
		
		//문제. 1부터 10까지 홀수만 출력
		
		//1. 정수형 변수 num 을 만들어 초기값 1설정
		int num=1;
		//2. while조건식을 num이 10보다 작거나 같은지 설정
		while(num<=10)
		//3. true일때 num일 출력하고 num을 1증가
		{
			
			if(num%2==1) {
			System.out.println(num);
			}
			num++;
			
			
		
		}
		


	}

}
