package hope;

import java.util.Arrays;

public class Roto_vr2 {

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
					randombox = (int) (Math.random() * (6725 - 1 + 1) + 1);
					
					if ( 1 <= randombox && randombox <=  147 )
		                x = 34;
		            else if ( 148 <= randombox && randombox <=  288  )
		                x = 27;
		            else if ( 289 <= randombox && randombox <=  429  )
		            	x = 43;
		            else if ( 430 <= randombox && randombox <=  568  )
		            	x = 18;
		            else if ( 569 <= randombox && randombox <=  705  )
		            	x = 12;
		            else if ( 706 <= randombox && randombox <= 842   )
		            	x = 39;
		            else if ( 843 <= randombox && randombox <=  979  )
		            	x = 40;
		            else if ( 980 <= randombox && randombox <=  1116  )
		            	x = 17;
		            else if ( 1117 <= randombox && randombox <=  1251  )
		            	x = 13;
		            else if ( 1252 <= randombox && randombox <=  1385  )
		            	x = 14;
		            else if ( 1386 <= randombox && randombox <= 1518   )
		            	x = 1;
		            else if ( 1519 <= randombox && randombox <=  1651  )
		            	x = 33;
		            else if ( 1652 <= randombox && randombox <=  1784  )
		            	x = 20;
		            else if ( 1785 <= randombox && randombox <=  1917  )
		            	x = 45;
		            else if ( 1918 <= randombox && randombox <=  2049  )
		            	x = 10;
		            else if ( 2050 <= randombox && randombox <= 2180   )
		            	x = 4;
		            else if ( 2181 <= randombox && randombox <=  2311  )
		            	x = 19;
		            else if ( 2312 <= randombox && randombox <=  2441  )
		            	x = 37;
		            else if ( 2442 <= randombox && randombox <=  2570  )
		            	x = 31;
		            else if ( 2571 <= randombox && randombox <=  3699  )
		            	x = 15;
		            else if ( 3700 <= randombox && randombox <= 3827   )
		            	x = 38;
		            else if ( 3828 <= randombox && randombox <=  3955  )
		            	x = 8;
		            else if ( 3956 <= randombox && randombox <=  4083  )
		            	x = 3;
		            else if ( 4084 <= randombox && randombox <=  4211  )
		            	x = 11;
		            else if ( 4212 <= randombox && randombox <=  4339  )
		            	x = 5;
		            else if ( 4340 <= randombox && randombox <= 4466   )
		            	x = 44;
		            else if ( 4467 <= randombox && randombox <=  4593  )
		            	x = 36;
		            else if ( 4594 <= randombox && randombox <=  4719  )
		            	x = 7;
		            else if ( 4720 <= randombox && randombox <=  4845  )
		            	x = 21;
		            else if ( 4846 <= randombox && randombox <=  4971  )
		            	x = 26;
		            else if ( 4972 <= randombox && randombox <= 5096   )
		            	x = 24;
		            else if ( 5097 <= randombox && randombox <=  5221  )
		            	x = 2;
		            else if ( 5222 <= randombox && randombox <=  5345  )
		            	x = 42;
		            else if ( 5346 <= randombox && randombox <=  5468  )
		            	x = 16;
		            else if ( 5469 <= randombox && randombox <=  5590  )
		            	x = 25;
		            else if ( 5591 <= randombox && randombox <= 5709   )
		            	x = 28;
		            else if ( 5710 <= randombox && randombox <=  5827  )
		            	x = 6;
		            else if ( 5828 <= randombox && randombox <=  5944  )
		            	x = 30;
		            else if ( 5945 <= randombox && randombox <=  6061  )
		            	x = 41;
		            else if ( 6062 <= randombox && randombox <=  6178  )
		            	x = 35;
		            else if ( 6179 <= randombox && randombox <= 6292   )
		            	x = 29;
		            else if ( 6293 <= randombox && randombox <= 6405   )
		            	x = 23;
		            else if ( 6406 <= randombox && randombox <= 6516   )
		            	x = 32;
		            else if ( 6517 <= randombox && randombox <= 6626   )
		            	x = 22;
		            else
		               x = 9;
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
