package hope;

public class Maple잠재능력 {

	public static void main(String[] args) {
        
        double randombox1;
        double randombox2;
        double randombox3;
        int x = 0;
        int y = 0;
        int count = 0;
 
        while (x < 1 && y < 1) {
        for (int i = 1; i <= 1; i++)
        {
            randombox1 = (int) (Math.random() * (1000000 - 1 + 1) + 1);
            randombox2 = (int) (Math.random() * (1367349 - 1 + 1) + 1);
            randombox3 = (int) (Math.random() * (1040406 - 1 + 1) + 1);
            
            if ( 1 <= randombox1 && randombox1 <=  652176 )
                System.out.print("꽝");
            else if ( 652177 < randombox1 && randombox1 <  695654  ) {
                System.out.print("공 6퍼");
            y = y + 1;}
            else
                System.out.print("꽝");
            
            System.out.print(" | ");
            
            if ( 1 <= randombox2 && randombox2 <=  661224 )
            	System.out.print("꽝");
            else if ( 661225 < randombox2 && randombox2 <  679591  ) {
            	System.out.print("공 3퍼");
            	x = x + 1;}
            else if ( 679592 < randombox2 && randombox2 <  1332565  )
            	System.out.print("꽝");
            else if ( 1332566 < randombox2 && randombox2 <  1336913  ) {
            	System.out.print("공 6퍼");
            	x = x + 1;}
            else
            	System.out.print("꽝");
            
            System.out.print(" | ");
            
            if ( 1 <= randombox3 && randombox3 <=  727344 )
            	System.out.print("꽝");
            else if ( 727345 < randombox3 && randombox3 <  747548  ) {
            	System.out.print("공 3퍼");
            	x = x + 1;}
            else if ( 747549 < randombox3 && randombox3 <  1036926  )
            	System.out.print("꽝");
            else if ( 1036927 < randombox3 && randombox3 <  1037361  ) {
            	System.out.print("공 6퍼");
            	x = x + 1;}
            else
            	System.out.print("꽝");
            
            System.out.print(" | ");
        }
        count = count + 1;
        if (y <1 || x < 1) {
			x = 0;
			y = 0;
		}
        System.out.println(" " + count + "회");
	}
        System.out.println("총 " + count + "회");
	}

}
