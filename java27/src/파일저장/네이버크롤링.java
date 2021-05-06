package 파일저장;

import java.io.IOException;
import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) throws Exception  {
		Connection con = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn");
		Document doc = con.get();
		Elements anav = doc.select("a.title");
		System.out.println(anav.size());
			try {
				FileWriter f = new FileWriter("d:\\limsh\\웹툰제목.txt");
				for (Element e : anav) {
				f.write(e.text() + "\n");
				}
				f.close();
			} catch (IOException i) {
				System.out.println("파일로 저장 중 에러발생");
				System.out.println("에러 정보는 " + i.getMessage());
			}

	}

}
