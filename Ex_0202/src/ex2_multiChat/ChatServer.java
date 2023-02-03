package ex2_multiChat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread {

	ServerSocket ss;

	// 복사된 클라이언트를 담아줄 ArrayList
	ArrayList<CopyClient> list;

	// 생성자
	public ChatServer() {

		try {
			list = new ArrayList<CopyClient>();

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

				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();

			} catch (Exception e) {
				// TODO: handle exception
			}

		} // while
	}// run()

	// 메세지 전달 메서드
	public void sendMessage(String msg) {
		// 접속자들은 CopyClient상태로 ArrayList에 저장되어있는 상태
		for (CopyClient cc : list) {
			cc.out.println(msg);// 서버에 접속해있는 모든 접속자들에게 메세지를 전달
		}
	}

	// 종료된 사용자를 ArrayList에서 제거
	public void removeClient(CopyClient cc) {

		list.remove(cc);// 접속 종료된 사용자를 ArrayList에서 제거

		// 남아있는 구성원들에게 퇴장 메세지를 전달
		sendMessage("***" + cc.ip + "님이 퇴장하였습니다. ***");

	}

}
