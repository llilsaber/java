package hope;

public class Maple주문서 {

	public static void main(String[] args) {
        
        double randombox;
        int x = 0;
        int y = 0;
        int count1 = 0;
        int count2 = 0;
 
        while (x < 9) { //무기 9, 방어구 8, 모자 12, 어깨장신구 2
        	while (y < 0) {
        	for (int i = 1; i <= 1; i++)
        	{
        		randombox = (int) (Math.random() * (100 - 1 + 1) + 1);
        		
        		if ( 1 <= randombox && randombox <=  10 ) {
        			System.out.println("★★순줌성공★★");
        			y = y + 1;
        		}
        		else 
        			System.out.println("실패");
        	}
        	count2 = count2 + 1;
        	}
        for (int i = 1; i <= 1; i++)
        {
            randombox = (int) (Math.random() * (100 - 1 + 1) + 1);
            
            if ( 1 <= randombox && randombox <=  39 ) { //무기 39%, 방어구 59%
                System.out.println("★주흔성공★");
                x = x + 1;
            }
            else {
                System.out.println("작실패");
                y = y - 1;
            }
        }
        count1 = count1 + 1;
	}
        System.out.println("강화는 " + count1 + "회");
        System.out.println("순줌은 " + count2 + "회");
        System.out.println("주흔은 " + ((count1 * 460 + count2 * 2000) / 9000 + 1) + "세트)");
	}

}
