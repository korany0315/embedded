package ex2_multiChat;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer extends Thread {

	ServerSocket ss;

	// ������
	public ChatServer() {

		try {

			ss = new ServerSocket(3500);
			System.out.println("������ ���۵Ǿ����ϴ�.");
		} catch (Exception e) {

		}

	}// ������

	@Override
	public void run() {
		while (true) {

			try {

				Socket s = ss.accept(); // Ŭ���̾�Ʈ�� ��ٸ���
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "���� �����߽��ϴ�.");

			} catch (Exception e) {
				// TODO: handle exception
			}

		} // while
	}

}
