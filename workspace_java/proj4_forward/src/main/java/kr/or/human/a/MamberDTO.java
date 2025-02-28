package kr.or.human.a;

public class MamberDTO {

	private String id;
	private String pw;
	
	public String getId() {
		System.out.println("MamberDTO getId 실행");
		return id;
	}
	public void setId(String id) {
		System.out.println("MamberDTO setId 실행");
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
