package kr.or.human3;

public class MemberDTO {

	private String id;
	private String pw;
	private String mane;
	private int age;
	
	
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
	public String getMane() {
		return mane;
	}
	public void setMane(String mane) {
		this.mane = mane;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", mane=" + mane + ", age=" + age + "]";
	}
		
	
	
}
