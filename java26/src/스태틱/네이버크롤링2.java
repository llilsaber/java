package 스태틱;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링2 {

	public static void main(String[] args) throws Exception  {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=007570");
		//System.out.println(con);
		
		//2. 연결한 사이트에 html문서를 받아오세요.
		Document doc = con.get();
		//System.out.println(doc);
		Elements anav = doc.select("p.no_today");
		System.out.println(anav.size());
		for (Element e : anav) {
			System.out.println(e.text());
		}
		for (int i = 0; i < anav.size(); i++) {
			System.out.println(anav.get(i).text().split(" ")[0]);
		}
		
		
		
		
		
		
		
	}

}
