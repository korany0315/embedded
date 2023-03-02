package ex4_multi_thread;

public class T2 extends Thread{

	@Override
	public void run() {
		
		for(int i = 0; i<100; i++) {
//			Thread.sleep(500);//for문 한바퀴 돌때마다 0.5초 쉬어
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}//for문 한바퀴 돌때마다 0.5초 쉬어
			System.out.print("0");
		}
		
	}
	
}
