package ex4_multi_thread;

public class T1 extends Thread{

	@Override // 런 메서드 필수 오버라이딩 하기
	public void run() {

		for(int i = 0; i<100; i++) {
//			Thread.sleep(500);// for문 한바퀴 돌때 마다 5초 쉬기
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//5초 쉬기
			System.out.print("1");
		}
		
	}
}
