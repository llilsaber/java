package shop;

public class MemberVO {
	String id;
	String pw;
	String name;
	String tel;
	
	public void setId(String id) { //id에 데이터 i 넣기
		this.id = id; //this는 이 클래스를 가리킨다
	}
	
	public void getId() {
		return id;
	}
}
