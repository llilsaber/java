package hope;

import java.util.Arrays;

public class Roto_vr {

	public static void main(String[] args) {
		double randomy;
        double randomb;
        double randomr;
        double randomd;
        double randomg;
        double randomnum;
        int x;
        
		int[] lotto = new int[6]; // lotto 변수형 배열 생성
		while (true) { // 무한 반복
			if (lotto[5] > 0) {
				Arrays.parallelSort(lotto); // 오름차순으로 정렬
				System.out.println(Arrays.toString(lotto)); // lotto 배열 출력
				break; // 반복문 중지
			} else {
				for (int i = 0; i < lotto.length; i++) {
					randomy = (int) (Math.random() * (1218 - 1 + 1) + 1);
		            randomb = (int) (Math.random() * (1326 - 1 + 1) + 1);
		            randomr = (int) (Math.random() * (1213 - 1 + 1) + 1);
		            randomd = (int) (Math.random() * (1295 - 1 + 1) + 1);
		            randomg = (int) (Math.random() * (642 - 1 + 1) + 1);
		            randomnum = (int) (Math.random() * (1000 - 1 + 1) + 1);
		            
		            if ( 1 <= randomnum && randomnum <=  218 ) {
		            if ( 1 <= randomy && randomy <=  113 )
		                x = 1;
		            else if ( 114 <= randomy && randomy <=  238  )
		            	x = 2;
		            else if ( 239 <= randomy && randomy <=  366  )
		            	x = 3;
		            else if ( 367 <= randomy && randomy <=  497  )
		            	x = 4;
		            else if ( 498 <= randomy && randomy <=  625  )
		            	x = 5;
		            else if ( 626 <= randomy && randomy <= 743   )
		            	x = 6;
		            else if ( 744 <= randomy && randomy <=  869  )
		            	x = 7;
		            else if ( 870 <= randomy && randomy <=  997  )
		            	x = 8;
		            else if ( 998 <= randomy && randomy <=  1096  )
		            	x = 9;
		            else
		            	x = 10;
		            } else if ( 219 <= randomnum && randomnum <=  450  ) {
		            if ( 1 <= randomb && randomb <= 128   )
		            	x = 11;
		            else if ( 129 <= randomb && randomb <=  265  )
		            	x = 12;
		            else if ( 266 <= randomb && randomb <=  400  )
		            	x = 13;
		            else if ( 401 <= randomb && randomb <=  534  )
		            	x = 14;
		            else if ( 535 <= randomb && randomb <=  663  )
		            	x = 15;
		            else if ( 664 <= randomb && randomb <= 786   )
		            	x = 16;
		            else if ( 787 <= randomb && randomb <=  923  )
		            	x = 17;
		            else if ( 924 <= randomb && randomb <=  1062  )
		            	x = 18;
		            else if ( 1063 <= randomb && randomb <=  1193  )
		            	x = 19;
		            else
		            	x = 20;
		            } else if ( 451 <= randomnum && randomnum <=  662  ) {
		            if ( 1 <= randomr && randomr <= 126   )
		            	x = 21;
		            else if ( 127 <= randomr && randomr <=  236  )
		            	x = 22;
		            else if ( 237 <= randomr && randomr <=  349  )
		            	x = 23;
		            else if ( 350 <= randomr && randomr <=  474  )
		            	x = 24;
		            else if ( 475 <= randomr && randomr <=  596  )
		            	x = 25;
		            else if ( 597 <= randomr && randomr <= 722   )
		            	x = 26;
		            else if ( 723 <= randomr && randomr <=  863  )
		            	x = 27;
		            else if ( 864 <= randomr && randomr <=  982  )
		            	x = 28;
		            else if ( 983 <= randomr && randomr <=  1096  )
		            	x = 29;
		            else
		            	x = 30;
		            } else if ( 663 <= randomnum && randomnum <=  888  ) {
		            if ( 1 <= randomd && randomd <= 129   )
		            	x = 31;
		            else if ( 130 <= randomd && randomd <=  239  )
		            	x = 32;
		            else if ( 240 <= randomd && randomd <=  372  )
		            	x = 33;
		            else if ( 373 <= randomd && randomd <=  519  )
		            	x = 34;
		            else if ( 520 <= randomd && randomd <=  636  )
		            	x = 35;
		            else if ( 637 <= randomd && randomd <= 763   )
		            	x = 36;
		            else if ( 764 <= randomd && randomd <=  893  )
		            	x = 37;
		            else if ( 894 <= randomd && randomd <=  1021  )
		            	x = 38;
		            else if ( 1022 <= randomd && randomd <=  1158  )
		            	x = 39;
		            else
		            	x = 40;
		            } else {
		            if ( 1 <= randomg && randomg <= 117   )
		            	x = 41;
		            else if ( 118 <= randomg && randomg <= 241   )
		            	x = 42;
		            else if ( 242 <= randomg && randomg <= 382   )
		            	x = 43;
		            else if ( 383 <= randomg && randomg <= 509   )
		            	x = 44;
		            else
		            	x = 45;
		            }
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
