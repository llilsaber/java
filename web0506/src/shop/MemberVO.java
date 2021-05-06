package shop;

public class MemberVO {
	//가방안에 변수들로 공간을 만들어둔다.
	String id;
	String pw;
	String name;
	String tel;

	public void setId(String id) {
		this.id = id;
		//this: 이 클래스=>MemberVO
	}
	public String getId() {
		return id;
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
