package ex1_server_socket;

import java.io.IOException;
import java.net.Socket;
import java.rmi.UnexpectedException;

public class MyClient {
	
	public static void main(String[] args) {
		
		//SocketŬ���� ��ü �����
		//Ŭ���̾�Ʈ�� �ǹ��ϴ� ���� ��ü�� �����ѵ� 
		//������ ������ ip�ּҿ� ��Ʈ��ȣ�� ���� ������ �����Ѵ�.

		try {
			
			Socket s = new Socket("192.168.3.22", 3000);
			
		} catch (UnexpectedException e) {
			e.printStackTrace();
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
