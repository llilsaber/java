package hope;

public class Maple주문서2 {

	public static void main(String[] args) {
        
        double randombox;
        int x = 0;
        int count = 0;
 
        while (x < 9) {
        for (int i = 1; i <= 1; i++)
        {
            randombox = (int) (Math.random() * (100 - 1 + 1) + 1);
            
            if ( 1 <= randombox && randombox <=  10 ) { //무기 39%, 방어구 59%
                System.out.println("★매지컬 공11 성공★");
                x = x + 1;
            }
            else
                System.out.println("실패");
        }
        count = count + 1;
	}
        System.out.println("총 매지컬작 횟수 " + count + "회");
	}

}
