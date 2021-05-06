package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 기본형형변환5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list = new ArrayList();

list.add("ghdrlfehd");
list.add(new man());
list.add(new Random());
list.add(new super());
System.out.println(list);

String name = (String)list.get(0);
	}

}
