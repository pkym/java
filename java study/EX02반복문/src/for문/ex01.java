package for문;

public class ex01 {

	public static void main(String[] args) {
		// while문: 대게 반복횟수가 정해져 있지 않을 때
		// for문: 대게 반복횟수가 정해져 있을 때
		
		// for(초기화 구문; 조건식; 반복 후 작업){
		// 실행문장;
		// }
		
		//Q. 1부터 10까지 출력
		//변수
//		int num;   //변수의 선언
// 		num=5;     //변수의 할당(초기화-최초의 할당)
// 		num=10;    //변수의 재할당
// 		int num =10; //변수는 재선언 불가

		
		for(int i=1; i<=10; i++) {   //i=1이면 조건만족 후 실행문장 실행
			System.out.println(i);   //실행 후 반복후 작업 으로 감 i++
		}                            //i=2 다시 조건 식으로 감
		

	}

}
