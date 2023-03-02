package ex1_server_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
	// ������ ���

	// ��θ� ������ִ� ����
	ServerSocket ss;

	// ������ �غ�
	public MyServer() {

		try {
			// ������ ���� �� Ŭ���̾�Ʈ�� ���� ��Ʈ�� ����д�. (��Ʈ : ��� ����)
			// try-catch�� ������� ������ �ȳ� //3000���� ��Ʈ��ȣ�� �̹� ������� Ȯ�� ����
			ss = new ServerSocket(3000);
			System.out.println("���� �غ� �Ϸ�!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {

		while (true) {

			try {

				// ������ Ŭ���̾�Ʈ�� ������ ������ accept()�޼��带 �޾Ƽ�
				// s��ü���� �ѱ��.
				//accept() :  �����ڰ� �� �� ���� �Ʒ��� ������ �������� �ʰ� ����Ѵ�.
				Socket s = ss.accept();
				
				//�������� ip�ּҸ� ��������
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "�� ������ ȯ���մϴ�.");
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		}//while

	}
}
