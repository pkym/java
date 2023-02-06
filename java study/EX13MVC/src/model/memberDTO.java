package model;

import java.util.ArrayList;

public class memberDTO {

	// rs 값을 한번에 옮기기 위해서 DTO를 정의함
	
	// DTO : Data Transfer Object
	// 데이터를 이동할 수 있게 하는 나만의 자료형
	// 테이블 컬럼들을 필드로 가짐/ 테이블 마다 한 개씩 DTO를 갖는다
	// 계층간 데이터 전달을 위해 사용되는 객체이다

	// 필드정의(id pw name tel)
	// 캡슐화 함
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//기본 생성자 메소드 >> 비어있는 바구니: 필요한 것만 집어 넣을 수 있다
	public memberDTO() {		
	}	

	// 로그인 생성자메소드
	// 모든 필드를 초기화 하는 생성자 >> ALLArgsConstructor 전체생성자
	public memberDTO(String id, String pw, String name, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}	
	// getter/setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
