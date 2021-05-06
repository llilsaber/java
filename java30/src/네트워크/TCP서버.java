package 네트워크;

import java.net.ServerSocket;
import java.net.Socket;

public class TCP서버 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int count = 0;
		
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 소켓 시작됨");
		System.out.println("클라이언트의 요청을 기다리는 중");
		while (true) {
			Socket socket = server.accept();
			count++;
			System.out.println("서버가" + count + "개의 클라이언트 요청을 승인함");
		}
	}

}
