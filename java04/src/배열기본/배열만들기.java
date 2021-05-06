package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		int[] num = new int[5];
		int x = 10;

		for (int i = 0; i < num.length; i++) {
			num[i] = x;
			x = x + 10;
		}
		
		System.out.println(num[0] + num[2]);
		
		String[] pro = new String[3];
		
		pro[0] = "자바";
		pro[1] = "스프링";
		pro[2] = "JSF";
		
		System.out.println(pro[0] + " 보다는 " + pro[1]);
	}//\t 일정한 간격만큼 뛰우기

}
