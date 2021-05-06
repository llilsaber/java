package hope;

public class Maple코젬 {

	public static void main(String[] args) {
        
        double randombox;
        int x = 0;
        int v = 0;
        int count = 0;
 
        while (x < 110) {
        for (int i = 1; i <= 1; i++)
        {
            randombox = (int) (Math.random() * (55 - 1 + 1) + 1);
            
            if ( 1 <= randombox && randombox <=  20 ) {
                System.out.print("스젬");
            v = v + 40;
            }
            else if ( 20 < randombox && randombox <  22  ) {
                System.out.print("**코젬**");
            v = v + 70;}
            else if ( 22 <= randombox && randombox <=  30  ) {
            	System.out.print("강젬");
            	v = v + 10;}
            else {
                System.out.print("특젬");
            v = v + 50;
            }
        }
        x = v / 70;
        count = count + 1;
        System.out.println(" " + count + "회");
	}
        System.out.println("코잼은 총 " + count + "개");
	}

}
