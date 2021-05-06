package 문제풀이;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP날짜서버 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 소켓 시작됨");
		System.out.println("클라이언트의 요청을 기다리는 중");
		try {
		while (true) {
			Socket socket = server.accept();
			try {
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				out.println(new Date().toString());
			} finally {
				socket.close();
			}
		}
	} finally {
		server.close();
	}
	}

}
