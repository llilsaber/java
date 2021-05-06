package one;

public class Code3 {

	public static void main(String[] args) {
		int[] num = {3, 12, 45, 32, 54, 22};
		int sum = 0;
		int max = 0;
		int min = 99;
		
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
			if (max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
			}
			
		}
		System.out.println("합계: " + sum + " , 평균: " + (sum / num.length) + " , 최댓값: " + max + " , 최소값: " + min);
	}

}
