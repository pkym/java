package ex13mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import model.memberDAO;
import model.memberDTO;

public class Main {

	public static void main(String[] args) {
		// 디자인 패턴: 계속해서 같은 문제가 발생하여, 이 문제를 해결하고자 형식이나 규칙을 지정해 놓은 것.
		// MVC 패턴
		// model: 데이터를 저장하거나 조작하기 위한 코드들의 모음
		// view: 사용자에게 직접 보여지는 부분
		// controller: 실제 기능이 일어나는 부분
		Scanner sc = new Scanner(System.in);
		System.out.println("====SHRD 회원관리 프로그램====");

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]전체회원목록 [4]회원정보수정 [5]회원탈퇴 [6]종료 >> ");
			int choice = sc.nextInt();

			// 1. 회원가입-join class 그대로 가져오기
			if (choice == 1) {
				System.out.print("ID입력: ");
				String id = sc.next();
				System.out.print("PW입력: ");
				String pw = sc.next();
				System.out.print("이름입력: ");
				String name = sc.next();
				System.out.print("번호입력: ");
				String tel = sc.next();

				memberDAO dao = new memberDAO();
				int row = dao.join(id, pw, name, tel);

				if (row > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

				// 2. 로그인
			} else if (choice == 2) {

				System.out.print("ID입력: ");
				String id = sc.next();
				System.out.print("PW입력: ");
				String pw = sc.next();
				// id,pw 일치하는지 체크
				memberDAO dao = new memberDAO();
				// 객체의 필드에 접근하기 (접근 연산자 .)와 메소드 login(id,pw)
				// DAO 메소드에서 memberDTO 자료형으로 값을 리턴 받음
				memberDTO dto = dao.login(id, pw);
				// 로그인 성공유무
				if (dto != null) {
					System.out.println("로그인 성공");
					System.out.printf("%s님 환영합니다", dto.getName());
					System.out.println();

				} else {
					System.out.println("로그인 실패");
				}

				// 3. 전체회원목록
			} else if (choice == 3) {
				// 데이터 전체목록 가져오기...>DAO에 메소드 형태로 정의
				// 스캐너처럼 사용할 도구 DAO부터 가져오기
				memberDAO dao = new memberDAO();
				// 어레이리스트라는 자료형에 담아둬야함
				ArrayList<memberDTO> list = dao.selectAll();
				// 열이름출력
				System.out.println("아이디\t이름\t전화번호");
				// 데이터 출력하기
				for (memberDTO p : list) {
					System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getTel());
				}

//				for(int i=0;i<list.size();i++) {
//				    memberDTO dto=list.get(i);
//					System.out.println(dto.getId()+dto.getName()+dto.getTel());
//				}

				// 4. 회원정보수정
			} else if (choice == 4) {

				System.out.print("ID입력: ");
				String id = sc.next();
				System.out.print("PW입력: ");
				String pw = sc.next();
				System.out.print("수정할 이름입력: ");
				String name = sc.next();
				System.out.print("수정할 Tel입력: ");
				String tel = sc.next();

				// 사용자로 받아온 데이터를 DTO 객체를 통해 묶기
				memberDTO dto = new memberDTO(id, pw, name, tel);

				// DB 에서 정보 수정(객체에서 메소드 가져오기)
				memberDAO dao = new memberDAO();
				int row = dao.update(dto);

				if (row > 0) {
					System.out.println("회원정보 수정성공");
				} else {
					System.out.println("ID와 PW를 확인하세요");

				}

				// 5. 회원탈퇴
			} else if (choice == 5) {

				System.out.print("삭제할 ID입력: ");
				String id = sc.next();
				System.out.print("삭제할 PW입력: ");
				String pw = sc.next();
				// 기본생성자를 이용해 빈 DTO 생성
				memberDTO dto = new memberDTO();
				// setter 메서드를 이용해서 원하는 데이터만 채울 수 있다
				dto.setId(id);
				dto.setPw(pw);
				// DAO 객체를 이용해서 리턴값 가져오기
				memberDAO dao = new memberDAO();
				int row = dao.delete(dto);

				if (row > 0) {
					System.out.println("회원탈퇴 성공");
				} else {
					System.out.println("회원탈퇴 실패");
				}

				// 종료
			} else if (choice == 6) {
				System.out.println("종료합니다");
				break;

			}

		}

	}

}
