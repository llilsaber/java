package hope;

import java.util.Arrays;

public class Roto_vrorg {

	public static void main(String[] args) {
		double randombox; // 랜덤 클래스 사용
int x;
		int[] lotto = new int[6]; // lotto 변수형 배열 생성
		while (true) { // 무한 반복
			if (lotto[5] > 0) {
				Arrays.parallelSort(lotto); // 오름차순으로 정렬
				System.out.println(Arrays.toString(lotto)); // lotto 배열 출력
				break; // 반복문 중지
			} else {
				for (int i = 0; i < lotto.length; i++) {
					randombox = (int) (Math.random() * (5684 - 1 + 1) + 1);
					
					if ( 1 <= randombox && randombox <=  113 )
		                x = 1;
		            else if ( 134 <= randombox && randombox <=  238  )
		                x = 2;
		            else if ( 239 <= randombox && randombox <=  366  )
		            	x = 3;
		            else if ( 367 <= randombox && randombox <=  497  )
		            	x = 4;
		            else if ( 498 <= randombox && randombox <=  625  )
		            	x = 5;
		            else if ( 626 <= randombox && randombox <= 743   )
		            	x = 6;
		            else if ( 744 <= randombox && randombox <=  869  )
		            	x = 7;
		            else if ( 870 <= randombox && randombox <=  997  )
		            	x = 8;
		            else if ( 998 <= randombox && randombox <=  1096  )
		            	x = 9;
		            else if ( 1097 <= randombox && randombox <=  1228  )
		            	x = 10;
		            else if ( 1229 <= randombox && randombox <= 1356  )
		            	x = 11;
		            else if ( 1357 <= randombox && randombox <=  1493  )
		            	x = 12;
		            else if ( 1494 <= randombox && randombox <=  1628  )
		            	x = 13;
		            else if ( 1629 <= randombox && randombox <=  1762  )
		            	x = 14;
		            else if ( 1763 <= randombox && randombox <=  1891  )
		            	x = 15;
		            else if ( 1892 <= randombox && randombox <= 2014   )
		            	x = 16;
		            else if ( 2015 <= randombox && randombox <=  2151  )
		            	x = 17;
		            else if ( 2152 <= randombox && randombox <=  2290  )
		            	x = 18;
		            else if ( 2291 <= randombox && randombox <=  2421  )
		            	x = 19;
		            else if ( 2422 <= randombox && randombox <=  2554  )
		            	x = 20;
		            else if ( 2555 <= randombox && randombox <= 2680   )
		            	x = 21;
		            else if ( 2681 <= randombox && randombox <=  2790  )
		            	x = 22;
		            else if ( 2791 <= randombox && randombox <=  2903  )
		            	x = 23;
		            else if ( 2904 <= randombox && randombox <=  3028  )
		            	x = 24;
		            else if ( 3029 <= randombox && randombox <=  3150  )
		            	x = 25;
		            else if ( 3151 <= randombox && randombox <= 3276   )
		            	x = 26;
		            else if ( 3277 <= randombox && randombox <=  3417  )
		            	x = 27;
		            else if ( 3418 <= randombox && randombox <=  3536  )
		            	x = 28;
		            else if ( 3537 <= randombox && randombox <=  3650  )
		            	x = 29;
		            else if ( 3651 <= randombox && randombox <=  3767  )
		            	x = 30;
		            else if ( 3768 <= randombox && randombox <= 3896   )
		            	x = 31;
		            else if ( 3897 <= randombox && randombox <=  4006  )
		            	x = 32;
		            else if ( 4007 <= randombox && randombox <=  4119  )
		            	x = 33;
		            else if ( 4120 <= randombox && randombox <=  4266  )
		            	x = 34;
		            else if ( 4267 <= randombox && randombox <=  4383  )
		            	x = 35;
		            else if ( 4384 <= randombox && randombox <= 4510   )
		            	x = 36;
		            else if ( 4511 <= randombox && randombox <=  4640  )
		            	x = 37;
		            else if ( 4641 <= randombox && randombox <=  4768  )
		            	x = 38;
		            else if ( 4769 <= randombox && randombox <=  4905  )
		            	x = 39;
		            else if ( 4906 <= randombox && randombox <=  5042  )
		            	x = 40;
		            else if ( 5043 <= randombox && randombox <= 5159   )
		            	x = 41;
		            else if ( 5160 <= randombox && randombox <= 5283   )
		            	x = 42;
		            else if ( 5284 <= randombox && randombox <= 5424   )
		            	x = 43;
		            else if ( 5425 <= randombox && randombox <= 5551   )
		            	x = 44;
		            else
		               x = 45;
					if (lotto[0] == x || lotto[1] == x || lotto[2] == x || lotto[3] == x || lotto[4] == x
							|| lotto[5] == x) { // 같은 숫자가 있는지 확인
						i = i - 1; // 배열에 같은 번호가 발견될 시 자리수 낮추어서 다시 번호를 생성하게 함
					} else
						lotto[i] = x; // 같은 번호가 없을 경우 배열에 번호를 들록함
				}
			}
		}
	}
}
