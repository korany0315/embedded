package ex2_multiChat;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer extends Thread {

	ServerSocket ss;

	// 생성자
	public ChatServer() {

		try {

			ss = new ServerSocket(3500);
			System.out.println("서버가 시작되었습니다.");
		} catch (Exception e) {

		}

	}// 생성자

	@Override
	public void run() {
		while (true) {

			try {

				Socket s = ss.accept(); // 클라이언트를 기다린다
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님이 접속했습니다.");

			} catch (Exception e) {
				// TODO: handle exception
			}

		} // while
	}

}
