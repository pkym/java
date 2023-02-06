package ex04포켓몬게임;

public class Pokemon {

	// 1. private 필드
	// 이름, 타입, hp, atk, skill

	private String name;
	private String type;
	private int hp;
	private int atk;
	private String skill;

	// 2. 메소드
	// 생성자 메소드 만들기-모든 필드의 값을 초기화 시킬 수 있는 생성자
	public Pokemon(String name, String type, int hp, int atk, String skill) {
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.atk = atk;
		this.skill = skill;
	}

	// getter/setter 메소드 만들기
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	// 2. 메소드
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
