package 스태틱;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) throws Exception  {
		//1. 사이트에 연결하세요.
		//체인식 코드
		//Jsoup.connect("http://www.naver.com").get();
		Connection con = Jsoup.connect("http://www.naver.com");
		//System.out.println(con);
		
		//2. 연결한 사이트에 html문서를 받아오세요.
		Document doc = con.get();
		//System.out.println(doc);
		Elements anav = doc.select("a.nav");
		System.out.println(anav.size());
		for (Element e : anav) {
			System.out.println(e.text());
		}
		
		
		
		
		
		
		
	}

}
