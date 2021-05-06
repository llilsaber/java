package 네트워크;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TCP클라이언트3 {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) {
			Socket socket = new Socket("localhost", 9000);
			System.out.println(i + "번: 클라이언트가 9000포트 서버에 연결을 요청함");
			InputStream input = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(input);
			BufferedReader buffer = new BufferedReader(reader);
			socket.getInputStream();
		}
	}

}
