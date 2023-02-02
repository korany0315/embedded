package ex1_server_socket;

import java.io.IOException;
import java.net.Socket;
import java.rmi.UnexpectedException;

public class MyClient {
	
	public static void main(String[] args) {
		
		//Socket클래스 객체 만들기
		//클라이언트를 의미하는 소켓 객체를 생성한뒤 
		//접속할 서버와 ip주소와 포트번호를 통해 서버에 접속한다.

		try {
			
			Socket s = new Socket("192.168.3.22", 3000);
			
		} catch (UnexpectedException e) {
			e.printStackTrace();
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
