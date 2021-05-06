package 배열심화;

public class 성적변동확인 {

	   public static void main(String[] args) {
	      String[] title = {"국어","수학","영어","과학","컴퓨터"};
	      int[] term1 = {100, 90, 70, 30, 50};
	      //1학기, 2학기 점수 목록이 별도로 있어야 하기 때문에 깊은 복사!필요
	      int[] term2 = term1.clone();
	      term2[3] = 55;
	      term2[4] = 77;
	      
	      
	      
	      
	   }

	}