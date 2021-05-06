package 배열심화;

public class 스트링을배열로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "감자, 고구마, 양파";
		String[] s2 = s.split(",");
		
		String s3 = "     홍길동";
		String s4 = s3.trim();
		System.out.println(s4.length());
		
		String s5 = s3.replace("    ", "");
		System.out.println(s5);
	}

}
