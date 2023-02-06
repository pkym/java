package 이차원배열;

import java.util.Arrays;

public class ex11배열split {

	public static void main(String[] args) {
		// split 특정 문자를 기준으로 분리해주는 기능

		String score = "A,A,B,C,D,A,C,D,D,D,F";
//		split():특정 문자를 기준으로 분리해주는 기능
//		String[] abc = score.split(",");
//      배열출력
//		System.out.println(Arrays.toString(abc));
		

		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;

		// 기본데이터타입(CHAR)으로 변환
		// CharAt(인덱스번호): String으로 지정된 문자열 중 한 문자를 char타입으로 변환
		// ','와 ' '도 문자 인덱스에 포함
		// 1번쨰 문자인 , 출력
		// System.out.println(score.charAt(1));

		for (int i = 0; i < score.length(); i += 2) {
			if (score.charAt(i) == 'A') {
				cntA++;
			} else if (score.charAt(i) == 'B') {
				cntB++;
			} else if (score.charAt(i) == 'C') {
				cntC++;
			} else if (score.charAt(i) == 'D') {
				cntD++;
			} else {
				cntF++;
			}
		}

//		for (int i = 0; i < abc.length; i++) {
//			if (abc[i].equals("A")) {
//				cntA++;
//			} else if (abc[i].equals("B")) {
//				cntB++;
//			} else if (abc[i].equals("C")) {
//				cntC++;
//			} else if (abc[i].equals("D")) {
//				cntD++;
//			} else if (abc[i].equals("F")) {
//				cntF++;
//			}
//		}

		System.out.println("A:" + cntA + "명");
		System.out.println("B:" + cntB + "명");
		System.out.println("C:" + cntC + "명");
		System.out.println("D:" + cntD + "명");
		System.out.println("F:" + cntF + "명");

	}

}
