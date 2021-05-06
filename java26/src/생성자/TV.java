package 생성자;

public class TV {
	int ch;
	int vol;
	boolean onOff;
	
	//다른 생성자가 하나도 없으면 자동으로 만들어진다.
	//묵시적으로 기본생성자가 정의
	//파라메터없는 생성자, 기본생성자(default 생성자)
	//기본생성자는 다른 생성자가 하나도 없으면 자동으로 만들어진다.
	//일단 객체생성한 후, 멤버변수값을 나중에 넣어주는 경우
	//파라메터있은 경우와 없는 경우를 함께 사용하고자 하는 경우
	//명시적으로 기본생성자를 정의해주어야 한다.
	public TV() {
	}
	
	//생성자, 파라메터있는 생성자
	//객체생성할 때 멤버변수값을 넣어주는 경우
	public TV(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	public void on() {
		System.out.println("켜다.");
	}
	public void off() {
		System.out.println("끄다.");
	}
	
	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
	
}
