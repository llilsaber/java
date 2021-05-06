package 스태틱;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링3 {

	public static void main(String[] args) throws Exception  {
		Connection con = Jsoup.connect("https://book.naver.com/");
		//System.out.println(con);
		
		//2. 연결한 사이트에 html문서를 받아오세요.
		Document doc = con.get();
		//System.out.println(doc);
		Elements anav = doc.select("div strong.title");
		//System.out.println(anav.size());
		for (int i = 0; i < anav.size(); i++) {
			System.out.println(i + ": " + anav.get(i).text());
		}
		
		Elements imgs = doc.getElementsByTag("img");
		if(imgs.size() > 0) {
		    String src = imgs.get(0).attr("src");
		    System.out.println(src);
		}


		
		
		
		
		
		
	}

}
