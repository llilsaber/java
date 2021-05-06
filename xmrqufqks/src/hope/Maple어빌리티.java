package hope;

public class Maple어빌리티 {

	public static void main(String[] args) {
        
        double randombox;
        int x = 0;
        int count = 0;
 
        while (x < 1) {
        for (int i = 1; i <= 1; i++) //첫줄
        {
            randombox = (int) (Math.random() * (905 - 1 + 1) + 1);
            
            if ( 1 <= randombox && randombox <=  416 )
                System.out.print("꽝");
            else if ( 417 == randombox )
            	System.out.print("보공20%");
            else
                System.out.print("꽝");
            
            System.out.print(" | ");
        }
        for (int i = 1; i <= 2; i++) //나머지 줄
        {
            randombox = (int) (Math.random() * (564 - 1 + 1) + 1);
            
            if ( 1 <= randombox && randombox <=  96 )
                System.out.print("꽝");
            else if ( 97 == randombox ) {
            	System.out.print("크확20%");
            	x = x + 1;}
            else if ( 97 < randombox && randombox <  563  )
            	System.out.print("꽝");
            else {
                System.out.print("상태이상뎀8%");
                x = x + 1;}
            
            System.out.print(" | ");
        }
        count = count + 1;
        System.out.println(" " + count + "회 ( " + (count * 13100) + " )");
	}
	}

}
