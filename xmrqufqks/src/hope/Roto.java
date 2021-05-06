package hope;

public class Roto {

	public static void main(String[] args) {
        
        double randomy;
        double randomb;
        double randomr;
        double randomd;
        double randomg;
        double randomnum;
 
        for (int i = 1; i <= 6; i++)
        {
            randomy = (int) (Math.random() * (1246 - 1 + 1) + 1);
            randomb = (int) (Math.random() * (1326 - 1 + 1) + 1);
            randomr = (int) (Math.random() * (1210 - 1 + 1) + 1);
            randomd = (int) (Math.random() * (1295 - 1 + 1) + 1);
            randomg = (int) (Math.random() * (641 - 1 + 1) + 1);
            randomnum = (int) (Math.random() * (1000 - 1 + 1) + 1);
            
            if ( 1 <= randomnum && randomnum <=  218 ) {
            if ( 1 <= randomy && randomy <=  132 )
                System.out.print("1");
            else if ( 160 <= randomy && randomy <=  257  )
                System.out.print("2");
            else if ( 258 <= randomy && randomy <=  385  )
            	System.out.print("3");
            else if ( 386 <= randomy && randomy <=  516  )
            	System.out.print("4");
            else if ( 517 <= randomy && randomy <=  644  )
            	System.out.print("5");
            else if ( 645 <= randomy && randomy <= 762   )
            	System.out.print("6");
            else if ( 763 <= randomy && randomy <=  880  )
            	System.out.print("7");
            else if ( 881 <= randomy && randomy <=  1016  )
            	System.out.print("8");
            else if ( 1007 <= randomy && randomy <=  1114  )
            	System.out.print("9");
            else
            	System.out.print("10");
            } else if ( 219 <= randomnum && randomnum <=  450  ) {
            if ( 1 <= randomb && randomb <= 128   )
            	System.out.print("11");
            else if ( 129 <= randomb && randomb <=  265  )
            	System.out.print("12");
            else if ( 266 <= randomb && randomb <=  400  )
            	System.out.print("13");
            else if ( 401 <= randomb && randomb <=  534  )
            	System.out.print("14");
            else if ( 535 <= randomb && randomb <=  663  )
            	System.out.print("15");
            else if ( 664 <= randomb && randomb <= 786   )
            	System.out.print("16");
            else if ( 787 <= randomb && randomb <=  923  )
            	System.out.print("17");
            else if ( 924 <= randomb && randomb <=  1062  )
            	System.out.print("18");
            else if ( 1063 <= randomb && randomb <=  1193  )
            	System.out.print("19");
            else
            	System.out.print("20");
            } else if ( 451 <= randomnum && randomnum <=  662  ) {
            if ( 1 <= randomr && randomr <= 126   )
            	System.out.print("21");
            else if ( 127 <= randomr && randomr <=  236  )
            	System.out.print("22");
            else if ( 237 <= randomr && randomr <=  349  )
            	System.out.print("23");
            else if ( 350 <= randomr && randomr <=  474  )
            	System.out.print("24");
            else if ( 475 <= randomr && randomr <=  596  )
            	System.out.print("25");
            else if ( 597 <= randomr && randomr <= 721   )
            	System.out.print("26");
            else if ( 722 <= randomr && randomr <=  862  )
            	System.out.print("27");
            else if ( 863 <= randomr && randomr <=  980  )
            	System.out.print("28");
            else if ( 981 <= randomr && randomr <=  1094  )
            	System.out.print("29");
            else
            	System.out.print("30");
            } else if ( 663 <= randomnum && randomnum <=  888  ) {
            if ( 1 <= randomd && randomd <= 129   )
            	System.out.print("31");
            else if ( 130 <= randomd && randomd <=  239  )
            	System.out.print("32");
            else if ( 240 <= randomd && randomd <=  372  )
            	System.out.print("33");
            else if ( 373 <= randomd && randomd <=  519  )
            	System.out.print("34");
            else if ( 520 <= randomd && randomd <=  636  )
            	System.out.print("35");
            else if ( 637 <= randomd && randomd <= 763   )
            	System.out.print("36");
            else if ( 764 <= randomd && randomd <=  893  )
            	System.out.print("37");
            else if ( 894 <= randomd && randomd <=  1021  )
            	System.out.print("38");
            else if ( 1022 <= randomd && randomd <=  1158  )
            	System.out.print("39");
            else
            	System.out.print("40");
            } else {
            if ( 1 <= randomg && randomg <= 116   )
            	System.out.print("41");
            else if ( 117 <= randomg && randomg <= 240   )
            	System.out.print("42");
            else if ( 241 <= randomg && randomg <= 381   )
            	System.out.print("43");
            else if ( 382 <= randomg && randomg <= 508   )
            	System.out.print("44");
            else
                System.out.print("45");
            }
            
            System.out.print(" | ");
        }
	}

}
