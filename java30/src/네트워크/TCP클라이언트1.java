package 네트워크;

import java.net.Socket;
import java.io.IOException;

public class TCP클라이언트1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 9000);
		System.out.println("클라이언트가 9000포트 서버에 연결을 요청함");
	}

}
