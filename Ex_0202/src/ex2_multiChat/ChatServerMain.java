package ex2_multiChat;

public class ChatServerMain {

	// 3500포트를 여는 작업 + 클라이언트를 기다리는 작업
	public static void main(String[] args) {

		ChatServer cs = new ChatServer();
		cs.start();

	}// main

}
