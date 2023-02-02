package ex1_server_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
	// 스레드 상속

	// 통로를 만들어주는 역할
	ServerSocket ss;

	// 생성자 준비
	public MyServer() {

		try {
			// 서버로 접근 할 클라이언트를 위해 포트를 열어둔다. (포트 : 통로 개념)
			// try-catch로 묶어줘야 오류가 안남 //3000밑의 포트번호는 이미 사용중일 확률 높음
			ss = new ServerSocket(3000);
			System.out.println("서버 준비 완료!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {

		while (true) {

			try {

				// 접속한 클라이언트의 정보를 서버가 accept()메서드를 받아서
				// s객체에게 넘긴다.
				//accept() :  접속자가 올 때 까지 아래쪽 라인을 실행하지 않고 대기한다.
				Socket s = ss.accept();
				
				//접속자의 ip주소를 가져오자
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속을 환영합니다.");
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		}//while

	}
}
