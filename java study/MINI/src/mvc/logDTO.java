package mvc;

public class logDTO {

	private String num;
	private String id;
	private String mark;
	private String mod;
	private String time;

	public logDTO() {
	}

	public logDTO(String num, String id, String mark, String mod, String time) {
		super();
		this.num = num;
		this.id = id;
		this.mark = mark;
		this.mod = mod;
		this.time = time;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
